Network Node Health Analyser

A Java project that:
- Loads network nodes from a JSON file
- Calculates a health score for each node
- Classifies health as HEALTHY, DEGRADED, or CRITICAL
- Prints a formatted report

Features
- JSON parsing using Jackson
- Health scoring algorithm based on latency, packet loss, and status
- Clean project architecture (Models, Services, App)
- Maven project structure

Future Improvements

This project can be expanded further with a few small upgrades:

- Sort nodes by health score.
- Print a more detailed health report.
- Add unit tests for the scoring and classification.
- Add a REST API version using Spring Boot.
- Improve the console output formatting.

