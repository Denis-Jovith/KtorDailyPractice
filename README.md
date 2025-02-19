# Ktor Daily Practice - Back to Learning with Commitment

This project marks my return to mastering Ktor and expanding my web development skills. I'm committed to continuous learning, exploring new Ktor features, and applying them in real-world scenarios.

## Useful Links

- [Ktor Documentation](https://ktor.io/docs/home.html) – The official Ktor documentation for reference.
- [Ktor GitHub Page](https://github.com/ktorio/ktor) – Explore the official Ktor GitHub repository.
- [Ktor Slack Chat](https://app.slack.com/client/T09229ZC6/C0A974TJ9) – Join the Ktor community on Slack (request an invite [here](https://surveys.jetbrains.com/s3/kotlin-slack-sign-up)).

## Features

This project incorporates some foundational Ktor features, which are integral to understanding the framework:

| Feature     | Description                                                 |
|-------------|------------------------------------------------------------- |
| **Routing** | Allows defining structured routes and associated handlers.  |

## Building & Running

To build or run the project, use one of the following Gradle tasks:

| Task                              | Description                                                          |
|-----------------------------------|---------------------------------------------------------------------- |
| `./gradlew test`                 | Run the tests                                                        |
| `./gradlew build`                | Build the project                                                     |
| `buildFatJar`                     | Create an executable JAR of the server with all dependencies included |
| `buildImage`                      | Build the Docker image for the fat JAR                               |
| `publishImageToLocalRegistry`    | Publish the Docker image locally                                      |
| `run`                             | Run the server                                                       |
| `runDocker`                       | Run using the local Docker image                                     |

Upon successful startup, you should see output similar to:

