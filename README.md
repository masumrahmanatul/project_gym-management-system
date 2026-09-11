# Strength Factory Gym — Management System

A Java Swing desktop application for managing a gym's admins, staff, trainers, and members — built as a 'Object Oriented Programming 1' university project.

## About

Strength Factory Gym Management System is a login-protected desktop app that lets a gym administrator manage four types of records — Administrators, Staff, Trainers, and Members — each through its own management window. It was developed as a team project for the Software Engineering course at AIUB.

## Features

- **Login screen** with username/password authentication checked against a local text file
- **Home page** with navigation to each management section
- **Admin management** — add, update, search by ID, delete, and list all administrators (with a role dropdown: Membership Administrator, Financial Manager, Scheduling Coordinator, Maintenance Administrator)
- **Staff management** — add, update, search by ID, delete, and list all staff
- **Trainer management** — add, search by ID, delete, and list all trainers (including height, weight, and salary)
- **Member management** — add, update, search by ID, delete, and list all members
- Basic input validation (e.g. required fields, gender as M/F) with dialog pop-ups for errors and confirmations

## Tech Stack

- **Language:** Java
- **UI:** Java Swing (`JFrame`, `JPanel`, `JTextArea`, `JOptionPane`, etc.)
- **Data storage:** Plain text files — no database. Admin and Staff records are saved to and loaded from `.txt` files; Trainer and Member records are currently kept in memory only for the session (not persisted)
- **Structure:** Organized into packages —
  - `Entity` — `Person` (base class) and `Administrator`, `Staff`, `Member`, `Trainer` (mostly extending `Person`)
  - `EntityList` — array/list-backed collections (`AdministratorList`, `StaffList`, `MemberList`, and `TrainerList` using an `ArrayList`) with insert, delete, search-by-ID, and list-all operations
  - `File` — `FileIO`, handling login checks and reading/writing admin and staff records
  - `GUI` — `LoginPage`, `HomePage`, `AdminManagementPage`, `StaffManagementPage`, `TrainerManagementPage`, `MemberManagmentPage`

## Getting Started

### Prerequisites

- Java JDK installed (e.g. JDK 8 or later)
- A Java IDE (IntelliJ IDEA, Eclipse, or similar) is recommended, since the project isn't set up with a build tool like Maven/Gradle

### Installation

1. Clone the repository
   ```
   git clone https://github.com/masumrahmanatul/project_Strength-Factory-Gym.git
   ```
2. Open the `Gym Management System [GROUP-B]` folder as a project in your IDE
3. Make sure the `Entity`, `EntityList`, `File`, and `GUI` packages/folders and the `strength_factory.png` logo are on the classpath alongside the entry-point class
4. Data files (`users.txt`, `admins.txt`, `staffs.txt`) are expected under `./File/data/` relative to where the app runs — create that folder structure if it doesn't already exist in the repo
5. Run the app from **`GymManagementPage.java`** (the `main` method here launches the `LoginPage`)

> Note: the repo also contains a `Start.java` with a separate console-based admin menu. That's a leftover/earlier prototype and isn't the GUI app's entry point — use `GymManagementPage` to run the actual application.

### Logging In

Login credentials are checked against `users.txt` (format: `username;password`). A sample login pair used during development is `atul;1234` — replace or add your own entries in that file.

## Usage

1. Launch the app — the **Login Page** appears first
2. Enter valid credentials to reach the **Home Page**
3. From the Home Page, choose Admin, Staff, Trainer, or Member Page
4. In each management page you can:
   - Fill in the fields and click **ADD** to create a new record
   - Enter an ID and click **UPDATE** to edit an existing record
   - Enter an ID and click **SEARCH** to look up a single record
   - Enter an ID and click **DELETE** (with a confirmation prompt) to remove a record
   - Click **SHOW ALL** to list every record, or **CLEAR SCREEN** to clear the display
5. Use **Back** to return to the Home Page

## Team

- Masum Rahman Atul[23-54245-3] (Me)

## Course

CSC 1205: Object Oriented Programming (JAVA) — AIUB
