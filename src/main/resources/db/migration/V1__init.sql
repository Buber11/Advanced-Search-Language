CREATE TABLE post (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    language VARCHAR(3) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMP NOT NULL DEFAULT NOW()
);

CREATE TABLE author (
    id SERIAL PRIMARY KEY,
    post_id INTEGER NOT NULL,
    name VARCHAR(100) NOT NULL,
    surname VARCHAR(100) NOT NULL,
    CONSTRAINT fk_post_author FOREIGN KEY (post_id) REFERENCES post(id) ON DELETE CASCADE
);

CREATE TABLE photo (
    id SERIAL PRIMARY KEY,
    post_id INTEGER NOT NULL,
    photo BYTEA,
    CONSTRAINT fk_post_photo FOREIGN KEY (post_id) REFERENCES post(id) ON DELETE CASCADE
);
