<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="http://192.168.137.1/androidusers/buscar.php" method="GET">
        <!-- <input type="text" name="form" value="1" hidden> -->
        <input type="text" placeholder="email" name="email"><br><br>
        <input type="text" placeholder="password" name="password"><br><br>
        <input type="text" placeholder="created_at" name="created_at"><br><br>
        <input type="text" placeholder="updated_at" name="updated_at"><br><br>
        <input type="text" placeholder="id" name="id">   <br><br>     
        <input type="submit"><br><br>
    </form>
    <hr>
    <form action="192.168.137.1/androidusers/buscar.php" method="GET">
        <p>Buscar por ID</p>
        <input type="text" name="form" value="2" hidden>
        <input type="text" placeholder="id" name="id">        
        <input type="submit">
    </form>

    <!-- <?php
    if($_SERVER['REQUEST_METHOD'] === 'GET' ){
        if($_GET['form'] === "1"){
            $email = $_GET['email'];
            $password = $_GET['password'];
            $created = $_GET['created_at'];
            $updated = $_GET['updated_at'];
        }
        else{
            $id = $_GET['id'];
        }
    }
    ?> -->
</body>
</html>