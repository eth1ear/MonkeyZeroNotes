# Monkey Zero Notes

## Project Description

Monkey Zero Notes is an Android application designed to provide a simple and intuitive note management system. Users can create, edit, and delete notes, with note data stored in a local database. The application utilizes Android Studio as the development environment, is written in Java, and uses the Room database for data management.

## Preparing for Development

### Environment Requirements

- Android Studio 2020.3.1 or higher
- Gradle 6.7.1 or higher
- Android SDK version 21 or higher

### Cloning the Project from GitHub

First, you need to clone the project from GitHub to your local machine using the following commands:

```
git clone https://github.com/eth1ear/MonkeyZeroNotes.git
cd MonkeyZeroNotes
```

### Installing Dependencies

The project uses Gradle to manage dependencies. After opening Android Studio, all dependencies should automatically install. If dependencies fail to install automatically, try running the following command manually:

```
./gradlew build
```

## How to Run the Project

### Using Android Studio

1. Open Android Studio.
2. Select "Open an Existing Project" and navigate to the project root directory.
3. Wait for Android Studio to load the project and build Gradle.
4. Connect an Android device or set up an Android Virtual Device (AVD).
5. Click the "Run" button in Android Studio and select your device to run the app.

### Using the Command Line

If you prefer using the command line, you can build and run the project with the following commands:

```
./gradlew assembleDebug  # Build the Debug APK
./gradlew installDebug   # Install the Debug APK to a connected Android device
```

## APK File

If you just want to install and test the application, you can directly download the precompiled APK file from the GitHub Releases page.

Visit [here](https://github.com/eth1ear/MonkeyZeroNotes/tree/main/app/release) to download the latest version of the APK file.

## How to Contribute

We welcome all forms of contributions, whether it's new features, bug fixes, or documentation improvements. Please follow these simple steps:

1. Fork the repository and create your branch.
2. If you add code, make sure to write corresponding tests.
3. If you change the API, update the documentation.
4. Ensure your code passes all tests.
5. Submit a Pull Request.

## License

This project is released under the MIT License.