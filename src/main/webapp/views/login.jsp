<%--
  Created by IntelliJ IDEA.
  User: rktirtho
  Date: ২৭/৪/২১
  Time: ৪:০৯ PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/libs/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">

</head>
<body>
<div class="container mt-5 pt-5">
    <div class="card mx-auto border-0">
        <div class="card-header border-bottom-0 bg-transparent">
            <div><img class="logo-img" src="${pageContext.request.contextPath}/imgs/rktirtho.png"/>
                <span class="font-weight-bold">HRM System</span>
            </div>
            <ul class="nav nav-tabs justify-content-center pt-4" id="pills-tab" role="tablist">
                <li class="nav-item">
                    <a class="nav-link active text-primary" id="pills-login-tab" data-toggle="pill" href="" role="tab"
                       aria-controls="pills-login"
                       aria-selected="false">Login</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link text-primary" id="pills-register-tab" data-toggle="pill" href="" role="tab"
                       aria-controls="pills-register"
                       aria-selected="true">Register</a>
                </li>
            </ul>
        </div>

        <div class="card-body pb-4">
            <div class="tab-content" id="pills-tabContent">
                <div class="tab-pane fade show active" id="pills-login" role="tabpanel"
                     aria-labelledby="pills-login-tab">
                    <form>
                        <div class="form-group">
                            <input type="email" name="email" class="form-control" id="email" placeholder="Email"
                                   required autofocus>
                        </div>

                        <div class="form-group">
                            <input type="password" name="password" class="form-control" id="password" id="password"
                                   placeholder="Password" required>
                        </div>

                        <div class="custom-control custom-checkbox">
                            <input class="custom-control-input" id="customCheck1" checked="" type="checkbox">
                            <label class="custom-control-label" for="customCheck1">Check me out</label>
                        </div>

                        <div class="text-center pt-4">
                            <button type="submit" class="btn btn-primary">Login</button>
                        </div>

                        <div class="text-center pt-3">
                            <a class="btn btn-link text-primary" href="#">Forgot Your Password?</a>
                        </div>
                    </form>
                </div>

                <div class="tab-pane fade" id="pills-register" role="tabpanel" aria-labelledby="pills-register-tab">
                    <form>
                        <div class="form-group">
                            <input type="text" name="username" id="name" class="form-control" placeholder="Username"
                                   required autofocus>
                        </div>

                        <div class="form-group">
                            <input type="email" name="email" id="email" class="form-control" placeholder="Email"
                                   required>
                        </div>

                        <div class="form-group">
                            <input type="password" name="password" id="password" class="form-control"
                                   placeholder="Set a password" required>
                        </div>

                        <div class="form-group">
                            <input type="password" name="password_confirmation" id="password-confirm"
                                   class="form-control" placeholder="Confirm password" required>
                        </div>

                        <div class="text-center pt-2 pb-1">
                            <button type="submit" class="btn btn-primary">Register</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="javascript" href="${pageContext.request.contextPath}/libs/bootstrap/js/bootstrap.js"></script>

</body>
</html>
