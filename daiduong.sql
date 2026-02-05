drop database if exists Testing_System_Assignment_2;
CREATE DATABASE Testing_System_Assignment_2 ;
-- Table 1:Department
-- DepartmentID:  định danh của phòng ban (auto increment)
-- DepartmentName: tên đầy đủ của phòng ban (VD: sale, marketing, …)
use Testing_System_Assignment_2;
CREATE TABLE Department(
    DepartmentID int primary key auto_increment,
    DepartmentName varchar(50) not null
);
-- Table 2: Position
-- PositionID:  định danh của chức vụ (auto increment)
-- PositionName: tên chức vụ (Dev, Test, Scrum Master, PM)
CREATE TABLE`Position`(
    PositionID INT AUTO_INCREMENT primary key,
    PositionName varchar(50) not null unique
);
-- Table 3: Account
-- AccountID:  định danh của User (auto increment)
-- Email:  Địa chỉ email
-- Username:  tên đăng nhập
-- FullName:  tên đầy đủ
-- DepartmentID: phòng ban của user trong hệ thống
-- PositionID: chức vụ của User
-- CreateDate: ngày tạo tài khoản
CREATE TABLE Account(
    AccountID int primary key auto_increment,
    Email varchar(50) not null unique ,
    Username varchar(50) not null  unique ,
    FullName varchar(50) not null,
    DepartmentID int NOT NULL ,
    PositionID int NOT NULL ,
    CreateDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    foreign key (DepartmentID) references Department(DepartmentID),
    foreign key (PositionID) references `position`(PositionID)
);
-- Table 4: Group
-- GroupID:  định danh của nhóm (auto increment)
-- GroupName:  tên nhóm
-- CreatorID: id của người tạo group
-- CreateDate: ngày tạo group
CREATE TABLE `Group`(
    GroupID int primary key AUTO_INCREMENT,
    GroupName varchar(50) not null unique ,
    CreatorID int not null ,
    CreateDate datetime DEFAULT current_timestamp,
    foreign key (CreatorID) references account(AccountID)
);
-- Table 5: GroupAccount
-- GroupID:  định danh của nhóm
-- AccountID:  định danh của User
-- JoinDate: Ngày user tham gia vào nhóm
CREATE TABLE GroupAccount(
    GroupID int not null ,
    AccountID int not null ,
    JoinDate datetime default CURRENT_TIMESTAMP,
    primary key (GroupID,AccountID),
    FOREIGN KEY (GroupID) references `Group`(GroupID),
    foreign key (AccountID)references Account(AccountID)
);
-- Table 6: TypeQuestion
-- TypeID:  định danh của loại câu hỏi (auto increment)
-- TypeName:  tên của loại câu hỏi (Essay, Multiple-Choice)
CREATE TABLE TypeQuestion(
    TypeID int auto_increment primary key ,
    TypeName enum ('Essay','Multiple-Choice') not null
);
-- Table 7: CategoryQuestion
-- CategoryID:  định danh của chủ đề câu hỏi (auto increment)
-- CategoryName:  tên của chủ đề câu hỏi (Java, .NET, SQL, Postman, Ruby, …)
CREATE TABLE CategoryQuestion(
    CategoryID int auto_increment primary key ,
    CategoryName varchar(100) not null
);
-- Table 8: Question
-- QuestionID:  định danh của câu hỏi (auto increment)
-- Content:  nội dung của câu hỏi
-- CategoryID:  định danh của chủ đề câu hỏi
-- TypeID:  định danh của loại câu hỏi
-- CreatorID: id của người tạo câu hỏi
-- CreateDate: ngày tạo câu hỏi
CREATE TABLE Question(
    QuestionID int auto_increment primary key ,
    Content varchar(100) NOT NULL,
    CategoryID int NOT NULL ,
    TypeID int not null ,
    CreatorID int not null ,
    CreateDate datetime DEFAULT CURRENT_TIMESTAMP,
    foreign key (CreatorID) references Account(AccountID),
    foreign key (TypeID) references typequestion(TypeID),
    FOREIGN KEY (CategoryID) references CategoryQuestion(CategoryID)
);
-- Table 9: Answer
-- AnswerID:  định danh của câu trả lời (auto increment)
-- Content:  nội dung của câu trả lời
-- QuestionID:  định danh của câu hỏi
-- isCorrect: câu trả lời này đúng hay sai
CREATE table Answer(
    AnswerID int auto_increment primary key ,
    Content varchar(100) not null ,
    QuestionID int not null ,
    isCorrect boolean DEFAULT false,
    foreign key (QuestionID ) references question(QuestionID)
);
-- Table 10: Exam
-- ExamID:  định danh của đề thi (auto increment)
-- Code: mã đề thi
-- Title: tiêu đề của đề thi
-- CategoryID:  định danh của chủ đề thi
-- Duration: thời gian thi
-- CreatorID: id của người tạo đề thi
-- CreateDate: ngày tạo đề thi
create TABLE Exam(
    ExamID int primary key auto_increment,
    Code VARCHAR(20) Not Null unique ,
    Title varchar(50) NOT NULL ,
    CategoryID int not null ,
    Duration int not null ,
    CreatorID int not null,
    CreateDate datetime default CURRENT_TIMESTAMP,
    foreign key (CategoryID) references CategoryQuestion(CategoryID),
    foreign key (CreatorID) references account(AccountID)
);
-- Table 11: ExamQuestion
-- ExamID:  định danh của đề thi
-- QuestionID:  định danh của câu hỏi
CREATE TABLE ExamQuestion(
    ExamID int not null ,
    QuestionID int not null ,
    primary key (ExamID,QuestionID),
    foreign key (ExamID)references Exam(ExamID),
    foreign key (QuestionID)references Question(QuestionID)
);
-- Question 1: Thêm ít nhất 10 record vào mỗi table
INSERT INTO Department (DepartmentName) VALUES
('Sale'),('Marketing'),('HR'),('IT'),('Finance'),
('Support'),('QA'),('R&D'),('Operation'),('Training');
INSERT INTO `Position` (PositionName) VALUES
('Dev'),('Test'),('Scrum Master'),('PM'),('BA'),
('QA Lead'),('Tech Lead'),('Intern'),('Manager'),('Director');
INSERT INTO Account (Email, Username, FullName, DepartmentID, PositionID) VALUES
('a1@gmail.com','user1','Nguyen Van A',1,1),
('a2@gmail.com','user2','Tran Van B',2,2),
('a3@gmail.com','user3','Le Van C',3,3),
('a4@gmail.com','user4','Pham Van D',4,4),
('a5@gmail.com','user5','Hoang Van E',5,5),
('a6@gmail.com','user6','Vu Van F',6,6),
('a7@gmail.com','user7','Do Van G',7,7),
('a8@gmail.com','user8','Bui Van H',8,8),
('a9@gmail.com','user9','Dang Van I',9,9),
('a10@gmail.com','user10','Ngo Van K',10,10);
INSERT INTO `Group` (GroupName, CreatorID) VALUES
('Java Team',1),('SQL Team',2),('DevOps Team',3),('QA Team',4),
('Backend Team',5),('Frontend Team',6),('Mobile Team',7),
('AI Team',8),('Security Team',9),('Training Team',10);
INSERT INTO GroupAccount (GroupID, AccountID) VALUES
(1,1),(1,2),(2,3),(2,4),(3,5),
(4,6),(5,7),(6,8),(7,9),(8,10);
INSERT INTO TypeQuestion (TypeName) VALUES
('Essay'),('Multiple-Choice'),
('Essay'),('Multiple-Choice'),
('Essay'),('Multiple-Choice'),
('Essay'),('Multiple-Choice'),
('Essay'),('Multiple-Choice');
INSERT INTO CategoryQuestion (CategoryName) VALUES
('Java'),('.NET'),('SQL'),('Postman'),('Ruby'),
('Python'),('JavaScript'),('Docker'),('Linux'),('Testing');
INSERT INTO Question (Content, CategoryID, TypeID, CreatorID) VALUES
('What is JVM?',1,1,1),
('What is JOIN?',3,2,2),
('Explain OOP',1,1,3),
('What is Docker?',8,2,4),
('What is REST API?',4,2,5),
('Explain Unit Test',10,1,6),
('What is Index?',3,2,7),
('Explain Linux permission',9,1,8),
('What is Python?',6,2,9),
('Explain Git',7,1,10);
INSERT INTO Answer (Content, QuestionID, isCorrect) VALUES
('Java Virtual Machine',1,1),
('Used to combine tables',2,1),
('Object Oriented Programming',3,1),
('Container platform',4,1),
('API over HTTP',5,1),
('Test từng module',6,1),
('Tăng tốc truy vấn',7,1),
('rwx permission',8,1),
('Programming language',9,1),
('Version control system',10,1);
INSERT INTO Exam (Code, Title, CategoryID, Duration, CreatorID) VALUES
('EX001','Java Basic',1,60,1),
('EX002','SQL Basic',3,45,2),
('EX003','Docker Test',8,30,3),
('EX004','Linux Test',9,45,4),
('EX005','Python Test',6,60,5),
('EX006','JS Test',7,45,6),
('EX007','Testing',10,30,7),
('EX008','Postman',4,30,8),
('EX009','Ruby',5,45,9),
('EX010','DevOps',8,60,10);
INSERT INTO ExamQuestion (ExamID, QuestionID) VALUES
(1,1),(1,3),
(2,2),(2,7),
(3,4),(3,10),
(4,8),(4,6),
(5,9),(6,5);
-- Question 2: Lấy ra tất cả các phòng ban
SELECT DepartmentName as PhongBan
FROM department;
-- Question 3: Lấy ra id của phòng ban "Sale"
select *
FROM department
WHERE DepartmentName='Sale';
-- Question 4: Lấy ra thông tin account có full name dài nhất
SELECT *
from account
where length(FullName)=(select max(length(FullName))from account);
-- Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id  = 3
SELECT *
from account
where DepartmentID=3 and length(FullName)=(select max(length(FullName))from account);
-- Question 6: Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT GroupName
from `Group` a
LEFT JOIN GroupAccount b on a.GroupID = b.GroupID
WHERE CreateDate < 2019/12/20;
-- Question 7: Lấy ra ID của question có >= 4 câu trả lời
SELECT QuestionID
FROM Answer
GROUP BY QuestionID
HAVING COUNT(*) >= 4;
-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019
SELECT Code
from Exam
WHERE Duration >=60 and CreateDate <'2019/12/20';
-- Question 9: Lấy ra 5 group được tạo gần đây nhất
SELECT GroupName
From `group`
order by CreateDate DESC
LIMIT 5;
-- Question 10: Đếm số nhân viên thuộc department có id = 2
SELECT COUNT(*)
from account
WHERE DepartmentID = 2
GROUP BY AccountID;
-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"
SELECT FullName
from Account
WHERE FullName like 'D%o';
-- Question 12: Xóa tất cả các exam được tạo trước ngày 20/12/2019
DELETE from exam
where CreateDate <'2019/12/20';
-- Question 13: Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi
DELETE from question
WHERE Content like 'câu hỏi%';
-- Question 14: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc"
-- và email thành loc.nguyenba@vti.com.vn
update account
Set FullName='Nguyễn Bá Lộc' , Email='loc.nguyenba@vti.com.vn '
where AccountID=5;
-- Question 15: update account có id = 5 sẽ thuộc group có id = 4
UPDATE GroupAccount
SET GroupID = 4
WHERE AccountID = 5;
-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT *
FROM Account a
LEFT JOIN department b on a.DepartmentID = b.DepartmentID;
-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010
select *
FROM account
WHERE CreateDate >2010/12/20;
-- Question 3: Viết lệnh để lấy ra tất cả các developer
SELECT *
FROM Position a
RIGHT JOIN Account b on a.PositionID=b.PositionID
WHERE a.PositionName='DEV';
-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT a.DepartmentID,a.DepartmentName,COUNT(b.AccountID) as sonhanvien
from Department a
LEFT JOIN Account b on a.DepartmentID = b.DepartmentID
GROUP BY a.DepartmentID,a.DepartmentName
having sonhanvien >=3;
-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT a.QuestionID,a.Content,count(b.QuestionID) as sudung
FROM question a
LEFT JOIN ExamQuestion b on a.QuestionID = b.QuestionID
GROUP BY a.QuestionID,a.Content
having sudung =(select max(bit)
    FROM (select count(*) as bit
         from examquestion
        GROUP BY QuestionID
                     )ab
);
-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT a.CategoryID,a.CategoryName,COUNT( b.QuestionID) as sudung
FROM CategoryQuestion a
LEFT JOIN question b on a.CategoryID = b.CategoryID
GROUP BY a.CategoryID,a.CategoryName;
-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT a.QuestionID,a.Content,COUNT(b.ExamID) as sudung
FROM question a
LEFT JOIN ExamQuestion b on a.QuestionID = b.QuestionID
GROUP BY a.QuestionID,a.Content;
-- Question 8: Lấy ra Question có nhiều câu trả lời nhất
select a.QuestionID,a.Content,COUNT(b.AnswerID) as maxtl
FROM question a
left join answer b on a.QuestionID =b.QuestionID
GROUP BY a.QuestionID,a.Content
HAVING maxtl=(SELECT max(atc)
    FROM (select COUNT(*) as atc
    from answer
    group by QuestionID) ab);
