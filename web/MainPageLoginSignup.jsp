<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" />
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css"/>
</head>
<body>
    
    <!--about us-->
    <div class="container-fluid">
            <div class="row">
                <div class="col-1"></div>
                <div class="col-5">
                    <div class="row justify-content-center my-3">
                        <h3 style="font-family:verdana;">
                            <span style="text-decoration: underline;text-decoration-color:yellow;">Some Words</span>
                            <b>about Us</b></h3>
                    </div>
                    <div class="row justify-content-center">
                        <p class="text-muted ">We love building and rebuilding Brands through our specific skills.We help Enterprises to 
                                achieve success.We Brand companies in a way they will never forget</p>
                    </div>
                    <div class="row my-4">
                        <ul style="list-style:none;">
                            <li class="my-1"><i class="far fa-dot-circle"></i><b> Mission</b> - <em>We deliver Security and Quality </em></li>
                            <li class="my-1"><i class="far fa-dot-circle"></i><b> Skills</b> - <em>Delivering Fast and excellent results </em></li>
                            <li class="my-1"><i class="far fa-dot-circle"></i><b> Clients</b> - <em>Satisfied Clients thanks to our experience  </em></li>
                        </ul>
                
                    </div>
                </div>
                <div class="col-1"></div>
                <div class="col-5"><img src="./images/pc1.png" class="img-fluid my-4" alt="pc"/></div>
            </div>
    </div>
    <!--xxx---->
    <!--take a look at our services-->
    <div class="container-fluid p-5" 
         style="background-image:url('./images/client.jpg');background-repeat: no-repeat;background-size: 
         cover;background-attachment: fixed;color:white;">
        <div class="container">
            <div class="row justify-content-center"><p><h3>Take a look at our services</h3></p></div>
            <div class="row my-2"><p>Risorsa is a  business process 
                    management software that allows an organization to use a system of integrated applications to manage 
                    the business and automate many back office functions related to technology, services and human resources.
</p></div>
            <div class="row my-5 justify-content-center">
                <div class="col-3">
                    <div class="row" style="max-height: 200px;">
                        <img src="https://smallbusinessfirst.com.au/media/397512/finance-courses.jpg?width=600" class="img-fluid" style="border-radius:20%;"/>
                    </div>
                    <div class="row justify-content-center">Manage Finance</div>
                </div>
                <div class="col-1"></div>
                <div class="col-3">
                    <div class="row" style="max-height: 200px;">
                        <img src="http://www.business-to-you.com/wp-content/uploads/2017/03/Growth.png" class="img-fluid" style="border-radius:20%;"/>
                    </div>
                    <div class="row justify-content-center">Monitor Growth</div>
                </div>
                <div class="col-1"></div>
                <div class="col-3">
                    <div class="row" style="max-height: 200px;">
                        <img src="http://www.humanengineers.com/wp-content/uploads/2017/07/ceo-5.jpg" class="img-fluid" style="border-radius:20%;"/>
                    </div>
                    <div class="row justify-content-center">Manage HR</div>
                </div>
            </div>
          
            <div class="row justify-content-center">
                <div class="col-3">
                    <div class="row" style="max-height: 200px;">
                        <img src="http://www.businesscomputingworld.co.uk/wp-content/uploads/2017/08/data-loss.jpg" class="img-fluid" style="border-radius:20%;"/>
                    </div>
                    <div class="row justify-content-center">Prevent Data Loss</div>
                </div>
                <div class="col-1"></div>
                <div class="col-3">
                    <div class="row" style="max-height: 200px;">
                        <img src="https://kaiserhealthnews.files.wordpress.com/2018/02/bill-envelope-side-smaller2.jpg?w=1350&h=620" class="img-fluid" style="border-radius:20%;"/>
                    </div>
                    <div class="row justify-content-center">Generate Bills</div>
                </div>
                <div class="col-1"></div>
                <div class="col-3">
                    <div class="row" style="max-height: 200px;">
                        <img src="./images/keep_pic.jpg" class="img-fluid" style="border-radius:20%;"/>
                    </div>
                    <div class="row justify-content-center">Keep Everything at one place</div>
                </div>
            </div>
        </div>
    </div>
    
    <!---xx--->

    <div class="container-fluid">
        <div class="row my-5 ml-5">
            <button type="button" class="btn-lg btn-primary" data-toggle="modal" data-target="#exampleModalCenterLogin">LOGIN</button>
            <button type="button" class="btn-lg btn-primary" data-toggle="modal" data-target="#exampleModalCenterSignup">SIGNUP</button>
        </div>
    </div>
    
    <!--feel free to contact us-->
    <div class="container-fluid">
        <div class="container">
            <div class="row justify-content-center">
                <h4>Feel Free To Contact Us</h4>
            </div>
               <form class="mt-3">
                   <div class="form-row">
                       <div class="col-5">
                           <small> Enter Email Address</small>
                       </div>
                       <div class="col-2"></div>
                       <div class="col-5">
                           <small> Password</small>
                       </div>
                   </div>
                   
              <div class="form-row my-2">
                <div class="col-5">
                  <input type="text" class="form-control text-center" placeholder="Email">
                </div>
                  <div class="col-2"></div>
                <div class="col-5">
                  <input type="text" class="form-control text-center" placeholder="Password">
                </div>
              </div>
                   <div class="form-row my-2">
                       <small> Message</small>
                   </div>
                   <div class="form-row my-2">
                       <textarea class="form-control" rows="3"></textarea>
                   </div>
                   <div class="form-row my-2">
                       <small class="form-text text-muted">We'll never share your email with anyone else.</small>
                   </div>
                   <div class="form-row my-2">
                       <button type="button" class="btn btn-dark">SUBMIT</button>
                   </div>
            </form>
        </div>
    </div>
    <!----xxxx---->
    
    
    
    <div class="modal fade" id="exampleModalCenterLogin" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">Login</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
          <a href="EmpLogin"><button type="button" class="btn btn-primary">Employee Login</button></a>
          <a href="ORGLogin"><button type="button" class="btn btn-primary">Organization Login</button></a>
      </div>
    </div>
  </div>
</div>
    
    
    
    <div class="modal fade" id="exampleModalCenterSignup" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">Sign Up</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
          <a href="EmpSignup"><button type="button" class="btn btn-primary">Employee Sign up</button></a>
          <a href="ORGsignup"><button type="button" class="btn btn-primary">Organization Sign up </button></a>
      </div>
    </div>
  </div>
</div>
    
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</body>
</html>