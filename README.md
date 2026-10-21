# VIDHIDARPAN - AI Powered Legal Assistance Platform

<p align="center">
  <img src="screenshots/banner.png" alt="VIDHIDARPAN Banner" width="100%">
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Platform-Android-brightgreen" />
  <img src="https://img.shields.io/badge/Language-Java%20%7C%20Kotlin-blue" />
  <img src="https://img.shields.io/badge/Architecture-MVVM-orange" />
  <img src="https://img.shields.io/badge/Backend-Firebase-yellow" />
  <img src="https://img.shields.io/badge/AI-Legal%20Assistant-red" />
  <img src="https://img.shields.io/badge/License-MIT-success" />
</p>

---

## Overview

VIDHIDARPAN is an AI-powered Android application designed to simplify legal assistance by connecting users with verified legal professionals. The platform enables users to discover advocates based on their legal needs, communicate securely, receive AI-generated legal guidance, schedule consultations, and manage legal interactions through a single mobile application.

The application was developed to address the fragmented legal services ecosystem by creating a centralized platform that improves accessibility, transparency, and communication between citizens and legal professionals.

---

# Problem Statement

Finding trustworthy legal professionals can be difficult and time-consuming. Traditional legal consultation methods lack transparency, proper communication channels, and centralized access to verified advocates.

VIDHIDARPAN solves these challenges by providing:

- Verified Legal Professionals
- AI-powered Legal Guidance
- Smart Advocate Recommendations
- Secure Communication
- Ratings and Reviews
- Appointment Management
- Centralized Legal Assistance

---

# Features

## User Features

- User Registration
- Secure Login Authentication
- Edit Profile
- Browse Legal Professionals
- Search Advocates
- AI Legal Assistant
- Chat with Advocates
- View Chat History
- Appointment Booking
- Advocate Ratings
- Review System
- Legal Recommendations

---

## Advocate Features

- Advocate Registration
- Profile Verification
- Professional Dashboard
- Client Management
- Chat with Clients
- Appointment Management
- Ratings and Feedback
- Profile Management

---

## AI Features

- AI Legal Assistant
- Instant Legal Guidance
- Smart Advocate Recommendation
- Personalized Legal Suggestions
- Legal Query Assistance

---

# Application Workflow

```text
User Registration
        │
        ▼
Login Authentication
        │
        ▼
Dashboard
        │
        ▼
Search Advocate
        │
        ▼
AI Recommendation
        │
        ▼
Select Advocate
        │
        ▼
Chat / Consultation
        │
        ▼
Book Appointment
        │
        ▼
Give Feedback
        │
        ▼
Rating Updated
```

---

# Architecture

```
                Android Application
                       │
      ┌────────────────┼─────────────────┐
      │                │                 │
      ▼                ▼                 ▼
    View          ViewModel         Repository
      │                │                 │
      └────────────────┼─────────────────┘
                       │
                       ▼
                Firebase Services
                       │
       ┌───────────────┼───────────────┐
       ▼               ▼               ▼
 Authentication   Realtime DB     Cloud Storage
```

---

# Tech Stack

## Mobile Development

- Java
- Kotlin
- XML

## Architecture

- MVVM
- Repository Pattern

## Backend

- Firebase Authentication
- Firebase Realtime Database
- Firebase Storage

## APIs

- REST APIs

## Security

- AES Encryption

## Development Tools

- Android Studio
- Git
- Firebase Console
- Postman

---

# Project Structure

```
VIDHIDARPAN/
│
├── app/
│
├── activities/
│
├── fragments/
│
├── adapters/
│
├── models/
│
├── repositories/
│
├── viewmodels/
│
├── utils/
│
├── firebase/
│
├── res/
│   ├── layout/
│   ├── drawable/
│   ├── values/
│   └── mipmap/
│
├── screenshots/
│
└── README.md
```

---

# UI Screenshots

## Login Screen

<p align="center">
<img src="screenshots/login.png" width="250">
</p>

---

## User Registration

<p align="center">
<img src="screenshots/user_signup.png" width="250">
</p>

---

## Advocate Registration

<p align="center">
<img src="screenshots/advocate_signup.png" width="250">
</p>

---

## Home Dashboard

<p align="center">
<img src="screenshots/home.png" width="250">
</p>

---

## Available Legal Professionals

<p align="center">
<img src="screenshots/lawyers.png" width="250">
</p>

---

## Advocate Profile

<p align="center">
<img src="screenshots/profile.png" width="250">
</p>

---

## Ratings & Reviews

<p align="center">
<img src="screenshots/reviews.png" width="250">
</p>

---

## Chat with Advocate

<p align="center">
<img src="screenshots/chat.png" width="250">
</p>

---

## Chat History

<p align="center">
<img src="screenshots/chat_history.png" width="250">
</p>

---

## AI Legal Assistant

<p align="center">
<img src="screenshots/ai_chatbot.png" width="250">
</p>

---

# Security Features

- AES Data Encryption
- Firebase Authentication
- Secure User Login
- Verified Advocate Profiles
- Protected User Information
- Secure Database Communication

---

# Installation

## Clone Repository

```bash
git clone https://github.com/yourusername/VIDHIDARPAN.git
```

## Open Project

Open the project using **Android Studio**.

---

## Configure Firebase

1. Create a Firebase Project.
2. Enable Authentication.
3. Enable Realtime Database.
4. Download `google-services.json`.
5. Place it inside the `app` folder.

---

## Build Project

```bash
Sync Gradle
```

---

## Run

```bash
Run on Android Emulator or Physical Device
```

---

# Future Enhancements

- Video Consultation
- Voice Calling
- AI-based Case Prediction
- OCR Document Scanner
- Multilingual Support
- Online Payment Gateway
- Push Notifications
- Court Case Tracking
- Advocate Availability Status
- Offline Support
- Dark Theme
- Cross-platform Support

---

# Contributing

Contributions are welcome.

1. Fork the repository.
2. Create your feature branch.

```bash
git checkout -b feature/NewFeature
```

3. Commit your changes.

```bash
git commit -m "Add New Feature"
```

4. Push the branch.

```bash
git push origin feature/NewFeature
```

5. Open a Pull Request.

---

# License

This project is licensed under the MIT License.

---

# Developer

**Mohit Singh**

Software Engineer

Android Developer | Java Developer | AI Enthusiast

GitHub: (https://github.com/mohitsingh785)

LinkedIn: https://www.linkedin.com/in/mohit-singh-37966720b/

---

## Acknowledgements

Special thanks to everyone who contributed to the development of this project, including mentors, faculty members, and the open-source community whose tools and technologies made this application possible.
