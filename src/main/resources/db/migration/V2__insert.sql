-- Wstawianie danych do tabeli post
INSERT INTO post (title, description, language, created_at, updated_at) VALUES
('AI Revolution', 'How AI is changing the world', 'ENG', NOW(), NOW()),
('Sztuczna Inteligencja', 'Wpływ AI na rynek pracy', 'POL', NOW(), NOW()),
('Future of Space Travel', 'Elon Musk’s vision for Mars', 'ENG', NOW(), NOW());

-- Wstawianie danych do tabeli author
INSERT INTO author (post_id, name, surname) VALUES
(1, 'John', 'Doe'),
(2, 'Anna', 'Kowalska'),
(3, 'Elon', 'Musk');


-- Wstawianie danych do tabeli post_author
INSERT INTO post_author (post_id, author_id) VALUES
(1, 1),  -- John Doe pisał "AI Revolution"
(2, 2),  -- Anna Kowalska pisała "Sztuczna Inteligencja"
(3, 3);  -- Elon Musk pisał "Future of Space Travel"
