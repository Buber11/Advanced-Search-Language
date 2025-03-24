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
    surname VARCHAR(100) NOT NULL
);

CREATE TABLE photo (
    id SERIAL PRIMARY KEY,
    post_id INTEGER NOT NULL,
    photo BYTEA
);

CREATE TABLE post_author(
    post_id BIGINT,
    author_id BIGINT,
    PRIMARY KEY (post_id, author_id),
    CONSTRAINT fk_post FOREIGN KEY (post_id) REFERENCES post(id) ON DELETE CASCADE,
    CONSTRAINT fk_author FOREIGN KEY (author_id) REFERENCES author(id) ON DELETE CASCADE
);

CREATE TABLE post_photo(
    post_id BIGINT,
    photo_id BIGINT,
    PRIMARY KEY (post_id, photo_id),
    CONSTRAINT fk_post FOREIGN KEY (post_id) REFERENCES post(id) ON DELETE CASCADE,
    CONSTRAINT fk_photo FOREIGN KEY (photo_id) REFERENCES photo(id) ON DELETE CASCADE
);

