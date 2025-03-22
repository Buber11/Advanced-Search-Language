# Advanced-Search-Language
 

Query Language for Browsers using ANTLR
 


 

# Project Description
 

This project aims to create a custom query language that will be converted into SQL using ANTLR. The language will enable data searches on websites like Twitter in a user-friendly manner.
 


 

# Key Features
 

- Grammar definition in ANTLR for the custom query language.
 

- Parser to transform queries into SQL statements.
 

- Support for query filters (e.g., date range, keywords, authors).
 


 

# Example Queries
 

Our query language might look like this:  
 

```
 

FIND tweets WHERE author = "elonmusk" AND date > "2024-01-01"
 

```
 


 

Converted to SQL:  
 

```
 

SELECT * FROM tweets WHERE author = 'elonmusk' AND date > '2024-01-01';
 

```
 


 

# Technologies Used
 

- ANTLR - for creating grammar and parser.  
 

- Java & Spring Boot - for query processing and SQL conversion.  
 

- PostgreSQL -  example databases for testing  
