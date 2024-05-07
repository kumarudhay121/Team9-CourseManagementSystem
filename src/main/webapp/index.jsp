<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LearnSphere</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Material Icons -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="C:\Users\priyanshuroy\Backend\src\main\webapp\indexStyles.css">
    <style>
        /* Dark mode styles */
        body {
            background-color: #121212;
            color: #fff;
        }

        .navbar-dark .navbar-nav .nav-link {
            color: #fff;
        }

        .navbar-dark .navbar-toggler-icon {
            background-color: #fff;
        }

        /* Hero Section Styles */
        .hero {
            background-color: #121212;
            padding-top: 90px;
            padding-bottom: 40px;
            color: #fff;
            position: relative; /* Add this to position the video correctly */
        }

        .hero video {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            object-fit: cover;
        }
        .hero-img{
            height: fit-content;
            width: 60%;
            margin: auto;
        }
        /* Features Section Styles */
        .features .feature {
            background-color: #121212;
            color: #fff;
        }

        /* Footer Styles */
        footer {
            background-color: #121212;
            color: #fff;
        }

        /* FAQ, Feedback, and Contact Section Styles */
        .faq-feedback-contact {
            background-color: #121212;
            color: #fff;
            bs-bg-opacity: 0;
        }

        .faq-feedback-contact h3 {
            color: #fff;
        }

        .faq-feedback-contact p,
        .faq-feedback-contact ul {
            color: #ccc; /* Adjust the color as needed */
        }

        /* Reviews Section Styles */
        .reviews {
            background-color: #121212;
            color: #fff;
        }

        .reviews .card {
            background-color: #121212;
            border: none;
            color: #fff;
        }

        .reviews .card-title {
            color: #fff;
        }

        .reviews .card-text {
            color: #ccc;
        }
        .feature-video{
            margin-top: 50px;
            margin-bottom: 90px;
            height: 100%;
            width: 100%;
        }
        img{
        height: 100%;
        width: 100%;
        }
    </style>
