# SZABIST Student Portal — Android Application

An Android mobile application developed as **Assignment 2** for the Android Application Development course. The app simulates a university student portal with login authentication, registration, password recovery, a dashboard, student profile, and digital student identity card.

## 📱 Implemented Features

### Screens

| # | Screen | Description |
|---|--------|-------------|
| 1 | **Splash Screen** | Displays the SZABIST logo, app name, and tagline. Automatically navigates to Login after 2.5 seconds. |
| 2 | **Login Screen** | Username and password authentication with input validation. Includes links to Register and Forgot Password. Uses hardcoded demo credentials. |
| 3 | **Registration Screen** | New student registration with Full Name, Student ID, Email, Password, and Confirm Password fields. Validates email format, password length (min 6 chars), and password matching. |
| 4 | **Forgot Password Screen** | Accepts an email address, validates the format, and simulates sending a password reset link locally. Navigates to the Reset Password screen. |
| 5 | **Reset Password Screen** | New Password and Confirm Password fields with validation for empty fields, minimum length (6 characters), and password matching. Navigates back to Login on success. |
| 6 | **Dashboard Screen** | Displays module cards in a grid layout: Courses, Attendance, Results, Profile, and Student Card. Shows the logged-in student's name and program. Includes a Logout button. |
| 7 | **Profile Screen** | Displays student information (name, registration number, father's name, university, phone, emergency contact). Includes Edit Profile, Back to Dashboard, and Logout options. |
| 8 | **Student Card Screen** | A digital student identity card showing the student's photo, university branding, and all personal details in a card-style layout. |

### Demo Credentials

| Username | Password |
|----------|----------|
| `Aleeya Fatima` | `aleeya27` |

## 🗺️ Navigation Flow

```
Splash Screen
    │
    ▼
Login Screen ──────────────┬──────────────────┐
    │                      │                  │
    ▼                      ▼                  ▼
Dashboard          Register Screen    Forgot Password
    │                                        │
    ├── Courses (Coming Soon)                ▼
    ├── Attendance (Coming Soon)       Reset Password
    ├── Results (Coming Soon)                │
    ├── Profile ──► Logout ──► Login         │
    ├── Student Card                         ▼
    └── Logout ──► Login                   Login
```

## 🛠️ Technical Stack

- **Language:** Java
- **UI:** XML Layouts with Material Design Components
- **IDE:** Android Studio
- **Min SDK:** 24 (Android 7.0)
- **Target SDK:** 34 (Android 14)

## 📐 Layout Types Used

| Layout | Where Used |
|--------|-----------|
| `ConstraintLayout` | Splash Screen |
| `LinearLayout` | Login, Register, Forgot Password, Reset Password, Dashboard, Student Card |
| `GridLayout` | Dashboard (2-column module grid) |
| `RelativeLayout` | Profile Screen |

## 📂 Project Structure

```
app/src/main/
├── java/com/example/studentcard/
│   ├── SplashActivity.java
│   ├── MainActivity.java          (Login)
│   ├── RegisterActivity.java
│   ├── ForgotPasswordActivity.java
│   ├── ResetPasswordActivity.java
│   ├── DashboardActivity.java
│   ├── ProfileActivity.java
│   └── CardActivity.java          (Student Card)
├── res/
│   ├── layout/                    (8 XML layout files)
│   ├── drawable/                  (Icons, backgrounds, logos)
│   ├── values/
│   │   ├── strings.xml
│   │   ├── colors.xml
│   │   └── themes.xml
│   └── values-night/
│       └── colors.xml             (Dark mode colors)
└── AndroidManifest.xml
```

## 🔧 How to Build & Run

1. Open the project in **Android Studio**.
2. Sync Gradle files.
3. Connect an Android device or start an emulator (API 24+).
4. Click **Run** (▶) or press `Shift + F10`.
5. The app will launch on the Splash Screen and navigate to Login automatically.

## 📋 Assignment Requirements Covered

- [x] Splash Screen with logo and auto-navigation
- [x] Login with input validation and simulated authentication
- [x] Registration with email, password, and confirm password validation
- [x] Forgot Password with email validation and simulated recovery
- [x] Reset Password with matching password validation
- [x] Dashboard with card/grid modules (icons + text)
- [x] Profile with user info display and working Logout
- [x] Java + XML implementation
- [x] strings.xml for all text resources
- [x] Night-mode alternative resources (values-night/colors.xml)
- [x] LinearLayout, GridLayout, ConstraintLayout demonstrated
- [x] Appropriate input types (textPersonName, textPassword, textEmailAddress, number)
- [x] Button click listeners and input validation
- [x] Explicit Intents for Activity navigation
- [x] Consistent Material Design UI

## 👩‍🎓 Student Information

- **Name:** Aleeya Fatima
- **Registration No:** 24108108
- **University:** SZABIST Islamabad
- **Program:** BS AI (Artificial Intelligence)
