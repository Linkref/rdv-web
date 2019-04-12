        <jsp:include page="header.jsp">
            <jsp:param name="" value=""/>
        </jsp:include>
        <%@ page pageEncoding="UTF-8" %>

                        <div class="col-xl-12">
                            <div class="card shadow mb-4">
                                
                                <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                    <h6 class="m-0 font-weight-bold text-primary">LISTE DE RENDEZ-VOUS 
                                    <!-- Affiche les messages de succés -->
                                    <% if (request.getParameter("form") != null) {
                                    	out.println("<span class='badge badge-pill badge-success'>Rendez-vous ajouté avec succès</span>");
                                    } else if (request.getParameter("date") != null) {
                                    	out.println("<span class='badge badge-pill badge-success'>Rendez-vous supprimé avec succès</span>");
                                    }
                                    	
                                    	%>
                                    
                                    </h6>
                                </div>
                                
                                <div class="card shadow mb-12">
                                    <div class="card-body">
                                        <div class="table-responsive">
                                            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                                <thead>
                                                <tr>
                                                    <th>Nom</th>
                                                    <th>Prénom</th>
                                                    <th>Date de rendez-vous</th>
                                                    <th>Heure de rendez-vous</th>                                                  
                                                    <th>Médecin</th>
                                                    <th>Motif</th>
                                                    <th>Supprimer</th>
                                                </tr>
                                                </thead>

                                                <tbody>
                                                <!-- On remplit le tableau avec les rendez-vous -->
												<jsp:useBean id="listeRdv"  scope="request" class="rdv.ListeRDV"/>
												<%@ page import="java.util.ArrayList"
														import="rdv.RendezVous"  
												%>
												<%	
																							
													   for(RendezVous rdv : listeRdv.getListeRDV())
													   {
														   
														   out.println(
																   "<tr>"
														   			+"<td>"+rdv.getPatient().split(" ")[0].replace("_", " ")+"</td>"
														   			+"<td>"+rdv.getPatient().split(" ")[1].replace("_", " ")+"</td>"
														   			+"<td id='date'>"+rdv.getDate()+"</td>"
														   			+"<td id='heure'>"+rdv.getHeureDebut() +"</td>"
														   		    +"<td>"+rdv.getMedecin()+"</td>"
														   		    +"<td>"+rdv.getRaisonVenue()+"</td>"
																    +"<td><a href='listerdv?date="+rdv.getDate()+"&heure="+rdv.getHeureDebut()+"&med="+rdv.getMedecin().replace(" ", "_")+"'> <i class='fas fa-trash-alt'></i></button></td><tr>"
																   	
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
		              
         <jsp:include page="footer.jsp">
                    <jsp:param name="" value=""/>
        
        </jsp:include>