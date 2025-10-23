# LeetCode Problem Management Application

A Spring Boot application for managing and executing LeetCode problems. This application provides RESTful APIs to manage problems and execute their solutions.

## Project Structure

```
leet-code-java/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── leetcode/
│   │   │           ├── LeetCodeApp.java
│   │   │           ├── config/
│   │   │           ├── controller/
│   │   │           ├── model/
│   │   │           ├── problems/
│   │   │           └── service/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
└── pom.xml
```

## Prerequisites

- Java 21
- Maven
- Spring Boot 3.5.0

## Building the Project

```bash
mvn clean install
```

## Running the Application

```bash
mvn spring-boot:run
```

## Available Endpoints

### Problem Management

1. **Get All Problems**
   ```
   GET /api/problems
   ```

2. **Get Problem by ID**
   ```
   GET /api/problems/{id}
   ```

3. **Add New Problem**
   ```
   POST /api/problems
   ```
   Request body:
   ```json
   {
       "id": 412,
       "title": "FizzBuzz",
       "description": "Write a program that outputs the string representation of numbers from 1 to n...",
       "difficulty": "Easy"
   }
   ```

### Problem Execution

1. **Execute Problem Solution**
   ```
   POST /api/problems/execute
   ```
   Request body:
   ```json
   {
       "problemId": 412,
       "input": 15
   }
   ```
   Response:
   ```json
   {
       "problemId": 412,
       "result": ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"],
       "message": "Success"
   }
   ```

## Supported Problems

1. **FizzBuzz (412)**
   - Input: Integer n
   - Output: Array of strings containing FizzBuzz sequence

2. **Number of Steps to Reduce a Number to Zero (1342)**
   - Input: Integer num
   - Output: Integer representing number of steps

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Development with AI Assistance

This project was developed with the assistance of GitHub Copilot, an AI-powered coding assistant. Here's how the development process was enhanced through prompt engineering and AI collaboration:

### AI Capabilities Used

1. **Code Generation**
   - Spring Boot application structure
   - RESTful API endpoints
   - Problem solution implementations
   - Configuration setup
   - Model and DTO classes

2. **Code Organization**
   - Project structure recommendations
   - Package organization
   - Best practices implementation
   - Clean code principles

3. **Documentation**
   - README generation
   - API documentation
   - Code comments
   - Usage examples

### Prompt Engineering Process

The development workflow utilized strategic prompt engineering to achieve optimal results:

1. **Initial Setup**
   ```
   Create a Spring Boot application for managing LeetCode problems
   ```

2. **Feature Addition**
   ```
   Add an endpoint to execute LeetCode problems with request body containing problemId and input
   ```

3. **Problem Implementation**
   ```
   Implement solution for FizzBuzz (412) and Number Steps to Zero (1342)
   ```

4. **Documentation**
   ```
   Create comprehensive README with project structure and API documentation
   ```

### AI Assistant Details

- **Assistant**: GitHub Copilot
- **Version**: October 2025
- **Capabilities**:
  - Code generation and completion
  - Natural language understanding
  - Context-aware suggestions
  - Documentation generation
  - Best practices implementation

This collaboration between human developer and AI assistant demonstrates the potential of modern development workflows, where AI augments human creativity and expertise to produce high-quality, well-documented code efficiently.