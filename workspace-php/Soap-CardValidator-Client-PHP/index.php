<?php
  /**
   * 
   */
  class CreditCard 
  {

  	private $number;
	private $expiryDate;
	private $controlNumber;
	private $type;
  	
  	function __construct($number, $expiryDate, $controlNumber, $type )
  	{
  		$this->number = $number;
		$this->expiryDate = $expiryDate;
		$this->controlNumber = $controlNumber;
		$this->type = $type;
  	}
  }

?>


<?php  
  $client = new SoapClient("wsdl.xml");

  
  $param = array('card' => new CreditCard("1234567891234567", null, null, null));
  $response = $client->validate($param);

  var_dump($response->return);
?>