INSERT INTO Organization (id, version, name, full_name, inn, kpp, address, phone, is_active)
VALUES (1, 0, 'Первая организация', 'Полное имя первой организации', 1122334455, 123456789, 'ул. Ленина, 25', 84951112233, 'FALSE');

INSERT INTO Organization (id, version, name, full_name, inn, kpp, address, phone, is_active)
VALUES (2, 0, 'Вторая организация', 'Полное имя второй организации', 5544332211, 987654321, 'ул. Проспект, 10', 84953332211, 'TRUE');

INSERT INTO Office (id, version, name, full_name,  address, phone, org_id, is_active)
VALUES (1, 0, 'Первый офис', 'л. Ленина, 15', 84951111111, 1, 'TRUE');

INSERT INTO Office (id, version, name, full_name,  address, phone, org_id, is_active)
VALUES (2, 0, 'Второй офис', 'л. Мира, 35', 84952222222, 2, 'TRUE');

INSERT INTO Employee (id, version, first_name, last_name, middle_name, possition, phone, doc_id, citizenship_code, office_id, is_identified)
VALUES (1, 0, 'Петр', 'Иванов', 'Николаевич', 'Разработчик', 89992225533, 1, 643, 1, 'FALSE');

INSERT INTO Employee (id, version, first_name, last_name, middle_name, possition, phone, doc_id, citizenship_code, office_id, is_identified)
VALUES (2, 0, 'Иван', 'Петров', 'Александрович', 'Стажер', 89993336677, 2, 643, 2, 'FALSE');

INSERT INTO Doc (id, version, documentation_code, number, date, user_id)
VALUES (1, 0, 23, "8020355665", '2020-01-01', 1);

INSERT INTO Doc (id, version, documentation_code, number, date, user_id)
VALUES (2, 0, 10, "8020556677", '2020-02-02', 2);

INSERT INTO Documentation (code, version, name) VALUES (91, 0, 'Иные документы  ');

INSERT INTO Documentation (code, version, name) VALUES (23, 0, 'Паспорт гражданина Российской Федерации');

INSERT INTO Documentation (code, version, name) VALUES (10, 0, 'Паспорт иностранного гражданина');

INSERT INTO Country (code, version, name) VALUES (643, 0, 'Российская Федерация');

INSERT INTO Country (code, version, name) VALUES (398, 0, 'Республика Казахстан');

INSERT INTO Country (code, version, name) VALUES (840, 0, 'Соединенные Штаты Америки');