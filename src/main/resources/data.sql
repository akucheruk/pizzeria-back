INSERT INTO topping (id, topping) VALUES (1, 'CHEESE');
INSERT INTO topping (id, topping) VALUES (2, 'TOMATO');
INSERT INTO topping (id, topping) VALUES (3, 'SAUSAGES');
INSERT INTO topping (id, topping) VALUES (4, 'BROCCOLI');

INSERT INTO customer (id, email) VALUES (1, 'chuck.norris@fake_gmail.com');
INSERT INTO customer (id, email) VALUES (2, 'mr.smith@fake_gmail.com');

INSERT INTO customer_topping (customer_id, topping_id) VALUES (1, 1);
INSERT INTO customer_topping (customer_id, topping_id) VALUES (1, 2);
INSERT INTO customer_topping (customer_id, topping_id) VALUES (1, 4);
INSERT INTO customer_topping (customer_id, topping_id) VALUES (2, 1);