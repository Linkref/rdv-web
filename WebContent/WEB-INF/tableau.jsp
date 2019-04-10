        <jsp:include page="header.jsp">
            <jsp:param name="" value=""/>
        </jsp:include>
        <%@ page pageEncoding="UTF-8" %>
                    
                   

                        <!-- Area Chart -->
                        <div class="col-xl-12">
                            <div class="card shadow mb-4">
                                <!-- Card Header - Dropdown -->
                                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                    <h6 class="m-0 font-weight-bold text-primary">LISTE DE RENDEZ-VOUS 
                                    <% if (request.getParameter("form") != null) {
                                    	out.println("<span class='badge badge-pill badge-success'>Rendez-vous ajouté avec succès</span>");
                                    }
                                    %>
                                    
                                    </h6>
                                </div>
                                <!-- Card Body -->
                                <div class="card shadow mb-12">
                                    <div class="card-body">
                                        <div class="table-responsive">
                                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                                <thead>
                                                <tr>
                                                    <th>Patient</th>
                                                    <th>Date de rendez-vous</th>
                                                    <th>Médecin</th>
                                                    <th>Motif</th>
                                                    <th>Supprimer</th>
                                                </tr>
                                                </thead>

                                                <tbody>
                                                
												<jsp:useBean id="listeRdv"  scope="request" class="rdv.ListeRDV"/>
												<%@ page import="java.util.ArrayList"
														import="rdv.RendezVous"  
												%>
												<%	
																							
													   for(RendezVous rdv : listeRdv.getListeRDV())
													   {
														   out.println(
																   "<tr>"
														   			+"<td>"+rdv.getPatient()+"</td>"
														   			+"<td>"+rdv.getDate()+ " à "+ rdv.getHeureDebut() +"</td>"
														   		    +"<td>"+rdv.getMedecin()+"</td>"
														   		    +"<td>"+rdv.getRaisonVenue()+"</td>"
																    +"<td> <i class='fas fa-trash-alt'></i></td><tr>"
																   
																   );
													   }
												%>
                                                
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>


                    </div>
                    <!-- /.container-fluid -->

         <jsp:include page="footer.jsp">
                    <jsp:param name="" value=""/>
        
        </jsp:include>