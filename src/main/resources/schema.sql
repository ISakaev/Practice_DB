CREATE TABLE IF NOT EXISTS Organization (
    id                   INTEGER                         COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
    version              INTEGER         NOT NULL        COMMENT 'Служебное поле hibernate',
    name                 VARCHAR(50)     NOT NULL        COMMENT 'Название организации',
    full_name            VARCHAR(150)    NOT NULL        COMMENT 'Полное название организации',
    inn                  VARCHAR(10)     NOT NULL        COMMENT 'ИНН организации',
    kpp                  VARCHAR(10)     NOT NULL        COMMENT 'КПП организации',
    address              VARCHAR(150)    NOT NULL        COMMENT 'Юридический дрес организации',
    phone                VARCHAR(20)     NOT NULL        COMMENT 'Номер телефона организации',
    is_active            VARCHAR(5)     NOT NULL DEFAULT FALSE COMMENT 'Отметка активности'
);
COMMENT ON TABLE Organization IS 'Организация';

CREATE TABLE IF NOT EXISTS Office (
    id                   INTEGER                         COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
    version              INTEGER         NOT NULL        COMMENT 'Служебное поле hibernate',
    name                 VARCHAR(50)     NOT NULL        COMMENT 'Название офиса',
    address              VARCHAR(150)    NOT NULL        COMMENT 'Адрес офиса',
    phone                VARCHAR(20)     NOT NULL        COMMENT 'Телефон офиса',
    org_id               INTEGER         NOT NULL        COMMENT 'Уникальный идентификатор организации',
    is_active            VARCHAR(50)     NOT NULL DEFAULT FALSE COMMENT 'Отметка идентификации'
);
COMMENT ON TABLE Office IS 'Офис';

CREATE TABLE IF NOT EXISTS Employee (
    id                  INTEGER                          COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
    version             INTEGER         NOT NULL         COMMENT 'Служебное поле hibernate',
    first_name          VARCHAR(20)     NOT NULL         COMMENT 'Имя',
    last_name           VARCHAR(20)     NOT NULL         COMMENT 'Фамилия',
    middle_name         VARCHAR(20)     NOT NULL         COMMENT 'Отчество',
    position            VARCHAR(20)     NOT NULL         COMMENT 'Позиция',
    phone               VARCHAR(20)     NOT NULL         COMMENT 'Номер телефона',
    doc_id              INTEGER         NOT NULL         COMMENT 'Уникальный идентификатор документа',
    citizenship_code    INTEGER         NOT NULL         COMMENT 'Уникальный идентификатор страны',
    office_id           INTEGER         NOT NULL         COMMENT 'Уникальный идентификатор офиса',
    is_identified       VARCHAR(50)     NOT NULL DEFAULT FALSE COMMENT 'Отметка идентификации'
);
COMMENT ON TABLE User IS 'Сотрудник';

CREATE TABLE IF NOT EXISTS Doc (
    id                  INTEGER                          COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT ,
    version             INTEGER         NOT NULL         COMMENT 'Служебное поле hibernate',
    documentation_code  INTEGER         NOT NULL         COMMENT 'Уникальный идентификатор кода документа',
    number              VARCHAR(50)     NOT NULL         COMMENT 'Номер документа',
    date                VARCHAR(50)     NOT NULL         COMMENT 'Дата выдачи документа',
    user_id             INTEGER         NOT NULL         COMMENT 'Уникальный идентификатор офиса',
);
COMMENT ON TABLE User IS 'Пользователь';

CREATE TABLE IF NOT EXISTS Documentation (
    code                INTEGER         NOT NULL         COMMENT 'Уникальный идентификатор' PRIMARY KEY,
    version             INTEGER         NOT NULL         COMMENT 'Служебное поле hibernate',
    name                VARCHAR(50)     NOT NULL         COMMENT 'Название документа',
);
COMMENT ON TABLE Doc IS 'Документ';

CREATE TABLE IF NOT EXISTS Country (
    code                INTEGER        NOT NULL          COMMENT 'Уникальный идентификатор' PRIMARY KEY,
    version             INTEGER        NOT NULL          COMMENT 'Служебное поле hibernate',
    name                VARCHAR(50)    NOT NULL          COMMENT 'Имя',
);
COMMENT ON TABLE Country IS 'Страна';

CREATE INDEX IX_Organization_Id ON Office (org_id);
ALTER TABLE Office ADD FOREIGN KEY (org_id) REFERENCES Organization(id);

CREATE INDEX IX_Office_Id ON Employee (office_id);
ALTER TABLE Employee ADD FOREIGN KEY (office_id) REFERENCES Office(id);

CREATE INDEX IX_Doc_Id ON Employee (doc_id);
ALTER TABLE Employee ADD FOREIGN KEY (doc_id) REFERENCES Doc(id);

CREATE INDEX IX_Documentation_Code ON Employee (documentation_code);
ALTER TABLE Employee ADD FOREIGN KEY (documentation_code) REFERENCES Documentation(code);

CREATE INDEX IX_Country_Code ON Employee (citizenship_code);
ALTER TABLE Employee ADD FOREIGN KEY (citizenship_code) REFERENCES Country(code);
