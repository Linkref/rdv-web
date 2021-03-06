        <jsp:include page="header.jsp">
            <jsp:param name="" value=""/>
        </jsp:include>
        <%@ page pageEncoding="UTF-8" %>

            <div class="col-xl-12">
              <div class="card shadow mb-4">
                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                  <h6 class="m-0 font-weight-bold text-primary">PRISE DE RENDEZ-VOUS  <% if (request.getParameter("form") != null) {
                                    	out.println("<span class='badge badge-pill badge-danger'>Médecin non disponible durant ce chréno</span>");
                                    }
                                    %></h6>
                </div>
                <div class="card-body">
                  <form class="form-horizontal" action="index" method="post" id="formRdv">
                    <fieldset>


                      <div class="row">

                        <div class="form-group col-md-6">
                          <label class="col-md-12 control-label" for="selectMed">Médecin</label>
                          <div class="col-md-8">
                            <select id="selectMed" name="selectMed" class="form-control">
  								<option>Michel Cymes</option>
								<option>Marco Polo</option>
								<option>Martin Dupont</option>
								<option>Albert Tuile</option>
								<option>Serge Loupon</option>
                            </select>
                          </div>
                        </div>
                        
                        
                        <div class="form-group col-md-6">
                        <label class="col-md-12 control-label" for="RaisonRdv">Raison de la venue</label>
                        <div class="col-md-8">
                          <input id="raisonrdv" name="raisonrdv" type="text" placeholder="Raison de la venue" class="form-control input-md" required>
                        </div>
                      </div>

                        
                        <div class="form-group col-md-6">
                          <label class="col-md-12 control-label" for="patient">Nom</label>
                          <div class="col-md-8">
						  <input id="patientNom" name="patientNom" type="text" placeholder="Nom" class="form-control input-md" required>
                          </div>
                        </div>
                        
                       
                        <div class="form-group col-md-6">
                          <label class="col-md-12 control-label" for="patient">Prénom</label>
                          <div class="col-md-8">
						  <input id="patientPrenom" name="patientPrenom" type="text" placeholder="Prénom" class="form-control input-md" required>
                          </div>
                        </div>

  						 
                     
                     <div class="form-group col-md-6">
                        <label class="col-md-12 control-label" for="date">Date</label>
                        <div class="col-md-8">
                          <input id="date" name="date" type="text" placeholder="Date" class="form-control input-md" required autocomplete="off">
                        </div>
                      </div>
                    

                     
                      <div class="form-group col-md-6">
                        <label class="col-md-12 control-label" for="dob">Heure</label>
                        <div class="col-md-8">
                            <select id="heure" name="heure" class="form-control">

                            </select>                       
                         </div>
                      </div>
                      
                      <div class="form-group col-md-6" id ="horaires" style="display: none;">
                        <label class="col-md-12 control-label" for="dob" id="horairesLabel"></label>
                        <div class="col-md-12" id="badges">

                         </div>
                      </div>
                      
                      


                      </div>
                      
                      
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

        
            
        <jsp:include page="footer.jsp">
             <jsp:param name="" value=""/>  
        </jsp:include>
