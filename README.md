# Old Hebrew

> Repository: `avi-kohen/ancient-hebrew`
> App Name: Old Hebrew

A comprehensive Android app to compare, learn, and translate ancient (Paleo) Hebrew script into modern Hebrew. Built with Kotlin and Jetpack Compose, this project mimics real-world development workflows and is ideal for showcasing on your résumé.

A comprehensive Android app to compare, learn, and translate ancient (Paleo) Hebrew script into modern Hebrew. Built with Kotlin and Jetpack Compose, this project mimics real‑world development workflows and is ideal for showcasing on your résumé.

---

## Table of Contents

- [Description](#description)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the App](#running-the-app)
- [Project Structure](#project-structure)
- [Workflow](#workflow)
- [Contributing](#contributing)
- [License](#license)

---

## Description

This project is an educational and translation tool focusing on the evolution of Hebrew writing. It includes:

- **Alphabet Comparison**: Side‑by‑side view of Paleo‑Hebrew vs. Modern Hebrew letters.
- **History & Lessons**: Concise modules on the origins and evolution of the script.
- **Text Converter**: Instant transliteration of ancient text input.
- **Live & Photo Translation**: Real‑time camera overlay and photo‑capture OCR for translating inscriptions.

The codebase follows industry best practices, including MVVM architecture, GitHub‑based issue tracking, and CI pipelines. Perfect for learners who want end‑to‑end exposure to mobile app development.

---

## Features (MVP)

1. **Alphabet Comparison**: 22‑letter mapping, scrollable list.
2. **History & Lessons**: Lesson list + detailed view with text and images.
3. **Text Converter**: Paste or type ancient text → modern Hebrew output.
4. **Navigation**: Bottom navigation with Compare, Lessons, Converter, Camera.
5. **Live Camera Translation**: Overlay modern Hebrew in real-time.
6. **Photo-Capture Translation**: Capture image and transliterate.

Future enhancements include OCR from gallery, quiz mode, audio pronunciations, and offline dictionaries.

---

## Tech Stack

- **Language**: Kotlin
- **UI**: Jetpack Compose
- **Architecture**: MVVM (ViewModel + StateFlow)
- **Camera**: CameraX
- **OCR**: ML Kit Text Recognition
- **Database**: Room (for future offline features)
- **Version Control**: Git & GitHub (branch-per-feature)
- **CI**: GitHub Actions (lint, unit tests)
- **IDE**: Android Studio (Arctic Fox+)

---

## Getting Started

### Prerequisites

- JDK 11+
- Android Studio Arctic Fox (or later)
- Android SDK Platform 34
- Git

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/avi-kohen/ancient-hebrew.git
   cd ancient-hebrew
   ```
2. **Open in Android Studio**
   - Choose "Open an existing project" and select the cloned folder.
3. **Configure Build**
   - Ensure `minSdkVersion` is set to `24` in `build.gradle`.
   - Sync Gradle.

### Running the App

- Select an emulator or physical device running Android 7.0+ (API 24+)
- Click **Run** ▶️ in Android Studio

---

## Project Structure

```
ancient-hebrew-translator/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/ancienthebrew/
│   │   │   ├── ui/
│   │   │   │   ├── CompareScreen.kt
│   │   │   │   ├── HistoryScreen.kt
│   │   │   │   ├── ConverterScreen.kt
│   │   │   │   ├── CameraScreen.kt
│   │   │   ├── viewmodel/
│   │   │   │   └── MainViewModel.kt
│   │   │   └── data/
│   │   │       ├── alphabet_mapping.json
│   │   │       └── lessons.json
│   │   └── AndroidManifest.xml
│   └── build.gradle
├── .github/
│   └── ISSUE_TEMPLATE/
│       ├── feature_request.md
│       └── bug_report.md
├── README.md
└── build.gradle
```

---

## Workflow

1. **Branch Strategy**
   - `main`: stable releases
   - `dev`: integration channel
   - `feature/<story>`: individual user‑story branches
2. **Issue Tracking**
   - Six MVP issues defined in the Issues tab
   - Link commits with `#issueNumber`
3. **Pull Requests**
   - Open a PR against `dev` for each feature
   - Include screenshots or GIFs for UI changes
   - Ensure all checks pass before merging

---

## Contributing

1. Fork the repo
2. Create a feature branch: `git checkout -b feature/your-feature`
3. Commit your changes: `git commit -m "feat: add example feature"`
4. Push to your fork: `git push origin feature/your-feature`
5. Open a Pull Request against `dev`
6. Review and merge once approved

---

## License

© 2025 Avi Kohen. All rights reserved.

This project and its source code are the exclusive intellectual property of Avi Kohen.  
You are granted a personal, non-commercial license to copy, review, and learn from the code.  
Any modification, distribution, sublicensing, reverse-engineering, or commercial use—including selling or monetizing the software—is strictly prohibited without prior written permission from Avi Kohen.

