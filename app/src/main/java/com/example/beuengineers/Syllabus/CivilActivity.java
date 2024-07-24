package com.example.beuengineers.Syllabus;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beuengineers.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CivilActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BranchAdapter branchAdapter;
    List<Branch> branchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        branchList = getBranches();
        branchAdapter = new BranchAdapter(branchList, this);
        recyclerView.setAdapter(branchAdapter);
    }

    private List<Branch> getBranches() {
        List<Branch> branches = new ArrayList<>();

        //1 Semester
        List<String> BEE = Arrays.asList("Module-1 : \n DC Circuits ( 8 Lectures )", "Electrical Circuit elements (R, L and C), Voltage and Current sources, Kirchhoff current and voltage Laws, Analysis of simple circuits with DC excitation. Star-Delta conversion, Network theorems (Superposition, Thevenin, Norton and Maximum power transfer theorems). Time-domain analysis of first order RL and RC circuits." ,
                "Module-2 : \n AC Circuits ( 8 Lectures )","Representation of sinusoidal waveforms, Peak, rms and Average values (Form factor and Peak factor), Impedance of series and parallel circuit, Phasor representation, Real Power, Reactive Power, Apparent Power, Power Factor, Power Triangle. Analysis of single-phase Ac circuits consisting of R, L, C, RL, RC, RLC Combinations (Series and Parallel), Resonance. Three-Phase Balanced Circuits, Voltage and current relations in Star and Delta connections." ,
                        "Module-3 : \n Magnetic Circuits ( 4 Lectures )","Introduction, Series and Parallel Magnetic circuits, Analysis of Series and Parallel magnetic circuits.",
                "Module-4 : \n Transformers ( 6 Lectures )","Magnetic Materials, B-H characteristics, Ideal and Practical Transformer, EMF equation, Equivalent Circuit, Losses in transformers, Regulation and efficiency. Auto-transformer and Three-Phase Transformer connections." ,
                        "Module-5 : \n Electrical Machines (10 Lectures )","Construction, Working, Torque-Speed characteristic and speed control of separately excited DC Motor. Generation of rotating Magnetic Fields, Construction and working of a ThreePhase induction Motor, Significance of Torque-Slip characteristic. Loss components and efficiency, Starting and speed control of induction Motor. Construction and working of synchronous Generators." ,
                        "Module-6 : \n Electrical Installations ( 6 Lectures )","Components of L-t Switchgear: Switch Fuse Unit (SFU), MCB, ELCB, MCCB, Types of wires and cables, Earthing. Types of Batteries, Important characteristics for Batteries. Elementary calculations for energy consumption, Power factor improvement and Battery backup." ,
                        "BOOKS : \n Suggested books","1. D. P. KOTHARI AND I. J. NAGRATH, “BASIC ELECTRICAL ENGINEERING”, TATA MCGRAW HILL, 2010.\n" +
                        "2. D. C. KULSHRESHTHA, “BASIC ELECTRICAL ENGINEERING”, MCGRAW HILL, 2009.\n" +
                        "3. L. S. BOBROW, “FUNDAMENTALS OF ELECTRICAL ENGINEERING”, OXFORD UNIVERSITY PRESS, 2011.\n" +
                        "4. BASIC ELECTRICAL ENGINEERING BY FITZERALD.");


        List<String> MathFirst = Arrays.asList("Module-1:A \n Calculus: (12 Lectures)", "Intervals, Convergence of sequences and series of Real numbers, Limit and Continuity of functions, Differentiability of functions, Rolle’s theorem, Mean value theorems, Taylor’s and Maclaurin theorems with remainders; Indeterminate forms and L'Hospital's rule; Maxima and Minima, Riemann integration, Fundamental theorem of calculus." ,
                "Module-1:B \n Calculus: (8 Lectures)","Evolutes and involutes; Evaluation of definite and improper integrals; Beta and Gamma functions and their properties; Applications of definite integrals to evaluate surface areas and volumes of Revolutions." ,
                        "Module-1:C \n Series: (Prerequisite 2B) (8 Lectures)","Power series, Taylor's series. Series for exponential, Trigonometric and Logarithmic functions; Fourier series: Half range sine and cosine series, Parseval’s theorem." ,
                        "Module-2:A \n Matrices (In case vector spaces is to be taught) (14 Lectures)","Algebra of matrices, Inverse and rank of a matrix, Rank-Nullity theorem; System of linear equations; Symmetric, Skew-Symmetric and Orthogonal matrices; Determinants; Eigenvalues and Eigenvectors; Diagonalization of matrices; Cayley-Hamilton theorem, Orthogonal transformation and quadratic to canonical forms." ,
                        "Module-2:B \n Matrices (In case vector spaces is to be taught) (8 Lectures)","Matrices, Vectors: Addition and scalar multiplication, Matrix multiplication; Linear systems of equations, Linear independence, Rank of a matrix, Determinants, Cramer’s rule, Inverse of a matrix, Gauss elimination and Gauss-Jordan elimination." ,
                        "Module-2:C \n Vector Spaces (Prerequisite 2B) (10 Lectures)","Vector space, Linear dependence of vectors, Basis, Dimension; Linear transformations (maps), Range and kernel of a linear map, Rank and Nullity, Inverse of a linear transformation, Rank- Nullity theorem, Composition of linear maps, Matrix associated with a Linear Map." ,
                        "Module-1:D \n Vector Spaces (Prerequisite 2B-C) (10 Lectures)","Eigenvalues, Eigenvectors, Symmetric, Skew-Symmetric and Orthogonal matrices, Eigenbases. Diagonalization; Inner product spaces, Gram-Schmidt Orthogonalization.");

//EGD
        List<String> EGD = Arrays.asList("Traditional Engineering Graphics", "Principles of Engineering Graphics; Orthographic Projection; Descriptive Geometry; Drawing Principles; Isometric Projection; surface Development; Perspective; Reading a Drawing; Sectional Views; Dimensioning & Tolerances; True Length, Angle; Intersection, Shortest Distance." ,
                "Computer Graphics","Engineering Graphics Software; Spatial Transformations; Orthographic Projections; Model viewing; Co-ordinate systems; Multi-view projection; Exploded assembly; Model viewing; Animation; Spatial manipulation; Surface Modelling; sSlid Modelling, Introduction to Building Information Modelling (BIM)." ,
                        "Module-1 : \n Introduction to Engineering Drawing","Principles of Engineering Graphics and their significance, Usage of Drawing Instruments, Lettering, Conic sections including the rectangular Hyperbola (General method only); Cycloid, Epicycloid, Hypocycloid and Involute; Scales – Plain, Diagonal and Vernier Scales." ,
                        "Module-2 : \n Orthographic projections","principles of orthographic projections- Conventions-Projections of points and Lines inclined to both Planes, projections of planes inclined planes Auxiliary Planes." ,
                        "Module-3 : \n Projections of Regular Solids","Those inclined to both the Planes-Auxiliary views, Draw simple Annotation, Dimensioning and scale floor plains that include: Windows, Doors and Fixtures such as WC, Bath, Sink, Shower, etc." ,
                        "Module-4 : \n Sections and Sectional views of Right Angular Solids","Covering, Prism, Cylinder, Pyramid, Cone – Auxiliary views; Development of surfaces of Right Regular Solids- Prism, Pyramid, cylinder and Cone; Draw the sectional Orthographic views of Geometrical Solids, Objects from industry and Dwellings ( Foundation to Slab only )." ,
                        "Module-5 : \n Isometric Projections","Principles of Isometric projection – Isometric Scale, Isometric views, Conventions; Isometric views of Lines, Planes, Simple and compound solids; Conversion of isometric views to Orthographic views and vice-versa, Conventions." ,
                        "Module-6 : \n Overview of Computer Graphics","Listing the computer Technologies that impact on Graphical Communication, Demonstrating knowledge of the theory of CAD Software [ such as: The Menu system, Toolbars ( Standard, Object properties, Draw, Modify and Dimension), Drawing Area ( Background, Crosshairs, Coordinate system ), dialog boxes and windows, Shortcut menus (Button bars), The command line (where applicable ), The status bar, Different methods of zoom as used in CAD, Select and erase objects. Isometric views of Lines, Planes, Simple and Compound Solids ]." ,
                        "Module-7 : \n Customisation and CAD Drawing","Consisting of set up of the drawing page and the printer, Including scale settings, Setting up of units and Drawing Limits; ISO and ANSI Standards for coordinate Dimensioning and Tolerancing; Orthographic constraints, Snap to objects manually and automatically; Producing drawings by using various coordinate input entry methods to draw straight lines, Applying various ways of Drawing Circles." ,
                        "Module-8 : \n Annotaions, Layering and Other Functions","Covering applying Dimensions to objects, Applying annotations to drawings; Setting up and use of layers, Layers to create drawings, Create, Edit and use customized layers; Changing line lengths through modifying existing lines ( extend/lengthen ); Printing documents to paper using the print command; Orthographic projection techniques; Drawing sectional views of composite right regular geometric solids and project the true shape of the sectioned surface; Drawing annotation, Computer-Aided Design ( CAD ) software modeling of parts and assemblies. Parametric and Non-Parametric solid, Surface, and Wireframe models. Part editing and Two-Dimensional documentation of models. Planar projection theory, Including sketching of perspective, Isometric, Multiview, Auxiliary and section views. Spatial visualization exercises. Dimensioning guidelines, Tolerancing techniques; Dimensioning and scale multi views of Dwelling." ,
                        "Module-9 : \n Demonstration of a sample Team Design project that Illustrates","Geometry and Topology of Engineered Components: Creation of Engineering models and their presentation in standard 2-D Blueprint form and as 3-D wireframe and shaded solids; Meshed Topologies for Engineering Analysis and Toolpath Generation for Component Manufacture; Geometric Dimensioning and Tolerancing; Use of solid-modeling software for creating associative models at the component and assembly levels. Floor plans that include: Windows, Doors, and Fixtures such as WC, Bath, Sink, Shower, etc. Applying colour coding according to building drawing practice; Drawing sectional elevation showing foundation to ceiling; Introduction to Building Information Modelling ( BIM )." ,
                        "BOOKS : ","1.BHATT N.D., PANCHAL V.M. & INGLE P.R., (2014), ENGINEERING DRAWING, CHAROTAR PUBLISHING HOUSE\n" +
                        "2. SHAH, M.B. &RANA B.C. (2008), ENGINEERING DRAWING AND COMPUTER GRAPHICS, PEARSON EDUCATION\n" +
                        "3. AGRAWAL B. & AGRAWAL C. M. (2012), ENGINEERING GRAPHICS, TMH PUBLICATION\n" +
                        "4. NARAYANA, K.L. & P KANNAIAH (2008), TEXT BOOK ON ENGINEERING DRAWING, SCITECHPUBLISHERS");


        List<String> PHYMECHANICS = Arrays.asList("Module-1 : \n Vector Mechanics Of Particles (20 Lectures)", "Transformation of scalars and vectors under Rotation transformation; Forces in nature; Newton’s laws and its completeness in describing particle motion; Form invariance of Newton’s second law; Solving Newton’s equations of motion in polar coordinates; Problems including constraints and friction; Extension to cylindrical and spherical coordinates; Potential energy function; F = - grad V, Equipotential surfaces and meaning of gradient; Conservative and Non-Conservative forces, Curl of a force field; Central forces; Conservation of angular momentum; Energy equation and energy Diagrams; Elliptical, Parabolic and Hyperbolic orbits; Kepler problem; Application: Satellite Manoeuvres; Noninertial frames of reference; Rotating coordinate system: Five-term acceleration formula. Centripetal and coriolis accelerations; Applications: weather systems, Foucault pendulum; Harmonic oscillator; Damped harmonic motion – Over-Damped, Critically damped and lightly-damped oscillators; Forced oscillations and Resonance." ,
                "Module-2 : \n Planar Rigid Body Mechanics (10 Lectures)","Definition and motion of a rigid body in the plane; Rotation in the plane; Kinematics in a coordinate system rotating and translating in the plane; Angular Momentum about a point of a rigid body in planar motion; Euler’s Laws of motion, Their independence from Newton’s laws, and their necessity in describing rigid body motion; Examples. Introduction to Three-Dimensional rigid body motion — Only need to highlight the distinction from Two-Dimensional motion in terms of (a) angular velocity vector, and its rate of change and (b) moment of inertia tensor; Three-Dimensional motion of a rigid body wherein all points move in a Coplanar manner: e.g. Rod executing conical motion Withcenter of mass fixed — Only need to show that this motion looks Two-Dimensional but is Threedimensional, and Two-Dimensional formulation fails." ,
                        "Module-3 : \n Statics (10 Lectures)","Free body Diagrams with examples on modelling of typical supports and joints; Condition for equilibrium in Three- and Two- Dimensions; Friction: Limiting and Non-Limiting cases; Force displacement relationship; Geometric compatibility for small deformations; Illustrations through simple problems on axially loaded members like trusses." ,
                        "Module-4 : \n Mechanics Of Solids (30 Lectures)","Concept of stress at a point; Planet stress: Transformation of stresses at a point, Principal stresses and Mohr’s Circle; displacement field; Concept of strain at a point; Plane strain: Transformation of strain at a point, Principal strains and Mohr’s circle; Strain roseoe; Discussion of experimental results on one- Dimensional material behaviour; Concepts of elasticity, Plasticity, strain hardening, Failure (fracture / yielding); Idealization of onedimensional stress-strain curve; generalized Hooke’s Law with and without thermal Strains for isotropic materials; Complete equations of elasticity; Force analysis — Axial force, Shear force, Bending moment and twisting moment diagrams of slender members (without using singularity functions); Torsion of circular shafts and thin-walled tubes (plastic analysis and rectangular shafts not to be discussed); Moment curvature relationship for pure bending of beams with symmetric cross-section; bending stress; Shear stress; Cases of combined stresses; Concept of strain energy; Yield criteria; Deflection due to bendind.");


        List<Semester> firstSemesters = new ArrayList<>();
        firstSemesters.add(new Semester("Basic Electrical Engineering", BEE));
        firstSemesters.add(new Semester("Mathematics-I (Calculus, Multivariable Calculus and Linear Algebra )", MathFirst));
        firstSemesters.add(new Semester("Engineering Graphics and Design", EGD));
        firstSemesters.add(new Semester("Physics(Introduction To Mechanics)", PHYMECHANICS));

        branches.add(new Branch("Semester 1", firstSemesters));
        //first semester complete.......



        //2 Semester start......
        List<String> Chemistry = Arrays.asList("Module-1\n Atomic and Molecular Structure(10 Lectures)", "Atomic structure and its properties at atomic and sub-atomic level, Failure of classical theories to explain properties of particles, Molecular orbitals of diatomic molecules and graphs of multicentre orbitals, Principal for combination of atomic orbita;s to form molecular orbitals, Schodinger equation, Photoelectric effect and Heisenberg uncertainty principle, Dual nature of electromagnetic radiation, Planks theory, Band structure, Electromagnetic radiation, Crystal field theory and the energy level diagram for transition metals ions and their magnetic properties." ,
                "Module-2\n Spectroscopic Technique and its Applications (8 Lectures)","Principal of vibrational and rotational spectroscopy and selection rules for application in diatomic molecules, Elementary idea for elecctronic spectroscopy. UV-VIS Spectroscopy with related rules and its applications. Fluorescence and its application in medicines. Basic principle of Nuclear magnetic resonance and its applications. Basics of magnetic resonance imaging." ,
                "Module-3\n Intermolecular forces and properties of Gases (4 Lectures)","Ionic, Dipolar and Vanderwalls interactions. Equations of stste of ideal and real gases, Deviation from ideal behaviour. Vanderwalls Gas Equation.",
                "Module-4\n Use of free energy in chemical equilibriya and water chemistry (8 Lecture)","Thermodynamics functions: Energy, Enthalpy,Free energy. Equation to interrelate thermodynamics properties. Free Energy, EMF, and Cell potentials, The Nearst equation and its applications, Corrosion, Use of free energy considerations in metallurgy through ellingham diagrams. Solubility equilibria. Water chemistry hard and soft water, Parameretrs of quality of water to be used in different industries as for drinking water. Calculations of hardness of water in all units. Estimation of hardness using EDTA and Alkalinity methode. Removal of hardness by Sodalime and ion exchange methode including Zeolite Methode.",
                "Module-5\n Periodic properties (4 Lectures)","Effective Nuclear charge, Penetration of orbitals, Vibrations of s,p,d,and f orbitals energies of atom in the periodic table. Electronic configuration, Atomic and ionic size, Ionization energies,Polarisation,Acid,Base,Principal of HSAB theory, Oxidation states, Hybridisation and Moecular geometry.",
                "Module-6\n Stereochemistry (4 Lectures)","Representation of 3-D structures, Structural Isomersand stereoisomers, Diastereomers,Optical activity, Configuration and symmetry and chirality,enantiomers,Absolute configurations and confirmational analysis.",
                "Module-7\n Organic reactions and synthesis of drugs moleculed (4 lectures)","Introduction to intermediates and reaction involving substitution, Addition, Elimination, Oxidation-Reductions. Diels Elders cuclization and epoxide ring opening reactiion. Synthesis of a commonly used drug molecules like Aspirin.",
                "Practicals:\n Choose any 10-12 experiments from below","1. Determination of surface tension and viscosity.\n" +
                        "2. Thin layer chromatography.\n" +
                        "3. Ion Exchange column for removal of hardness of water.\n" +
                        "4. Determination of chloride component of water.\n" +
                        "5. Colligative properties using freezing point depression.\n" +
                        "6. Determination of rate constant of reaction.\n" +
                        "7. Determination of cell constant and conductance of solution.\n" +
                        "8. Potentiomerty-Determination of redox potential and Emfs.\n" +
                        "9. synthesis of a polymer/drug.\n" +
                        "10. Saponication/ acid value of oil.\n" +
                        "10. Chemical analysis of a salt.\n" +
                        "11. Lattice structure and packing of spheres.\n" +
                        "12. Model of potential Energy surface.\n" +
                        "13. Chemical oscillations-Iodine clock reaction.\n" +
                        "14. Adsorption of acetic acid by charcoal.\n" +
                        "15. Use of capillary viscisimeter to the demonstrate of the iso electric point as the PH of minimum viscosity.");


        List<String> MathSecond = Arrays.asList("Module-3:A \n FIRST ORDER ORDINARY DIFFERENTIAL EQUATIONS (6 LECTURES)","Exact, Linear and Bernoulli’s equations, Euler’s equations, Equations not of first degree: Equations solvable for P, equations solvable for Y, equations solvable for X and Clairaut’s type." ,
                "Module-3:B \n ORDINARY DIFFERENTIAL EQUATIONS OF HIGHER ORDERS (8 LECTURES)","Second Order Linear differential equations with variable Co-Efficients, Method of variation of parameters, Cauchy-Euler equation; Power series solutions; Legendre polynomials, Bessel functions of the first kind and their properties." ,
                        "Module-3:C \n PARTIAL DIFFERENTIAL EQUATIONS – FIRST ORDER AND HIGHER ORDER (16 LECTURES)","First Ordder Partial differential equations, Solutions of First Order Linear and Non-Linear PDEs.\n" +
                        "Solution to Homogenous and Non-Homogenous linear partial differential equations second and Higher order by complimentary function and particular integral method. Flows, Vibrations and diffusions, Second-order linear equations and their classification, Initial and boundary conditions (with an informal description of well-posed problems), D'alembert's solution of the wave equation; Duhamel's principle for one dimensional wave equation. Separation of variables method to simple problems in cartesian coordinates. The Laplacian in plane, cylindrical and spherical polar coordinates, Solutions with bessel functions and legendre functions. One Dimensional diffusion equation and its solution by separation of variables. Boundary-Value problems: Solution of boundary-value problems for various linear PDEs in various Geometries.",
                "Module-4:A \n COMPLEX VARIABLE – DIFFERENTIATION (8 LECTURES)","Differentiation, Cauchy-Riemann equations, Analytic functions, Harmonic functions, Finding harmonic conjugate; Elementary analytic functions ( Exponential, Trigonometric, Logarithm ) and their properties; Conformal mappings, Mobius transformations and their properties." ,
                        "Module-4:B \n COMPLEX VARIABLE - INTEGRATION (8 LECTURES)","Contour integrals, Cauchy-Goursat theorem ( without proof ), Cauchy integral formula ( without proof ), Liouville’s theorem and maximum-modulus theorem( without proof ); Taylor’s series, Zeros of analytic functions, Singularities, Laurent’s series; Residues, Cauchy residue theorem ( without proof ), Evaluation of definite integral involving sine and cosine, Evaluation of certain improper integrals using the Bromwich Contour." ,
                        "Module-4:C \n APPLICATIONS OF COMPLEX INTEGRATION BY RESIDUES: (4 LECTURES)","Evaluation of definite integral involving sine and cosine. Evaluation of certain improper integrals using the Bromwich Contour.");




        List<String> PPS = Arrays.asList("Module-1: \n Introduction to Programming ( 6 Lectures)", "Introduction to components of a computer system (Disks, Memory, Processor, where a program is stored and executed, Operating system, Compilers etc). Idea of Algorithm: steps to solve logical and numerical problems. Representation of Algorithm: flowchart/pseudo code with examples. from algorithms to programs; source code, variables (with data types) variables and memory locations, type casting/type conversion, run time environment (Static, Dynamic location), Storage classes (auto, Register, static, extern), syntax and logical errors in compilation, object and executable code" ,
                "Module-2: \n Operators & Conditional branching and loops (7 Lectures)","Arithmetic expressions/Arithmetic operators/Relational operators/Logical operators/Bitwise operators and Precedence\n Writing and evaluation of Conditionals and consequent branching, Iteration and loops.",
                "Module-3: \n Arrays (4 Lectures)","Array declaration and Initialisation, Bound checking arrays (1-D, 2-D), character array and Strings. ",
                "Module-4: \n Basic Algorithms (6 Lectures)","Searching (Linear search, Binary search etc.), Basic Sorting Algorithms ( Bubble, Insertion and Selection ), finding roots of equations, Notion of order of complexity through example programs (no formal definition required)." ,
                "Module-5: \n Function (4 Lectures)","Introduction and writing functions, Scope of variables functions ( Including using fault in libraries ) Parameter passing in functions, Call by values, assing arrays to functios: Idea of call by reference." ,
                "Module-6: \n Recursion ( 5 Lectures)","Recursion, as a different way of solving problems. Example programs, such as finding Factorial, Fibonacci series, Reverse a string using recursion, and GCD of two numbers, Ackerman function etc. Quick sort or Merge sort." ,
                "Module-7: \n Structure/Union ( 3 Lectures )", "Structures, Accessing structure elements, Way of storage of structure elements, Defining structures and arrays of structures, Basic definition of Union, Comparison B/W Structure & Union with examples." ,
                "Module-8: \n Pointers ( 5 Lectures )","Idea of pointers, Defining pointers, Use of pointers in self-referential structures, Notion of linked list (no implementation), Pointer to pointer, Pointer to array, Pointer to strings, Array of pointer, Pointer to function, Pointer to structure." ,
                "Module-9: \n File Handling","( Only If time is available, Otherwise should be done as part of the LAB )" ,
                "LAB : \n Problem solving using computers" ,
                "1. Familirisation with programming Environment.\n" +
                        "2. Variable types and type conversions ( Simple computational problems using arithematics expression ).\n" +
                        "3. Branching and Logical Expression ( Problem involving IF-THEN-ELSE structure ).\n" +
                        "4. Loops, While, Do-While and For loops ( Iterative problems e.g. Sum of series ).\n" +
                        "5. Arrays: Searching, sorting ( 1-D array manipulations ).\n" +
                        "6. 2-D Array and Strings ( matrix problem, stringg operations ).\n" +
                        "7. Functions, Call by value : ( Simple function ).\n" +
                        "8. Programming for solving numerical methode problems ( e.g. root finding ).\n" +
                        "9. Recursion, Structure of recursive calls ( Recursive functions ).\n" +
                        "10. Saponication/ acid value of oil.\n" +
                        "10. Pointers, structures and dynamic Memory allocation.\n" +
                        "11. File handling ( File Operations ).");


        List<String> Workshop = Arrays.asList("Module-1: \n Lectures ans videos(10 Lectures )","1. Manufacturing methods- Casting, Forming, Machining, Joining Advanced manufacturing methods.\n" +
                        "2. CNC Machining, Additive Manufacturing.\n" +
                        "3. Fitting Operations and Power tools.\n" +
                        "4. Carpentary\n" +
                        "5. Plastic Moulding, Glass cutting.\n" +
                        "6. Metal Casting\n" +
                        "7. Welding (Arc welding and Gas welding Brazing, soldering )",
                "Module-2: \n Workshop Practice ( 60 hours )","1. Machine shop and Fitting shop( 18 hrs )\n" +
                        "2. Carpentary( 6 hrs )\n" +
                        "3. Welding shop ( Arc welding + Gas welding )( 8 hrs )\n" +
                        "4. Casting and smithy( 6 hrs )\n" +
                        "5. Plastic Moulding and Glass cutting( 6 hrs )\n" +
                        "6. 3-Printing of different models ( 8 hrs )");



        List<String> English = Arrays.asList("Module-1: \n Vocabulary Building", "A. Acquantance with prefixes and suffixes from foreign languages in English to from derivatives.\n" +
                        "B. Root words from foreign languages and their use in English.\n" +
                        "C. A concept of word formation\n" +
                        "D. Synonyms, Antonyms and standard abbreviations.\n" +
                        "E. Affixes, Acronyms",
                "Module-2: \n Basic writing skills","A. Use of Tense, Use in context and coherenceof tensein writing.\n" +
                        "B. Use of phrases and Clauses in sentences.\n" +
                        "C. Importance og proper Punctuation.\n" +
                        "D. Kinds of sentences.\n" +
                        "E. Sentence Structures.\n" +
                        "F. Use of voice-Active /Passive in sentences.\n" +
                        "G. Use of speech-Direct and Indirect speech.\n" +
                        "H. Framing questions- Direct,Using modal verbs.",
                "Module-3: \n Identifying common Errors in writing","A. Subject-Verb agreement.\n" +
                        "B. Noun-Pronoun agreement.\n" +
                        "C. Misplaced modifiers\n" +
                        "D. Articles\n" +
                        "E. Prepositions, Redundancies,Cliches.\n" +
                        "F. Common english errors",
                "Module-4: \n Nature and style of sensible writing","A. Describing\n" +
                        "B. Defining\n" +
                        "C. Classifying\n" +
                        "D. Providing examples or evidence\n" +
                        "E. Writing introduction and conclusion\n" +
                        "F. Organising principle of paragraphs in documents\n" +
                        "G. Argument, Describing/ Narrating/ Planning,Defining,Classifying\n" +
                        "H. Lexical resources, using suitabble language register.\n" +
                        "I. Coherence, writing introduction,\n" +
                        "body and conclusion techniques for writing precisely,grammar and accuracy.",
                "Module-5: \n Writing practices","A. Formal letter writing/application/Report writing/writing minutes of meetings\n" +
                        "B. Comprehension\n" +
                        "C. Essay writing\n" +
                        "D. Formal Email writing\n" +
                        "E. Resume/ CV writing /Cover letter\n" +
                        "F. Statement of purpose",
                "Module-6: \n Oral communication","( This unit involves interactive practices in language Lab. )\n" +
                        "A. Listening Comprehension\n" +
                        "B. Pronounciation, Intonation, Stress and Rythm.\n" +
                        "C. Common everyday situations: Conversations and Dialogues.\n" +
                        "D. Communication at workplace.\n" +
                        "E. Interviews\n" +
                        "F. Formal presentations\n" +
                        "G. Acquanting students with IPA symbols\n" +
                        "H. Phonetics(Basic)\n" +
                        "I. Sounds- Vowels, Consonants\n" +
                        "J. Clearingmother tongue influence\n" +
                        "K. Clearing redundancies and common errors related to indianism.\n" +
                        "L. Group discussion M.Expressing opinions\n" +
                        "M. Coherence and Fluency in speech.",
                "Module-7: \n Reading skills","A. Reading comprehension\n" +
                        "B. Paragraph reading based on phonetic sounds / Innotation\n" +
                        "PROFESSIONAL SKILLS\n" +
                        "A. Team Building\n" +
                        "B. Soft skill and entiquettes\n" +
                        "ACQUANTANCE WITH TECHNOLOGY-AIDED LANGUAGE LEARNING\n" +
                        "A. Use of computer softwares ( Grammarly Ginger.........)\n" +
                        "B. Use of smartphone applications ( Duolingo, Bussu......)",
                "Module-8: \n Activities","A. Narrative chain\n" +
                        "B. Describing / Narrating\n" +
                        "C. Writing essay in relay\n" +
                        "D. Peer / Group activities\n" +
                        "E. Brain storming vocabulary\n" +
                        "F. Debates");

        List<Semester> secondSemesters = new ArrayList<>();
        secondSemesters.add(new Semester("Chemistry", Chemistry));
        secondSemesters.add(new Semester("Mathematics-II ( Differential Equations )", MathSecond));
        secondSemesters.add(new Semester("Programming for Problem Solving(PPS)", PPS));
        secondSemesters.add(new Semester("Workshop Manufacturing practice", Workshop));
        secondSemesters.add(new Semester("English", English));

        branches.add(new Branch("Semester 2", secondSemesters));
        //second semester  complete........



        //3 Semester start.......
        List<String> BasicElectronic = Arrays.asList("Module-1\n" +
                "Diodes and Applications covering\n" +
                "Diodes and Applications covering, Semiconductor Diode - Ideal versus Practical, Resistance Levels, Diode Equivalent Circuits, Load Line Analysis; Diode as a Switch, Diode as a Rectifier, Half Wave and Full Wave Rectifiers with and without Filters; Breakdown Mechanisms, Zener Diode – Operation and Applications; OptoElectronic Devices – LEDs,\n" +
                "Photo Diode and Applications; Silicon Controlled Rectifier (SCR) – Operation, Construction, Characteristics, Ratings, Applications;\n" +
                "\n" +
                "Module-2\n" +
                "Transistor Characteristics covering, Bipolar Junction Transistor (BJT) –\n" +
                "Construction, Operation, Amplifying Action, Common Base, Common Emitter and Common Collector Configurations, Operating Point, Voltage Divider Bias Configuration; Field Effect.\n" +
                "Transistor (FET) – Construction, Characteristics of Junction FET, Depletion and Enhancement type Metal Oxide Semiconductor (MOS) FETs, Introduction to CMOS circuits;\n" +
                "\n" +
                "Module-3\n" +
                "Transistor Amplifiers and Oscillators covering\n" +
                "Transistor Amplifiers and Oscillators covering, Classification, Small Signal Amplifiers – Basic Features, Common Emitter Amplifier, Coupling and Bypass Capacitors, Distortion, AC Equivalent Circuit; Feedback Amplifiers – Principle, Advantages of Negative Feedback, Topologies, Current Series and Voltage Series Feedback Amplifiers; Oscillators – Classification, RC Phase Shift, Wien Bridge, High Frequency LC and NonSinusoidal type Oscillators.\n" +
                "\n" +
                "Module-4\n" +
                "Operational Amplifiers and Applications covering\n" +
                "Operational Amplifiers and Applications covering, Introduction to Op-Amp, Differential Amplifier Configurations, CMRR, PSRR, Slew Rate; Block Diagram, Pin Configuration of 741 Op-Amp, Characteristics of Ideal OpAmp, Concept of Virtual Ground;\n" +
                "\n" +
                "PRACTICALS\n" +
                "Module-1\n" +
                "Laboratory Sessions covering, Identification, Specifications, Testing of R, L, C Components (Colour Codes), Potentiometers, Switches (SPDT, DPDT and DIP), Bread.\n" +
                "Boards and Printed Circuit Boards (PCBs); Identification, Specifications, Testing of Active Devices – Diodes, BJTs, JFETs, MOSFETs, Power Transistors, SCRs and LEDs.\n" +
                "\n" +
                "Module-2\n" +
                "Study and Operation of Digital Multi Meter, Function / Signal Generator, Regulated Power Supply (RPS), Cathode Ray Oscilloscopes; Amplitude, Phase and,\n" +
                "Frequency of Sinusoidal Signals using Lissajous Patterns on CRO; (CRO).\n" +
                "\n" +
                "-\n" +
                "Module-3\n" +
                "Experimental Verification of PN Junction Diode Characteristics in A) Forward Bias B) Reverse Bias, Zener Diode Characteristics and Zener Diode as Voltage Regulator,\n" +
                "Input and Output Characteristics of BJT in Common Emitter (CE) Configuration, Drain and Transfer Characteristics of JFET in Common Source (CS) Configuration.\n" +
                "\n" +
                "Module-4\n" +
                "Study of Half Wave and Full Wave Rectification, Regulation with Filters, Gain and Bandwidth of BJT Common Emitter (CE) Amplifier, Gain and Bandwidth of JFET Common Source (CS) Amplifier, Gain and Bandwidth of BJT Current Series and Voltage Series Feedback Amplifiers, Oscillation Frequency of BJT based RC Phase Shift, Hartley and Colpitts Oscillators.\n" +
                "\n" +
                "Module-5\n" +
                "Op-Amp Applications – Adder, Subtractor, Voltage Follower and Comparator; Op-Amp Applications – Differentiator and Integrator, Square Wave and Triangular Wave Generation, Applications of 555 Timer – Astable and Monostable Multivibrators;\n" +
                "Module-6: Truth Tables and Functionality of Logic Gates – NOT, OR, AND, NOR, NAND, XO.");



        List<String> EngineeringMechanics = Arrays.asList("Module-1\n" +
                "Introduction to Engineering Mechanics covering\n" +
                "Introduction to Engineering Mechanics covering, Force Systems Basic concepts, Particle equilibrium in 2-D & 3-D; Rigid Body equilibrium; System of Forces, Coplanar Concurrent Forces, Components in Space – Resultant- Moment of Forces and its Application; Couples and Resultant of Force System, Equilibrium of System of Forces, Free body diagrams, Equations of Equilibrium of Coplanar Systems and Spatial Systems; Static Indeterminacy\n" +
                "\n" +
                "Module-2\n" +
                "Friction covering\n" +
                "Friction covering, Types of friction, Limiting friction, Laws of Friction, Static and Dynamic Friction; Motion of Bodies, wedge friction, screw jack & differential screw jack.\n" +
                "\n" +
                "Module-3\n" +
                "Basic Structural Analysis covering\n" +
                "Basic Structural Analysis covering, Equilibrium in three dimensions; Method of Sections; Method of Joints; How to determine if a member is in tension or compression; Simple Trusses; Zero force members; Beams & types of beams; Frames & Machines.\n" +
                "\n" +
                "Module-4\n" +
                "Centroid and Centre of Gravity covering\n" +
                "Centroid and Centre of Gravity covering, Centroid of simple figures from first principle, centroid of composite sections; Centre of Gravity and its implications; Area moment of inertia- Definition, Moment of inertia of plane sections from first principles, Theorems of moment of inertia, Moment of inertia of standard sections and composite sections; Mass moment inertia of circular plate, Cylinder, Cone, Sphere, Hook.\n" +
                "\n" +
                "module-5\n" +
                "Virtual Work and Energy Method\n" +
                "Virtual Work and Energy Method- Virtual displacements, principle of virtual work for particle and ideal system of rigid bodies, degrees of freedom. Active force diagram, systems with friction, mechanical efficiency. Conservative forces and potential energy (elastic and gravitational), energy equation for equilibrium. Applications of energy method for equilibrium. Stability of equilibrium.\n" +
                "\n" +
                "Module-6\n" +
                "Review of particle dynamics\n" +
                "Review of particle dynamics- Rectilinear motion; Plane curvilinear motion (rectangular, path, and polar coordinates). 3-D curvilinear motion; Relative and constrained motion; Newton’s 2nd law (rectangular, path, and polar coordinates). Work-kinetic energy, power, potential energy. Impulse-momentum (linear, angular); Impact (Direct and oblique).\n" +
                "\n" +
                "Module-7\n" +
                "Introduction to Kinetics of Rigid Bodies covering\n" +
                "Introduction to Kinetics of Rigid Bodies covering, Basic terms, general principles in dynamics; Types of motion, Instantaneous centre of rotation in plane motion and simple problems; D’Alembert’s principle and its applications in plane motion and connected bodies; Work energy principle and its application in plane motion of connected bodies; Kinetics of rigid body rotation;\n" +
                "\n" +
                "Module-8\n" +
                "Mechanical Vibrations covering\n" +
                "Mechanical Vibrations covering, Basic terminology, free and forced vibrations, resonance and its effects; Degree of freedom; Derivation for frequency and amplitude of free vibrations without damping and single degree of freedom system, simple problems, types of pendulum, use of simple, compound and torsion pendulums.\n" +
                "Tutorials from the above modules covering, To find the various forces and angles including resultants in various parts of wall crane, roof truss, pipes, etc.; To verify the line of polygon on various forces; To find coefficient of friction between various materials on inclined plan; Free body diagrams various systems including block-pulley.");




        List<String> ComputerAided = Arrays.asList("Module-1\n" +
                "INTRODUCTION\n" +
                "Introduction to concept of drawings, Interpretation of typical drawings, Planning drawings to show information concisely and comprehensively; optimal layout of drawings and Scales; Introduction to computer aided drawing, coordinate systems, reference planes. Commands: Initial settings, Drawing aids, Drawing basic entities, Modify commands, Layers, Text and Dimensioning, Blocks. Drawing presentation norms and standards.(\n" +
                "\n" +
                "Module-2\n" +
                "SYMBOLS AND SIGN CONVENTIONS\n" +
                "Materials, Architectural, Structural, Electrical and Plumbing symbols. Rebar drawings and structural steel fabrication and connections drawing symbols, welding symbols; dimensioning standards.\n" +
                "\n" +
                "Module-3\n" +
                "MASONRY BONDS\n" +
                "English Bond and Flemish Bond – Corner wall and Cross walls - One brick wall and one and half brick wall.\n" +
                "\n" +
                "Module-4\n" +
                "BUILDING DRAWING\n" +
                "Terms, Elements of planning building drawing, Methods of making line drawing and detailed drawing. Site plan, floor plan, elevation and section drawing of small residential buildings. Foundation plan. Roof drainage plans. Depicting joinery, standard fittings & fixtures, finishes. Use of Notes to improve clarity.\n" +
                "\n" +
                "Module-5\n" +
                "PICTORIAL VIEW\n" +
                "Principles of isometrics and perspective drawing. Perspective view of building. Fundamentals of Building Information Modelling (BIM) (3) Total 15 sessions.\n" +
                "It may be advisable to conduct Theory sessions along with Lab demonstrations.\n" +
                "\n" +
                "Drawing\n" +
                "List of Drawing\n" +
                "1. Buildings with load bearing walls including details of doors and windows. 09\n" +
                "2. Taking standard drawings of a typical two storeyed building including all MEP, joinery, rebars, finishing and other details and writing out a description of the Facility in about 500 -700 words. 06\n" +
                "3. RCC framed structures 09\n" +
                "4. Reinforcement drawings for typical slabs, beams, columns and spread footings. 09\n" +
                "5. Industrial buildings - North light roof structures - Trusses 06\n" +
                "6. Perspective view of one and two storey buildings 06.");





        List<String> SurveyingGeomatics = Arrays.asList("Module-1\n" +
                "Introduction to Surveying (8 hours)\n" +
                "Principles, Linear, angular and graphical methods, Survey stations, Survey lines- ranging, Bearing of survey lines, Levelling: Plane table surveying, Principles of levelling- booking and reducing levels; differential, reciprocal leveling, profile levelling and cross sectioning. Digital and Auto Level, Errors in levelling; contouring: Characteristics, methods, uses; areas and volumes.\n" +
                "Triangulation and Trilateration (6 Hours): Theodolite survey: Instruments, Measurement of horizontal and vertical angle; Horizontal and vertical control - methods -triangulation network- Signals. Baseline - choices - instruments and accessories - extension of base lines corrections - Satellite station - reduction to centre - Intervisibility of height and distances - Trigonometric leveling - Axis single corrections.\n" +
                "\n" +
                "Module-2\n" +
                "Curves (6 hours)\n" +
                "Elements of simple and compound curves – Method of setting out– Elements of Reverse curve - Transition curve – length of curve – Elements of transition curve - Vertical curves.\n" +
                "\n" +
                "Module-3\n" +
                "Modern Field Survey Systems (8 Hours)\n" +
                "Principle of Electronic Distance Measurement, Modulation, Types of EDM instruments, Distomat, Total Station – Parts of a Total Station – Accessories –Advantages and Applications.\n" +
                "Field Procedure for total station survey, Errors in Total Station Survey; Global Positioning Systems- Segments, GPS measurements, errors and biases, Surveying with GPS, Co-ordinate transformation, accuracy considerations\n" +
                "\n" +
                "Module-4\n" +
                "Photogrammetry Surveying (8 Hours)\n" +
                "Introduction, Basic concepts, perspective geometry of aerial photograph, relief and tilt displacements, terrestrial photogrammetry, flight planning; Stereoscopy, ground control extension f.");





        List<String> MatheThree = Arrays.asList("Module-1\n" +
                "PDE ( 14 Lectures )\n" +
                "Definition of Partial Differential Equations, First order partial differential equations, solutions of first order linear PDEs; Solution to homogenous and non-homogenous linear partial differential equations of second order by complimentary function and particular integral method. Second-order linear equations and their classification, Initial and boundary conditions, D'Alembert's solution of the wave equation; Duhamel's principle for one dimensional wave equation. Heat diffusion and vibration problems, Separation of variables method to simple problems in Cartesian coordinates. The Laplacian in plane, cylindrical and spherical polar coordinates, solutions with Bessel functions and Legendre functions. One dimensional diffusion equation and its solution by separation of variables.\n" +
                "\n" +
                "Module-2\n" +
                "tures )\n" +
                "Probability ( 12 Lectures )\n" +
                "Probability spaces, conditional probability, independence; Discrete random variables, Independent random variables, the multinomial distribution, Poisson approximation to the binomial distribution, infinite sequences of Bernoulli trials, sums of independent random variables; Expectation of Discrete Random Variables, Moments, Variance of a sum, Correlation coefficient, Chebyshev's Inequality. Continuous random variables and their properties, distribution functions and densities, normal, exponential and gamma densities. Bivariate distributions and their properties, distribution of sums and quotients, conditional densities, Bayes' rule.\n" +
                "\n" +
                "Module-3\n" +
                "Statics ( 12 Lectures )\n" +
                "Basic Statistics, Measures of Central tendency: Moments, skewness and Kurtosis - Probability distributions: Binomial, Poisson and Normal - evaluation of statistical parameters for these three distributions, Correlation and regression – Rank correlation. Curve fitting by the method of least squares- fitting of straight lines, second degree parabolas and more general curves. Test of significance: Large sample test for single proportion, difference of proportions, Tests for single mean, difference of means, and difference of standard deviations. Test for ratio of variances - Chi- square test for goodness of fit and independence of attributes.");





        List<String> Biology = Arrays.asList("Module-1\n" +
                "Introduction (2 hours)\n" +
                "Purpose: To convey that Biology is as important a scientific discipline as Mathematics, Physics and Chemistry. Bring out the fundamental differences between science and engineering by drawing a comparison between eye and camera, Bird flying and aircraft. Mention the most exciting aspect of biology as an independent scientific discipline. Why we need to study biology? Discuss how biological observations of 18th Century that lead to major discoveries. Examples from Brownian motion and the origin of thermodynamics by referring to the original observation of Robert Brown and Julius Mayor. These examples will highlight the fundamental importance of observations in any scientific inquiry.\n" +
                "\n" +
                "Module-2\n" +
                "Classification (3 hours)\n" +
                "Purpose: To convey that classification per se is not what biology is all about. The underlying criterion, such as morphological, biochemical or ecological be highlighted. Hierarchy of life forms at phenomenological level. A common thread weaves this hierarchy Classification. Discuss classification based on (a) cellularity- Unicellular or multicellular (b) ultrastructure- prokaryotes or eucaryotes. (c) energy and Carbon utilization -Autotrophs, heterotrophs, lithotropes (d) Ammonia excretion – aminotelic, uricotelic, ureotelic (e) Habitata- acquatic or terrestrial (e) Molecular taxonomy- three major kingdoms of life. A given organism can come under different category based on classification. Model organisms for the study of biology come from different groups. E.coli, S.cerevisiae, D. Melanogaster, C. elegance, A. Thaliana, M. musculus\n" +
                "\n" +
                "Module-3\n" +
                "Genetics (4 hours)\n" +
                "Purpose: To convey that “Genetics is to biology what Newton’s laws are to Physical Sciences”. Mendel’s laws, Concept of segregation and independent assortment. Concept of allele. Gene mapping, Gene interaction, Epistasis. Meiosis and Mitosis be taught as a part of genetics. Emphasis to be give not to the mechanics of cell division nor the phases but how genetic material passes from parent to offspring. Concepts of recessiveness and dominance. Concept of mapping of phenotype to genes. Discuss about the single gene disorders in humans. Discuss the concept of complementation using human genetics.\n" +
                "\n" +
                "Module-4\n" +
                "Biomolecules (4 hours)\n" +
                "Purpose: To convey that all forms of life has the same building blocks and yet the manifestations are as diverse as one can imagine. Molecules of life. In this context discuss monomeric units and polymeric structures. Discuss about sugars, starch and cellulose. Amino acids and proteins. Nucleotides and DNA/RNA. Two carbon units and lipids.\n" +
                "\n" +
                "Module-5\n" +
                "Enzymes (4 Hours)\n" +
                "Purpose: To convey that without catalysis life would not have existed on earth. Enzymology: How to monitor enzyme catalysed reactions. How does an enzyme catalyse reactions? Enzyme classification. Mechanism of enzyme action. Discuss at least two examples. Enzyme kinetics and kinetic parameters. Why should we know these parameters to understand biology? RNA catalysis.\n" +
                "\n" +
                "Module-6\n" +
                "Information Transfer (4 hours)\n" +
                "Purpose: The molecular basis of coding and decoding genetic information is universal. Molecular basis of information transfer. DNA as a genetic material. Hierarchy of DNA structure- from single stranded to double helix to nucleosomes. Concept of genetic code. Universality and degeneracy of genetic code. Define gene in terms of complementation and recombination.\n" +
                "\n" +
                "Module-7\n" +
                "Macromolecular analysis (5 hours)\n" +
                "Purpose: To analyse biological processes at the reductionistic level. Proteins- structure and function. Hierarch in protein structure. Primary secondary, tertiary and quaternary structure. Proteins as enzymes, transporters, receptors and structural elements.\n" +
                "\n" +
                "Module-8\n" +
                "Metabolism (4 hours)\n" +
                "Purpose: The fundamental principles of energy transactions are the same in physical and biological world. Thermodynamics as applied to biological systems. Exothermic and endothermic versus endergonic and exergonic reactions. Concept of Keq and its relation to standard free energy. Spontaneity. ATP as an energ.");




        List<String> HumanitiesFirst = Arrays.asList("Module-1\n" +
                "Information Design and Development\n" +
                "Information Design and Development- Different kinds of technical documents, Information development life cycle, Organization structures, factors affecting information and document design, Strategies for organization, Information design and writing for print and for online media.\n" +
                "\n" +
                "Module-2\n" +
                "Technical Writing, Grammar and Editing\n" +
                "Technical writing process, forms of discourse, Writing drafts and revising, Collaborative writing, creating indexes, technical writing style and language. Basics of grammar, study of advanced grammar, editing strategies to achieve appropriate technical style. Introduction to advanced technical communication, Usability, Hunan factors, Managing technical communication projects, time estimation, Single sourcing, Localization.\n" +
                "\n" +
                "Module-3\n" +
                "Self Development and Assessment\n" +
                "Self assessment, Awareness, Perception and Attitudes, Values and belief, Personal goal setting, career planning, Self-esteem. Managing Time; Personal memory, Rapid reading, Taking notes; Complex problem solving; Creativity.\n" +
                "\n" +
                "Module-4\n" +
                "Communication and Technical Writing\n" +
                "Communication and Technical Writing- Public speaking, Group discussion, Oral; presentation, Interviews, Graphic presentation, Presentation aids, Personality Development. Writing reports, project proposals, brochures, newsletters, technical articles, manuals, official notes, business letters, memos, progress reports, minutes of meetings, event report.\n" +
                "\n" +
                "Module-5\n" +
                "Ethics- Business ethics\n" +
                "Business ethics, Etiquettes in social and office settings, Email etiquettes, Telephone Etiquettes, Engineering ethics, Managing time, Role and responsibility of engineer, Work culture in jobs, Personal memory, Rapid reading, Taking notes, Complex problem solving, Creativity.");




        List<String> IntroductionCivilEngineering = Arrays.asList("Proposed Syllabus\n" +
                "What is Civil Engineering/ Infrastructure, History of Civil Engineering, Overview of ancient & modern civil engineering marvels, current national planning for civil engineering/ infrastructure projects, scope of work involved in various branches of Civil Engineering – Architecture & Town planning, Surveying & Geomatics, Structural Engineering, Construction Management, Construction materials, Hydrology and Water Resources Engineering, Hydraulic Engineering, Environmental Engineering &Sustainability, Pavement Engineering and construction, Traffic & Transportation Engineering and Management, Geotechnical Engineering, Ocean Engineering, Building Energy Efficiency, Basics of Contract Management, Professional Ethics, Avenues for entrepreneurial working, Creativity & Innovativeness in Civil Engineering.\n" +
                "\n" +
                "Modules\n" +
                "1. Basic Understanding: What is Civil Engineering/ Infrastructure? Basics of Engineering and Civil Engineering; Broad disciplines of Civil Engineering; Importance of Civil Engineering, Possible scopes for a career.\n" +
                "\n" +
                "2. History of Civil engineering: Early constructions and developments over time; Ancient monuments & Modern marvels; Development of various materials of construction and methods of construction; Works of Eminent civil engineers.\n" +
                "\n" +
                "3. Overview of National Planning for Construction and Infrastructure Development; Position of construction industry vis-à-vis other industries, five year plan outlays for construction; current budgets for infrastructure works.\n" +
                "\n" +
                "4. Fundamentals of Architecture & Town Planning: Aesthetics in Civil Engineering, Examples of great architecture, fundamentals of architectural design & town planning; Building Systems (HVAC, Acoustics, Lighting, etc.); LEED ratings; Development of Smart cities.\n" +
                "\n" +
                "5. Fundamentals of Building Materials: Stones, bricks, mortars, Plain, Reinforced & Prestressed Concrete, Construction Chemicals; Structural Steel, High Tensile Steel, Carbon Composites; Plastics in Construction; 3D printing; Recycling of Construction & Demolition wastes.\n" +
                "\n" +
                "6. Basics of Construction Management & Contracts Management: Temporary Structures in Construction; Construction Methods for various types of Structures; Major Construction equipment; Automation & Robotics in Construction; Modern Project management Systems; Advent of Lean Construction; Importance of Contracts Management.\n" +
                "\n" +
                "7. Environmental Engineering & Sustainability: Water treatment systems; Effluent treatment systems; Solid waste management; Sustainability in Construction.\n" +
                "\n" +
                "8. Geotechnical Engineering: Basics of soil mechanics, rock mechanics and geology; various types of foundations; basics of rock mechanics & tunnelling.\n" +
                "\n" +
                "9. Hydraulics, Hydrology & Water Resources Engineering: Fundamentals of fluid flow, basics of water supply systems; Underground Structures; Underground Structures Multipurpose reservoir projects.\n" +
                "\n" +
                "10. Ocean Engineering: Basics of Wave and Current Systems; Sediment transport systems; Ports & Harbours and other marine structures.\n" +
                "\n" +
                "11. Power Plant Structures: Chimneys, Natural & Induced Draught Colling towers, coal handling systems, ash handling systems; nuclear containment structures; hydro power projects.\n" +
                "\n" +
                "12. Structural Engineering: Types of buildings; tall structures; various types of bridges; Water retaining structures; Other structural systems; Experimental Stress Analysis; Wind tunnel studies.\n" +
                "\n" +
                "13. Surveying & Geomatics: Traditional surveying techniques, Total Stations, Development of Digital Terrain Models; GPS, LIDAR.\n" +
                "\n" +
                "14. Traffic &Transportation Engineering: Investments in transport infrastructure development in India for different modes of transport; Developments and challenges in integrated transport development in India: road, rail, port and harbour and airport sector; PPP in transport sector; Intelligent Transport Systems; Urban Public and Freight Transportation; Road Safety under heterogeneous traffic; Sustainable and resilient pavement materials, design, construction and management; Case studies and examples.\n" +
                "\n" +
                "15. Repairs & Rehabilitation of Structures: Basics of corrosion phenomena and other structural distress mechanisms; some simple systems of rehabilitation of structures; NonDestructive testing systems; Use of carbon fibre wrapping and carbon composites in repairs.\n" +
                "\n" +
                "16. Computational Methods, IT, IoT in Civil Engineering: Typical software used in Civil Engineering- Finite Element Method, Computational Fluid Dynamics; Computational Geotechnical Methods; highway design (MX), Building Information Modelling; Highlighting typical available software systems (SAP, STAAD, ABAQUS, MATLAB, ETAB, NASTRAN, NISA, MIKE 21, MODFLOW, REVIT, TEKLA, AUTOCAD,…GEOSTUDIO, EDUSHAKE, MSP, PRIMAVERA, ArcGIS, VisSIM, …).\n" +
                "\n" +
                "17. Industrial lectures: Case studies of large civil engineering projects by industry professionals, covering comprehensive planning to commissioning.\n" +
                "\n" +
                "18. Basics of Professionalism: Professional Ethics, Entrepreneurial possibilities in Civil Engineering, Possibilities for creative & innovative working, Technical writing Skills enhancement; Facilities Management; Quality & HSE Systems in Construction.");




        List<String> Internship = Arrays.asList("Contact your college Administration for Internship or Do internship in any Company by self.");



        List<Semester> thirdSemesters = new ArrayList<>();
        thirdSemesters.add(new Semester("Basic Electronic", BasicElectronic));
        thirdSemesters.add(new Semester("Engineering Mechanics", EngineeringMechanics));
        thirdSemesters.add(new Semester("Computer-Aided Civil Engineering Drawing", ComputerAided));
        thirdSemesters.add(new Semester("Surveying and Geomatics", SurveyingGeomatics));
        thirdSemesters.add(new Semester("Mathematics-III ( PDE, Probability and Statics )", MatheThree));
        thirdSemesters.add(new Semester("Biology for Engineers", Biology));
        thirdSemesters.add(new Semester("Humanities-1 ( Effective Technical Communication )", HumanitiesFirst));
        thirdSemesters.add(new Semester("Introduction to Civil Engineering", IntroductionCivilEngineering));
        thirdSemesters.add(new Semester("Internship", Internship));

        branches.add(new Branch("Semester 3", thirdSemesters));
        //3rd Semester complete....


        //4 Semester start.......
        List<String> MechanicalEngineering = Arrays.asList("Module-1\n" +
                "Basic Concepts- Basic concepts\n" +
                "Basic Concepts- Basic concepts - concept of continuum, macroscopic approach, Thermodynamic systems - closed, open and isolated. Property, state, path and process, quasistatic process, work, modes of work. Zeroth law of thermodynamics, concept of temperature and heat. Concept of ideal and real gases.\n" +
                "\n" +
                "Module-2\n" +
                "First Law of Thermodynamics\n" +
                "Concepts of Internal Energy, Specific Heat Capacities, Enthalpy. Energy Balance for Closed and Open Systems, Energy Balance for Steady-Flow Systems. Steady-Flow Engineering Devices. Energy Balance for Unsteady- Flow .\n" +
                "\n" +
                "Module-3\n" +
                "Second Law of Thermodynamics\n" +
                "Thermal energy reservoirs, heat engines energy conversion, Kelvin’s and Clausius statements of second law, the Carnot cycle, the Carnot Theorem, the thermodynamic temperature scale, the Carnot heat engine, efficiency, the Carnot refrigerator and heat pump, COP. Clausius inequality, concept of entropy, principle of increase of entropy – availability, the increase of entropy principle, perpetual-motion machines, reversible and irreversible processes, Entropy change of pure substances, isentropic processes, property diagrams involving entropy, entropy change of liquids and solids, the entropy change of ideal gases, reversible steady-flow work, minimizing the compressor work, isentropic efficiencies of steady-flow devices, and entropy balance. Energy - a measure of work potential, including work potential of energy, reversible work and irreversibility, second-law efficiency, exergy change of a system, energy transfer by heat, work, and mass, the decrease of exergy principle and exergy destruction, energy balance: closed systems and control volumes energy balance.\n" +
                "\n" +
                "Module-4\n" +
                "Properties Of Pure Substance\n" +
                "Properties of pure substances. Thermodynamic properties of pure substances in solid, liquid and vapour phases. Phase rule, P-V, P-T, T-V, T-S, H-S diagrams, PVT surfaces. Thermodynamic properties of steam. Calculations of work done and heat transfer in non- flow and flow processes.\n" +
                "\n" +
                "Module-5\n" +
                "Power Cycles\n" +
                "Vapour and combined power cycles, including the Carnot vapor cycle, Rankine cycle: the ideal cycle for vapor power, the ideal reheat and regenerative and the secondlaw analysis of vapour power cycles. Gas power cycles, including basic considerations in the analysis of power cycles, the Carnot cycle and its value in engineering, an overview of reciprocating engines, air standard assumptions, gasoline engine Otto cycle, diesel engine cycle, gas-turbine Brayton cycle, and the second-law analysis of gas power cycles.\n" +
                "\n" +
                "Module-6\n" +
                "Ideal and Real Gases and Thermodynamic Relations\n" +
                "Ideal and Real Gases and Thermodynamic Relations- Gas mixtures – properties ideal and real gases. Equation of state, Avogadro’s Law, Vander Waal’s equation of state, Compressibility factor, compressibility chart. Dalton’s law of partial pressure. Exact differentials, T-D relations, Maxwell’s relations. Clausius Clapeyron equations, Joule – Thomson coefficient.\n" +
                "\n" +
                "Module-7\n" +
                "Psychrometry and psychrometric charts\n" +
                "Psychrometry and psychrometric charts, property calculations of air vapour mixtures. Psychrometric process – Sensible heat exchange processes. Latent heat exchange processes. Adiabatic mixing, evaporative cooling. Use of standard thermodynamic tables, Mollier diagram, Psychometric chart and Refrigerant property tables. Refrigeration cycles, including refrigerators and heat pumps, the ideal reversed Carnot vapour-compression refrigeration cycle, actual vaporcompression refrigeration cycles, heat pump systems, gas refrigeration cycles, and absorption refrigeration systems.");



        List<String> EngineeringGeology = Arrays.asList("Module-1\n" +
                "Introduction\n" +
                "Branches of geology useful to civil engineering, scope of geological studies in various civil engineering projects. Department dealing with this subject in India and their scope of work- GSI, Granite Dimension Stone Cell, NIRM. Mineralogy-Mineral, Origin and composition. Physical properties of minerals, susceptibility of minerals to alteration, basic of optical mineralogy, SEM, XRD., Rock forming minerals, megascopic identification of common primary & secondary minerals.\n" +
                "\n" +
                "Module-2\n" +
                "Petrology-Rock forming processes\n" +
                "Petrology-Rock forming processes. Specific gravity of rocks. Ternary diagram. Igneous petrology- Volcanic Phenomenon and different materials ejected by volcanoes. Types of volcanic eruption. Concept of Hot spring and Geysers. Characteristics of different types of magma. Division of rock on the basis of depth of formation, and their characteristics. Chemical and Mineralogical Composition. Texture and its types. Various forms of rocks. IUGS Classification of phaneritic and volcanic rock.. Field Classification chart. Structures. Classification of Igneous rocks on the basis of Chemical composition. Detailed study of Acidic Igneous rocks like Granite, Rhyolite or Tuff, Felsite, Pegmatite, Hornfels. Metamorphic Aureole, Kaolinization. Landform as Tors. Engineering aspect to granite. Basic Igneous rocks Like Gabbro, Dolerite, Basalt. Engineering aspect to Basalt. Sedimentary petrology- mode of formation, Mineralogical Composition. Texture and its types, Structures, Gradation of Clastic rocks. Classification of sedimentary rocks and their characteristics. Detailed study of Conglomerate, Breccia, Sandstone, Mudstone and Shale, Limestone Metamorphic petrology- Agents and types of metamorphism, metamorphic grades, Mineralogical composition, structures & textures in metamorphic rocks. Important Distinguishing features of rocks as Rock cleavage, Schistosity, Foliation. Classification. Detailed study of Gneiss, Schist, Slate with engineering consideration.\n" +
                "\n" +
                "Module-3\n" +
                "Physical Geology\n" +
                "Weathering. Erosion and Denudation. Factors affecting weathering and product of weathering. Engineering consideration. Superficial deposits and its geotechnical importance: Water fall and Gorges, River meandering, Alluvium, Glacial deposits, Laterite (engineering aspects), Desert Landform, Loess, Residual deposits of Clay with flints, Solifluction deposits, mudflows, Coastal deposits.\n" +
                "\n" +
                "Module-4\n" +
                "Strength Behavior of Rocks\n" +
                "Stress and Strain in rocks. Concept of Rock Deformation & Tectonics. Dip and Strike. Outcrop and width of outcrop. Inliers and Outliers. Main types of discontinuities according to size. Fold- Types and nomenclature, Criteria for their recognition in field. Faults: Classification, recognition in field, effects on outcrops. Joints & Unconformity; Types, Stresses responsible, geotechnical importance. Importance of structural elements in engineering operations. Consequences of failure as land sliding, Earthquake and Subsidence. Strength");



        List<String> DisasterPreparedness = Arrays.asList("Module-1\n" +
                "INTRODUCTION\n" +
                "Concepts and definitions: disaster, hazard, vulnerability, risks- severity, frequency and details, capacity, impact, prevention, mitigation.\n" +
                "\n" +
                "Module-2\n" +
                "Disasters\n" +
                "Disasters classification; natural disasters (floods, draught, cyclones, volcanoes, earthquakes, tsunami, landslides, coastal erosion, soil erosion, forest fires etc.); manmade disasters (industrial pollution, artificial flooding in urban areas, nuclear radiation, chemical spills, transportation accidents, terrorist strikes, etc.); hazard and vulnerability profile of India, mountain and coastal areas, ecological fragility.\n" +
                "\n" +
                "Module-3\n" +
                "Disaster Impacts\n" +
                "Disaster impacts (environmental, physical, social, ecological, economic, political, etc.); health, psycho-social issues; demographic aspects (gender, age, special needs); hazard locations; global and national disaster trends; climate change and urban disasters.\n" +
                "\n" +
                "Module-4\n" +
                "Disaster Risk Reduction (DRR)\n" +
                "Disaster management cycle – its phases; prevention, mitigation, preparedness, relief and recovery; structural and non-structural measures; risk analysis, vulnerability and capacity assessment; early warning systems, Postdisaster environmental response (water, sanitation, food safety, waste management, disease control, security, communications); Roles and responsibilities of government, community, local institutions, NGOs and other stakeholders; Policies and legislation for disaster risk reduction, DRR programmes in India and the activities of National Disaster Management Authority.\n" +
                "\n" +
                "Module-5\n" +
                "Disasters, Environment and Development\n" +
                "Factors affecting vulnerability such as impact of developmental projects and environmental modifications (including of dams, landuse changes, urbanization etc.), sustainable and environmental friendly recovery; reconstruction and development methods.");



        List<String> FluidMechanics = Arrays.asList("Module-1\n" +
                "Basic Concepts and Definitions\n" +
                "Distinction between a fluid and a solid; Density, Specific weight, Specific gravity, Kinematic and dynamic viscosity; variation of viscosity with temperature, Newton law of viscosity; vapour pressure, boiling point, cavitation; surface tension, capillarity, Bulk modulus of elasticity, compressibility.\n" +
                "\n" +
                "Module-2\n" +
                "Fluid Statics\n" +
                "Fluid Pressure: Pressure at a point, Pascals law, pressure variation with temperature, density and altitude. Piezometer, U-Tube Manometer, Single Column Manometer, U-Tube Differential Manometer, Micromanometers. pressure gauges, Hydrostatic pressure and force: horizontal, vertical and inclined surfaces. Buoyancy and stability of floating bodies.\n" +
                "\n" +
                "Module-3\n" +
                "Fluid Kinematics\n" +
                "Classification of fluid flow : steady and unsteady flow; uniform and non-uniform flow; laminar and turbulent flow; rotational and irrotational flow; compressible and incompressible flow; ideal and real fluid flow; one, two and three dimensional flows; Stream line, path line, streak line and stream tube; stream function, velocity potential function. One-, two- and three -dimensional continuity equations in Cartesian coordinates.\n" +
                "\n" +
                "Module-4\n" +
                "Fluid Dynamics\n" +
                "Surface and body forces; Equations of motion - Euler’s equation; Bernoulli’s equation – derivation; Energy Principle; Practical applications of Bernoulli’s equation : venturimeter, orifice meter and pitot tube; Momentum principle; Forces exerted by fluid flow on pipe bend; Vortex Flow – Free and Forced.\n" +
                "Dimensional Analysis and Dynamic Similitude - Definitions of Reynolds Number, Froude Number, Mach Number, Weber Number and Euler Number; Buck ingham’s π-Theorem.\n" +
                "\n" +
                "Module-5\n" +
                "Laminar Flow\n" +
                "Laminar flow through :circular pipes, annulus and parallel plates. Stoke’s law, Measurement of viscosity .\n" +
                "\n" +
                "Module-6\n" +
                "Dimensional Analysis and Hydraulic Similitude\n" +
                "Dimensional homogeneity, Rayleigh method, Buckingham’s Pi method and other methods. Dimensionless groups. Similitude, Model studies, Types of models. Application of dimensional analysis and model Studies to fluid flow problem. Dynamic Similitude- Definitions of ReynoldsNumber, Froude Number, MachNumber, Weber Number and EulerNumber.\n" +
                "\n" +
                "Module-7\n" +
                "Flow through Pipes\n" +
                "Loss of head through pipes,Darcy-Wiesbatch equation, minor losses, total energy equation, hydraulic gradient line,Pipes in series, equivalent pipes, pipes in parallel, flow through laterals, flows in dead end pipes, siphon, power transmission through pipes, nozzles. Analysis of pipe networks: Hardy Cross method, water hammer in pipes and control measures, branching of pipes, three reservoir problem .\n" +
                "\n" +
                "Module-8\n" +
                "Turbulent Flow\n" +
                "Reynolds experiment, Transition from laminar to turbulent flow. Definition of turbulence, scale and intensity, Causes of turbulence, instability, mechanism of turbulence and effect of turbulent flow in pipes. Reynolds stresses, semi-empirical theories of turbulence, Prandtl’s mixing length theory, universal velocity distribution equation. Resistance to flow of fluid in smooth and rough pipes, Moody’s diagram");




        List<String> SolidMechanics = Arrays.asList("Module-1\n" +
                "Simple Stresses and Strains\n" +
                "Concept of stress and strain, St. Venant’s principle, stress and strain diagram, Elasticity and plasticity – Types of stresses and strains, Hooke’s law – stress – strain diagram for mild steel – Working stress – Factor of safety – Lateral strain, Poisson’s ratio and volumetric strain – Elastic moduli and the relationship between them – Bars of varying section – composite bars – Temperature stresses. Strain Energy – Resilience – Gradual, sudden, impact and shock loadings – simple applications.\n" +
                "\n" +
                "Module-2\n" +
                "tures )\n" +
                "Compound Stresses and Strains\n" +
                "Two dimensional system, stress at a point on a plane, principal stresses and principal planes, Mohr circle of stress, ellipse of stress and their applications. Two dimensional stress-strain system, principal strains and principal axis of strain, circle of strain and ellipse of strain. Relationship between elastic constants.\n" +
                "\n" +
                "Module-3\n" +
                "Bending moment and Shear Force Diagrams\n" +
                "Bending moment (BM) and shear force (SF) diagrams.BM and SF diagrams for cantilevers simply supported and fixed beams with or without overhangs. Calculation of maximum BM and SF and the point of contra flexure under concentrated loads, uniformly distributed loads over the whole span or part of span, combination of concentrated loads (two or three) and uniformly distributed loads, uniformly varying loads, application of moments.\n" +
                "\n" +
                "Module-4\n" +
                "Flexural Stresses\n" +
                "Theory of simple bending – Assumptions – Derivation of bending equation: M/I = f/y = E/R - Neutral axis – Determination of bending stresses – Section modulus of rectangular and circular sections (Solid and Hollow), I,T, Angle and Channel sections – Design of simple beam sections.\n" +
                "\n" +
                "Module-5\n" +
                "Shear Stresses\n" +
                "Derivation of formula – Shear stress distribution across various beam sections like rectangular, circular, triangular, I, T angle sections.\n" +
                "\n" +
                "Module-6\n" +
                "Slope and deflection\n" +
                "Relationship between moment, slope and deflection, Moment area method, Macaulay’s method. Use of these methods to calculate slope and deflection for determinant beams.\n" +
                "\n" +
                "-\n" +
                "Module-7\n" +
                "Torsion\n" +
                "Derivation of torsion equation and its assumptions. Applications of the equation of the hollow and solid circular shafts, torsional rigidity, Combined torsion and bending of circular shafts, principal stress and maximum shear stresses under combined loading of bending and torsion. Analysis of close-coiled-helical springs.\n" +
                "\n" +
                "Module-8\n" +
                "Thin Cylinders and Spheres\n" +
                "Derivation of formulae and calculations of hoop stress, longitudinal stress in a cylinder, and sphere subjected to internal pressures.\n" +
                "\n" +
                "Practicals\n" +
                "List of Practicals\n" +
                "1. Tension test\n" +
                "2. Bending tests on simply supported beam and Cantilever beam.\n" +
                "3. Compression test on concrete\n" +
                "4. Impact test\n" +
                "5.Shear test\n" +
                "6. Investigation of Hook’s law that is the proportional relation between force and stretching in elastic deformat");



        List<String> StructuralAnalysis = Arrays.asList("Module-1\n" +
                "Analysis of indeterminate structures by force methods, flexibility coefficients, Energy methods: Principle of minimum potential energy, principle of virtual work, Castigliano’s theorems, Reciprocal theorem, unit load method, Influence line and Rolling loads, beam, frames and arches, MullerBreslau Principles and its applications to determinate and indeterminate structures.\n" +
                "\n" +
                "Analysis of Beams and Frames: Moment Area method, Slope deflection method, Three Moment Equation, Moments distribution methods, effect of symmetry and ant symmetry, sway correction, Lateral load analysis: Portal and Cantilever methods, Matrix method of structural analysis, Displacement/Stiffness methods.");



        List<String> MaterialsTesting = Arrays.asList("Introduction to Engineering Materials covering, Cements, M-Sand, Concrete (plain, reinforced and steel fibre/ glass fibre-reinforced, light-weight concrete, High Performance Concrete, Polymer Concrete) Ceramics, and Refractories, Bitumen and asphaltic materials, Timbers, Glass and Plastics, Structural Steel and other Metals, Paints and Varnishes, Acoustical material and geo-textiles, rubber and asbestos, laminates and adhesives, Graphene, Carbon composites and other engineering materials including properties and uses of these.\n" +
                "\n" +
                "Introduction to Material Testing covering, What is the “ Material Engineering” ?; Mechanical behavior and mechanical characteristics; Elasticity – principle and characteristics; Plastic deformation of metals; Tensile test – standards for different material (brittle, quasi-brittle, elastic and so on) True stress – strain interpretation of tensile test; hardness tests; Bending and torsion test; strength of ceramic; Internal friction, creep – fundaments and characteristics; Brittle fracture of steel – temperature transition approach; Background of fracture mechanics; Discussion of fracture toughness testing – different materials; concept of fatigue of materials; Structural integrity assessment procedure and fracture mechanics.\n" +
                "\n" +
                "Standard Testing & Evaluation Procedures covering, Laboratory for mechanical testing; Discussion about mechanical testing; Naming systems for various irons, steels and nonferrous metals; Discussion about elastic deformation; Plastic deformation; Impact test and transition temp.");



        List<String> GlobalImpact = Arrays.asList("Module-1\n" +
                "Introduction to Course and Overview; Understanding the past to look into the future: Pre-industrial revolution days, Agricultural revolution, first and second industrial revolutions, IT revolution; Recent major Civil Engineering breakthroughs and innovations; Present day world and future projections, Ecosystems in Society and in Nature; the steady erosion in Sustainability; Global warming, its impact and possible causes; Evaluating future requirements for various resources; GIS and applications for monitoring systems; Human Development Index and Ecological Footprint of India Vs other countries and analysis.\n" +
                "\n" +
                "Module-2\n" +
                "Understanding the importance of Civil Engineering in shaping and impacting the world; The ancient and modern Marvels and Wonders in the field of Civil Engineering; Future Vision for Civil Engineering.\n" +
                "\n" +
                "Module-3\n" +
                "Infrastructure - Habitats, Megacities, Smart Cities, futuristic visions; Transportation (Roads, Railways & Metros, Airports, Seaports, River ways, Sea canals, Tunnels (below ground, under water); Futuristic systems (ex, Hyper Loop)); Energy generation (Hydro, Solar (Photovoltaic, Solar Chimney), Wind, Wave, Tidal, Geothermal, Thermal energy); Water provisioning; Telecommunication needs (towers, above-ground and underground cabling); Awareness of various Codes & Standards governing Infrastructure development; Innovations and methodologies for ensuring Sustainability.\n" +
                "\n" +
                "Module-4\n" +
                "Environment- Traditional & futuristic methods; Solid waste management, Water purification, Wastewater treatment & Recycling, Hazardous waste treatment; Flood control (Dams, Canals, River interlinking), Multi-purpose water projects, Atmospheric pollution; Global warming phenomena and Pollution Mitigation measures, Stationarity and nonstationarity; Environmental Metrics & Monitoring; Other Sustainability measures; Innovations and methodologies for ensuring Sustainability.\n" +
                "\n" +
                "Module-5\n" +
                "Built environment – Facilities management, Climate control; Energy efficient built environments and LEED ratings, Recycling, Temperature/ Sound control in built environment, Security systems; Intelligent/ Smart Buildings; Aesthetics of built environment, Role of Urban Arts Commissions; Conservation, Repairs & Rehabilitation of Structures & Heritage structures; Innovations and methodologies for ensuring Sustainability.\n" +
                "\n" +
                "Module-6\n" +
                "Civil Engineering Projects – Environmental Impact Analysis procedures; Waste (materials, manpower, equipment) avoidance/ Efficiency increase; Advanced construction techniques for better sustainability; Techniques for reduction of Green House Gas emissions in various aspects of Civil Engineering Projects; New Project Management paradigms & Systems (Ex. Lean Construction), contribution of Civil Engineering to GDP, Contribution to employment(projects, facilities management), Quality of products, Health & Safety aspects for stakeholders; Innovations and methodologies for ensuring Sustainability during Project development.\n" +
                "\n" +
                "Module-7\n" +
                "Population Dynamics covering, Population ecology- Population characteristics, ecotypes; Population genetics- Concept of gene pool and genetic diversity in population.");




        List<String> OrganisationalBehaviour = Arrays.asList("Management | (Organisational Behaviour)");


        List<String> OpenElectiveFirst = Arrays.asList("Open Elective-|(Humanities) MOOC");


        List<Semester> fourthSemesters = new ArrayList<>();
        fourthSemesters.add(new Semester("Mechanical Engineering", MechanicalEngineering));
        fourthSemesters.add(new Semester("Engineering Geology", EngineeringGeology));
        fourthSemesters.add(new Semester("Disaster Preparedness & Planning Management", DisasterPreparedness));
        fourthSemesters.add(new Semester("Introduction to Fluid Mechanics", FluidMechanics));
        fourthSemesters.add(new Semester("Introduction to Solid Mechanics", SolidMechanics));
        fourthSemesters.add(new Semester("Structural Analysis", StructuralAnalysis));
        fourthSemesters.add(new Semester("Materials, Testing and Evaluation", MaterialsTesting));
        fourthSemesters.add(new Semester("Civil Engineering- Social and Global Impact", GlobalImpact));
        fourthSemesters.add(new Semester("Management | (Organisational Behaviour)", OrganisationalBehaviour));
        fourthSemesters.add(new Semester("Open Elective-|(Humanities) MOOC", OpenElectiveFirst));

        branches.add(new Branch("Semester 4", fourthSemesters));
        //4th Semester complete......




        //5 Semester Start.......
        List<String> MechanicsMaterials = Arrays.asList("Module-1\n" +
                "Deformation and Strain\n" +
                "Deformation and Strain covering description of finite deformation, Infinitesimal deformation; Analysis of statically determinate trusses; Stability of dams, retaining walls and chimneys; Stress analysis of thin, thick and compound cylinder.\n" +
                "\n" +
                "Module-2\n" +
                "Generalized state of stress and strain\n" +
                "Generalized state of stress and strain: Stress and strain tensor, Yield criteria and theories of failure; Tresca, Von-Mises, Hill criteria, Heigh-Westerguard’s stress space.\n" +
                "\n" +
                "Module-3\n" +
                "Momentum Balance and Stresses covering Forces\n" +
                "Momentum Balance and Stresses covering Forces and Moments Transmitted by Slender Members, Shear Force and Bending Moment Diagrams, Momentum Balance, Stress States / Failure Criterion .\n" +
                "\n" +
                "Module-4\n" +
                "Mechanics of Deformable Bodies\n" +
                "Mechanics of Deformable Bodies covering Force-deformation Relationships and Static Indeterminacy, Uniaxial Loading and Material Properties, Trusses and Their Deformations, Statically Determinate and Indeterminate Trusses.\n" +
                "\n" +
                "Module-5\n" +
                "Force-Stress and Displacement\n" +
                "Force-Stress-Equilibrium covering Multiaxial Stress and Strain                                                    \n" +
                "Displacement – Strain covering Multiaxial Strain and Multiaxial Stress-strain Relationships\n" +
                "\n" +
                "Module-6\n" +
                "Elasticity and Elasticity Bounds\n" +
                "Elasticity and Elasticity Bounds covering Stress-strain-temperature Relationships and Thin-walled Pressure Vessels, Stress and strain Transformations and Principal Stress, Failure of Materials.\n" +
                "\n" +
                "Module-7\n" +
                "Bending\n" +
                "Stress and Strains; Deflections and Torsion covering Pure Bending, Moment-curvature Relationship, Beam Deflection, Symmetry, Superposition, and Statically Indeterminate Beams, Shear and Torsion, Torsion and Twisting, Thermoelasticity, Energy methods, Variational Methods; Strain energy, elastic, complementary and total strain energy, Strain energy of axially loaded bar, Beam in bending, shear and torsion; General energy theorems, Castigliano’s theorem, Maxwell Bettie’s reciprocal theorem; Virtual work and unit load method for deflection, Application to problems of beams and frames.\n" +
                "\n" +
                "Module-8\n" +
                "Structural stability\n" +
                "Structural stability; Stability of columns, Euler’s formula, end conditions and effective length factor, Columns with eccentric and lateral load; Plasticity and Yield Design covering 1D-Plasticity – An Energy Approach, Plasticity Models, Limit Analysis and Yield Design.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested books\n" +
                "1. Norris, C.H. and Wilber, J. B. and Utku, S. “Elementary Structural Analysis” Mc Graw Hill, Tokyo, Japan\n" +
                "2. Timoshenko, S. and Young, D. H., “Elements of Strength of Materials”, DVNC, New York, USA\n" +
                "3. Kazmi, S. M. A., ‘Solid Mechanics” TMH, Delhi, India\n" +
                "4. Hibbeler, R. C. Mechanics of Materials. 6th ed. East Rutherford, NJ: Pearson Prentice Hall, 2004.");




        List<String> HydraulicEngineering = Arrays.asList("Module-1\n" +
                "Boundary Layer Analysis\n" +
                "Boundary Layer Analysis-Assumption and concept of boundary layer theory. Boundary-layer thickness, displacement, momentum & energy thickness, laminar and Turbulent boundary layers on a flat plate; Laminar sub-layer, smooth and rough boundaries. Local and average friction coefficients. Separation and Control.\n" +
                "\n" +
                "Module-2\n" +
                "Introduction to Open Channel Flow\n" +
                "Introduction to Open Channel Flow-Comparison between open channel flow and pipe flow, geometrical parameters of a channel, classification of open channels, classification of open channel flow, Velocity Distribution of channel section.\n" +
                "\n" +
                "Module-3\n" +
                "Uniform Flow\n" +
                "Uniform Flow-Continuity Equation, Energy Equation and Momentum Equation, Characteristics of uniform flow, Chezy’s formula, Manning’s formula. Factors affecting Manning’s Roughness Coefficient “ n .Most economical section of channel. Computation of Uniform flow, Normal depth.\n" +
                "\n" +
                "Module-4\n" +
                "Non-Uniform Flow\n" +
                "Non-Uniform Flow- Specific energy, Specific energy curve, critical flow, discharge curve Specific force Specific depth, and Critical depth. Channel Transitions. Measurement of Discharge and Velocity – Venturi Flume, Standing Wave Flume, Parshall Flume, Broad Crested Weir. Measurement of Velocity- Current meter, Floats, Hot-wire anemometer. Gradually Varied Flow-Dynamic Equation of Gradually Varied Flow, Classification of channel bottom slopes, Classification of surface profile, Characteristics of surface profile. Computation of water surface profile by graphical, numerical and analytical approaches. Direct Step method, Graphical Integration method and Direct integration method.\n" +
                "\n" +
                "Module-5\n" +
                "Hydraulic Jump\n" +
                "Hydraulic Jump- Theory of hydraulic jump, Elements and characteristics of hydraulic jump in a rectangular Channel, length and height of jump, location of jump, Types,applications and location of hydraulic jump. Energy dissipation and other uses, surge as a moving hydraulic jump. Positive and negative surges.\n" +
                "\n" +
                "Module-6\n" +
                "Computational Fluid Dynamics\n" +
                "Basic equations of fluid dynamics, Grid generation, Introduction to in viscid incompressible flow, Boundary layer flow as applicable to C.F.D. Hydro informatics: Concept of hydro informatics –scope of internet and web based modeling in water resources engineering.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. Hydraulics and Fluid Mechanics, P.M. Modi and S.M. Seth, Standard Book House                                                   \n" +
                "2. Theory and Applications of Fluid Mechanics, K. Subramanya, Tata McGraw Hill.\n" +
                "3. Open channel Flow, K. Subramanya, Tata McGraw Hill\n" +
                "4. Open Channel Hydraulics, Ven Te Chow, Tata McGraw Hill.\n" +
                "\n" +
                "Practicals\n" +
                "1. Flow Visualization\n" +
                "2. Studies in Wind Tunnel\n" +
                "3. Boundary Layer\n" +
                "4. Flow around an Aerofoil / circular cylinder\n" +
                "5. Uniform Flow\n" +
                "6. Velocity Distribution in Open channel flow\n" +
                "7. Venturi Flume 8. Standing Wave Flume\n" +
                "9. Gradually Varied Flow\n" +
                "10. Hydraulic Jump\n" +
                "11. Flow under Sluice Gate\n" +
                "12. Flow through pipes\n" +
                "13. Turbulent flow through pipes\n" +
                "14. Flow visualization\n" +
                "15. Laminar flow through pipes\n" +
                "16. Major losses / Minor losses in pipe.");


        List<String> AnalysisDesignConcreteStructure = Arrays.asList("Module-1\n" +
                "Introduction\n" +
                "Concepts of energy principles, safety, sustainable development in performance; what makes a structure; principles of stability, equilibrium; what is a structural engineer, role of engineer, architect, user, builder; what are the functions’ what do the engineers design, first principles of process of design .\n" +
                "\n" +
                "Module-2\n" +
                "Introduction to reinforced concrete structures\n" +
                "Introduction to reinforced concrete structures, Basic material properties: stress-strain relation of concrete and reinforcing steel.\n" +
                "\n" +
                "Module-3\n" +
                "Planning and Design Process\n" +
                "Materials, Loads, and Design Safety; Behaviour and Properties of Concrete and Steel; Wind and Earthquake Loads Design philosophy: assumptions and code of practice .\n" +
                "\n" +
                "Module-4\n" +
                "Theory of singly reinforced members in bending\n" +
                "Theory of singly reinforced members in bending, Design of simply supported and continuous beams with rectangular and flanged section.\n" +
                "\n" +
                "Module-5\n" +
                "Limit state of collapse in shear\n" +
                "Limit state of collapse in shear, Design for bond, Design of one-way and two-way slab systems.\n" +
                "\n" +
                "Module-6\n" +
                "Design of columns under uniaxial and biaxial bending, Design of footings and staircase.\n" +
                "\n" +
                "-->\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. Nilson, A. H. Design of Concrete Structures. 13th edition. McGraw Hill, 2004\n" +
                "2. McCormac, J.C., Nelson, J.K. Jr., Structural Steel Design. 3rd edition. Prentice Hall, N.J., 2003\n" +
                "3. Galambos, T.V., Lin, F.J., Johnston, B.G., Basic Steel Design with LRFD, Prentice Hall, 1996.");




        List<String> GeotechnicalEngineering = Arrays.asList("Module-1\n" +
                "Introduction\n" +
                "Introduction–Types of soils, their formation and deposition, Definitions: soil mechanics, soil engineering, rock mechanics, geotechnical engineering. Scope of soil engineering. Comparison and difference between soil and rock. Basic Definitions and Relationships-Soil as three-phase system in terms of weight, volume, voids ratio, and porosity. Definitions: moisture content, unit weights, degree of saturation, voids ratio, porosity, specific gravity, mass specific gravity, etc. Relationship between volume weight, voids ratio- moisture content, unit weight- percent air voids, saturation- moisture content, moisture content- specific gravity etc. Determination of various parameters such as: Moisture content by oven dry method, pycnometer, sand bath method, torsional balance method,nuclear method, alcohol method and sensors. Specific gravity by density bottle method, pycnometer method, measuring flask method. Unit weight by water displacement method, submerged weight method, core-cutter method, sand-replacement method.\n" +
                "\n" +
                "On completion of this module, the students must be able to: • Understand the different types of soil based on their formation mechanism;\n" +
                "• Understand the various phase diagrams and derive various phase relationships of the soil; Perform various laboratory experiments to determine moisture content, specific gravity; Perform field experiments to estimate the field density of the soil mass.\n" +
                "\n" +
                "Module-2\n" +
                "Plasticity Characteristics of Soil\n" +
                "Introduction to definitions of: plasticity of soil, consistency limits-liquid limit, plastic limit, shrinkage limit, plasticity, liquidity and consistency indices, flow & toughness indices, definitions of activity and sensitivity. Determination of: liquid limit, plastic limit and shrinkage limit. Use of consistency limits. Classification of SoilsIntroduction of soil classification: particle size classification, textural classification, unified soil classification system, Indian standard soil classification system. Identification: field identification of soils, general characteristics of soil in different groups.\n" +
                "\n" +
                "On completion of this module, the students must be able to:\n" +
                "• Understand the behaviour of soils based on their moisture contents;\n" +
                "• Perform laboratory experiments to estimate various Atterberg limits and evaluate index properties of soils;\n" +
                "• Classify any soils based on their particle size distribution and index properties;\n" +
                "\n" +
                "Module-3\n" +
                "Permeability of Soil\n" +
                "Darcy’s law, validity of Darcy’s law. Determination of coefficient of permeability: Laboratory method: constant-head method, falling-head method. Field method: pumping- in test, pumping- out test. Permeability aspects: permeability of stratified soils, factors affecting permeability of soil. Seepage Analysis- Introduction, stream and potential functions, characteristics of flow nets, graphical method to plot flow nets.\n" +
                "\n" +
                "On completion of this module, the student must be able to:\n" +
                "• Determine the permeability of soils through various laboratory and field tests;\n" +
                "• Analytically calculate the effective permeability of anisotropic soil mass;\n" +
                "• Determine the seepage quantities and pore water pressures below the ground;\n" +
                "• Graphically plot the equipotential lines and flow lines in a seepage flow.\n" +
                "\n" +
                "Module-4\n" +
                "Effective Stress Principle\n" +
                "Introduction, effective stress principle, nature of effective stress, effect of water table. Fluctuations of effective stress, effective stress in soils saturated by capillary action, seepage pressure, quick sand condition.\n" +
                "\n" +
                "On completion of this module, the student must be able to:\n" +
                "• Understand the physical significance of effective stress and its relation with pore pressure;\n" +
                "• Plot various stress distribution diagrams along the depth of the soil mass;\n" +
                "• Understand the effect of capillary action and seepage flow direction on the effective stress at a point in the soil mass.\n" +
                "\n" +
                "Module-5\n" +
                "Compaction of Soil\n" +
                "Introduction, theory of compaction, laboratory determination of optimum moisture content and maximum dry density. Compaction in field, compaction specifications and field control.\n" +
                "\n" +
                "On completion of this module, the student must be able to:\n" +
                "• Perform laboratory test to determine the maximum dry density and optimum moisture content of the soil;\n" +
                "• Variation in compaction curve with compaction effort and soil type;\n" +
                "• Determine the compactive effort required to obtain necessary degree of compaction insitu;\n" +
                "• Differentiate among various field methods of compaction and their usage based on the type of soil\n" +
                "\n" +
                "Module-6\n" +
                "Stresses in soils\n" +
                "Introduction, stresses due to point load, line load, strip load, uniformly loaded circular area, rectangular loaded area. Influence factors, Isobars, Boussinesq’s equation, Newmark’s Influence Chart. Contact pressure under rigid and flexible area, computation of displacements from elastic theory.\n" +
                "\n" +
                "On completion of this module, the student must be able to:\n" +
                "• Analytically compute the vertical stress in a semi-infinite soil mass due to various loading conditions; Plot isobars due various loading condition\n" +
                "\n" +
                "Practicals\n" +
                "List of tests on-\n" +
                "1. Field Density using Core Cutter method.\n" +
                "2. Field Density using Sand replacement method.\n" +
                "3. Natural moisture content using Oven Drying method.\n" +
                "4. Field identification of Fine Grained soils.\n" +
                "5. Specific gravity of Soils.\n" +
                "6. Grain size distribution by Sieve Analysis.\n" +
                "7. Grain size distribution by Hydrometer Analysis.\n" +
                "8. Consistency limits by Liquid limit\n" +
                "9. Consistency limits by Plastic limit\n" +
                "10. Consistency limits by Shrinkage limit.\n" +
                "11. Permeability test using Constant-head test method.\n" +
                "12. Permeability test using Falling-head method.\n" +
                "13. Compaction test: Standard Proctor test.\n" +
                "14. Compaction test: Modified Proctor test.\n" +
                "15. Relative density.\n" +
                "16. Consolidation Test.\n" +
                "17. Triaxial Test (UU)\n" +
                "18. Vane shear test\n" +
                "19. Direct Shear Test\n" +
                "20. Unconfined Compression Strength Test\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. Soil Mechanics by Craig R.F., Chapman & Hall\n" +
                "2. Fundamentals of Soil Engineering by Taylor, John Wiley & Sons\n" +
                "3. An Introduction to Geotechnical Engineering, by Holtz R.D. and Kovacs, W.D., Prentice Hall, NJ\n" +
                "4. Principles of Foundation Engineering, by Braja M. Das, Cengage Learning.");




        List<String> HydrologyWaterResourcesEngineering = Arrays.asList("Module-1\n" +
                "Introduction\n" +
                "Introduction - hydrologic cycle, water-budget equation, history of hydrology, world water balance, applications in engineering, sources of data.\n" +
                "\n" +
                "Module-2\n" +
                "Precipitation\n" +
                "Precipitation - forms of precipitation, characteristics of precipitation in India, measurement of precipitation, rain gauge network, mean precipitation over an area, depthareaduration relationships, maximum intensity/depth-duration-frequency relationship, Probable Maximum Precipitation (PMP), rainfall data in India.\n" +
                "\n" +
                "Module-3\n" +
                "Abstractions from precipitation\n" +
                "Abstractions from precipitation - evaporation process, evaporimeters, analytical methods of evaporation estimation, reservoir evaporation and methods for its reduction, evapotranspiration, measurement of evapotranspiration, evapotranspiration equations, potential evapotranspiration over India, actual evapotranspiration, interception, depression storage infiltration, infiltration capacity, measurement of infiltration, modelling infiltration capacity, classification of infiltration capacities, infiltration indices.\n" +
                "\n" +
                "Module-4\n" +
                "Runoff\n" +
                "Runoff - runoff volume, SCS-CN method of estimating runoff volume, flowduration curve, flow-mass curve, hydrograph, factors affecting runoff hydrograph, components of hydrograph, base flow separation, effective rainfall, unit hydrograph surface water resources of India, environmental flows.\n" +
                "\n" +
                "Module-5\n" +
                "Ground water and well hydrology\n" +
                "Ground water and well hydrology - forms of subsurface water, saturated formation, aquifer properties, geologic formations of aquifers, well hydraulics: steady state flow in wells, equilibrium equations for confined and unconfined aquifers, aquifer tests.\n" +
                "\n" +
                "Module-6\n" +
                "Water withdrawals and uses\n" +
                "GWater withdrawals and uses – water for energy production, water for agriculture, water for hydroelectric generation; flood control. Analysis of surface water supply, Water requirement of crops-Crops and crop seasons in India, cropping pattern, duty and delta; Quality of irrigation water; Soil-water relationships, root zone soil water, infiltration, consumptive use, irrigation requirement, frequency of irrigation; Methods of applying water to the fields: surface, sub-surface, sprinkler and trickle / drip irrigation.\n" +
                "\n" +
                "Module-7\n" +
                "Distribution systems\n" +
                "GDistribution systems - canal systems, alignment of canals, canal losses, estimation of design discharge. Design of channels- rigid boundary channels, alluvial channels, Kennedy’s and Lacey’s theory of regime channels. Canal outlets: non-modular, semi-modular and modular outlets. Water logging: causes, effects and remedial measures. Lining of canals, types of lining. Drainage of irrigated lands: necessity, methods.\n" +
                "\n" +
                "Module-8\n" +
                "Dams and spillways\n" +
                "Dams and spillways - embankment dams: Classification, design considerations, estimation and control of seepage, slope protection. Gravity dams: forces on gravity dams, causes of failure, stress analysis, elementary and practical profile. Arch and buttress dams. Spillways: components of spillways, types of gates for spillway crests; Reservoirs- Types, capacity of reservoirs, yield of reservoir, reservoir regulation, sedimentation, economic height of dam, selection of suitable site.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. K Subramanya, Engineering Hydrology, Mc-Graw Hill.                                 \n" +
                "B. K N Muthreja, Applied Hydrology, Tata Mc-Graw Hill.\n" +
                "C. K Subramanya, Water Resources Engineering through Objective Questions, Tata McGraw Hill.");




        List<String> EnvironmentalEngineering = Arrays.asList("Module-1\n" +
                "Water\n" +
                "Water: -Sources of Water and quality issues, water quality requirement for different beneficial uses, Water quality standards, water quality indices, water safety plans, Water Supply systems, Need for planned water supply schemes, Water demand industrial and agricultural water requirements, Components of water supply system; Transmission of water, Distribution system, Various valves used in W/S systems, service reservoirs and design.\n" +
                "Water Treatment: aeration, sedimentation, coagulation flocculation, filtration, disinfection, advanced treatments like adsorption, ion exchange, membrane processes.\n" +
                "\n" +
                "Module-2\n" +
                "Air\n" +
                "Air - Composition and properties of air, Quantification of air pollutants, Monitoring of air pollutants, Air pollution- Occupational hazards, Urban air pollution automobile pollution, Chemistry of combustion, Automobile engines, quality of fuel, operating conditions and interrelationship. Air quality standards, Control measures for Air pollution, construction and limitations .\n" +
                "\n" +
                "Module-3\n" +
                "Noise\n" +
                "Basic concept, measurement and various control methods.\n" +
                "\n" +
                "Module-4\n" +
                "Building Plumbing\n" +
                "Introduction to various types of home plumbing systems for water supply and waste water disposal, high rise building plumbing, Pressure reducing valves, Break pressure tanks, Storage tanks, Building drainage for high rise buildings, various kinds of fixtures and fittings used.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. Introduction to Environmental Engineering and Science by Gilbert Masters, Prentice Hall, New Jersey\n" +
                "2. Introduction to Environmental Engineering by P. Aarne Vesilind, Susan M. Morgan, Thompson /Brooks/Cole; Second Edition 2008\n" +
                "3. Peavy, H.s, Rowe, D.R, Tchobanoglous, G. Environmental Engineering, Mc-Graw Hill International Editions, New York 1985\n" +
                "\n" +
                "Practicals:\n" +
                "List of Experiments\n" +
                "1. Physical Characterization of water: Turbidity, Electrical Conductivity, pH\n" +
                "2. Analysis of solids content of water: Dissolved, Settleable, suspended, total, volatile, inorganic etc.\n" +
                "3. Alkalinity and acidity, Hardness: total hardness, calcium and magnesium hardness\n" +
                "4. Analysis of ions: copper, chloride and sulfate\n" +
                "5. Optimum coagulant dose 6. Chemical Oxygen Demand (COD)\n" +
                "7. Dissolved Oxygen (D.O) and Biochemical Oxygen Demand (BOD)\n" +
                "8. Break point Chlorination\n" +
                "9. Bacteriological quality measurement: MPN\n" +
                "10. Ambient Air quality monitoring (TSP, RSPM, SOx, NOx)\n" +
                "11. Ambient noise measurement.");




        List<String> TransportationEngineering = Arrays.asList("Module-1\n" +
                "Highway development and planning\n" +
                "Highway development and planning-Classification of roads, road development in India, Current road projects in India; highway alignment and project preparation.\n" +
                "\n" +
                "Module-2\n" +
                "Geometric design of highways\n" +
                "Introduction; highway cross section elements; sight distance, design of horizontal alignment; design of vertical alignment; design of intersections, problems.\n" +
                "\n" +
                "Module-3\n" +
                "Traffic engineering & control\n" +
                "Traffic Characteristics, traffic engineering studies, traffic flow and capacity, traffic regulation and control; design of road intersections; design of parking facilities; highway lighting; problems .\n" +
                "\n" +
                "Module-4\n" +
                "Pavement materials\n" +
                "Materials used in Highway Construction- Soils, Stone aggregates, bituminous binders, bituminous paving mixes; Portland cement and cement concrete: desirable properties, tests, requirements for different types of pavements. Problems .\n" +
                "\n" +
                "Module-5\n" +
                "Design of pavements\n" +
                "Introduction; flexible pavements, factors affecting design and performance; stresses in flexible pavements; design of flexible pavements as per IRC; rigid pavements- components and functions; factors affecting design and performance of CC pavements; stresses in rigid pavements; design of concrete pavements as per IRC; problems .\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. Khanna, S.K., Justo, C.E.G and Veeraragavan, A, 'Highway Engineering', Revised 10th Edition, Nem Chand & Bros, 2017.\n" +
                "2. Kadiyalai, L.R., ' Traffic Engineering and Transport Planning', Khanna Publishers.\n" +
                "3. Partha Chakraborty, ' Principles Of Transportation Engineering, PHI Learning.\n" +
                "4. Fred L. Mannering, Scott S. Washburn, Walter P. Kilareski,'Principles of Highway Engineering and Traffic Analysis', 4th Edition, John Wiley.");




        List<String> EnvironmentalScience = Arrays.asList("Mandatory non-credit course", "(a) Awareness Activities:\n" +
                "i) Small group meetings about water management, promotion of recycle use, generation of less waste, avoiding electricity waste\n" +
                "ii) Slogan making events\n" +
                "iii) Poster making events\n" +
                "iv) Cycle rally\n" +
                "v) Lectures from experts\n" +
                "\n" +
                "(b) Actual Activities:\n" +
                "i) Plantation\n" +
                "ii) Gifting a tree to see its full growth\n" +
                "iii) Cleanliness drive\n" +
                "iv) Drive for segregation of waste\n" +
                "v) To live some big environmentalist for a week or so to understand his work\n" +
                "vi) To work in kitchen garden for mess\n" +
                "vii) To know about the different varieties of plants\n" +
                "viii) Shutting down the fans and ACs of the campus for an hour or so .");




        List<String> SummerEntrepreneurshipTwo = Arrays.asList("Summer Entrepreneurship-||");



        List<Semester> fifthSemesters = new ArrayList<>();
        fifthSemesters.add(new Semester("Mechanics of Materials", MechanicsMaterials));
        fifthSemesters.add(new Semester("Hydraulic Engineering", HydraulicEngineering));
        fifthSemesters.add(new Semester("Analysis and Design of Concrete Structure", AnalysisDesignConcreteStructure));
        fifthSemesters.add(new Semester("Geotechnical Engineering -I", GeotechnicalEngineering));
        fifthSemesters.add(new Semester("Hydrology & Water Resources Engineering", HydrologyWaterResourcesEngineering));
        fifthSemesters.add(new Semester("Environmental Engineering -I", EnvironmentalEngineering));
        fifthSemesters.add(new Semester("Transportation Engineering", TransportationEngineering));
        fifthSemesters.add(new Semester("Environmental Science", EnvironmentalScience));
        fifthSemesters.add(new Semester("Summer Entrepreneurship-||", SummerEntrepreneurshipTwo));

        branches.add(new Branch("Semester 5", fifthSemesters));
        //5th Semester complete......





        //6 Semester starting......
        List<String> ConstructionEngineeringAndManagement = Arrays.asList("Module 1: \n" +
                "\n" +
                "Basics of Construction- Unique features of construction, construction projects- types and features, phases of a project, agencies involved and their methods of execution;\n" +
                "\n" +
                "Module 2: Construction project planning- Stages of project planning: pre-tender planning, pre-construction planning, detailed construction planning, role of client and contractor, level of detail. Process of development of plans and schedules, work break-down structure, activity lists, assessment of work content, concept of productivities, estimating durations, sequence of activities, activity utility data; Techniques of planning- Bar charts, Gantt Charts. Networks: basic terminology, types of precedence relationships, preparation of CPM networks: activity on link and activity on node representation, computation of float values, critical and semi critical paths, calendaring networks. PERT- Assumptions underlying PERT analysis, determining three time estimates, analysis, slack computations, calculation of probability of completion.\n" +
                "\n" +
                "Module 3:Construction Methods basics: Types of foundations and construction methods; Basics of Formwork and Staging; Common building construction methods (conventional walls and slabs; conventional framed structure with blockwork walls; Modular construction methods for repetitive works; Precast concrete construction methods; Basics of Slip forming for tall structures; Basic construction methods for steel structures; Basics of construction methods for Bridges.\n" +
                "\n" +
                "Module 4: Construction Equipment basics: Conventional construction methods Vs Mechanized methods and advantages of latter; Equipment for Earthmoving, Dewatering; Concrete mixing, transporting & placing; Cranes, Hoists and other equipment for lifting; Equipment for transportation of materials. Equipment Productivities\n" +
                "\n" +
                "Module 5: Planning and organizing construction site and resources- Site: site layout including enabling structures, developing site organization, Documentation at site; Manpower: planning, organizing, staffing, motivation; Materials: concepts of planning, procurement and inventory control; Equipment: basic concepts of planning and organizing; Funds: cash flow, sources of funds; Histograms and S-Curves. Earned Value; Resource Scheduling- Bar chart, line of balance technique, resource constraints and conflicts; resource aggregation, allocation, smoothening and leveling. Common Good Practices in Construction\n" +
                "\n" +
                "Module 6: Project Monitoring & Control- Supervision, record keeping, periodic progress reports, periodical progress meetings. Updating of plans: purpose, frequency and methods of updating. Common causes of time and cost overruns and corrective measures. Basics of Modern Project management systems such as Lean Construction; Use of Building Information Modelling (BIM) in project management; Quality control: concept of quality, quality of constructed structure, use of manuals and checklists for quality control, role of inspection, basics of statistical quality control. Safety, Health and Environment on project sites: accidents; their causes, effects and preventive measures, costs of accidents, occupational health problems in construction, organizing for safety and health.\n" +
                "\n" +
                "Module 7: Contracts Management basics: Importance of contracts; Types of Contracts, parties to a contract; Common contract clauses (Notice to proceed, rights and duties of various parties, notices to be given, Contract Duration and Price. Performance parameters; Delays, penalties and liquidated damages; Force Majeure, Suspension and Termination. Changes & variations, Dispute Resolution methods.\n" +
                "\n" +
                "Module 8: Construction Costs: Make-up of construction costs; Classification of costs, timecost trade-off in construction projects, compression and decompression.\n" +
                "\n" +
                "Text/Reference Books:\n" +
                "\n" +
                "1. Varghese, P.C., “Building Construction”, Prentice Hall India, 2007.\n" +
                "\n" +
                "2. National Building Code, Bureau of Indian Standards, New Delhi, 2017.\n" +
                "\n" +
                "3. Chudley, R., Construction Technology, ELBS Publishers, 2007.\n" +
                "\n" +
                "4. Peurifoy, R.L. Construction Planning, Methods and Equipment, McGraw Hill, 2011\n" +
                "\n" +
                "5. Nunnally, S.W. Construction Methods and Management, Prentice Hall, 2006\n" +
                "\n" +
                "6. Jha, Kumar Neeraj., Construction Project management, Theory & Practice, Pearson Education India, 2015\n" +
                "\n" +
                "7. Punmia, B.C., Khandelwal, K.K., Project Planning with PERT and CPM, Laxmi Publications, 2016.");



        List<String> EngineeringEconomicsEstimationAndCosting = Arrays.asList("Module 1:Basic Principles and Methodology of Economics. Demand/Supply – elasticity –Government Policies and Application. Theory of the Firm and Market Structure. Basic Macro-economic Concepts (including GDP/GNP/NI/Disposable Income) and Identities for both closed and open economies. Aggregate demand and Supply (IS/LM). Price Indices (WPI/CPI), Interest rates, Direct and Indirect Taxes (3 lectures)\n" +
                "\n" +
                "Module 2: Public Sector Economics –Welfare, Externalities, Labour Market. Components of Monetary and Financial System, Central Bank –Monetary Aggregates; Commercial Banks & their functions; Capital and Debt Markets. Monetary and Fiscal Policy Tools & their impact on the economy – Inflation and Phillips Curve. (2 lectures)\n" +
                "\n" +
                "Module 3:Elements of Business/Managerial Economics and forms of organizations. Cost & Cost Control –Techniques, Types of Costs, Lifecycle costs, Budgets, Break even Analysis, Capital Budgeting, Application of Linear Programming. Investment Analysis – NPV, ROI, IRR, Payback Period, Depreciation, Time value of money (present and future worth of cash flows). Business Forecasting – Elementary techniques. Statements – Cash flow, Financial. Case Study Method. (3 lectures)\n" +
                "\n" +
                "\n" +
                "Module 4:Indian economy - Brief overview of post-independence period – plans. Post reform Growth, Structure of productive activity. Issues of Inclusion – Sectors, States/Regions, Groups of people (M/F), Urbanization. Employment–Informal, Organized, Unorganized, Public, Private. Challenges and Policy Debates in Monetary, Fiscal, Social, External sectors. (2 lectures)\n" +
                "\n" +
                "\n" +
                "Module 5:Estimation / Measurements for various items- Introduction to the process of Estimation; Use of relevant Indian Standard Specifications for the same, taking out quantities from the given requirements of the work, comparison of different alternatives, Bar bending schedules, Mass haul Diagrams, Estimating Earthwork and Foundations, Estimating Concrete and Masonry, Finishes, Interiors, MEP works; BIM and quantity take-offs; adding equipment costs; labour costs; rate analysis; Material survey-Thumb rules for computation of materials requirement for different materials for buildings, percentage breakup of the cost, cost sensitive index, market survey of basic materials. Use of Computers in quantity surveying (7 lectures)\n" +
                "\n" +
                "\n" +
                "Module 6: Specifications-Types, requirements and importance, detailed specifications for buildings, roads, minor bridges and industrial structures. (3 lectures)\n" +
                "\n" +
                "Module 7: Rate analysis-Purpose, importance and necessity of the same, factors affecting, task work, daily output from different equipment/ productivity. (3 lectures)\n" +
                "\n" +
                "Module 8: Tender- Preparation of tender documents, importance of inviting tenders, contract types, relative merits, prequalification. general and special conditions, termination of contracts, extra work and Changes, penalty and liquidated charges, Settlement of disputes, R.A. Bill & Final Bill, Payment of advance, insurance, claims, price variation, etc. Preparing Bids- Bid Price buildup: Material, Labour, Equipment costs, Risks, Direct & Indirect Overheads, Profits; Bid conditions, alternative specifications; Alternative Bids. Bid process management (6 lectures)\n" +
                "\n" +
                "Module 9: Introduction to Acts pertaining to-Minimum wages, Workman's compensation, Contracts, Arbitration, Easement rights. (1 lecture)\n" +
                "\n" +
                "Term Work Assignments may include:\n" +
                "\n" +
                "1. Deriving an approximate estimate for a multistoried building by approximate methods.\n" +
                "\n" +
                "2. Detailed estimate for the following with the required material survey for the same.\n" +
                "\n" +
                "   a. Ground plus three storied RCC Framed structure building with blockwork walls\n" +
                "\n" +
                "   b. bridge with minimum 2 spans\n" +
                "\n" +
                "   c. factory building\n" +
                "\n" +
                "   d. road work\n" +
                "\n" +
                "   e. cross drainage work\n" +
                "\n" +
                "   f. Ground plus three storied building with load-bearing walls g Cost of finishes, MEPworks for (f) above\n" +
                "\n" +
                "3. Preparation of valuation report in standard Government form.\n" +
                "\n" +
                "4. Assignments on rate analysis, specifications and simple estimates.\n" +
                "\n" +
                "5. Detailed estimate of minor structure.\n" +
                "\n" +
                "6. Preparation of Bar bending schedule.\n" +
                "\n" +
                "Text/Reference Books:\n" +
                "\n" +
                "1. Mankiw Gregory N. (2002), Principles of Economics, Thompson Asia\n" +
                "\n" +
                "2. V. Mote, S. Paul, G. Gupta(2004), Managerial Economics, Tata McGraw Hill\n" +
                "\n" +
                "3. Misra, S.K. and Puri (2009), Indian Economy, Himalaya\n" +
                "\n" +
                "4. Pareek Saroj (2003), Textbook of Business Economics, Sunrise Publishers\n" +
                "\n" +
                "5. M Chakravarty, Estimating, Costing Specifications & Valuation\n" +
                "\n" +
                "6. Joy P K, Handbook of Construction Management, Macmillan 7. B.S. Patil, Building &\n" +
                "\n" +
                "Engineering Contracts 8. Relevant Indian Standard Specifications.\n" +
                "\n" +
                "9. World Bank Approved Contract Documents.\n" +
                "\n" +
                "10. FIDIC Contract Conditions.\n" +
                "\n" +
                "11. Acts Related to Minimum Wages, Workmen’s Compensation, Contract, and\n" +
                "\n" +
                "Arbitration\n" +
                "\n" +
                "12. Typical PWD Rate Analysis documents.\n" +
                "\n" +
                "13. UBS Publishers & Distributors, Estimating and Costing in Civil Engineering: Theory and\n" +
                "\n" +
                "Practice including Specification and Valuations,2016\n" +
                "\n" +
                "14. Dutta, B.N., Estimating and Costing in Civil Engineering (Theory & Practice), UBS Publishers,2016.");



        List<String> DesignOfSteelStructure = Arrays.asList("Module 1: Introduction: Steel structures, material properties, Limit states and design philosophies; analysis and design methods, Loads, partial safety factors and load combinations, analysis of roof for wind loads. Codes and standards. Section Classification: Plastic, compact, semi-compact, and slender sections.\n" +
                "\n" +
                "Module 2: Connections: Structural fasteners - Rivets, bolts and welds, strength under combined stresses, Bolted and Welded Connections - Simple and Eccentric and Column bases.I\n" +
                "\n" +
                "Module 3: Tension members: Design based on net section including shear lag effects and block shear, lug angles. Compression members:\n" +
                "\n" +
                "Module 4: Design for flexural and flexural-torsional buckling, Effective length factor: Sway and Non- sway frames, Local buckling, Built-up columns - Battens and lacings. Laterally Supported and Unsupported Beams:\n" +
                "\n" +
                "Module 5: Design strength using shear-moment interaction; Built-up beams, Shear buckling strength, Plate girders and design of stiffeners, Lateral torsional buckling, Effect of restraints and effective length.\n" +
                "\n" +
                "Module 6: Beam-Columns: Effect of axial load on flexure behaviour, P-M interaction and moment amplification, Flexural torsional buckling and Bi-axial bending.\n" +
                "\n" +
                "Text/Reference Books:\n" +
                "\n" +
                "1. McCormac, J.C., Nelson, J.K. Jr., Structural Steel Design. 3rd edition. Prentice Hall, N.J., 2003.\n" +
                "\n" +
                "2. Galambos, T.V., Lin, F.J., Johnston, B.G., Basic Steel Design with LRFD, Prentice Hall, 1996\n" +
                "\n" +
                "3. Segui, W. T., LRFD Steel Design, 2nd Ed., PWS Publishing, Boston.\n" +
                "\n" +
                "4. Salmon, C.G. and Johnson, J.E., Steel Structures: Design and Behavior, 3rd Edition, Harper & Row, Publishers, New York, 1990.\n" +
                "\n" +
                "5. Related Codes of Practice of BIS\n" +
                "\n" +
                "6. NBC, National Building Code, BIS (2017).\n" +
                "\n" +
                "7. ASCE, Minimum Design Loads for Buildings and Other Structures, ASCE 7-02, American Society of Civil Engineers, Virginia, 2002.\n" +
                "\n" +
                "8. Subramanian, N. (2010). Steel Structures: Design and Practice, Oxford University Press.\n" +
                "\n" +
                "9. Duggal, S.K. (2014). Limit State Design of Steel Structures, McGraw Hill.");



        List<String> GeotechnicalEngineeringTwo = Arrays.asList("Module 1: Consolidation of Soil - Introduction, comparison between compaction and consolidation, initial, primary & secondary consolidation, spring analogy for primary consolidation, interpretation of consolidation test results, Terzaghi’s theory of consolidation, final settlement of soil deposits, computation of consolidation settlement and secondary consolidation.\n" +
                "\n" +
                "On completion of this module, the student must be able to:\n" +
                "\n" +
                "• Understand the basic mechanism of consolidation of soil;\n" +
                "\n" +
                "• Determine various consolidation parameters of soil through laboratory test; Evaluate ground settlements against time.\n" +
                "\n" +
                "Module 2: Shear Strength - Mohr circle and its characteristics, principal planes, relation between major and minor principal stresses, Mohr-Coulomb theory, types of shear tests: direct shear test, merits of direct shear test, triaxial compression tests, test behaviour of UU, CU and CD tests, pore- pressure measurement, computation of effective shear strength parameters unconfined compression test, vane shear test On completion of this module, the student must be able to:\n" +
                "\n" +
                "• Determine graphically and analytically the stress state in any plane of the soil mass; Perform various shear strength tests and appreciate the different field conditions which they simulate;\n" +
                "\n" +
                "• Understand the significance of shear strength parameters in various geotechnical analyses;\n" +
                "\n" +
                "• Evaluate the stiffness of soil using shear strength parameters\n" +
                "\n" +
                "Module 3:Stability of Slopes - Introduction, types of slopes and their failure mechanisms, factor of safety, analysis of finite and infinite slopes, wedge failure Swedish circle method, friction circle method, stability numbers and charts. On completion of this module, the student must be able to:\n" +
                "\n" +
                "• Differentiate various modes of slope failure;\n" +
                "\n" +
                "• Evaluate factor of safety of infinite slopes based on different ground conditions; Understand various methods for computation of factor of safety for finite slopes.\n" +
                "\n" +
                "Module 4: Soil Exploration- Introduction, methods of site exploration and soil investigation, methods of boring, soil samplers, sampling procedures, trail pits, borings, penetrometer tests, analysis of borehole logs, geophysical and advance soil exploration methods.\n" +
                "\n" +
                "On completion of this module, the student must be able to:\n" +
                "\n" +
                "• Specify a strategy for site investigation to identify the soil deposits and determine the depth and spatial extent within the ground;\n" +
                "\n" +
                "• Understand various site investigation techniques and their in-situ applications; Prepare a soil investigation report based on borehole log data and various in-situ tests like SPT, CPT, etc.\n" +
                "\n" +
                "Module 5 Application of soil mechanics to determine earth pressures, analysis of retaining walls, cuts & excavations and sheet piles, stability of slopes, instrumentation.\n" +
                "\n" +
                "Text/Reference Books:\n" +
                "\n" +
                "1. Soil Mechanics by Craig R.F., Chapman & Hall\n" +
                "\n" +
                "2. Fundamentals of Soil Engineering by Taylor, John Wiley & Sons\n" +
                "\n" +
                "3. An Introduction to Geotechnical Engineering, by Holtz R.D. and Kovacs, W.D., Prentice Hall, NJ\n" +
                "\n" +
                "4. Principles of Geotechnical Engineering, by Braja M. Das, Cengage Learning\n" +
                "\n" +
                "5. Principles of Foundation Engineering, by Braja M. Das, Cengage Learning\n" +
                "\n" +
                "6. Essentials of Soil Mechanics and Foundations: Basic Geotechnics by David F. McCarthy\n" +
                "\n" +
                "7. Soil Mechanics in Engineering Practice by Karl Terzaghi, Ralph B. Peck, and Gholamreza Mesri.\n" +
                "\n" +
                "8. Geotechnical Engineering: Principles and Practices of Soil Mechanics and Foundation\n" +
                "\n" +
                "Engineering (Civil and Environmental Engineering) by V.N.S. Murthy.");



        List<String> EnvironmentalEngineeringTwo = Arrays.asList("Module 1: Sewage- Domestic and Storm water, Quantity of Sewage, Sewage flow variations. Conveyance of sewage- Sewers, shapes design parameters, operation and maintenance of sewers, Sewage pumping; Sewerage, Sewer appurtenances, Design of sewerage systems. Small bore systems, Storm Water- Quantification and design of Storm water; Sewage and Sullage, Pollution due to improper disposal of sewage, National River cleaning plans, Wastewater treatment, aerobic and anaerobic treatment systems, suspended and attached growth systems, recycling of sewage – quality requirements for various purposes.\n" +
                "\n" +
                "Module2: Solid waste management-Municipal solid waste, Composition and various chemical and physical parameters of MSW, MSW management: Collection, transport, treatment and disposal of MSW. Special MSW: waste from commercial establishments and other urban areas, solid waste from construction activities, biomedical wastes, Effects of solid waste on environment: effects on air, soil, water surface and ground health hazards. Disposal of solid waste-segregation, reduction at source, recovery and recycle. Disposal methods- Integrated solid waste management. Hazardous waste: Types and nature of hazardous waste as per the HW Schedules of regulating authorities.\n" +
                "\n" +
                "Module 3: Government authorities and their roles in water supply, sewerage disposal. Solid waste management and monitoring/control of environmental pollution.\n" +
                "\n" +
                "Practical Work: List of Experiments\n" +
                "\n" +
                "1. Physical Characterization of water: Turbidity, Electrical Conductivity, pH\n" +
                "\n" +
                "2. Analysis of solids content of water: Dissolved, Settleable, suspended, total, volatile, inorganic etc.\n" +
                "\n" +
                "3. Alkalinity and acidity, Hardness: total hardness, calcium and magnesium hardness\n" +
                "\n" +
                "4. Analysis of ions: copper, chloride and sulfate\n" +
                "\n" +
                "5. Optimum coagulant dose\n" +
                "\n" +
                "6. Chemical Oxygen Demand (COD)\n" +
                "\n" +
                "7. Dissolved Oxygen (D.O) and Biochemical Oxygen Demand (BOD)\n" +
                "\n" +
                "8. Break point Chlorination\n" +
                "\n" +
                "9. Bacteriological quality measurement: MPN,\n" +
                "\n" +
                "10. Ambient Air quality monitoring (TSP, RSPM, SOx, NOx)\n" +
                "\n" +
                "11. Ambient noise measurement\n" +
                "\n" +
                "Text/Reference Books:\n" +
                "\n" +
                "1. Introduction to Environmental Engineering and Science by Gilbert Masters, Prentice Hall,New Jersey.\n" +
                "\n" +
                "2. Introduction to Environmental Engineering by P. Aarne Vesilind, Susan M. Morgan,\n" +
                "\n" +
                "Thompson /Brooks/Cole; Second Edition 2008.\n" +
                "\n" +
                "3. Peavy, H.s, Rowe, D.R, Tchobanoglous, G. Environmental Engineering, Mc-Graw Hill International Editions, New York 1985.\n" +
                "\n" +
                "4. MetCalf and Eddy. Wastewater Engineering, Treatment, Disposal and Reuse, Tata McGraw- Hill, New Delhi.\n" +
                "\n" +
                "5. Manual on Water Supply and Treatment. Ministry of Urban Development, New Delhi.\n" +
                "\n" +
                "6. Plumbing Engineering. Theory, Design and Practice, S.M. Patil, 1999\n" +
                "\n" +
                "7. Integrated Solid Waste Management, Tchobanoglous, Theissen & Vigil. McGraw Hill Publication\n" +
                "\n" +
                "8. Manual on Sewerage and Sewage Treatment Systems, Part A, B and C. Central Public Health and Environmental Engineering Organization, Ministry of Urban Development.");



        List<String> ProgramElectiveFirst = Arrays.asList("Program Elective-|");

        List<String> IndustrialVISIT = Arrays.asList("Industrial VISIT");

        List<String> MOOCSWAYAMNPTELCourses = Arrays.asList("MOOC/SWAYAM/NPTEL Courses-||");

        List<String> ConstitutionOfIndia = Arrays.asList("Constitution of India/ Essence of Indian Traditional Knowledge.");



        List<Semester> sixthSemesters = new ArrayList<>();
        sixthSemesters.add(new Semester("Construction Engineering And Management", ConstructionEngineeringAndManagement));
        sixthSemesters.add(new Semester("Engineering Economics ,Estimation And Costing", EngineeringEconomicsEstimationAndCosting));
        sixthSemesters.add(new Semester("Design of Steel Structure", DesignOfSteelStructure));
        sixthSemesters.add(new Semester("Geotechnical Engineering-||", GeotechnicalEngineeringTwo));
        sixthSemesters.add(new Semester("Environmental Engineering-||", EnvironmentalEngineeringTwo));
        sixthSemesters.add(new Semester("Program Elective-|", ProgramElectiveFirst));
        sixthSemesters.add(new Semester("Industrial VISIT", IndustrialVISIT));
        sixthSemesters.add(new Semester("MOOC/SWAYAM/NPTEL Courses-||", MOOCSWAYAMNPTELCourses));
        sixthSemesters.add(new Semester("Constitution of India/ Essence of Indian Traditional Knowledge", ConstitutionOfIndia));

        branches.add(new Branch("Semester 6", sixthSemesters));
        //6th Semester Complete.......





        //7 Semester Starting.......
        List<String> GraduateEmployabilitySkills = Arrays.asList("Graduate Employability Skills And Competitive Courses(GATE,IES,ETC)..");

        List<String> ProfessionalPracticeLawOfEthics = Arrays.asList("Basic elements of civil engineering professional practice are introduced in this course. Roles of all participants in the process-owners, developers, designers, consultants, architects, contractors, and suppliers - are described. Basic concepts in professional practice, business management, public policy, leadership, and professional licensure are introduced. The course covers professional relations, civic responsibilities, and ethical obligations for engineering practice. The course also describes contracts management, and various legal aspects related to engineering. Further, the course familiarizes students with elementary knowledge of laws that would be of utility in their profession, including several new areas of law such as IPR, ADR.\n" +
                "\n" +
                "The course is designed to address the following: \n" +
                "\n" +
                "• To make the students understand the types of roles they are expected to play in the society as practitioners of the civil engineering profession\n" +
                "\n" +
                "• To develop some ideas of the legal and practical aspects of their profession\n" +
                "\n" +
                "Proposed Syllabus\n" +
                "\n" +
                "Professional practice covering the respective roles of the various stakeholders in the profession of civil engineering and the factors governing the same; Professional ethics relating to civil engineering; Various aspects of contracts relating to construction and management of contracts; types of contractual and other disputes in the profession and methods of dispute resolution; legal aspects relating to employment and service conditions of labour; intellectual property rights and their legal framework\n" +
                "\n" +
                "Modules:\n" +
                "\n" +
                "Module 1 A- Professional Practice – Respective roles of various stakeholders: Government (constituting regulatory bodies and standardization organizations, prescribing norms to ensure safety of the citizens); Standardization Bodies (ex. BIS, IRC)(formulating standards of practice); professional bodies (ex. Institution of Engineers(India), Indian Roads Congress, IIA/ COA, ECI, Local Bodies/ Planning Authorities) (certifying professionals and offering platforms for interaction); Clients/ owners (role governed by contracts); Developers (role governed by regulations such as RERA); Consultants (role governed by bodies such as CEAI); Contractors (role governed by contracts and regulatory Acts and Standards); Manufacturers/ Vendors/ Service agencies (role governed by contracts and regulatory Acts and Standards)\n" +
                "\n" +
                "Module 1 B- Professional Ethics – Definition of Ethics, Professional Ethics, Business Ethics, Corporate Ethics, Engineering Ethics, Personal Ethics; Code of Ethics as defined in the website of Institution of Engineers (India); Profession, Professionalism, Professional Responsibility, Professional Ethics; Conflict of Interest, Gift Vs Bribery, Environmental breaches, Negligence, Deficiencies in state-of-theart; Vigil Mechanism, Whistleblowing, protected disclosures.\n" +
                "\n" +
                "Module 2:General Principles of Contracts Management: Indian Contract Act, 1972 and amendments covering General principles of contracting; Contract Formation & Law; Privacy of contract; Various types of contract and their features; Valid & Voidable Contracts; Prime and sub-contracts; Joint Ventures & Consortium; Complex contract terminology; Tenders, Request For Proposals, Bids & Proposals; Bid Evaluation; Contract Conditions & Specifications; Critical /“Red Flag” conditions; Contract award & Notice To Proceed; Variations & Changes in Contracts; Differing site conditions; Cost escalation; Delays, Suspensions & Terminations; Time extensions & Force Majeure; Delay Analysis; Liquidated damages & Penalties; Insurance & Taxation; Performance and Excusable Nonperformance; Contract documentation; Contract Notices; Wrong practices in contracting (Bid shopping, Bid fixing, Cartels); Reverse auction; Case Studies; Build-Own-Operate & variations; PublicPrivate Partnerships; International Commercial Terms;\n" +
                "\n" +
                "Module 3 :Arbitration, Conciliation and ADR (Alternative Dispute Resolution) system: Arbitration – meaning, scope and types – distinction between laws of 1940 and 1996; UNCITRAL model law – Arbitration and expert determination; Extent of judicial intervention; International commercial arbitration; Arbitration agreements – essential and kinds, validity, reference and interim measures by court; Arbitration tribunal – appointment, challenge, jurisdiction of arbitral tribunal, powers, grounds of challenge, procedure and court assistance; Award including Form and content, Grounds for setting aside an award, Enforcement, Appeal and Revision; Enforcement of foreign awards – New York and Geneva Convention Awards; Distinction between conciliation, negotiation, mediation and arbitration, confidentiality, resort to judicial proceedings, costs; Dispute Resolution Boards; Lok Adalats\n" +
                "\n" +
                "Module 4 : Engagement of Labour and Labour & other construction-related Laws: Role of Labour in Civil Engineering; Methods of engaging labour- on rolls, labour sub-contract, piece rate work; Industrial Disputes Act, 1947; Collective bargaining; Industrial Employment ( Standing Orders) Act, 1946; Workmen’s Compensation Act, 1923; Building & Other Construction Workers (regulation of employment and conditions of service) Act (1996) and Rules (1998); RERA Act 2017, NBC 2017\n" +
                "\n" +
                "Module 5 : Law relating to Intellectual property: Introduction – meaning of intellectual property, main forms of IP, Copyright, Trademarks, Patents and Designs, Secrets; Law relating to Copyright in India including Historical evolution of Copy Rights Act, 1957, Meaning of copyright – computer programs, Ownership of copyrights and assignment, Criteria of infringement, Piracy in Internet – Remedies and procedures in India; Law relating to Patents under Patents Act, 1970 including Concept and historical perspective of patents law in India, Patentable inventions with special reference to biotechnology products, Patent protection for computer programs, Process of obtaining patent – application, examination, opposition and sealing of patents, Patent cooperation treaty and grounds for opposition, Rights and obligations of patentee, Duration of patents – law and policy considerations, Infringement and related remedies; \n" +
                "\n" +
                " \n" +
                "\n" +
                "ORGANISATION OF COURSE (2-0-0) \n" +
                "S.No) Module ~ No of Lectures \n" +
                "1A) Professional Practice ~ 2 \n" +
                "1B) Professional Ethics ~2 \n" +
                "2) Contracts Management ~ 18 \n" +
                "3) Dispute Resolution Mechanisms ~ 5 \n" +
                "4) Labour; Labour & other Laws ~ 2 \n" +
                "5) Intellectual Property Management ~ 1 \n" +
                "TOTAL 30 \n" +
                "\n" +
                "Text/Reference Books:\n" +
                "\n" +
                "1. B.S. Patil, Legal Aspects of Building and Engineering Contracts, 1974.\n" +
                "\n" +
                "2. The National Building Code, BIS, 2017\n" +
                "\n" +
                "3. RERA Act, 2017\n" +
                "\n" +
                "4. Meena Rao (2006), Fundamental concepts in Law of Contract, 3rd Edn. Professional Offset\n" +
                "\n" +
                "5. Neelima Chandiramani (2000), The Law of Contract: An Outline, 2nd Edn. Avinash Publications Mumbai\n" +
                "\n" +
                "6. Avtarsingh (2002), Law of Contract, Eastern Book Co.\n" +
                "\n" +
                "7. Dutt (1994), Indian Contract Act, Eastern Law House\n" +
                "\n" +
                "8. Anson W.R. (1979), Law of Contract, Oxford University Press\n" +
                "\n" +
                "9. Kwatra G.K. (2005), The Arbitration & Conciliation of Law in India with case law on UNCITRAL Model Law on Arbitration, Indian Council of Arbitration\n" +
                "\n" +
                "10. Wadhera (2004), Intellectual Property Rights, Universal Law Publishing Co.\n" +
                "\n" +
                "11. T. Ramappa (2010), Intellectual Property Rights Law in India, Asia Law House\n" +
                "\n" +
                "12. Bare text (2005), Right to Information Act\n" +
                "\n" +
                "13. O.P. Malhotra, Law of Industrial Disputes, N.M. Tripathi Publishers\n" +
                "\n" +
                "14. K.M. Desai(1946), The Industrial Employment (Standing Orders) Act\n" +
                "\n" +
                "15. Rustamji R.F., Introduction to the Law of Industrial Disputes, Asia Publishing House\n" +
                "\n" +
                "16. Vee, Charles & Skitmore, Martin (2003) Professional Ethics in the Construction Industry, Engineering Construction and Architectural management, Vol.10, Iss2,pp 117-127, MCB UP Ltd\n" +
                "\n" +
                "17. American Society of Civil Engineers (2011) ASCE Code of Ethics – Principles Study and Application\n" +
                "\n" +
                "18. Ethics in Engineering- M.W.Martin& R.Schinzinger, McGraw-Hill\n" +
                "\n" +
                "19. Engineering Ethics, National Institute for Engineering Ethics, USA\n" +
                "\n" +
                "20. www.ieindia.org \n" +
                "\n" +
                "21. Engineering ethics: concepts and cases – C. E. Harris, M.S. Pritchard, M.J.Rabins\n" +
                "\n" +
                "22. CONSTRUCTION CONTRACTS, http://www.jnormanstark.com/contract.htm \n" +
                "\n" +
                "23. Internet and Business Handbook, Chap 4, CONTRACTS LAW, http://www.laderapress.com/laderapress/contractslaw1.html \n" +
                "\n" +
                "24. Contract&Agreements http://www.tco.ac.ir/law/English/agreements/General/Contract%20Law/C.htm \n" +
                "\n" +
                "25. Contracts, http://206.127.69.152/jgretch/crj/211/ch7.ppt\n" +
                "\n" +
                "26. Business & Personal Law. Chapter 7. “How Contracts Arise”, http://yucaipahigh.com/schristensen/lawweb/lawch7.ppt\n" +
                "\n" +
                "27. Types of Contracts, http://cmsu2.cmsu.edu/public/classes/rahm/meiners.con.ppt");

        List<String> ProgramElectiveTwo = Arrays.asList("PAVEMENT DESIGN",
                "BUILDING CONSTRUCTION PRACTICE",
                "TRANSPORT OF WATER AND WASTEWATER",
                "PIPELINE ENGINEERING",
                "SURFACE HYDROLOGY",
                "MASONRY STRUCTURES",
                "WOOD STRUCTURES",
                "CONCRETE TECHNOLOGY",
                "ADVANCED STRUCTURAL ANALYSIS",
                "SOIL MECHANICS-||",
                "ENVIRONMENTAL IMPACT ASSESSMENT AND LIFE CYCLE ANALYSIS",
                "GROUNDWATER ENGINEERING",
                "STRUCTURAL DYNAMICS",
                "GEOGRAPHIC INFORMATION SYSTEMS AND SCIENCE",
                "CIVIL ENGINEERING DESIGN-||",
                "PUBLIC TRANSPORTATION SYSTEMS",
                "TRAFFIC ENGINEERING AND MANAGEMENT",
                "FOUNDATION ENGINEERING",
                "STRUCTURAL ANALYSIS BY MATRIX METHOD",
                "STRUCTURAL MECHANICS",
                "REINFORCED CONCRETE",
                "DECISION AND RISK ANALYSIS",
                "DESIGN OF CONCRETE STRUCTURES-|",
                "ENVIRONMENTAL FLUID MECHANICS",
                "UNSTEADY OPEN CHANNEL FLOW",
                "ENVIRONMENTAL LAWS AND POLICY",
                "ROCK MECHANICS",
                "EARTHQUAKE ENGINEERING",
                "TRANSIENTS IN CLOSED CONDUITS",
                "URBAN HYDROLOGY AND HYDRAULICS",
                "STRUCTURAL ANALYSIS-||");

        List<String> ProgramElectiveThree = Arrays.asList("PAVEMENT DESIGN",
                "BUILDING CONSTRUCTION PRACTICE",
                "TRANSPORT OF WATER AND WASTEWATER",
                "PIPELINE ENGINEERING",
                "SURFACE HYDROLOGY",
                "MASONRY STRUCTURES",
                "WOOD STRUCTURES",
                "CONCRETE TECHNOLOGY",
                "ADVANCED STRUCTURAL ANALYSIS",
                "SOIL MECHANICS-||",
                "ENVIRONMENTAL IMPACT ASSESSMENT AND LIFE CYCLE ANALYSIS",
                "GROUNDWATER ENGINEERING",
                "STRUCTURAL DYNAMICS",
                "GEOGRAPHIC INFORMATION SYSTEMS AND SCIENCE",
                "CIVIL ENGINEERING DESIGN-||",
                "PUBLIC TRANSPORTATION SYSTEMS",
                "TRAFFIC ENGINEERING AND MANAGEMENT",
                "FOUNDATION ENGINEERING",
                "STRUCTURAL ANALYSIS BY MATRIX METHOD",
                "STRUCTURAL MECHANICS",
                "REINFORCED CONCRETE",
                "DECISION AND RISK ANALYSIS",
                "DESIGN OF CONCRETE STRUCTURES-|",
                "ENVIRONMENTAL FLUID MECHANICS",
                "UNSTEADY OPEN CHANNEL FLOW",
                "ENVIRONMENTAL LAWS AND POLICY",
                "ROCK MECHANICS",
                "EARTHQUAKE ENGINEERING",
                "TRANSIENTS IN CLOSED CONDUITS",
                "URBAN HYDROLOGY AND HYDRAULICS",
                "STRUCTURAL ANALYSIS-||");

        List<String> ProjectFirst = Arrays.asList("Project-|");

        List<String> EntrepreneurshipThree = Arrays.asList("Summer Entrepreneurship-|||");

        List<Semester> seventhSemesters = new ArrayList<>();
        seventhSemesters.add(new Semester("Graduate Employability Skills And Competitive Courses(GATE,IES,ETC)", GraduateEmployabilitySkills));
        seventhSemesters.add(new Semester("Professional Practice, Law of Ethics", ProfessionalPracticeLawOfEthics));
        seventhSemesters.add(new Semester("Program Elective-||", ProgramElectiveTwo));
        seventhSemesters.add(new Semester("Program Elective-|||", ProgramElectiveThree));
        seventhSemesters.add(new Semester("Project-|", ProjectFirst));
        seventhSemesters.add(new Semester("Summer Entrepreneurship-|||", EntrepreneurshipThree));

        branches.add(new Branch("Semester 7", seventhSemesters));
        //7 Semester complete......




        //8 Semester Starting.......
        List<String> OpenElective = Arrays.asList("Choose ANY ONE Subject : \n" +
                "\n" +
                "Metro Systems and Engineering \n" +
                "\n" +
                "GENERAL: Overview of Metro Systems; Need for Metros; Routing studies; Basic Planning and Financials\n" +
                "\n" +
                "CIVIL ENGINEERING-Overview and construction methods for: Elevated and underground Stations; Viaduct spans and bridges; Underground tunnels; Depots; Commercial and Service buildings. Initial Surveys & Investigations; Basics of Construction Planning & Management, Construction Quality & Safety Systems.  Traffic integration, multimodal transfers and pedestrian facilities; Environmental and social safeguards; Track systems-permanent way. Facilities Management\n" +
                "\n" +
                "ELECTRONICS AND COMMUNICATION ENGINEERING- Signaling systems; Automatic fare collection; Operation Control Centre (OCC and BCC); SCADA and other control systems; Platform Screen Doors.\n" +
                "\n" +
                " \n" +
                "\n" +
                "MECHANICAL & TV + AC: Rolling stock, vehicle dynamics and structure; Tunnel Ventilation systems; Air conditioning for stations and buildings; Fire control systems; Lifts and Escalators\n" +
                "\n" +
                "ELECTRICAL: OHE, Traction Power; Substations- TSS and ASS; Power SCADA; Standby and Back-up systems; Green buildings, Carbon credits and clear air mechanics.\n" +
                "\n" +
                "Economic Policies in India\n" +
                "\n" +
                "Detailed contents\n" +
                "\n" +
                "Module 1                                                                                                                            Lecture 10 hrs.\n" +
                "\n" +
                "Framework of Indian Economy: National Income - Trends and Structure of National Income, Demographic Features and Indicators of Economic Growth, Development Rural-Urban Migration and issues related to Urbanization, Poverty debate and Inequality, Nature, Policy and Implications, Unemployment-Nature, Central and State Government’s policies, policy implications, Employment trends in Organized and Unorganized Sector\n" +
                "\n" +
                "Module 2                                                                                                                            Lecture 10 hrs.\n" +
                "\n" +
                "Development Strategies in India: Agricultural- Pricing, Marketing and Financing of Primary Sector, Economic Reforms- Rationale of Economic Reforms, Liberalization, Privatization and Globalization of the Economy, Changing structure of India’s Foreign Trade, Role of Public Sector- Redefining the role of Public Sector, Government Policy towards Public Sector, problems associated with Privatization, issues regarding Deregulation-Disinvestment and future of Economic Reforms\n" +
                "\n" +
                "Module 3                                                                                                                             Lecture 10 hrs.\n" +
                "\n" +
                "The Economic Policy and Infrastructure Development: Energy and Transport, Social Infrastructure- Education, Health and Gender related issues, Social Inclusion, Issues and policies in Financing Infrastructure Development, Indian Financial System- issues of Financial Inclusion, Financial Sector Reforms-review of Monetary Policy of R.B.I. Capital Market in India.\n" +
                "\n" +
                "Module 4                                                                                                                             Lecture 10 hrs.\n" +
                "\n" +
                "The Economic Policy and Industrial Sector: Industrial Sector in Pre-reforms period, Growth and Pattern of Industrialization, Industrial Sector in Post-reform period- growth and pattern of Micro, Small, Medium Enterprises s, problems of India’s Industrial Exports, Labor Market- issues in Labor Market Reforms and approaches to Employment Generation.\n" +
                "\n" +
                "Text Books\n" +
                "\n" +
                "Dhingra, Ishwar C. [2006],’Indian Economy,’ Sultan Chand and Sons, New Delhi.\n" +
                "\n" +
                "Datt, Ruddar and Sundaram, K.P.M. [Latest edition] ,’Indian Economy,’ S. Chand and Co, New Delhi.\n" +
                "\n" +
                "Reference Books\n" +
                "\n" +
                "1. Brahmananda, P.R. and V.A. Panchmukhi. [2001], Ed. ‘Development Experience in Indian Economy, Inter-state Perspective,’ Bookwell, New Delhi.\n" +
                "\n" +
                "2. Gupta,S.P. [1989],’Planning and Development in India: A Critique,’ Allied Publishers Private Limited, New Delhi.\n" +
                "\n" +
                "3. Bhagwati, Jagdish. [2004],’In Defense of Globalization,’ Oxford University Press, U.K.");




        List<String> ProgramElectiveFour = Arrays.asList("Choose ANY ONE Subject : \n" +
                "\n" +
                "Urban Transportation Planning: Urban morphology - Urbanization and travel demand –\n" +
                "Urban activity systems and travel patterns – Systems approach – Trip based and Activity\n" +
                "based approach - Urban Transportation Planning – Goals, Objectives and Constraints -\n" +
                "Inventory, Model building, Forecasting and Evaluation - Study area delineation – Zoning -\n" +
                "UTP survey; Trip generation models – Trip classification - productions and attractions – Trip\n" +
                "rate analysis - Multiple regression models - Category analysis - Trip distribution models –\n" +
                "Growth factor models, Gravity model and Opportunity modes; Modal split models – Mode\n" +
                "choice behavior – Trip end and trip interchange models - Probabilistic models - Utility\n" +
                "functions - Logit models - Two stage model. Traffic assignment – Transportation networks –\n" +
                "Minimum Path Algorithms - Assignment methods – All or Nothing assignment, Capacity\n" +
                "restrained assignment and Multi path assignment - Route-choice behavior; Land use\n" +
                "transportation models – Urban forms and structures - Location models - Accessibility – Land\n" +
                "use models - Lowry derivative models - Quick response techniques - Non-Transport\n" +
                "solutions for transport problems; Preparation of alternative plans - Evaluation techniques -\n" +
                "Plan implementation - Monitoring - Financing of Project – urban development planning\n" +
                "policy - Case studies.\n" +
                "Prerequisite:\n" +
                "\n" +
                "Geometric Design of Highways: Introduction: Classification of rural highways and urban\n" +
                "roads. Objectives and requirements of highway geometric design; Design Controls:\n" +
                "Topography, vehicle characteristics and design vehicle, driver characteristics, speed, traffic\n" +
                "flow and capacity, levels of service, pedestrian and other facilities, environmental factors;\n" +
                "Design Elements: Sight distances, Horizontal alignment - design considerations, stability at\n" +
                "curves, super elevation, widening, transition curves; curvature at intersections, vertical\n" +
                "alignment - grades, ramps, design of summit and valley curves, combination of vertical and\n" +
                "horizontal alignment including design of hair pin bends, design of expressways, IRC\n" +
                "standards and guidelines for design problems; Cross Section Elements: Right of way and\n" +
                "width considerations, roadway, shoulders, kerbs traffic barriers, medians, frontage roads;\n" +
                "Facilities for pedestrians, bicycles, buses and trucks, Pavement surface characteristics - types,\n" +
                "cross slope, skid resistance, unevenness; Design Considerations: Design considerations for\n" +
                "rural and urban arterials, freeways, and other rural and urban roads; Design Of Intersections:\n" +
                "Characteristics and design considerations of at-grade intersections;; Rotary intersections;\n" +
                "Grade separations and interchanges -; Design of Parking lots Prerequisite:\n" +
                "\n" +
                "Contracts Management. Contract Management – Introduction, Importance of Contracts,\n" +
                "Overview of Contract Management, Overview of Activities in Contract Management;\n" +
                "Planning and People- Resource Management; Types of Contracts, Parties to a Contract;\n" +
                "Contract Formation, Formulation of Contract, Contract Start-Up, Managing Relationships;\n" +
                "Common contract clauses (Notice to proceed, rights and duties of various parties, notices to\n" +
                "be given, Contract Duration and Price. Performance parameters; Delays, penalties and\n" +
                "liquidated damages; Force Majeure, Suspension and Termination. Changes &amp; variations,\n" +
                "Notices under contracts; Conventional and Alternative Dispute Resolution methods. Various\n" +
                "Acts governing Contracts; Contract Administration and Payments- Contract Administration,\n" +
                "\n" +
                "\n" +
                "Payments; Contract Management in Various Situations- Contract Management in NCB\n" +
                "Works, Contract Management in ICB Works Contracts, Contract of Supply of Goods-\n" +
                "Design, Supply and Installation Contracts, Contract Management in Consultancy,; Managing\n" +
                "Risks and Change- Managing Risks, Managing Change; Contract Closure and Review-\n" +
                "Ending a Contract, Post-Implementation Review; Legal Aspects in Contract Management-\n" +
                "Contract Management Legal View, Dispute Resolution, Integrity in Contract Management;\n" +
                "Managing Performance- Introduction, Monitoring and Measurement\n" +
                "\n" +
                "\n" +
                "Physico-Chemical Processes for water and wastewater treatment. The Objective of this\n" +
                "course is to provide an in depth understanding of physical and physico-chemical processes\n" +
                "used for water and wastewater treatment systems and to provide capability to design such\n" +
                "systems. Water purification in natural systems, physical processes, chemical processes and\n" +
                "biological processes. Primary, secondary and tertiary treatment. Unit operations, unit\n" +
                "processes. Aeration and gas transfer. Sedimentation, different types of settling, sedimentation\n" +
                "tank design. Coagulation and flocculation, coagulation processes, stability of colloids,\n" +
                "destabilization of colloids, destabilization in water and wastewater treatment, transport of\n" +
                "colloidal particles, design aspects. Filtration: filtration processes, Hydraulics of flow through\n" +
                "porous media, Rate control patterns and methods, Filter effluent quality parameters,\n" +
                "mathematical model for deep granular filters, slow sand filtration, rapid sand filtration,\n" +
                "precoat filtration, design aspects. Disinfection: Types of disinfectants, Kinetics of\n" +
                "disinfection, chlorination and its theory, Design of Chlorinators. Precipitation: Hardness\n" +
                "removal, Iron, Mn, and heavy metal removal; Adsorption, adsorption equilibria and\n" +
                "adsorption isotherm, rates of adsorption, Sorption kinetics in batch reactors, continuous\n" +
                "reactors, factors affecting adsorption. Ion Exchange-exchange processes, materials and\n" +
                "reactions, methods of operation, Application, design aspects. Membrane Processes, Reverse\n" +
                "osmosis, Ultrafiltration, Electrodyalisis\n" +
                "\n" +
                "\n" +
                "River Engineering: Knowledge about river behavior is essential for practicing hydraulic and\n" +
                "water resources engineers. River Morphology (Bars; Bends and Meanders, Thalweg;\n" +
                "Braiding; Bifurcations etc.); Sediment Transport Mechanics (Bed forms, Bed Load transport,\n" +
                "Transport of suspended sediment, Critical Shear stress, Sediment Transport Equations);\n" +
                "Aggradation and Degradation; Local Scour at Bridge Piers and other Hydraulic Structures.\n" +
                "Measurements in Rivers (Stage measurements, Channel geometry, Discharge, Sediment\n" +
                "samplers and suspended and bed load measurement), Physical river Models (fixed and\n" +
                "movable bed models; sectional models, distorted Models), Mathematical models for\n" +
                "aggradations, degradation and local scour, River Protection and Training Works\n" +
                "(Revetments, Dikes, Gabions, Spurs, Bank Protective measures and Bed control structures),\n" +
                "Design of river training and flood protection structures, Diversion and Cofferdams; River\n" +
                "regulations systems; Dredging and Disposal, River restoration\n" +
                "\n" +
                "\n" +
                "Water Resources Field Methods. Scientific principles of measurement technologies and\n" +
                "protocols used for water-resources measurements and experimental design of field-scale\n" +
                "water-resources and environmental studies. Planning field studies; instruments and protocols\n" +
                "for surface-water, ground-water, and water-quality sampling; description of data quality.\n" +
                "One-half-day laboratory field trips to streamflow monitoring stations and groundwater\n" +
                "monitoring wells nearby.\n" +
                "Prerequisite:\n" +
                "\n" +
                "\n" +
                "Design of Concrete Structures-II. Design of continuous beams and building frames,\n" +
                "Moment redistribution, Estimation of wind and seismic loads, Desirable features of\n" +
                "earthquake resistant construction, Detailing for earthquake resistant construction – ductility\n" +
                "criteria; Water tank and staging; Introduction, Design criteria, Design of rectangular and\n" +
                "circular water tank, Design of\n" +
                "Intze tank, Staging for overhead tank; Introduction to bridge engineering, Investigation for\n" +
                "bridges, IRC loadings, Design of slab culvert; Design of Masonry walls and columns;\n" +
                "Prestressed concrete, Introduction, pre-stressing system, losses in pre-stress, Design of\n" +
                "simple span girders, Design of end block; Design of staircases; Design of cantilever and\n" +
                "counterforte type retaining wall; All design steps/process to as per the most recent BIS code\n" +
                "of practices Prerequisite:\n" +
                "\n" +
                "\n" +
                "Prestressed Concrete. Study of strength, behavior, and design of prestressed reinforced\n" +
                "concrete members and structures, with primary emphasis on pretensioned, precast\n" +
                "construction; emphasis on the necessary coordination between design and construction\n" +
                "techniques in prestressing.\n" +
                "Prerequisite:\n" +
                "\n" +
                "\n" +
                "Geotechnical Design.Subsurface site evaluation; integrated design of retaining walls,\n" +
                "foundations, pavements, and materials for airports, highways, dams, or other facilities.\n" +
                "Prerequisite:\n" +
                "Reference books:\n" +
                "• Analysis and Design of Substructures: Limit State Design by Swami Saran\n" +
                "Upon completion of the course, the student would be:\n" +
                "• Well acquainted with the various investigation specifications as per the infrastructure\n" +
                "to be build on the proposed site.\n" +
                "• knowing about the properties of materials required for the constructing a desired\n" +
                "infrastructure\n" +
                "familiar with design concepts of various foundation systems \uF0B7 familiar with design of\n" +
                "transportation facilities\n" +
                "\n" +
                "\n" +
                "Systems Engineering &amp; Economics: Introduction to the formulation and solution of civil\n" +
                "engineering problems. Major topics are: engineering economy, mathematical modeling, and\n" +
                "optimization. Techniques, including classical optimization, linear and nonlinear\n" +
                "programming, network theory, critical path methods, simulation, decision theory, and\n" +
                "dynamic programming are applied to a variety of civil engineering problems. Prerequisite:");



        List<String> ProgramElectiveFive = Arrays.asList("Choose ANY ONE Subject : \n" +
                "\n" +
                "Intelligent Transportation Systems: Introduction to Intelligent Transportation Systems\n" +
                "(ITS) – Definition of ITS and Identification of ITS Objectives, Historical Background,\n" +
                "Benefits of ITS - ITS Data collection techniques – Detectors, Automatic Vehicle Location\n" +
                "(AVL), Automatic Vehicle Identification (AVI), Geographic Information Systems (GIS),\n" +
                "video data collection. Telecommunications in ITS – Importance of telecommunications in the\n" +
                "ITS system, Information Management, Traffic Management Centres (TMC). Vehicle – Road\n" +
                "\n" +
                "\n" +
                "side communication – Vehicle Positioning System; ITS functional areas – Advanced Traffic\n" +
                "Management Systems (ATMS), Advanced Traveler Information Systems (ATIS),\n" +
                "Commercial Vehicle Operations (CVO), Advanced Vehicle Control Systems (AVCS),\n" +
                "Advanced Public Transportation Systems (APTS), Advanced Rural Transportation Systems\n" +
                "(ARTS); ITS User Needs and Services – Travel and Traffic management, Public\n" +
                "Transportation Management, Electronic Payment, Commercial Vehicle Operations,\n" +
                "Emergency Management, Advanced Vehicle safety systems, Information Management;\n" +
                "Automated Highway Systems - Vehicles in Platoons – Integration of Automated Highway\n" +
                "Systems. ITS Programs in the World – Overview of ITS implementations in developed\n" +
                "countries, ITS in developing countries.\n" +
                "Prerequisite:\n" +
                "\n" +
                "Pavement Materials. Soil - Classification, characteristics, compaction, evaluation of soil\n" +
                "strength; stabilized pavement materials; Aggregates: requirements, properties and tests on\n" +
                "road aggregates for flexible and rigid pavements. Bitumen: Origin, preparation, properties\n" +
                "and tests, constitution of bituminous road binders; requirements; Criterion for selection of\n" +
                "different binders. Bituminous Emulsions and Cutbacks: Preparation, characteristics, uses and\n" +
                "tests, Bituminous Mixes: Mechanical properties: Resilient modulus, dynamic modulus and\n" +
                "fatigue characteristics of bituminous mixes. bituminous mix design methods and\n" +
                "specifications. Weathering and Durability of Bituminous Materials and Mixes. Performance\n" +
                "based Bitumen Specifications; Superpave mix design method: design example problems.\n" +
                "Cement Concrete for Pavement Construction: Requirements, and design of mix for CC\n" +
                "pavement, IRC and IS specifications and tests, joint filler and sealer materials. Prerequisite:\n" +
                "\n" +
                "Basics of Computational Hydraulics. Derivation of governing equations for flow and\n" +
                "transport in surface and sub-surface (saturated and unsaturated flow); Equations for reactive\n" +
                "transport; Coupled surface and sub-surface flow models; Basics of finite difference, finite\n" +
                "element and finite volume methods (consistency, stability, convergence, order of accuracy,\n" +
                "computational efficiency); application of numerical methods for solving flow and transport\n" +
                "equations, fully coupled and iteratively coupled models; Model simplification, Parameter\n" +
                "estimation (Model calibration and validation), Computational Fluid Dynamics (CFD)\n" +
                "software for three-dimensional turbulent flow modeling, Software for sub-surface flow\n" +
                "simulation\n" +
                "\n" +
                "Port and Harbour Engineering: Harbour Planning: Types of water transportation, water\n" +
                "transportation in India, requirements of ports and harbours, classification of harbours,\n" +
                "selection of site and planning of harbours, location of harbour, traffic estimation, master plan,\n" +
                "ship characteristics, harbour design, turning basin, harbour entrances, type of docks, its\n" +
                "location and number, Site investigations – hydrographic survey, topographic survey, soil\n" +
                "investigations, current observations, tidal observations; Docks and Repair Facilities: Design\n" +
                "and construction of breakwaters, berthing structures - jetties, fenders, piers, wharves,\n" +
                "dolphins, trestle, moles, Harbour docks, use of wet docks, design of wet docks, repair docks,\n" +
                "lift docks, dry docks, keel and bilge blocking, construction of dry docks, gates for dry docks,\n" +
                "pumping plant, floating docks, slipways, locks, size of lock, lock gates, types of gates;\n" +
                "\n" +
                "\n" +
                "Navigational Aids: Requirements of signals, fixed navigation structures, necessity of\n" +
                "navigational aids, light houses, beacon lights, floating navigational aids, light ships, buoys,\n" +
                "radar; Dredging and Coastal Protection: Classification, types of dredgers, choice of dredger,\n" +
                "uses of dredged materials, coastal erosion and protection, sea wall, revetment, bulkhead,\n" +
                "coastal zone and beach profile; Port facilities: Port development, port planning, port building\n" +
                "facilities, transit sheds, warehouses, cargo handling facilities, container handling terminal\n" +
                "facilities, shipping terminals, inland port facilities. Inland waterways, Inland water\n" +
                "transportation in India, classification of waterways, economics of inland waterways\n" +
                "transportation, national waterways.\n" +
                "Prerequisite:\n" +
                "\n" +
                "\n" +
                "Railway Engineering. Railway track gauge, alignment of railway lines, engineering surveys\n" +
                "and construction of new lines, tracks and track stresses; rails, sleepers; ballast; subgrade and\n" +
                "formation, rack fittings and fastenings, creep of rails, geometric design of track, curves and\n" +
                "super-elevation, points and crossings, track junctions and simple track layouts; rail joints and\n" +
                "welding of rails; track maintenance, track drainage; modern methods of track maintenance,\n" +
                "rehabilitation and renewal of track; tractive resistance and power, railway stations and yards;\n" +
                "railway tunneling; signaling and interlocking; maintenance of railways and high speed trains.\n" +
                "Prerequisite:\n" +
                "\n" +
                "Structural Geology. Description, classification, and origin of earth structures. Ways in\n" +
                "which the continental crust can deform; link scales of structure from the field, outcrops, hand\n" +
                "specimen, thin section by integrating analytical techniques with practical examples.\n" +
                "Theoretical and meso to microscale analysis of structures developed through a linked series\n" +
                "of lectures and practicals; practical 2D strain analysis; 3D strain concepts; incremental strain,\n" +
                "kinematics and polyphase deformations; fold construction and classes; fault evolution and\n" +
                "section balancing; fault rock microstructures; fault and fold mechanics, current concepts in\n" +
                "plate tectonics, cross-section construction techniques, structural interpretation of seismic\n" +
                "data, structural styles in different tectonic settings (thrust and fold belts, rifts, strike and slip,\n" +
                "gravity tectonics, inversion), structural geology of reservoir units.\n" +
                "Prerequisite:\n" +
                "Reference books:\n" +
                "• Ghosh, S.K., Structural Geology: Fundamentals and Modern Developments, Elsevier;\n" +
                "First edition\n" +
                "On successful completion of this course the students will be able to:\n" +
                "• Acquire knowledge on the geometry and type of structures present in earth.\n" +
                "• Understand and describe the features formed in rocks when subjected to stress.\n" +
                "• Understand the impact of structural geology to active tectonic settings\n" +
                "• Understand micro and macro scale deformation mechanisms (viz., brittle, ductile).\n" +
                "• Portray 2D and 3D strain analysis for various deformation behaviours.\n" +
                "• Interpret graphs and models used in structural geology to understand and demonstrate\n" +
                "poly phase deformations.\n" +
                "\n" +
                "\n" +
                "Design of Steel Structures. Properties of materials; loads and stresses, Design of semi-rigid,\n" +
                "rigid and moment resistant connections; Built-up sections Design of tension members\n" +
                "\n" +
                "\n" +
                "subjected to axial tension and bending, splicing of tension member, Design of compression\n" +
                "members, Beam-column connections, Design of columns and their bases Design of flexural\n" +
                "members and Plate girder; loads, specification and design Industrial buildings; loads, design\n" +
                "of purlins, trusses, bracings; gantry girders; Introduction to Plastic analysis; Simple cases of\n" +
                "beams and frames; All design steps/process to as per the most recent BIS code of practices\n" +
                "Prerequisite:\n" +
                "\n" +
                "Civil Engineering Design-I. Concept of design and its contribution to the quality of life;\n" +
                "Civil Engineering Design, the role of geomatics, the environment, and scientific laws in\n" +
                "design; Introduction to the design of buildings and Civil Engineering Infrastructure, site\n" +
                "appraisal; Risk and vulnerability in design; Health and safety in Civil Engineering Design,\n" +
                "environmental impact assessment; Civil Engineering drawing, CAD techniques, introduction\n" +
                "to GIS techniques.\n" +
                "Prerequisite:\n" +
                "\n" +
                "\n" +
                "Industrial Structures. Industrial steel building frames: Types of frames, bracing, crane\n" +
                "girders and columns, workshop sheds, trussed bents, Pressed steel tank, circular tank;\n" +
                "Transmission and Communication towers: Types and configuration, Analysis and design;\n" +
                "Chimneys; Loads and stresses in chimney shaft, Earthquake and wind effect, Stresses due to\n" +
                "temperature difference, combined effect of loads and temperature, temperature. Design of\n" +
                "chimney; Silos and Bunkers; Jassen’s theory, Airy’s theory, Shallow and deep bins,\n" +
                "Rectangular bunkers with slopping bottom, Rectangular bunkers with high side walls; Steel\n" +
                "stacks; introduction, force acting on a steel stack, design consideration, design example of\n" +
                "stacks; Concrete Shell Structures: Folded plate and cylindrical shell structures; Introduction,\n" +
                "structural behaviour of long and short shells, beam and arch action, analysis and design of\n" +
                "cylindrical shell structures, Analysis and design of folded plates; Machine foundations;\n" +
                "introduction, machine vibration, structural design of foundation to rotary machines, impact\n" +
                "machines, vibration characteristics, design consideration of foundation to impact machine,\n" +
                "grillage, pile and raft foundation. Prerequisite:\n" +
                "\n" +
                "\n" +
                "Construction Cost Analysis. Introduction to the application of scientific principles to costs\n" +
                "and estimates of costs in construction engineering; concepts and statistical measurements of\n" +
                "the factors involved in direct costs, general overhead costs, cost markups and profits; and the\n" +
                "fundamentals of cost recording for construction cost accounts and cost controls. Prerequisite:");



        List<String> ProgramElectiveSix = Arrays.asList("Choose ANY ONE Subject : \n" +
                "\n" +
                "\n" +
                "Hydraulic Modeling: The main objective of this course is to introduce various concepts\n" +
                "which will help in designing physical hydraulic models. Basics of Hydraulic Modelling\n" +
                "(similarity mechanics, model laws, distinction between numerical and hydraulic models,\n" +
                "classification of hydraulic modelling, materials used in the model, scale effect, design,\n" +
                "construction, operation and interpretation of the results); Role of instrumentation and data\n" +
                "processing; Gravity dominated models (modelling of energy dissipaters, overflow spillways,\n" +
                "siphon spillways, bridge piers, vortex formation, cavitation, flow induced vibrations);\n" +
                "Gravity friction models: (pumped flow models, ship models, surge tank models); Friction\n" +
                "dominated models; River models with fixed and mobile bed; Basin and reservoir models;\n" +
                "Tidal models with fixed and mobile bed; estuarine models; harbor and breakwater models,\n" +
                "models of offshore structures; Hybrid and Analogue models; Scope and limitations of\n" +
                "hydraulic modelling, complementary aspects of numerical and hydraulic modelling.\n" +
                "\n" +
                "\n" +
                "Biological processes for contaminant removal.Understanding of basics of microbiology,\n" +
                "metabolism and energetic, bio kinetic parameter, reactors and reactor analyses.\n" +
                "Characterization of waste. Aerobic, anaerobic and anoxic systems. Suspended and attached\n" +
                "growth biological systems. Activated Sludge processand process modifications, Process\n" +
                "design considerations, Treatment Ponds and aerated Lagoons, aerobic pond, facultative pond,\n" +
                "anaerobic ponds, polishing ponds, constructed wet lands etc. Attached Growth Biological\n" +
                "Treatment Systems, Trickling Filters, Rotating Biological Contactors, Activated Biofilters,\n" +
                "Moving bed biological reactor (MBBR), Sequential Batch reactors (SBR), Membrane\n" +
                "Biological Reactors (MBR) etc. Anaerobic processes, Process fundamentals, Standard, high\n" +
                "rate and hybrid reactors, Anaerobic filters, Expanded /fluidized bed reactors, Upflow\n" +
                "anaerobic sludge blanket reactors, Performance and design aspects, Expanded granular bed\n" +
                "reactors, Two stage/phase anaerobic reactors. Sludge Digestion, anaerobic digestion, aerobic\n" +
                "digestion\n" +
                "\n" +
                "\n" +
                "Rural water supply and onsite sanitation systems. Attributes of water supply systems,\n" +
                "drinking water quality. Relationships between diseases and water quality, hygiene and\n" +
                "sanitation. Need for water treatment. Point of use water treatment systems, filters, bio-sand\n" +
                "filters, disinfection systems for rural areas, chlorination, Solar disinfection systems, removal\n" +
                "\n" +
                "of arsenic, fluoride and iron.Onsite sanitation systems: Nexus between water quality and\n" +
                "\n" +
                "sanitation. Importance of hydrogeology on selection of onsite sanitation systems, Design of\n" +
                "\n" +
                "Septic tanks, single pit and double pit toilets. Small bore systems, bio digesters, reed beds,\n" +
                "constructed wetlands, sludge/septage management systems.\n" +
                "\n" +
                "Construction Engineering Materials. Design, production, application, specification, and\n" +
                "quality control of construction materials unique to civil engineering. Stones, bricks, mortars,\n" +
                "Plain, Reinforced &amp; Prestressed Concrete, Construction Chemicals; Structural Steel, High\n" +
                "Tensile Steel, Carbon Composites; Plastics in Construction; 3D printing; Recycling of\n" +
                "Construction &amp; Demolition wastes Prerequisite:\n" +
                "\n" +
                "Solid and hazardous waste management. Solid Wastes: Origin, Analysis, Composition and\n" +
                "Characteristics. Integrated Solid Waste Management System: Collection, Storage,\n" +
                "Segregation, Reuse and Recycling possibilities, Transportation, Treatment / Processing and\n" +
                "Transformation Techniques, Final Disposal. Management of: Municipal, Biomedical,\n" +
                "Nuclear, Electronic and Industrial Solid Wastes and the rules and regulations. Introduction to\n" +
                "Hazardous wastes, Definition of Hazardous waste, The magnitude of the problem; Hazardous\n" +
                "waste: Risk assessment, Environmental legislation, Characterization and site assessment,\n" +
                "Waste minimization and resource recovery, Transportation of hazardous waste, Physical,\n" +
                "chemical and biological treatment, Ground water contamination, Landfill disposal, Current\n" +
                "Management Practices, Environmental audit, Pollution Prevention, Facility Development and\n" +
                "operation, Site Remediation: Quantitative risk assessment, site and subsurface\n" +
                "characterization, Containment, remedial alternatives.\n" +
                "\n" +
                "\n" +
                "Bridge Engineering. General; classification of bridges, site selection, geometric and\n" +
                "hydraulic design consideration, loading standards for highway and railway bridges, general\n" +
                "design consideration; optimum spans; Concrete bridges: culverts; Slab, T-beam, box girder\n" +
                "bridges, balanced cantilever bridge, cable stayed bridge, extrados bridges; arch bridge;\n" +
                "Special requirements for Prestressed Concrete bridges; Steel bridges: plate girder bridge,\n" +
                "truss bridge, suspension cable bridge, cable stayed bridge; Substructures: design of piers and\n" +
                "abutments, pile and well foundations, bearings and expansion joints, special wearing coats;\n" +
                "seismic design considerations; Aerodynamic stability considerations; special durability\n" +
                "measures; provisions for inspection and maintenance; Prerequisite:\n" +
                "\n" +
                "\n" +
                "Design of Structural Systems. The whole structural design process including definition of\n" +
                "functional requirements, selection of structural scheme, formulation of design criteria,\n" +
                "preliminary and computer- aided proportioning, and analysis of response, cost, and value.\n" +
                "Prerequisite:\n" +
                "\n" +
                "\n" +
                "Offshore Engineering. Introduction to offshore structures, codes of practice, offshore\n" +
                "project management, deep water, offshore site investigations, geophysical methods; offshore\n" +
                "sediment sampling, in-situ testing, geological aspects; development of design stratigraphies.\n" +
                "Prerequisite:");


        List<String> ProjectTwo = Arrays.asList("Project-II");


        List<Semester> eightSemesters = new ArrayList<>();
        eightSemesters.add(new Semester("Open Elective", OpenElective));
        eightSemesters.add(new Semester("Program Elective-IV", ProgramElectiveFour));
        eightSemesters.add(new Semester("Program Elective-V", ProgramElectiveFive));
        eightSemesters.add(new Semester("Program Elective-VI", ProgramElectiveSix));
        eightSemesters.add(new Semester("Project-II", ProjectTwo));

        branches.add(new Branch("Semester 8", eightSemesters));






        return branches;
    }
}


