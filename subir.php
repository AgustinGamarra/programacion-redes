<?php
    include("conexion.php");
    if(isset($_POST['register'])){
        $nombre = $_POST['name'];
        $email = $_POST['email'];
        $contra = $_POST['contra'];
        $fechaU = date ('m-d-y h:i:s a' , time());
        $fechaC = date ('m-d-y h:i:s a' , time());
    
        $consulta = "INSERT INTO user ('email', 'contrasena', 'created_at', 'updated_at', 'id', 'fecha', 'hora') VALUES (NULL,'$nombre','$email','$contra',NOW(),Nombre,Email,Contra)";
        $resultado = mysqli_query($mysql,$consulta);

    }