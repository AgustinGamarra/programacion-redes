<?php

    $mysql = new mysqli("localhost", "root","", "android users");

    if($mysql->connect_error)
    {
        die("falló la conexión");
    }
    else
    {
        echo "conexión satisfactoria";
    }
    