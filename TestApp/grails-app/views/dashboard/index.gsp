<!DOCTYPE html>
<html>
	<head>
          <g:javascript library="jquery"/>
		<meta name="layout" content="main"/>
		<title>Dashboard</title>

                <style type="text/css" media="screen">
			#status {
				background-color: #eee;
				border: .2em solid #fff;
				margin: 2em 2em 1em;
				padding: 1em;
				width: 5em;
				float: left;
				-moz-box-shadow: 0px 0px 1.25em #ccc;
				-webkit-box-shadow: 0px 0px 1.25em #ccc;
				box-shadow: 0px 0px 1.25em #ccc;
				-moz-border-radius: 0.6em;
				-webkit-border-radius: 0.6em;
				border-radius: 0.6em;
			}

			.ie6 #status {
				display: inline; 
			}

			#status ul {
				font-size: 0.9em;
				list-style-type: none;
				margin-bottom: 0.6em;
				padding: 0;
			}

			#status li {
				line-height: 1.3;
			}

			#status h1 {
				text-transform: uppercase;
				font-size: 1.1em;
				margin: 0 0 0.3em;
			}

			#page-body {
				margin: 2em 1em 1.25em 18em;
			}

			h2 {
				margin-top: 1em;
				margin-bottom: 0.3em;
				font-size: 1em;
			}

			p {
				line-height: 1.5;
				margin: 0.25em 0;
			}

			#controller-list ul {
				list-style-position: inside;
			}

			#controller-list li {
				line-height: 1.3;
				list-style-position: inside;
				margin: 0.25em 0;
			}

			@media screen and (max-width: 100) {
				#status {
					display: none;
				}

				#page-body {
					margin: 0 1em 1em;
				}

				#page-body h1 {
					margin-top: 0;
				}
			}
                        
                        table.fixed { table-layout:fixed; }
                        table.fixed td { overflow: hidden; width: 30px;}
                        
		</style>
	</head>
	<body>
        <div id="status" role="complementary">
          <div id="controller-list" role="navigation">
            <h2>Controllers:</h2>
            <ul>
              <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.name } }">
                <li class="controller"><g:link controller="${c.logicalPropertyName}">${c.name}</g:link></li>
              </g:each>
            </ul>
          </div>
        </div>
          
        <div id="page-body" role="main">
          <div id="controller-list" role="navigation">
          <center><h1>Customers</h1></center>
          <br>
            <table class="fixed">
              <tr>
                <td align="left"><b>#</b></td>
                <td align="left"><b>Name</b></td>
                <td align="left"><b>Zip Code</b></td>
                <td align="center"><b>E-mail</b></td>
                <td align="left"><b>Phone</b></td>
              </tr>
              <tr>
                <g:each in="${customers}" var="customer" status="i">
                  <table border="0">
                    <tr>
                      <td align="left">${i+1}</td>
                      <td align="left">${customer.name}</td>
                      <td align="left">${customer.zipCode}</td>
                      <td align="center">${customer.email}</td>
                      <td align="left">${customer.phoneNumber}</td>
                    </tr>
                  </table>
                </g:each>
              </tr>
            </table>

            <br>
            <p>
            </p>
            <br>

            <center><h1>Orders</h1></center>
            <br>
            <table class="fixed">
              <tr>
                <td align="left"><b>#</b></td>
                <td align="left"><b>Date Purchased</b></td>
                <td align="center"><b>Customer Name</b></td>
                <td align="center"><b>Store Used</b></td>
                <td align="center"><b>Order Number</b></td>
                <td align="center"><b>Item(s) Purchased</b></td>
              </tr>
              <tr>
                <g:each in="${order}" var="orders" status="i">
                  <table border="0">
                    <tr>
                      <td align="left">${i+1}</td>
                      <td align="left">${order.datePurchased}</td>
                      <td align="center">${order.customerName}</td>
                      <td align="center">${order.storeUsed}</td>
                      <td align="center">${order.orderNumber}</td>
                      <td align="center">${order.itemPurchased}</td>
                    </tr>
                  </table>
                </g:each>
               </tr>
            </table>
          </div>
        </div>
        </body>
</html>