# AccountExam

• installation sql server 2017 
• Open port 1433 on SQLServer Configuration Manager
• Create Database name account_db
• Download Project AccountExam.zip
• Import project to your IDE
• Change application.properties to your db configuration
• Launch AccountExam protject
• Open Postman > [POST] http://localhost:8080/registration
• add parameter to JSON raw body

{
    "username" : "AccountExam_Test",
    "password" : "testpassword",
    "address" : "KRAAM Sukhumvit 26 Sales Gallery Sukhumvit 26, Sukhumvit Road, Klongton Sub-district, Klongtoey District Bangkok",
    "phone" : "0877444841",
    "salary" : 40000
}
