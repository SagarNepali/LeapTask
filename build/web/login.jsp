<%@include file="header.jsp" %>
<div class="container">
    <div class="container-fluid" >

        <form method="POST" action="login">

            <table class="table">
                
                <tr>
                    <input type ="text" name="username" placeholder="Enter your username"/>
                </tr>
                <tr>
                    <input type ="password" name="password" placeholder="Enter your password"/>
                </tr>
                <tr>
                    <button type="Submit" name="login" >Login</button>
                    <button type="Submit" name="register">Register</button>
                    <button type="Submit" name="forgot" >Forgot Password</button>
                </tr>
            </table>
        </form>

    </div>
</div>


<%@include file="footer.jsp" %>