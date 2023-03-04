<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sistema da Ana</title>
    <style>
        body {
            font-family: 'Montserrat', sans-serif;
        }
    </style>
    <link href="https://fonts.googleapis.com/css?family=Montserrat&display=swap" rel="stylesheet">
</head>
<body>
<h1>Sistema da Ana</h1>

<h2>Cadastro</h2>

<form name="subscriptionForm" action="pagInicial" method="POST">
    <table>
        <tr>
            <td><label for="name">Seu nome:</label></td>
            <td><input type="text" name="nome" id="name"/></td>
        </tr>
        <tr>
            <td><label for="email">Seu email:</label></td>
            <td><input type="text" name="emailCadastro" id="email"/></td>
        </tr>
        <tr>
            <th><input type="reset" value="Limpar" name="reset"/></th>
            <th><input type="submit" value="Enviar" name="submit"/></th>
        </tr>
    </table>
</form>
</body>
</html>