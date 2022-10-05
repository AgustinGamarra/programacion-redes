<?php
if($_SERVER['REQUEST_METHOD']=='GET')
{
    require_once('db.php');
    $id = $_GET['id'];

    $query = "SELECT * FROM users WHERE id='$id'";
    $result = $mysql->query($query);
    if($mysql->affected_rows >0){
        while($row =$result->fetch_assoc())
        {
            $array = $row;
        }
        echo json_encode($array);

    }
    else
    {
        echo ",  no sencontro nada";
    } 
    $result->close();
    $mysql->close();

}

?>
 <table class="tabla2">
    <thead>
        <th class="col">Nombre</th>
        <th class="col">Email</th>
        <th class="col">Fecha inicio</th>
        <th class="col">Fecha upgrade</th>        
    </thead>
        <tbody>
            <?php while($row = $resultado ->fetch_assoc()){ ?>
                <tr>
                    <td class="fill"><?php echo $row ['usuario'] ?></td>
                    <td class="fill"><?php echo $row ['mail'] ?></td>
                    <td class="fill"><?php echo $row ['created_at'] ?></td>
                    <td class="fill"><?php echo $row ['upgraded_at'] ?></td>
            <?php }?>
        </tbody>
 </table>