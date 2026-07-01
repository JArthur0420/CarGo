import React, { useState } from "react";

export default function Register() {
  const [form, setForm] = useState({
    firstname: "",
    middlename: "",
    lastname: "",
    email: "",
    password: "",
  });

  const handleChange = (e) => {
    setForm({
      ...form,
      [e.target.name]: e.target.value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    console.log("Register data:", form);

    // Example API call:
    /*
    fetch("/api/students", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(form),
    });
    */
  };

  return (
    <div style={styles.body}>
      <div style={styles.container}>
        <h2>Create Account</h2>

        <form onSubmit={handleSubmit}>
          <input
            type="text"
            name="firstname"
            placeholder="First Name"
            required
            value={form.firstname}
            onChange={handleChange}
            style={styles.input}
          />

          <input
            type="text"
            name="middlename"
            placeholder="Middle Name"
            value={form.middlename}
            onChange={handleChange}
            style={styles.input}
          />

          <input
            type="text"
            name="lastname"
            placeholder="Last Name"
            required
            value={form.lastname}
            onChange={handleChange}
            style={styles.input}
          />

          <input
            type="email"
            name="email"
            placeholder="Email"
            required
            value={form.email}
            onChange={handleChange}
            style={styles.input}
          />

          <input
            type="password"
            name="password"
            placeholder="Password"
            required
            value={form.password}
            onChange={handleChange}
            style={styles.input}
          />

          <button type="submit" style={styles.button}>
            Register
          </button>
        </form>

        <a href="/login" style={styles.link}>
          Already have an account? Login
        </a>
      </div>
    </div>
  );
}

const styles = {
  body: {
    fontFamily: "Arial, sans-serif",
    background: "#f4f4f4",
    display: "flex",
    justifyContent: "center",
    alignItems: "center",
    height: "100vh",
    margin: 0,
  },
  container: {
    background: "white",
    padding: "25px",
    borderRadius: "10px",
    width: "320px",
    boxShadow: "0 0 10px rgba(0,0,0,0.1)",
  },
  input: {
    width: "100%",
    padding: "10px",
    margin: "8px 0",
    border: "1px solid #ccc",
    borderRadius: "5px",
  },
  button: {
    width: "100%",
    padding: "10px",
    background: "#28a745",
    color: "white",
    border: "none",
    borderRadius: "5px",
    cursor: "pointer",
    fontSize: "16px",
  },
  link: {
    display: "block",
    textAlign: "center",
    marginTop: "12px",
    textDecoration: "none",
    color: "#333",
  },
};