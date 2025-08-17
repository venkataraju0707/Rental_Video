# 🎬 Rental Video System API

A secure and scalable video rental system built with **Spring Boot** and **PostgreSQL**, providing a RESTful backend for managing users, videos, and rentals.

---

## ✨ Features

This project is a backend API for a video rental platform, designed with a focus on scalability, security, and clean architecture.

### 🔐 Security & Authentication
- **Authentication**: Spring Security with Basic Auth for secure login.  
- **Authorization**: Role-based access with two roles: `CUSTOMER` and `ADMIN`.  
- **Password Safety**: All passwords are hashed with BCrypt (never stored in plain text).  

### 👤 User Management
- **Registration**: New users can register with email and password.  
- **Default Role**: New users are assigned the `CUSTOMER` role automatically.  
- **Access Control**: Private endpoints require authentication.  

### 📼 Video Management
- **Video Catalog**: Store and manage video details like Title, Director, Genre, and Availability.  
- **Public Browsing**: Anyone can view the list of available videos.  
- **Admin Privileges**: Only admins can add, update, or delete videos.  

---

## 🚀 API Endpoints

| Endpoint             | HTTP Method | Description                     | Access       |
|----------------------|-------------|---------------------------------|--------------|
| `/api/register`      | POST        | Register a new user             | Public       |
| `/api/videos`        | GET         | Get all videos                  | Public       |
| `/api/videos`        | POST        | Create a new video              | Admin only   |
| `/api/videos/{id}`   | PUT         | Update an existing video        | Admin only   |
| `/api/videos/{id}`   | DELETE      | Delete a video                  | Admin only   |

---

## 🛠️ Tech Stack

- **Framework**: Spring Boot (3.x)  
- **Security**: Spring Security  
- **Database**: PostgreSQL  
- **ORM**: Spring Data JPA + Hibernate  
- **Build Tool**: Maven  
 
---

## 📦 How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/rental-video-system.git
   cd rental-video-system
