<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">

<head>


  <title>Cabinet Médical - DashBoard</title>

  <!-- Custom fonts for this template-->
  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top">

  <div id="wrapper">
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion toggled" id="accordionSidebar">
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Cabinet Médical</div>
      </a>

      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item active">
        <a class="nav-link" href="index.html">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Prendez un rendez-vous</span></a>
      </li>

      <li class="nav-item">
        <a class="nav-link" href="index.html">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Liste de rendez-vous</span></a>
      </li>

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <div id="content">

        <!-- Topbar -->
        <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
          <ul class="navbar-nav ml-auto">
            <div class="topbar-divider d-none d-sm-block"></div>
            <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Cabinet Médical</span>
                <img class="img-profile rounded-circle" src="http://pngimg.com/uploads/doctor/doctor_PNG16007.png">
              </a>
            </li>
          </ul>
        </nav>
        <!-- End of Topbar -->

        <!-- Begin Page Content -->
        <div class="container-fluid">


          <!-- Content Row -->
          <div class="row">

            <!-- Earnings (Monthly) Card Example -->
            <div class="col-xl-3 col-md-6 mb-4">
              <div class="card border-left-primary shadow h-100 py-2">
                <div class="card-body">
                  <div class="row no-gutters align-items-center">
                    <div class="col mr-2">
                      <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">À venir</div>
                      <div class="h5 mb-0 font-weight-bold text-gray-800">15</div>
                    </div>
                    <div class="col-auto">
                      <i class="fas fa-calendar fa-2x text-gray-300"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <!-- Earnings (Monthly) Card Example -->
            <div class="col-xl-3 col-md-6 mb-4">
              <div class="card border-left-success shadow h-100 py-2">
                <div class="card-body">
                  <div class="row no-gutters align-items-center">
                    <div class="col mr-2">
                      <div class="text-xs font-weight-bold text-success text-uppercase mb-1">Passés</div>
                      <div class="h5 mb-0 font-weight-bold text-gray-800">450</div>
                    </div>
                    <div class="col-auto">
                      <i class="fas fa-calendar fa-2x text-gray-300"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <!-- Earnings (Monthly) Card Example -->
            <div class="col-xl-3 col-md-6 mb-4">
              <div class="card border-left-info shadow h-100 py-2">
                <div class="card-body">
                  <div class="row no-gutters align-items-center">
                    <div class="col mr-2">
                      <div class="text-xs font-weight-bold text-success text-uppercase mb-1">Aujourd'hui</div>
                      <div class="h5 mb-0 font-weight-bold text-gray-800">3</div>
                    </div>
                    <div class="col-auto">
                      <i class="fas fa-calendar fa-2x text-gray-300"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>


          <!-- Content Row -->

          <div class="row">

            <!-- Area Chart -->
            <div class="col-xl-12">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">PRISE DE RENDEZ-VOUS</h6>
                </div>
                <!-- Card Body -->
                <div class="card-body">
                  <form class="form-horizontal" action="RdvServlet" method="post">
                    <fieldset>


                      <div class="row">



                      <!-- Select Basic -->
                      <div class="form-group col-md-6">
                        <label class="col-md-12 control-label" for="selectSpe">Spécialité</label>
                        <div class="col-md-8">
                          <select id="selectSpe" name="selectSpe" class="form-control">
                          
							  <!-- On recupère un objet listeMedecin puis la liste des specialités pour remplir les options du select -->
							<jsp:useBean id="medecins"  scope="request" class="medecin.ListeMedecin"/>
							<%@ page import="java.util.ArrayList"  %>
							<%	
									ArrayList<String> listeSpe = medecins.getListSpecialite();
					 			   for(int i=0; i<listeSpe.size();i++)
					 			   {
					 				   out.println("<option>"+listeSpe.get(i)+"</option>");
					 			   }
					 		%>
                      
                          </select>
                        </div>
                      </div>

                        <div class="form-group col-md-6">
                          <label class="col-md-12 control-label" for="selectMed">Médecin</label>
                          <div class="col-md-8">
                            <select id="selectMed" name="selectMed" class="form-control">
                            
  								<!-- On remplit les options du select avec l'objet ListeMedecin -->
					 		   <%		
					 			   for(int i=0; i<medecins.size();i++)
					 			   {
					 				   out.println("<option>"+medecins.get(i).toString()+"</option>");
					 			   }
					 			%>
                            </select>
                          </div>
                        </div>

                        <!-- Text input-->
                        <div class="form-group col-md-6">
                          <label class="col-md-12 control-label" for="patient">Patient</label>
                          <div class="col-md-8">
                           <select id="selectPat" name="selectPat" class="form-control">
                           
                           	  <!-- On recupère un objet listePatient pour remplir les options du select -->
                               <jsp:useBean id="patients"  scope="request" class="patient.ListePatient"/>
					 		   <%		
					 			   for(int i=0; i<patients.size();i++)
					 			   {
					 				   out.println("<option>"+patients.get(i).toString()+"</option>");
					 			   }
					 			%>
					 			
                           </select>
                          </div>
                        </div>


                      <!-- Text input-->
                        <div class="form-group col-md-6">
                        <label class="col-md-12 control-label" for="RaisonRdv">Raison de la venue</label>
                        <div class="col-md-8">
                          <input id="raisonrdv" name="raisonrdv" type="text" placeholder="Raison de la venue" class="form-control input-md" required="">
                        </div>
                      </div>
  						 

                      <!-- Text input-->
                     <div class="form-group col-md-6">
                        <label class="col-md-12 control-label" for="date">Date</label>
                        <div class="col-md-8">
                          <input id="date" name="date" type="text" placeholder="Date" class="form-control input-md" required="">
                        </div>
                      </div>
                    

                      <!-- Text input-->
                      <div class="form-group col-md-6">
                        <label class="col-md-12 control-label" for="dob">Heure</label>
                        <div class="col-md-8">
                          <input id="Heure" name="Heure" type="text" placeholder="Heure" class="form-control input-md" required="">
                        </div>
                      </div>


                      </div>

                      <!-- Button -->
                      <div class="form-group">
                        <div class="col-md-4">
                          <button id="envoyer" name="envoyer" class="btn btn-primary">Reserver</button>
                        </div>
                      </div>

                    </fieldset>
                  </form>

                </div>
              </div>
            </div>


        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->



    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->




  <!-- Bootstrap core JavaScript-->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="js/sb-admin-2.min.js"></script>

  <!-- Page level plugins -->
  <script src="vendor/chart.js/Chart.min.js"></script>

</body>

</html>
