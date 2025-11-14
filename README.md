
# 🩺 **ShiftCare – Hospital Shift Management App**

<div align="center">

![Android](https://img.shields.io/badge/Platform-Android-green?style=for-the-badge\&logo=android)
![Kotlin](https://img.shields.io/badge/Language-Kotlin-purple?style=for-the-badge\&logo=kotlin)
![Version](https://img.shields.io/badge/Version-1.0.0-blue?style=for-the-badge)

**Smart, seamless, and reliable shift management for healthcare professionals**

</div>

---

## 📖 **Overview**

**ShiftCare** is a mobile application designed to simplify **doctor shift scheduling and swapping** in hospitals.
It helps doctors manage duty timings, request swaps with colleagues, and track attendance and workload — all in one place.
The goal is to ensure **continuous patient care, reduced miscommunication, and fair workload distribution** among hospital staff.



## ✨ **Key Features**

* **📅 Shift Management:** View, manage, and update daily work schedules.
* **🔄 Shift Swapping:** Request and accept shift exchanges with other doctors instantly.
* **📊 Analytics Dashboard:** Track hours worked, swap statistics, and attendance history.
* **🔔 Smart Notifications:** Get real-time alerts for shift changes, approvals, and emergencies.
* **👤 Profile Management:** Manage personal info, specialization, and shift history.
* **🧠 Admin Controls:** Admins can assign shifts, approve swaps, and monitor workload.



## 🧩 **Modules**

1. **Home/Dashboard** – Overview of today’s and next shifts, quick actions, and alerts.
2. **Shift Management** – Full weekly/monthly schedule view.
3. **Shift Swapping** – Manage and approve swap requests.
4. **Analytics & Attendance** – View statistics and performance metrics.
5. **Profile** – Manage doctor and admin details.



## 🛠️ **Tech Stack**

* **Language:** Kotlin
* **Architecture:** MVVM (Model-View-ViewModel)
* **Database:** Room Database
* **UI:** Material Design Components / Jetpack Compose
* **Async:** Coroutines & Flow
* **Dependency Injection:** Dagger Hilt
* **Networking (Future Scope):** Retrofit

---

## 📱 **App Layout**

| Home                          | Shifts                            | Swap                          | Analytics                               | Profile                             |
| ----------------------------- | --------------------------------- | ----------------------------- | --------------------------------------- | ----------------------------------- |
| ![Image](https://github.com/user-attachments/assets/cd6ce3bf-e6e2-4320-88c1-4ac1aba92fbe) | ![Image](https://github.com/user-attachments/assets/bd4c9f32-fc51-4a0e-8b14-da69cf0a2a72) | ![Image](https://github.com/user-attachments/assets/cb0ba252-ccb7-46f5-8090-1b77510afe99) | ![Image](https://github.com/user-attachments/assets/99465846-3a2c-4c38-833d-1d19b3e62eff) | ![Image](https://github.com/user-attachments/assets/c565f874-85f0-4bce-8a44-204b49d75bdf) |

---

## 🚀 **Getting Started**

### **Prerequisites**

* Android Studio (Arctic Fox or later, but mostly Ladybug)
* Android SDK 31+
* Kotlin 1.9.0+

### **Installation**

1. Clone this repository:

   ```bash
   git clone https://github.com/saisindhu218/ShiftCare-Basic_Android-Application.git
   cd ShiftCare
   ```
2. Open in **Android Studio**.
3. Build and run the project on an emulator or device.



## 📁 **Project Structure**

```
app/
├── ui/fragments/        # Screens (Home, Shifts, Swap, Analytics, Profile)
├── viewmodel/           # Business logic
├── data/
│   ├── model/           # Data classes
│   ├── repository/      # Data handling
│   └── database/        # Room database
└── util/                # Helper utilities
```



## 🎯 **Future Enhancements**

* 🔔 Real-time push notifications (Firebase)
* 🌐 Backend integration with hospital APIs
* 🌙 Dark mode support
* 🌏 Multi-language interface
* 📊 Admin dashboard web version



## 👥 **Developed By**

* **Sinchana HM**
* MCA, Jain (Deemed-to-be University)
* Project: ShiftCare – Hospital Shift Management App

