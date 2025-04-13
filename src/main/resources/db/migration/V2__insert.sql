-- Wstawianie danych do tabeli post
INSERT INTO post (title, description, language, created_at, updated_at) VALUES
('AI Revolution', 'How AI is changing the world', 'EN', '1992-05-05 00:00:01', '2025-04-11'),
('Sztuczna Inteligencja', 'Wpływ AI na rynek pracy', 'PO', '2024-01-01', '2024-01-01'),
('Future of Space Travel', 'Elon Musk’s vision for Mars', 'EN', '1992-05-05', NOW()),
('Niepokój czy nadzieja - Sztuczna inteligencja', 'Wpływ AI na życie codzienne obywateli III RP', 'PO', NOW(), NOW()),
('Future of Electric Cars', 'Elon Musk’s vision for Tesla', 'EN', NOW(), NOW()),
('Die Auswirkungen der KI auf den Alltag der Bürger der Dritten Polnischen Republik', 'Die Auswirkungen der KI auf den Arbeitsmarkt', 'GE', NOW(), NOW()),
('Die Zukunft der Elektroautos', 'Elon Musk’s vision for Tesla auf Deutsch', 'GE', NOW(), NOW())
;

-- Wstawianie danych do tabeli author
INSERT INTO author (post_id, name, surname) VALUES
(1, 'John', 'Doe'),
(2, 'Anna', 'Kowalska'),
(3, 'Elon', 'Musk');


-- Wstawianie danych do tabeli post_author
INSERT INTO post_author (post_id, author_id) VALUES
(1, 1),  -- John Doe pisał "AI Revolution"
(2, 2),  -- Anna Kowalska pisała "Sztuczna Inteligencja"
(3, 3), -- Elon Musk pisał "Future of Space Travel"
(4, 2),
(5, 3),
(6, 2),
(7, 3);