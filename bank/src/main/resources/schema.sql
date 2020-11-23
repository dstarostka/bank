DROP SCHEMA IF EXISTS bank_database;
CREATE SCHEMA bank_database;
USE bank_database;

CREATE TABLE account_type (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE user (
    user_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    pesel VARCHAR(50) NOT NULL,
    postal_code VARCHAR(50) NOT NULL,
    city VARCHAR(50) NOT NULL,
    street VARCHAR(50) NULL,
    house_number VARCHAR(50) NOT NULL,
    additional_info VARCHAR(50) NULL
);

CREATE TABLE account (
    account_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    account_number VARCHAR(50) NOT NULL,
    account_type_id BIGINT,
    user_id BIGINT,
    CONSTRAINT FK_account_account_type_id FOREIGN KEY (account_type_id) REFERENCES account_type(id),
    CONSTRAINT FK_account_user_id FOREIGN KEY (user_id) REFERENCES user(user_id)
);

CREATE TABLE recipient (
    recipient_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    account_number VARCHAR(50) NOT NULL,
    user_id BIGINT,
    CONSTRAINT FK_recipient_user_id FOREIGN KEY (user_id) REFERENCES user(user_id)
);

CREATE TABLE transaction (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(50) NULL,
    transaction_amount DECIMAL NOT NULL,
    transaction_date TIMESTAMP NOT NULL,
    posting_date TIMESTAMP NOT NULL,
    account_type_id BIGINT,
    user_id BIGINT,
    recipient_id BIGINT,
    CONSTRAINT FK_transaction_account_type_id FOREIGN KEY (account_type_id) REFERENCES account_type(id),
    CONSTRAINT FK_transaction_user_id FOREIGN KEY (user_id) REFERENCES user(user_id),
    CONSTRAINT FK_transaction_recipient_id FOREIGN KEY (recipient_id) REFERENCES recipient(recipient_id)
);