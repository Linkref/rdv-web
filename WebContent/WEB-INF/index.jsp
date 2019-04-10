        <jsp:include page="header.jsp">
            <jsp:param name="" value=""/>
        </jsp:include>
        <%@ page pageEncoding="UTF-8" %>

            <!-- Area Chart -->
            <div class="col-xl-12">
              <div class="card shadow mb-4">
                <!-- Card Header - Dropdown -->
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">PRISE DE RENDEZ-VOUS</h6>
                </div>
                <!-- Card Body -->
                <div class="card-body">
                  <form class="form-horizontal" action="index" method="post">
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
        
        <jsp:include page="footer.jsp">
                    <jsp:param name="" value=""/>
        
        </jsp:include>
