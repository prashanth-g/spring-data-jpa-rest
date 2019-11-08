INSERT INTO test.book (book_id, name) VALUES (1, 'book1');

INSERT INTO test.book_category (category_id, name, book_id) VALUES (1, 'cate1', 1);

INSERT INTO test.book_price (price_id, price, category_id) VALUES (1, 100, 1);
INSERT INTO test.book_price (price_id, price, category_id) VALUES (2, 150, 1);
INSERT INTO test.book_price (price_id, price, category_id) VALUES (3, 200, 1);