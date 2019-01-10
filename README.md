# ProgramowanieObiektoweProjekt
Aby stworzyć potrzebną bazę danych należy w NetBeans wejść w zakładkę Services -> Databases, prawy przycisk myszy na Java DB i Create Data Base.
Nazwę ustawić na MyDataBase
Login: student
Hasło: student
W Services -> Drivers -> powstanie jdbc:derby://localhost:1527/MyDataBase, wejść i stworzyć tabelę z czterema klumnami
ID jako klucz główny, INTEGER
NAME jako VARCHAR(20)
SURNAME jako VARCHAR(20)
PHONENUMBER jako VARCHAR, Column Size 10.
Kiedy baza jest stworzona prawy przycisk na nią i Connect.
Libaries prawy przycisk myszy "Add JAR/Folder" i dodajemy plik załączony rs2xml.jar albo ściągamy z https://www.dropbox.com/s/zrxff09igs07ltf/rs2xml.jar?dl=0
W Libaries trzeba dodać bibliotekę Libaries->ppm Add Library i dodajemy Java DB Driver.
Teraz prawy przycisk na GUI.java i Run File.
