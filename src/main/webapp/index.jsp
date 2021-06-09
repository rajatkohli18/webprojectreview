<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style> 
#panel, #flip {
  padding: 5px;
  text-align: center;
  background-color: #e5eecc;
  border: solid 1px #c3c3c3;
}

#panel {
  padding: 50px;
  display: none;
}
#rj{
    text-align:center;
    padding:20px;
    width:340px;
    margin: 0 auto;

    /* Set the border and border image properties */
    border:30px solid transparent;
    border-image:url(https://demo.tutorialzine.com/2013/10/css3-features-you-can-finally-use/assets/img/border.png) 30 30 round;
}
</style>

<script> 
$(document).ready(function(){
	  $("button").click(function(){
	    $("div").css("color", "red");
	  });
	});
</script>
</head>

<body>


	<div class="col-md-6 offset-md-3 mt-5">
		<br>

		<h1>Application For .Net Core - Module Lead / Technical Lead -
			CHENNAI</h1>
		<form accept-charset="UTF-8" action="FormData" method="POST">
			<div class="form-group mt-3" id ="rj" >
				<label class="mr-4">Upload your Resume:</label> <input type="file"
					name="file" id="file">
			</div>
			<h2>Tell us a little about Yourself</h2>
			<div class="form-group">
				<label for="exampleInputEmail1" required="required">Email
					address</label> <input type="email" name="email" class="form-control"
					id="email" aria-describedby="emailHelp"
					placeholder="Enter your email address" />
			</div>
			<div class="form-group">
				<label for="exampleInputName">First Name</label> <input type="text"
					name="firstname" class="form-control" id="firstname"
					placeholder="Enter your first name" required="required">
			</div>
			<div class="form-group">
				<label for="exampleInputName">Last Name</label> <input type="text"
					name="lastname" class="form-control" id="lastname"
					placeholder="Enter your last name" required="required">
			</div>
			<div class="form-group" id = "flip">
				<label for="example-tel-input" class="col-2 col-form-label">Phone
					Number</label>
				<div class="col-10">
					<input class="form-control" name="tel" type="tel" value="" id="tel">
				</div>
			</div>

			<div class="form-group">
				<label for="inputAddress">Current Location</label> <input
					type="text" name="address" class="form-control" id="address"
					placeholder="">
			</div>


			<div class="form-group">
				<label for="example-date-input" class="col-3 col-form-label">Date
					of Birth</label>
				<div class="col-10">
					<input class="form-control" name="applicationdate" type="formdate"
						value="2020-02-01" id="applicationdate">
				</div>
			</div>
			<div class="col-12 form-group">
				<label for="Country">Total Experience (in Years)*</label> <select
					name="experience" id="experience"
					class="form-control custom-select browser-default">
					<option value="1">1 Years</option>
					<option value="2">2 Years</option>
					<option value="3">3 Years</option>
					<option value="4">4 Years</option>
					<option value="5">5 Years</option>
					<option value="6">6 Years</option>
					<option value="7">7 Years</option>
					<option value="8">8 Years</option>
					<option value="9">9 Years</option>
					<option value="10">10 Years</option>
				</select>
			</div>

			<div class="form-group">
				<label for="exampleInputMid">Please provide the earlier Mid
					in case you are a former mindtree mind</label> <input type="text"
					name="mid" class="form-control" id="mid" placeholder="-select-"
					required="required">
			</div>
			<div style="margin-right: 100px">
				<label>Notice period*</label> <select class="form-select"
					aria-label="Default select example" id="noticeperiod"
					name="noticeperiod">
					<option selected>Notice period*</option>
					<option value="1">15 days</option>
					<option value="2">25 days</option>
					<option value="3">1 month</option>
				</select>
			</div>
			<br>
			
			<div class="col-sm-12 form-group mb-0">
              <button type="submit" class="btn btn-primary" onclick="savedata()">Submit</button>
            </div>
</form>
<form action="DisplayAllUsers" method="get">
    	<div class="col-sm-12 form-group mb-0">
               <button class="btn btn-primary float-right">Display All Users</button>
        </div>
        </form>
</body>

</html>