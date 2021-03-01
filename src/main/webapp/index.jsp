<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>
    Taxes calculator:
</h1>

<div>
    <form action="taxes" method="get">
        <label>First name: <input type="text" minlength="1" maxlength="25"
                                  placeholder="Латинские буквы"
                                  required pattern="^[a-zA-Z]+$"
                                  name="first_name"/></label><br/><br/>

        <label>Last name: <input type="text" minlength="1"
                                 maxlength="25"
                                 placeholder="Латинские буквы"
                                 required pattern="^[a-zA-Z]+$"
                                 name="last_name"/></label><br/>
        
        <br/>
        <label>Gender:
            <input type="radio" name="gender" value="female" checked/>Female
            <input type="radio" name="gender" value="male"/>Male

        </label>
        <br/>       <br/>

        Choose your region:
        <select name="region">
            <option>Minsk</option>
            <option>Vitebsk</option>
            <option>Brest</option>
            <option>Gomel</option>
            <option>Grodno</option>
            <option>Mogilev</option>
        </select>
        <br/>
        <br/>
        <label>
            Salary: <input type="number" step="0.01" min="0.01" name="salary" required/>
            <br/>
            <br/>
            Base value: <input type="number" step="0.01" min="0.01" name="baseValue" required/>
        </label>
        <br/>
        <br/>
        <input type="submit" value="Submit"/>
        <input type="reset" value="Reset"/>
    </form>
</div>
</body>
</html>