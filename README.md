# Spring Batch ETL (Extract, Transform, Load)

The Spring Batch ETL (Extract, Transform, Load) project is a robust solution for efficiently processing and managing large-scale data transformations within a Spring Boot environment. Leveraging the power of Spring Batch, the project provides a structured and scalable approach to handling data extraction from a MySQL database, applying transformation logic, and loading the transformed data into a different database table.

## Table of Contents
- [Key Components](#key-components)
- [Additional Notes](#additional-notes)

## Project Structure

The project has the following main components:

- **Configuration Classes (`com.etl.batch.config`):**
  - `BatchConfiguration`: Configures Spring Batch job, step, reader, processor, and writer.
  
- **Controller (`com.etl.batch.controller`):**
  - `BatchController`: Exposes an endpoint to trigger the Spring Batch job.

- **Domain Classes (`com.etl.batch.domain`):**
  - `Profile`: Represents the target entity to store processed data.
  - `User`: Represents the source entity from which data is extracted.

- **Listener (`com.etl.batch.listener`):**
  - `JobCompletionNotificationListener`: Notifies when the Spring Batch job is completed.

- **Processor (`com.etl.batch.processor`):**
  - `ProfileItemProcessor`: Implements the logic to transform `User` entities into `Profile` entities.

- **Main Application Class (`com.etl.batch.SpringBatchDemoApplication`):**
  - `SpringBatchDemoApplication`: The main class to run the Spring Boot application.

- **SQL Data Files:**
  - `users.sql`: Contains sample user data for testing.

## Additional Notes

- The Spring Batch job reads data from the `User` table, processes it using the `ProfileItemProcessor`, and writes the transformed data to the `Profile` table.
- The `JobCompletionNotificationListener` provides a simple notification when the job is completed.
