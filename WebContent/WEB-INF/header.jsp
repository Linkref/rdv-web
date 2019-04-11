<%@ page pageEncoding="UTF-8" %>
<%@ page import="rdv.RendezVous"%>
<jsp:useBean id="listeRdv"  scope="request" class="rdv.ListeRDV"/>
<!DOCTYPE html>
<html lang="fr">

<head>

  <title>Cabinet Médical - Prise de rendez-vous</title>

  <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="css/jquery.ui.css" rel="stylesheet" >
  <link href="css/sb-admin-2.css" rel="stylesheet">

</head>

<body id="page-top">

  <div id="wrapper">
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion toggled" id="accordionSidebar">
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Cabinet Médical</div>
      </a>

      <hr class="sidebar-divider my-0">

      <li class="nav-item active">
        <a class="nav-link" href="index">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Prendez un rendez-vous</span></a>
      </li>

      <li class="nav-item active">
        <a class="nav-link" href="listerdv">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Liste de rendez-vous</span></a>
      </li>

    </ul>


    <div id="content-wrapper" class="d-flex flex-column">

      <div id="content">

        
        <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
          <ul class="navbar-nav ml-auto">
            <div class="topbar-divider d-none d-sm-block"></div>
            <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle" href="index" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-gray-600 small">Cabinet Médical</span>
              </a>
            </li>
          </ul>
        </nav>

        <div class="container-fluid">


          
          <div class="row">

           
            <div class="col-xl-3 col-md-6 mb-4">
              <div class="card border-left-primary shadow h-100 py-2">
                <div class="card-body">
                  <div class="row no-gutters align-items-center">
                    <div class="col mr-2">
                      <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">À venir</div>
                      <div class="h5 mb-0 font-weight-bold text-gray-800">
						<% out.println(listeRdv.compterRdv("futur")); %>                
                      </div>
                    </div>
                    <div class="col-auto">
                      <i class="fas fa-calendar fa-2x text-gray-300"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>

           
            <div class="col-xl-3 col-md-6 mb-4">
              <div class="card border-left-success shadow h-100 py-2">
                <div class="card-body">
                  <div class="row no-gutters align-items-center">
                    <div class="col mr-2">
                      <div class="text-xs font-weight-bold text-success text-uppercase mb-1">Passés</div>
                      <div class="h5 mb-0 font-weight-bold text-gray-800"><% out.println(listeRdv.compterRdv("passe")); %></div>
                    </div>
                    <div class="col-auto">
                      <i class="fas fa-calendar fa-2x text-gray-300"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <div class="col-xl-3 col-md-6 mb-4">
              <div class="card border-left-info shadow h-100 py-2">
                <div class="card-body">
                  <div class="row no-gutters align-items-center">
                    <div class="col mr-2">
                      <div class="text-xs font-weight-bold text-success text-uppercase mb-1">Aujourd'hui</div>
                     
                      <div class="h5 mb-0 font-weight-bold text-gray-800">                      
                      <% out.println(listeRdv.compterRdv("ajd")); %>
                      </div>
                    </div>
                    <div class="col-auto">
                      <i class="fas fa-calendar fa-2x text-gray-300"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>

          <div class="row">