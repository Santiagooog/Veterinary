<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Eliminar veterinario</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<section class="form-section">
    <form action="delete-vet" method="POST" class="styled-form">
        <h2>Eliminar veterinario</h2>
        <label>
            Id
            <input type="text" name="id" required>
        </label>
        <input type="submit" value="Eliminar veterinario" class="submit-button">
    </form>
</section>
</body>
<style>
    /* General Styles */
    body {
        font-family: Arial, sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        min-height: 100vh;
        background-color: #f3f4f6;
        margin: 0;
    }

    .form-section {
        display: flex;
        justify-content: center;
        width: 100%;
        max-width: 500px;
        padding: 20px;
    }

    /* Form Styles */
    .styled-form {
        background-color: #ffffff;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
        width: 100%;
    }

    .styled-form h2 {
        margin-bottom: 20px;
        font-size: 24px;
        color: #333;
        text-align: center;
    }

    /* Label and Input Styles */
    .styled-form label {
        display: flex;
        flex-direction: column;
        font-size: 14px;
        color: #555;
        margin-bottom: 15px;
    }

    .styled-form input[type="text"] {
        padding: 10px;
        margin-top: 5px;
        font-size: 16px;
        border: 1px solid #ddd;
        border-radius: 5px;
        outline: none;
        transition: border-color 0.3s ease;
    }

    .styled-form input[type="text"]:focus {
        border-color: #4a90e2;
    }

    /* Submit Button Styles */
    .submit-button {
        width: 100%;
        padding: 12px;
        font-size: 16px;
        color: #fff;
        background-color: #e74c3c;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        transition: background-color 0.3s ease;
        margin-top: 10px;
    }

    .submit-button:hover {
        background-color: #c0392b;
    }

</style>
</html>
