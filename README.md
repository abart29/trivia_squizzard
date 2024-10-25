# Trivia Game Application

This is a full-stack Trivia Game application built with a Spring Boot backend and React frontend. The application allows users to register, login, and participate in a trivia quiz. It also includes a leaderboard to track users' scores.

## Features

- User Authentication (Signup/Login)
- Trivia Game with multiple-choice questions
- Leaderboard to display top scores
- RESTful API integration for user and game management
- Dynamic question fetching from the Open Trivia Database
- Responsive design

## Tech Stack

### Backend (API)
- Java
- Spring Boot
- JPA/Hibernate
- H2 Database (for development)
- REST API

### Frontend (UI)
- React.js
- JavaScript (ES6+)
- CSS Modules

## Backend Structure

- **Controllers**: Handles incoming requests and routes them to appropriate services
  - `GameQuestionController.java`: Manages questions for the trivia game
  - `UserController.java`: Handles user authentication and management
- **Models**: Entity classes that represent the data
  - `GameQuestion.java`: Represents a trivia question
  - `User.java`: Represents a user of the application
- **Repositories**: Interfaces for database access
  - `GameQuestionRepository.java`: Handles CRUD operations for `GameQuestion`
  - `UserRepository.java`: Handles user-related database operations
- **Configuration**: Config files for security, encoding, and documentation
  - `EncoderConfig.java`: Configures password encoding
  - `SecurityConfig.java`: Sets up application security and authorization
  - `SwaggerConfig.java`: Configures Swagger for API documentation
  - `WebConfig.java`: Configures CORS and other web settings
- **DTOs**: Data Transfer Objects for structuring API requests and responses
  - `AnswersDTO.java`: Represents answers submitted in a trivia session
  - `AuthRequestDTO.java`: Represents authentication requests (login)
  - `ScoresDTO.java`: Represents user scores data
- **Security**: Security configuration and utilities
  - `CustomUserDetailsService.java`: Custom service for user authentication
  - `JwtUtil.java`: Utility for handling JWT creation and validation
- **Database Migration**: 
  - SQL schema defined in `V1__initial_db_schema.sql`

### Frontend Structure

- **Pages**:
  - `Game.jsx`: Handles the trivia game logic and UI
  - `Home.jsx`: Homepage of the application
  - `Leaderboard.jsx`: Displays top scores
  - `Login.jsx`: User login form
  - `Navbar.jsx`: Navigation bar for accessing different sections of the app
  - `Profile.jsx`: Displays user profile information
  - `Signup.jsx`: User registration form
- **CSS**:
  - `Style.css`: General styles for the app, including layout and animations
- **Services**:
  - `UserService.js`: Handles user-related requests (login, signup, fetching users)

## How to Run

### Create the Database
1. Create a new database named `trivia_springboot_development` in your preferred SQL database (H2, PostgreSQL, MySQL, etc.).

### Backend
1. Clone the repository:
```bash
git clone https://github.com/your-repo/trivia_squizzard.git
cd trivia-game-backend
```
2. Build and run the Spring Boot application:
```bash
./gradlew bootRun
```
### Frontend
Open a seperate terminal window
1. Navigate to the frontend folder:
```bash
cd trivia-frontend
```
2. Install dependencies:
```bash
npm install
```
3. Start the development server:
```bash
npm run dev
```
Open http://localhost:5173 in your browser to view the application.

Accessing the Application

## Accessing the Application

- **Local Development**: [http://localhost:5173](http://localhost:5173) (Vite development server)
- **Deployed Version**: [https://trivia-react-latest.onrender.com/signup](https://trivia-react-latest.onrender.com/signup)

