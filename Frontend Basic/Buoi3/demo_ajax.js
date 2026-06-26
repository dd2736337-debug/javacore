var accounts = [];
var v_idUpdate = -1;
loadData();
function loadData() {
    // Call api đên mockapi.io để lấy danh sách account
    // jqAjax
    $.ajax({
        type: "GET",
        url: "https://6a3df0780443193a1a0b390e.mockapi.io/api/v1/account",
        // data: "data", phục vụ cho thêm và update
        dataType: "JSON",
        success: function (response) {
            //call api thành công
            accounts = response;
            var tableContent = "";
            for (let i = 0; i < accounts.length; i++) {
                tableContent += "<tr>";
                tableContent += "<td>" + accounts[i].id + "</td>";
                tableContent += `<td><img src="${accounts[i].avatar}" style="height:40px" alt="Image"></td>`;
                tableContent += "<td>" + accounts[i].username + "</td>";
                tableContent += "<td>" + accounts[i].fullName + "</td>";
                tableContent += "<td>" + accounts[i].age + "</td>";
                tableContent +=
                    "<td><button onclick='onHandleEdit(" +
                    accounts[i].id +
                    ")'>Edit</button> <button onclick='onDelete(" +
                    accounts[i].id +
                    ")'>Delete</button></td>";
                tableContent += "</tr>";
            }
            // document.getElementById("tableBody").innerHTML = tableContent; //nối dữ liệu vào table body có id=tableBody
            //Trước khi show data thì clear bảng trước
            //jqEmpty
            $("#tableBody").empty();

            //cú pháp JqAppend
            $("#tableBody").append(tableContent);
        },
        error: function (error) {
            //Thất bại
            alert("Call api get account thất bại");
        },
    });
}

function onDelete(idDelete) {
    var check = confirm("Bạn có chắc chắn xóa account này");
    if (check == true) {
        //dung ajax
        $.ajax({
            type: "DELETE",
            url:
                "https://6a3df0780443193a1a0b390e.mockapi.io/api/v1/account/" +
                idDelete,
            // data: "data",
            // dataType: "dataType", dung cho Get
            success: function (response) {
                alert("Xóa thành công");
                loadData();
            },
            error: function (error) {
                //Thất bại
                alert("Call api xóa thất bại");
            },
        });
    }
}

//JqSubmit
$("#AccountForm").submit(function (e) {
    e.preventDefault();
    if (v_idUpdate > 0) {
        alert("Đang update ,không thể tạo mới được");
        return;
    }

    var v_avatar = $("#inputAvatar");
    var v_username = $("#inputUsername").val();
    var v_fullname = $("#inputFullname").val();
    var v_age = $("#inputAge").val();

    var account = {
        //object của js
        avatar: v_avatar,
        username: v_username,
        fullName: v_fullname,
        age: v_age,
    };
    //call api  để thêm mới account
    $.ajax({
        type: "POST",
        url: "https://6a3df0780443193a1a0b390e.mockapi.io/api/v1/account",
        data: JSON.stringify(account), //chuyển account của js thành json
        contentType: "application/json",
        success: function (response) {
            alert("Thêm dữ liệu thành công");
            loadData();
            $("#inputAvatar").val("");
            $("#inputUsername").val("");
            $("#inputFullname").val("");
            $("#inputAge").val("");
        },
        error: function (error) {
            //Thất bại
            alert("Call api thêm mới thất bại");
        },
    });
});

function onHandleEdit(idUpdate) {
    //call api get by id để lấy dữ liệu ra để hiện thị lên các ô input
    $.ajax({
        type: "GET",
        url:
            "https://6a3df0780443193a1a0b390e.mockapi.io/api/v1/account/" +
            idUpdate,
        dataType: "JSON",
        success: function (response) {
            //hiện thi ra các ô input tương ứng
            $("#inputAvatar").val(response.avatar);
            $("#inputUsername").val(response.username);
            $("#inputFullname").val(response.fullName);
            $("#inputAge").val(response.age);
            v_idUpdate = idUpdate; //lưu lại id update
        },
        error: function (error) {
            //Thất bại
            alert("Call api edit thất bại thất bại");
        },
    });
}

$("#btnUpdate").click(function (e) {
    var v_avatar = $("#inputAvatar").val();
    var v_username = $("#inputUsername").val();
    var v_fullname = $("#inputFullname").val();
    var v_age = $("#inputAge").val();
    //lấy ra đối tượng cần update
    var accountUpdate = {
        avatar: v_avatar,
        username: v_username,
        fullName: v_fullname,
        age: v_age,
    };
    //Cal api update
    $.ajax({
        type: "PUT",
        url:
            "https://6a3df0780443193a1a0b390e.mockapi.io/api/v1/account/" +
            v_idUpdate,
        data: JSON.stringify(accountUpdate),
        contentType: "application/json",
        success: function (response) {
            alert("Update dữ liệu thành công");
            //hiển thị lại danh sách account
            loadData();
            v_idUpdate = -1;
            $("#inputAvatar").val("");
            $("#inputUsername").val("");
            $("#inputFullname").val("");
            $("#inputAge").val("");
        },
        error: function (error) {
            //Thất bại
            alert("Call api update thất bại");
        },
    });
});