-- Question 9: Thống kê số lượng account trong mỗi group
SELECT a.GroupID,a.GroupName,COUNT(b.AccountID) as soluong
FROM `group` a
JOIN groupaccount b on a.GroupID = b.GroupID
GROUP BY a.GroupID,a.GroupName;
-- Question 10: Tìm chức vụ có ít người nhất
SELECT a.PositionID,a.PositionName,COUNT(b.AccountID) as soluong
FROM position a
left join  account b on a.PositionID=b.PositionID
GROUP BY a.PositionID,a.PositionName
HAVING soluong = (select MIN(tt)
    from (select COUNT(*) as tt
        from account
        GROUP BY PositionID)ac
);
-- Question 11: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
select a.DepartmentName,a.DepartmentID,
       SUM(case when c.PositionName='Dev'then 1 else 0 end) as soDEV,
       SUM(case when c.PositionName='test'then 1 else 0 end) as sotest,
       SUM(case when c.PositionName='scrum master'then 1 else 0 end) as soscrummaster,
       SUM(case when c.PositionName='PM'then 1 else 0 end) as soPM
FROM department a
LEFT JOIN account b on a.DepartmentID = b.DepartmentID
left join Position c on b.PositionID=c.PositionID
GROUP BY a.DepartmentName,a.DepartmentID;
-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question,
-- loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …
SELECT a.*,b.TypeName,CategoryName,d.FullName,e.Content
from Question a
LEFT JOIN TypeQuestion b on a.TypeID=b.TypeID
LEFT JOIN CategoryQuestion c on a.CategoryID = c.CategoryID
JOIN Account d on a.CreatorID = d.AccountID
LEFT JOIN answer e on e.QuestionID=a.QuestionID;
--  uestion 13: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
select A.TypeID,a.TypeName,COUNT(b.QuestionID) as soluong
fROM TypeQuestion A
join Question b on a.TypeID=b.TypeID
group by A.TypeID,a.TypeName;
-- Question 14:Lấy ra group không có account nào
SELECT *
FROM `Group` a
left join GroupAccount b on a.GroupID = b.GroupID
WHERE b.AccountID  is null;
-- Question 15: Lấy ra group không có account nào
SELECT *
FROM `Group` a
left join GroupAccount b on a.GroupID = b.GroupID
WHERE b.AccountID  is null;
-- Question 16: Lấy ra question không có answer nào
SELECT *
FROM question a
left join answer b on b.QuestionID=a.QuestionID
where b.Content is null ;
-- Exercise 2: Union Question 17:
-- Lấy các account thuộc nhóm thứ 1
-- Lấy các account thuộc nhóm thứ 2
-- Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau
SELECT a.*
FROM Account a
JOIN GroupAccount ga ON a.AccountID = ga.AccountID
WHERE ga.GroupID = 1

UNION

SELECT a.*
FROM Account a
JOIN GroupAccount ga ON a.AccountID = ga.AccountID
WHERE ga.GroupID = 2;
-- Question 18:
-- Lấy các group có lớn hơn 5 thành viên
-- Lấy các group có nhỏ hơn 7 thành viên
-- Ghép 2 kết quả từ câu a) và câu b)
SELECT a.GroupID,a.GroupName,count(b.AccountID) as thanhvien
FROM `group` a
LEFT JOIN GroupAccount b on a.GroupID = b.GroupID
GROUP BY a.GroupID,a.GroupName
having thanhvien > 5

UNION

SELECT a.GroupID,a.GroupName,count(b.AccountID) as thanhvien
FROM `group` a
         LEFT JOIN GroupAccount b on a.GroupID = b.GroupID
GROUP BY a.GroupID,a.GroupName
having thanhvien > 7;