</head>
<body>
    <header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
            <div class="container">
                <a class="navbar-brand" href="#">LearnSphere</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="#"><i class="material-icons">home</i></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#"><i class="material-icons">library_books</i></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#"><i class="material-icons">info</i></a>
                        </li>
                        <!-- Single Login Button -->
                        <li class="nav-item">
                            <a class="nav-link" href="login.jsp">Login</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <section class="hero text-center">
        <img src="resources/images/Pic2.jpg" class="img-fluid hero-img" alt="Hero Image">
        <div class="container">
            <h2>Welcome to Our Online Learning Platform</h2>
            <p class="lead">Access a wide range of courses taught by experts.</p>
            <a href="#" class="btn btn-primary btn-lg">Explore Courses</a>
        </div>
    </section>

    <section class="features py-5">
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="feature text-center">
                        <video src="resources/videos/Feature1.mp4" class="video-fluid feature-video" autoplay loop muted></video>
                        <h3 class="text-light">Come for the training, stay for the experience</h3>
                        <p class="text-light">An intuitive interface means training feels right from the very first click. And with easy access on any device, learners jump in anytime, anywhere. Feel good introducing a tool that people actually use.</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="feature text-center">
                        <video src="resources/videos/Feature2.mp4" class="video-fluid feature-video" autoplay loop muted></video>
                        <h3 class="text-light">Ready to go, right out of the box</h3>
                        <p class="text-light">Skip the months-long setup times that cause your training programs to just fizzle out. Create new courses with a few simple clicks, add users, and go live by the end of the day.</p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="feature text-center">
                        <img src="https://www.chrp-india.com/wp-content/uploads/2020/03/anim-1-1.gif" class="" alt="Feature Image">
                        <h3 class="text-light">Matches your style, speaks their language</h3>
                        <p class="text-light">Teams embrace training when it is relevant. Personalize their experience to match your branding and localize to your user languages for training that feels like it is built just for them.</p>
                    </div>
                </div>
            </div>
        </div>
    </section>


    <section class="reviews py-5">
        <div class="container">
            <h2 class="text-center mb-4">What our Students Say...</h2>
            <div id="reviewCarousel" class="carousel slide" data-bs-ride="carousel" data-bs-interval="3000"> <!-- Set auto change interval to 5 seconds -->
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title">Priyanshu Roy</h5>
                                <p class="card-text"> "LearnSphere helped me expand my knowledge base significantly. The courses are well-structured, and the platform is user-friendly. Highly recommended!"</p>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title">Uday</h5>
                                <p class="card-text"> "As a busy professional, LearnSphere's flexible scheduling options were a lifesaver. I could access the courses at my own pace, which made learning convenient for me."</p>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title">Yash</h5>
                                <p class="card-text"> "The course selection on LearnSphere is diverse, catering to different interests and skill levels. Whether you're a beginner or an expert, there's something for everyone."</p>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title">Chakri</h5>
                                <p class="card-text"> "The support team at LearnSphere is top-notch. They're always responsive and helpful whenever I have questions or encounter any issues. Great customer service!"</p>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title">Naman</h5>
                                <p class="card-text">  "The community aspect of LearnSphere is fantastic. I've connected with other learners and instructors, which has enhanced my learning experience and provided valuable networking opportunities."</p>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title">Mohak</h5>
                                <p class="card-text">  "LearnSphere has exceeded my expectations. The platform is intuitive, and the learning materials are engaging. I've already recommended it to several friends and colleagues."</p>
                            </div>
                        </div>
                    </div>
                    <!-- Add more carousel items as needed -->
                </div>
            </div>
        </div>
    </section>

   <section class="faq-feedback-contact py-5 bg-dark text-light">
       <div class="container">
        <h3 class="card-title text-light text-center">FAQs</h3>
           <div class="row">
               <div class="col-md-4">
                   <div class="card bg-dark">
                       <div class="card-body">
                           <ul class="card-text text-light">
                               <li><strong>Q: What courses are available?</strong><br>A: LearnSphere offers a wide range of courses covering topics such as programming, data science, business management, and more. You can explore our course catalog to find the courses that best suit your interests and career goals.</li>
                           </ul>
                       </div>
                   </div>
               </div>
               <div class="col-md-4">
                   <div class="card bg-dark">
                       <div class="card-body">
                           <ul class="card-text text-light">
                               <li><strong>Q: How do I enroll in a course?</strong><br>A: To enroll in a course, simply browse our course catalog, select the course you're interested in, and click on the "Enroll" button. Follow the prompts to complete the enrollment process, and you'll gain access to the course materials.</li>
                           </ul>
                       </div>
                   </div>
               </div>
               <div class="col-md-4">
                   <div class="card bg-dark">
                       <div class="card-body">
                           <ul class="card-text text-light">
                               <li><strong>Q: Is there a mobile app available?</strong><br>A: Yes, LearnSphere offers a mobile app available for both iOS and Android devices. You can download the app from the App Store or Google Play Store to access your courses on the go.</li>
                           </ul>
                       </div>
                   </div>
               </div>
           </div>
       </div>
   </section>

  <section class="faq-feedback-contact py-5 bg-dark text-light">
      <div class="container">
          <div class="row justify-content-center"> <!-- Updated: Added justify-content-center -->
              <div class="col-md-4">
                  <div class="card bg-dark">
                      <div class="card-body">
                          <h3 class="card-title text-light">Feedback</h3>
                          <p class="card-text text-light">We value your feedback. Please let us know how we can improve your learning experience.</p>
                      </div>
                      <div class="card-body">
                          <h3 class="card-title text-light">Contact Information</h3>
                          <p class="card-text text-light">If you have any queries or need assistance, feel free to contact us:</p>
                          <ul class="text-light">
                              <li>Email: info@learnsphere.com</li>
                              <li>Phone: +91-123-456-7890</li>
                          </ul>
                      </div>
                  </div>
              </div>
          </div>
      </div>
  </section>


   <section class="faq-feedback-contact py-5 bg-dark text-light">
       <div class="container">
           <div class="row">
               <div class="col-md-4">
                   <div class="card bg-dark">

                   </div>
               </div>
           </div>
       </div>
   </section>




    <footer class="bg-dark text-light text-center py-4">
        <div class="container">
            <p>&copy; 2024 LearnSphere. All rights reserved.</p>
        </div>
    </footer>

    <!-- Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
