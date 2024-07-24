package com.example.beuengineers.Syllabus;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beuengineers.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EceActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BranchAdapter branchAdapter;
    List<Branch> branchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        branchList = getBranches();
        branchAdapter = new BranchAdapter(branchList, this);
        recyclerView.setAdapter(branchAdapter);
    }


    private List<Branch> getBranches() {
        List<Branch> branches = new ArrayList<>();

        //1 Semester
        List<String> Chemistry = Arrays.asList("Module-1\n" +
                "Atomic and Molecular Structure(10 Lectures)\n" +
                "Atomic structure and its properties at atomic and sub-atomic level, Failure of classical theories to explain properties of particles, Molecular orbitals of diatomic molecules and graphs of multicentre orbitals, Principal for combination of atomic orbita;s to form molecular orbitals, Schodinger equation, Photoelectric effect and Heisenberg uncertainty principle, Dual nature of electromagnetic radiation, Planks theory, Band structure, Electromagnetic radiation, Crystal field theory and the energy level diagram for transition metals ions and their magnetic properties.\n" +
                "\n" +
                "Module-2\n" +
                "Spectroscopic Technique and its Applications (8 Lectures)\n" +
                "Principal of vibrational and rotational spectroscopy and selection rules for application in diatomic molecules, Elementary idea for elecctronic spectroscopy. UV-VIS Spectroscopy with related rules and its applications. Fluorescence and its application in medicines. Basic principle of Nuclear magnetic resonance and its applications. Basics of magnetic resonance imaging.\n" +
                "\n" +
                "Module-3\n" +
                "Intermolecular forces and properties of Gases (4 Lectures)\n" +
                "Ionic, Dipolar and Vanderwalls interactions. Equations of stste of ideal and real gases, Deviation from ideal behaviour. Vanderwalls Gas Equation.\n" +
                "\n" +
                "Module-4\n" +
                "Use of free energy in chemical equilibriya and water chemistry (8 Lecture)\n" +
                "Thermodynamics functions: Energy, Enthalpy,Free energy. Equation to interrelate thermodynamics properties. Free Energy, EMF, and Cell potentials, The Nearst equation and its applications, Corrosion, Use of free energy considerations in metallurgy through ellingham diagrams. Solubility equilibria. Water chemistry hard and soft water, Parameretrs of quality of water to be used in different industries as for drinking water. Calculations of hardness of water in all units. Estimation of hardness using EDTA and Alkalinity methode. Removal of hardness by Sodalime and ion exchange methode including Zeolite Methode.\n" +
                "\n" +
                "Module-5\n" +
                "Periodic properties (4 Lectures)\n" +
                "Effective Nuclear charge, Penetration of orbitals, Vibrations of s,p,d,and f orbitals energies of atom in the periodic table. Electronic configuration, Atomic and ionic size, Ionization energies,Polarisation,Acid,Base,Principal of HSAB theory, Oxidation states, Hybridisation and Moecular geometry.\n" +
                "\n" +
                "Module-6\n" +
                "Stereochemistry (4 Lectures)\n" +
                "Representation of 3-D structures, Structural Isomersand stereoisomers, Diastereomers,Optical activity, Configuration and symmetry and chirality,enantiomers,Absolute configurations and confirmational analysis.\n" +
                "\n" +
                "Module-7\n" +
                "Organic reactions and synthesis of drugs moleculed (4 lectures)\n" +
                "Introduction to intermediates and reaction involving substitution, Addition, Elimination, Oxidation-Reductions. Diels Elders cuclization and epoxide ring opening reactiion. Synthesis of a commonly used drug molecules like Aspirin.\n" +
                "\n" +
                "Practicals:\n" +
                "Choose any 10-12 experiments from below\n" +
                "1. Determination of surface tension and viscosity.\n" +
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
                "15. Use of capillary viscisimeter to the demonstrate of the iso electric point as the PH of minimum viscosity..");

        List<String> MathFirst = Arrays.asList("Module-1\n" +
                "Calculus-I ( 6 Lectures )\n" +
                "Evolutes and involutes, Evaluation of definite and improper integrals, Beta and Gama functions anf their properties, Application of definite integrals to evaluate surface area and volume of revolutions.\n" +
                "\n" +
                "Module-2\n" +
                "Calculus-II( 6 Lectures )\n" +
                "Rolles theorem, Mean value theorem, Taylor and Maclaurin theorems with remainders, Intermediate forms and L-hospital rules, Maxima and Minima.\n" +
                "\n" +
                "Module-3\n" +
                "Sequence and Series ( 10 Lectures )\n" +
                "Convergence of sequence and series,Test for convergence, Power series, Taylor series, Series for Exponential, Trigonomertic and logarithmic functions, Fourier series: Half range sine and cosine series, Parsevals theorem.\n" +
                "\n" +
                "Module-4\n" +
                "Multivariable Calculus ( Differentiation )( 8 Lectures )\n" +
                "Limit continuty and partial Derivatives, Directional Derivatives, Total Derivatives, Tangent plane and Normal line, Maxima minima and saddle points, Methode of Lagrangemultipliers, Gradient, Curl, and Divergence.\n" +
                "\n" +
                "Module-5\n" +
                "Multivariable Calculus ( Integration ) ( 7 Lectures )\n" +
                "Multiple Integration: Double and triple integrals (Cartesian and Polar), Change of order of integration in double integrals, change of variables ( Cartesian to Polar ), Applications: Areas and volumes by ( double integration ) Center of mass and Gravity ( constant and variable densities ). Theorems of Green, Gauss and Stokes, Orthogonal Curvilinear coordinates, Simple applications involving Cubes, Sphere and Rectangular Parallelepipeds.\n" +
                "\n" +
                "Module-6\n" +
                "First Order Ordinary Differential Equation ( 3 Lectures )\n" +
                "Exact, Linear and Bernoulli’s equations, Euler’s equations, Equations not of first degree: Equations solvable for P, Equations solvable for Y, Equations solvable for X and cCairaut’s type\n" +
                "\n" +
                "Module-7\n" +
                "Ordinary Differential Equation of Higher Order and partial differential Equation (1st Order) ( 6 Lectures )\n" +
                "Second order linear differential equations with variable coefficients, Method of variation of parameters, Cauchy-Euler Equation; Power Series solutions; Legendre polynomials, Bessel functions of the first kind and their properties.\n" +
                "First order partial differential equations, Solution of first order Linear and Non-linear PDE..");

        List<String> Pps = Arrays.asList("Module-1\n" +
                "Introduction to Programming ( 6 Lectures)\n" +
                "Introduction to components of a computer system (Disks, Memory, Processor, where a program is stored and executed, Operating system, Compilers etc). Idea of Algorithm: steps to solve logical and numerical problems. Representation of Algorithm: flowchart/pseudo code with examples. from algorithms to programs; source code, variables (with data types) variables and memory locations, type casting/type conversion, run time environment (Static, Dynamic location), Storage classes (auto, Register, static, extern), syntax and logical errors in compilation, object and executable code\n" +
                "\n" +
                "Module-2\n" +
                "Operators & Conditional branching and loops (7 Lectures)\n" +
                "Arithmetic expressions/Arithmetic operators/Relational operators/Logical operators/Bitwise operators and Precedence\n" +
                "Writing and evaluation of Conditionals and consequent branching, Iteration and loops.\n" +
                "\n" +
                "Module-3\n" +
                "Arrays (4 Lectures)\n" +
                "Array declaration and Initialisation, Bound checking arrays (1-D, 2-D), character array and Strings.                                                  \n" +
                "\n" +
                "Module-4\n" +
                "Basic Algorithms (6 Lectures)\n" +
                "Searching (Linear search, Binary search etc.), Basic Sorting Algorithms ( Bubble, Insertion and Selection ), finding roots of equations, Notion of order of complexity through example programs (no formal definition required)          \n" +
                "\n" +
                "Module-5\n" +
                "Function (4 Lectures)\n" +
                "Introduction and writing functions, Scope of variables functions ( Including using fault in libraries ) Parameter passing in functions, Call by values, assing arrays to functios: Idea of call by reference.\n" +
                "\n" +
                "Module-6\n" +
                "Recursion ( 5 Lectures)\n" +
                "Recursion, as a different way of solving problems. Example programs, such as finding Factorial, Fibonacci series, Reverse a string using recursion, and GCD of two numbers, Ackerman function etc. Quick sort or Merge sort.\n" +
                "\n" +
                "Module-7\n" +
                "Structure/Union ( 3 Lectures )\n" +
                "Structures, Accessing structure elements, Way of storage of structure elements, Defining structures and arrays of structures, Basic definition of Union, Comparison B/W Structure & Union with examples.\n" +
                "\n" +
                "Module-8\n" +
                "Pointers ( 5 Lectures )\n" +
                "Idea of pointers, Defining pointers, Use of pointers in self-referential structures, Notion of linked list (no implementation), Pointer to pointer, Pointer to array, Pointer to strings, Array of pointer, Pointer to function, Pointer to structure.\n" +
                "\n" +
                "Module-9\n" +
                "File Handling\n" +
                "( Only If time is available, Otherwise should be done as part of the LAB )                                                  \n" +
                "\n" +
                "LAB :\n" +
                "Problem solving using computers\n" +
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
                "11. File handling ( File Operations )..");

        List<String> Workshop = Arrays.asList("Module-1\n" +
                "Lectures ans videos(10 Lectures )\n" +
                "1. Manufacturing methods- Casting, Forming, Machining, Joining Advanced manufacturing methods.\n" +
                "2. CNC Machining, Additive Manufacturing.\n" +
                "3. Fitting Operations and Power tools.\n" +
                "4. Carpentary\n" +
                "5. Plastic Moulding, Glass cutting.\n" +
                "6. Metal Casting\n" +
                "7. Welding (Arc welding and Gas welding Brazing, soldering )\n" +
                "\n" +
                "Module-2\n" +
                "Workshop Practice ( 60 hours )\n" +
                "1. Machine shop and Fitting shop( 18 hrs )\n" +
                "2. Carpentary( 6 hrs )\n" +
                "3. Welding shop ( Arc welding + Gas welding )( 8 hrs )\n" +
                "4. Casting and smithy( 6 hrs )\n" +
                "5. Plastic Moulding and Glass cutting( 6 hrs )\n" +
                "6. 3-Printing of different models ( 8 hrs )..");

        List<String> English = Arrays.asList("Module-1\n" +
                "Vocabulary Building\n" +
                "A. The concept of word formation\n" +
                "B. Root words from foreign languages and their use in English.\n" +
                "C. Acquantance with prefixes and suffixes from foreign languages in English to from derivatives.\n" +
                "D. Synonyms, Antonyms and standard abbreviations.\n" +
                "E. Affixes, Acronyms\n" +
                "\n" +
                "Module-2\n" +
                "Basic writing skills\n" +
                "A. Sentences structures.\n" +
                "B. Use of phrases and Clauses in sentences.\n" +
                "C. Importance og proper Punctuation.\n" +
                "D. Kinds of sentences.\n" +
                "E. Use of Tense, Use in context and coherenceof tensein writing.\n" +
                "F. Use of voice-Active /Passive in sentences.\n" +
                "G. Use of speech-Direct and Indirect speech.\n" +
                "H. Framing questions- Direct,Using modal verbs.\n" +
                "\n" +
                "Module-3\n" +
                "Identifying common Errors in writing\n" +
                "A. Subject-Verb agreement.\n" +
                "B. Noun-Pronoun agreement.\n" +
                "C. Misplaced modifiers\n" +
                "D. Articles\n" +
                "E. Prepositions, Redundancies,Cliches.\n" +
                "F. Common english errors\n" +
                "Module-4\n" +
                "Nature and style of sensible writing\n" +
                "A. Describing\n" +
                "B. Defining\n" +
                "C. Classifying\n" +
                "D. Providing examples or evidence\n" +
                "E. Writing introduction and conclusion\n" +
                "F. Organising principle of paragraphs in documents\n" +
                "G. Argument, Describing/ Narrating/ Planning,Defining,Classifying\n" +
                "H. Lexical resources, using suitabble language register.\n" +
                "I. Coherence, writing introduction,body and conclusion techniques\n" +
                "for writing precisely,grammar and accuracy.\n" +
                "\n" +
                "Module-5\n" +
                "Writing practices\n" +
                "A. Comprehension\n" +
                "B. Formal letter writing/application/Report writing/writing minutes of meetings.\n" +
                "C. Essay writing\n" +
                "D. Formal Email writing\n" +
                "E. Resume/ CV writing /Cover letter\n" +
                "F. Statement of purpose\n" +
                "\n" +
                "Module-6\n" +
                "Oral communication\n" +
                "( This unit involves interactive practices in language Lab. )\n" +
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
                "M. Coherence and Fluency in speech.\n" +
                "\n" +
                "Module-7\n" +
                "Reading skills\n" +
                "A. Reading comprehension\n" +
                "B. Paragraph reading based on phonetic sounds / Innotation\n" +
                "\n" +
                "\n" +
                "\n" +
                "PROFESSIONAL SKILLS\n" +
                "A. Team Building\n" +
                "B. Soft skill and entiquettes\n" +
                "\n" +
                "\n" +
                "\n" +
                "ACQUANTANCE WITH TECHNOLOGY-AIDED LANGUAGE LEARNING\n" +
                "A. Use of computer softwares ( Grammarly Ginger.........)\n" +
                "B. Use of smartphone applications ( Duolingo, Bussu......)\n" +
                "\n" +
                "Module-8\n" +
                "Activities\n" +
                "A. Narrative chain\n" +
                "B. Describing / Narrating\n" +
                "C. Writing essay in relay\n" +
                "D. Peer / Group activities\n" +
                "E. Brain storming vocabulary\n" +
                "F. Debates");

        List<Semester> firstSemesters = new ArrayList<>();
        firstSemesters.add(new Semester("Chemistry", Chemistry));
        firstSemesters.add(new Semester("Mathematics-1(Calculus and Differential Equation)", MathFirst));
        firstSemesters.add(new Semester("Programming for Problem Solving", Pps));
        firstSemesters.add(new Semester("Workshop Manufacturing practice", Workshop));
        firstSemesters.add(new Semester("English", English));

        branches.add(new Branch("Semester 1", firstSemesters));
        //1st Semester Complete........



        //2 Semester Start.......
        List<String> BEE = Arrays.asList("Module-1\n" +
                "DC Circuits ( 8 Lectures )\n" +
                "Electrical Circuit elements (R, L and C), Voltage and Current sources, Kirchhoff current and voltage Laws, Analysis of simple circuits with DC excitation. Star-Delta conversion, Network theorems (Superposition, Thevenin, Norton and Maximum power transfer theorems). Time-domain analysis of first order RL and RC circuits\n" +
                "\n" +
                "Module-2\n" +
                "AC Circuits ( 8 Lectures )\n" +
                "Representation of sinusoidal waveforms, Peak, rms and Average values (Form factor and Peak factor), Impedance of series and parallel circuit, Phasor representation, Real Power, Reactive Power, Apparent Power, Power Factor, Power Triangle. Analysis of single-phase Ac circuits consisting of R, L, C, RL, RC, RLC Combinations (Series and Parallel), Resonance. Three-Phase Balanced Circuits, Voltage and current relations in Star and Delta connections\n" +
                "\n" +
                "Module-3\n" +
                "Magnetic Circuits ( 4 Lectures )\n" +
                "Introduction, Series and Parallel Magnetic circuits, Analysis of Series and Parallel magnetic circuits.                                            \n" +
                "\n" +
                "Module-4\n" +
                "Transformers ( 6 Lectures )\n" +
                "Magnetic Materials, B-H characteristics, Ideal and Practical Transformer, EMF equation, Equivalent Circuit, Losses in transformers, Regulation and efficiency. Auto-transformer and Three-Phase Transformer connections.\n" +
                "\n" +
                "Module-5\n" +
                "Electrical Machines (10 Lectures )\n" +
                "Construction, Working, Torque-Speed characteristic and speed control of separately excited DC Motor. Generation of rotating Magnetic Fields, Construction and working of a ThreePhase induction Motor, Significance of Torque-Slip characteristic. Loss components and efficiency, Starting and speed control of induction Motor. Construction and working of synchronous Generators.\n" +
                "\n" +
                "Module-6\n" +
                "Electrical Installations ( 6 Lectures )\n" +
                "Components of L-t Switchgear: Switch Fuse Unit (SFU), MCB, ELCB, MCCB, Types of wires and cables, Earthing. Types of Batteries, Important characteristics for Batteries. Elementary calculations for energy consumption, Power factor improvement and Battery backup.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested books\n" +
                "1. D. P. KOTHARI AND I. J. NAGRATH, “BASIC ELECTRICAL ENGINEERING”, TATA MCGRAW HILL, 2010.\n" +
                "2. D. C. KULSHRESHTHA, “BASIC ELECTRICAL ENGINEERING”, MCGRAW HILL, 2009.\n" +
                "3. L. S. BOBROW, “FUNDAMENTALS OF ELECTRICAL ENGINEERING”, OXFORD UNIVERSITY PRESS, 2011.\n" +
                "4. BASIC ELECTRICAL ENGINEERING BY FITZERALD..");

        List<String> EGD = Arrays.asList("Traditional Engineering Graphics\n" +
                "Principles of Engineering Graphics; Orthographic Projection; Descriptive Geometry; Drawing Principles; Isometric Projection; surface Development; Perspective; Reading a Drawing; Sectional Views; Dimensioning & Tolerances; True Length, Angle; Intersection, Shortest Distance\n" +
                "\n" +
                "Computer Graphics\n" +
                "Engineering Graphics Software; Spatial Transformations; Orthographic Projections; Model viewing; Co-ordinate systems; Multi-view projection; Exploded assembly; Model viewing; Animation; Spatial manipulation; Surface Modelling; sSlid Modelling, Introduction to Building Information Modelling (BIM).\n" +
                "\n" +
                "Module-1\n" +
                "Introduction to Engineering Drawing\n" +
                "Principles of Engineering Graphics and their significance, Usage of Drawing Instruments, Lettering, Conic sections including the rectangular Hyperbola (General method only); Cycloid, Epicycloid, Hypocycloid and Involute; Scales – Plain, Diagonal and Vernier Scales\n" +
                "\n" +
                "Module-2\n" +
                "Orthographic projections\n" +
                "principles of orthographic projections- Conventions-Projections of points and Lines inclined to both Planes, projections of planes inclined planes Auxiliary Planes.\n" +
                "\n" +
                "Module-3\n" +
                "Projections of Regular Solids\n" +
                "Those inclined to both the Planes-Auxiliary views, Draw simple Annotation, Dimensioning and scale floor plains that include: Windows, Doors and Fixtures such as WC, Bath, Sink, Shower, etc.\n" +
                "\n" +
                "Module-4\n" +
                "Sections and Sectional views of Right Angular Solids\n" +
                "Covering, Prism, Cylinder, Pyramid, Cone – Auxiliary views; Development of surfaces of Right Regular Solids- Prism, Pyramid, cylinder and Cone; Draw the sectional Orthographic views of Geometrical Solids, Objects from industry and Dwellings ( Foundation to Slab only )\n" +
                "\n" +
                "Module-5\n" +
                "Isometric Projections\n" +
                "Principles of Isometric projection – Isometric Scale, Isometric views, Conventions; Isometric views of Lines, Planes, Simple and compound solids; Conversion of isometric views to Orthographic views and vice-versa, Conventions\n" +
                "\n" +
                "Module-6\n" +
                "Overview of Computer Graphics\n" +
                "Listing the computer Technologies that impact on Graphical Communication, Demonstrating knowledge of the theory of CAD Software [ such as: The Menu system, Toolbars ( Standard, Object properties, Draw, Modify and Dimension), Drawing Area ( Background, Crosshairs, Coordinate system ), dialog boxes and windows, Shortcut menus (Button bars), The command line (where applicable ), The status bar, Different methods of zoom as used in CAD, Select and erase objects. Isometric views of Lines, Planes, Simple and Compound Solids ]\n" +
                "\n" +
                "Module-7\n" +
                "Customisation and CAD Drawing\n" +
                "Consisting of set up of the drawing page and the printer, Including scale settings, Setting up of units and Drawing Limits; ISO and ANSI Standards for coordinate Dimensioning and Tolerancing; Orthographic constraints, Snap to objects manually and automatically; Producing drawings by using various coordinate input entry methods to draw straight lines, Applying various ways of Drawing Circles.\n" +
                "\n" +
                "Module-8\n" +
                "Annotaions, Layering and Other Functions\n" +
                "Covering applying Dimensions to objects, Applying annotations to drawings; Setting up and use of layers, Layers to create drawings, Create, Edit and use customized layers; Changing line lengths through modifying existing lines ( extend/lengthen ); Printing documents to paper using the print command; Orthographic projection techniques; Drawing sectional views of composite right regular geometric solids and project the true shape of the sectioned surface; Drawing annotation, Computer-Aided Design ( CAD ) software modeling of parts and assemblies. Parametric and Non-Parametric solid, Surface, and Wireframe models. Part editing and Two-Dimensional documentation of models. Planar projection theory, Including sketching of perspective, Isometric, Multiview, Auxiliary and section views. Spatial visualization exercises. Dimensioning guidelines, Tolerancing techniques; Dimensioning and scale multi views of Dwelling.\n" +
                "\n" +
                "Module-9\n" +
                "Demonstration of a sample Team Design project that Illustrates\n" +
                "Geometry and Topology of Engineered Components: Creation of Engineering models and their presentation in standard 2-D Blueprint form and as 3-D wireframe and shaded solids; Meshed Topologies for Engineering Analysis and Toolpath Generation for Component Manufacture; Geometric Dimensioning and Tolerancing; Use of solid-modeling software for creating associative models at the component and assembly levels. Floor plans that include: Windows, Doors, and Fixtures such as WC, Bath, Sink, Shower, etc. Applying colour coding according to building drawing practice; Drawing sectional elevation showing foundation to ceiling; Introduction to Building Information Modelling ( BIM ).\n" +
                "\n" +
                "BOOKS\n" +
                "1.BHATT N.D., PANCHAL V.M. & INGLE P.R., (2014), ENGINEERING DRAWING, CHAROTAR PUBLISHING HOUSE\n" +
                "2. SHAH, M.B. &RANA B.C. (2008), ENGINEERING DRAWING AND COMPUTER GRAPHICS, PEARSON EDUCATION\n" +
                "3. AGRAWAL B. & AGRAWAL C. M. (2012), ENGINEERING GRAPHICS, TMH PUBLICATION\n" +
                "4. NARAYANA, K.L. & P KANNAIAH (2008), TEXT BOOK ON ENGINEERING DRAWING, SCITECHPUBLISHERS..");

        List<String> MatheSecond = Arrays.asList("Module-1\n" +
                "Matrices (10 Lectures )\n" +
                "ALGEBRA OF MATRICES, INVERSE AND RANK OF A MATRIX, RANK-NULLITY THEOREM; SYSTEM OF LINEAR EQUATIONS; SYMMETRIC, SKEW-SYMMETRIC AND ORTHOGONAL MATRICES; DETERMINANTS; EIGENVALUES AND EIGENVECTORS; DIAGONALIZATION OF MATRICES; CAYLEY-HAMILTON THEOREM, ORTHOGONAL TRANSFORMATION AND QUADRATIC TO CANONICAL FORMS.\n" +
                "\n" +
                "Module-2\n" +
                "Numerical Methods-I ( 10 Lectures )\n" +
                "SOLUTION OF POLYNOMIAL AND TRANSCENDENTAL EQUATIONS – BISECTION METHOD, NEWTON-RAPHSON METHOD AND REGULA-FALSI METHOD. FINITE DIFFERENCES, INTERPOLATION USING NEWTON’S FORWARD AND BACKWARD DIFFERENCE FORMULAE. CENTRAL DIFFERENCE INTERPOLATION: GAUSS’S FORWARD AND BACKWARD FORMULAE. NUMERICAL INTEGRATION: TRAPEZOIDAL RULE AND SIMPSON’S 1/3RD AND 3/8 RULES.\n" +
                "\n" +
                "Module-3\n" +
                "Numerical Methods-II ( 10 Lectures )\n" +
                "ORDINARY DIFFERENTIAL EQUATIONS: TAYLOR’S SERIES, EULER AND MODIFIED EULER’S METHODS. RUNGE- KUTTA METHOD OF FOURTH ORDER FOR SOLVING FIRST AND SECOND ORDER EQUATIONS. MILNE’S AND ADAM’S PREDICATOR-CORRECTOR METHODS. PARTIAL DIFFERENTIAL EQUATIONS: FINITE DIFFERENCE SOLUTION TWO DIMENSIONAL LAPLACE EQUATION AND POISSON EQUATION, IMPLICIT AND EXPLICIT METHODS FOR ONE DIMENSIONAL HEAT EQUATION (BENDER-SCHMIDT AND CRANK-NICHOLSON METHODS), FINITE DIFFERENCE EXPLICIT METHOD FOR WAVE EQUATION.\n" +
                "\n" +
                "Module-4\n" +
                "Transform Calculus ( 10 Lectures )\n" +
                "LAPLACE TRANSFORM, PROPERTIES OF LAPLACE TRANSFORM, LAPLACE TRANSFORM OF PERIODIC FUNCTIONS. FINDING INVERSE LAPLACE TRANSFORM BY DIFFERENT METHODS, CONVOLUTION THEOREM. EVALUATION OF INTEGRALS BY LAPLACE TRANSFORM, SOLVING ODES AND PDES BY LAPLACE TRANSFORM METHOD. FOURIER TRANSFORMS..");

        List<String> WavePHY = Arrays.asList("Module-1\n" +
                "Waves ( 3 Lectures )\n" +
                "Mechanical and electrical Simple Harmonic Oscillators, Damped Harmonic Oscillator, Forced mechanical and Electrical oscillators, Impedance, Steady State motion of forced Damped Harmonic Oscillator\n" +
                "\n" +
                "Module-2\n" +
                "NON-DISPERSIVE TRANSVERSE AND LONGITUDINAL WAVES (4 LECTURES)\n" +
                "Transverse wave on a string, The wave equation on a string, Harmonic waves, Reflection and transmission of waves at a boundary, Impedance matching, Standing waves and their Eigen Frequencies, Longitudinal waves and the wave equation for them, Acoustics waves\n" +
                "\n" +
                "Module-3\n" +
                "LIGHT AND OPTICS (3 LECTURES)\n" +
                "Light as an Electromagnetic wave and Fresnel equations, Reflectance and transmittance, Brewster’s angle, Total internal reflection, and evanescent wave. Mirrors and lenses and optical instruments based on them\n" +
                "\n" +
                "Module-4\n" +
                "WAVE OPTICS (5 LECTURES)\n" +
                "Huygen's Principle, Superposition of waves and interference of light by wavefront splitting and amplitude Splitting; Young’s double slit experiment, Newton’s rings, Michelson interferometer, Mach Zehnder interferometer. Farunhofer diffraction from a single slit and a circular aperture, The rayleigh criterion for limit of resolution and its application to vision; Diffraction gratings and their resolving power\n" +
                "\n" +
                "Module-5\n" +
                "LASERS ( 5 Lectures )\n" +
                "Einstein’s theory of matter Radiation interaction and a and b coefficients; Amplification of light by population inversion, different types of lasers: Gas lasers (he-ne, co2), Solid-state Lasers (Ruby, Neodymium), Dye Lasers; Properties of Laser Beams: Mono-Chromaticity\n" +
                "\n" +
                "Module-6\n" +
                "INTRODUCTION TO QUANTUM MECHANICS (5 LECTURES)\n" +
                "Wave nature of particles, Time-Dependent and Time-Independent Schrodinger equation for wave function, Born interpretation, Probability current, Expectation values, Free-particle wave function and wave-packets, Uncertainty principle\n" +
                "\n" +
                "Module-7\n" +
                "SOLUTION OF WAVE EQUATION (6 LECTURES)\n" +
                "Solution of Stationary-State Schrodinger equation for One Dimensional problems–particle in a box, Particle in attractive Delta-function potential, Square-well potential, Linear Harmonic oscillator. scattering from a potential Barrier and Tunneling; Related examples like Alpha- decay, Field-ionization and scanning tunneling Microscope, Tunneling in semiconductor structures. Three Dimensional problems: Particle in three Dimensional box and related examples..\n" +
                "\n" +
                "Module-8\n" +
                "INTRODUCTION TO SOLIDS AND SEMICONDUCTORS (9 LECTURES)\n" +
                "Free electron theory of metals, Fermi level, Density of states in 1, 2 and 3 Dimensions, Bloch’s theorem for particles in a periodic potential, Kronigpenney model and origin of energy bands.Types of electronic materials: Metals, Semiconductors, and Insulators. Intrinsic and extrinsic semiconductors, Dependence of fermi level on carrier concentration and temperature (equilibrium carrier statistics), Carrier generation and recombination, Carrier transport: Diffusion and Drift, P-N Junction..");


        List<Semester> secondSemesters = new ArrayList<>();
        secondSemesters.add(new Semester("Basic Electrical Engineering", BEE));
        secondSemesters.add(new Semester("Engineering Graphics and Design", EGD));
        secondSemesters.add(new Semester("MATHEMATICS-II (Linear Algebra, Transform Calculus and Numerical Methods)", MatheSecond));
        secondSemesters.add(new Semester("Physics (Waves, Optics and Introduction to Quantum Mechanics)", WavePHY));

        branches.add(new Branch("Semester 2", secondSemesters));
        //2nd Semester End......



        //3 Semester Start.....
        List<String> NetworkTheory = Arrays.asList("Module-1\n" +
                "Introduction ( 8 Lectures )\n" +
                "Introduction to signals, their classification and properties, different types of systems, LTI systems and their properties, periodic waveforms and signal synthesis, properties and applications of Laplace transform.\n" +
                "\n" +
                "Module-2\n" +
                "System Modeling ( 8 Lectures )\n" +
                "System modeling in terms of differential equations and transient response of R, L, C, series and parallel circuits for impulse, step, ramp, sinusoidal and exponential signals by classical method and using Laplace transform.\n" +
                "\n" +
                "Module-3\n" +
                "Graph Theory ( 10 Lectures )\n" +
                "Concept of tree, Tie-set matrix, Cut-set matrix and application to solve electric networks. Two port networks – Introduction of two port parameters and their interconversion, Interconnection of two 2-port networks, Open circuit and Short circuit impedances and ABCD constants, Relation between image impedances and Short circuit and Open circuit impedances.\n" +
                "\n" +
                "Module-4\n" +
                "Network Functions ( 10 Lectures )\n" +
                "Network functions, their properties and concept of transfer impedance, Hurwitz polynomial ,Positive real function and synthesis of LC, RC, RL Networks in Foster’s I and II, Cauer’s I and II forms.\n" +
                "\n" +
                "Module-5\n" +
                "Introduction to passive filter and classification ( 4 Lectures )\n" +
                "Introduction of passive filter and their classification, frequency response, Characteristic impedance of low pass, high pass, Band Pass and Band reject prototype section.\n" +
                "\n" +
                "Module-6\n" +
                "BOOKS\n" +
                "Suggested books\n" +
                "1. “Engineering Circuit Analysis”, by W H Hayt, TMH Eighth Edition\n" +
                "2. “Network analysis and synthesis”, by F F Kuo, John Weily and Sons, 2nd Edition\n" +
                "3. “Circuit Theory”, by S Salivahanan, Vikas Publishing House 1st Edition, 2014\n" +
                "4. “Network analysis”, by M. E. Van Valkenburg, PHI, 2000..");

        List<String> SignalsSystems = Arrays.asList("Module-1\n" +
                "Introduction to Signal and System ( 10 Lectures )\n" +
                "Definition, classification of systems, standard test signal, properties of system, properties of linear system, Properties: linearity: additivity and homogeneity, Shift-invariance, Causality.\n" +
                "\n" +
                "Module-2\n" +
                "Linear time-invariant (LTI) systems ( 7 Lectures )\n" +
                "Linear time-invariant (LTI) systems, impulse response and step response, convolution, Characterization of causality and stability of linear time-invariant systems. System representation through differential equations and difference equations.\n" +
                "\n" +
                "Module-3\n" +
                "Laplace transformation\n" +
                "Laplace transform of some important function, Shift theorem and its application, Laplace transform of periodic signals, Functional analysis of response, Initial and Final value theorems, Response to periodic sinusoidal excitation, Region Of Convergence, Poles and Zeros of system, Laplace domain analysis, Solution to differential equations.\n" +
                "\n" +
                "Module-4\n" +
                "Analysis of Fourier Methods ( 9 Lectures )\n" +
                "Fourier series expansion, Functional symmetry condition, Exponential form of Fourier series, Fourier integral and Fourier transform, Multiplication and their effect in the frequency domain, Magnitude and Phase response, DTFT, Parseval’s Theorem.\n" +
                "\n" +
                "Module-5\n" +
                "Z-transformation ( 5 Lectures )\n" +
                "Z transform of Discrete time signal, LTI system, solution of difference equation, Application of Z transform to open loop system, Region Of Convergence, z-domain analysis..");

        List<String> OOPS = Arrays.asList("Module-1\n" +
                "Introduction to C++ ( 3 Hrs )\n" +
                "Introduction to C++ : Object Oriented Technology, Advantages of OOP, Input- output in C++, Tokens, Keywords, Identifiers, Data Types C++, Derives data types. The void data type, Type Modifiers, Typecasting, Constant, Operator, Precedence of Operators, Strings.\n" +
                "\n" +
                "Module-2\n" +
                "Control Structures and Functions\n" +
                "Control Structures and Functions: Decision making statements like if-else, Nested if-else, goto, break, continue, switch case, Loop statement like for loop, nested for loop, while loop, do-while loop. Parts of Function, User- defined Functions, Value- Returning Functions, void Functions, Value Parameters, Function overloading, Virtual Functions.\n" +
                "\n" +
                "Module-3\n" +
                "Classes and Data Abstraction\n" +
                "Structure in C++, Class, Build- in Operations on Classes, Assignment Operator and Classes, Class Scope, Reference parameters and Class Objects (Variables), Member functions, Accessor and Mutator Functions, Constructors, default Constructor, Destructors.\n" +
                "\n" +
                "Module-4\n" +
                "Overloading, Templates and Inheritance ( 8 Hrs )\n" +
                "Operator Overloading, Function Overloading, Function Templates, Class Templates. Single and Multiple Inheritance, virtual Base class, Abstract Class, Pointer and Inheritance, Overloading Member Function.\n" +
                "\n" +
                "Module-5\n" +
                "Pointers, Arrays and Exception Handling ( 11 Hrs )\n" +
                "Pointers, Arrays and Exception Handling: Void Pointers, Pointer to Class, Pointer to Object, Void Pointer, Arrays. The keywords try, throw and catch. Creating own Exception Classes, Exception Handling Techniques (Terminate the Program, Fix the Error and Continue, Log the Error and Continue), Stack Unwinding..");

        List<String> MathThird = Arrays.asList("Module-1\n" +
                "Polynomials ( 6 Lectures )\n" +
                "Orthogonal Polynomials –Lagrange’s, Chebysev Polynomials; Trigonometric Polynomials; Wavelet transforms : properties, methods, inverses and their applications.\n" +
                "\n" +
                "Module-2\n" +
                "Sets, relations and functions ( 10 Lectures )\n" +
                "Sets, relations and functions: Basic operations on sets, Cartesian products, disjoint union (sum), and power sets. Different types of relations, their compositions and inverses. Different types of functions: Ber and Bei functions; recurrence relations, orthogonality properties.\n" +
                "\n" +
                "Module-3\n" +
                "Introduction to Graphs ( 6 Lectures )\n" +
                "Graphs and their basic properties – degree, path, cycle, subgraph, isomorphism, Eulerian and Hamiltonian walk, trees.\n" +
                "\n" +
                "Module-4\n" +
                "Basic Statistics ( 10 Lectures )\n" +
                "Measures of Central tendency: Moments, skewness and Kurtosis ; Probability distributions - Binomial, Poisson and Normal ; evaluation of statistical parameters for these three distributions, Correlation and regression – Rank correlation.\n" +
                "\n" +
                "Module-5\n" +
                "Applied Statistics ( 10 Lectures )\n" +
                "Curve fitting by the method of least squares- fitting of straight lines, second degree parabolas and more general curves. Test of significance: Large sample test for single proportion, difference of proportions, single mean, difference of means, and difference of standard deviations..");

        List<String> BasicElectronics = Arrays.asList("Module-1\n" +
                "PN junction diode ( 8 Hrs )\n" +
                "Depletion layer, Barrier potential, Forward and Reverse bias, Breakdown voltage, I-V characteristics of PN junction diode, Knee voltage, Ideal PN junction diode, Diode capacitances, Breakdown diodes (Avalanche and Zener diode). Photodiode and Light Emitting Diode.\n" +
                "\n" +
                "Module-2\n" +
                "Rectifiers and filters ( 8 Hrs )\n" +
                "Half wave and Full wave rectifiers (Centre-tap and Bridge), Regulation, Ripple factor, R-C, L-C and Pi filters. Clipping and Clamping circuits, Voltage multiplier.\n" +
                "\n" +
                "Module-3\n" +
                "BJT ( 10 Lectures )\n" +
                "Basic theory and Operation of PNP and NPN transistors, Characteristics of C-B, C-E and C-C configuration. Biasing : Base bias, Emitter feedback bias, Voltage divider bias, Load line, Operating point, Incremental analysis using hybrid model.\n" +
                "\n" +
                "Module-4\n" +
                "FET ( 8 Hrs )\n" +
                "Introduction, Operation, I-V characteristics, JFET parameters, JFET amplifiers. MOSFET: Introduction, Operation, MOSFET parameters.\n" +
                "\n" +
                "Module-5\n" +
                "Integrated circuit ( 8 Hrs )\n" +
                "Characteristics of an ideal Operational Amplifier. Application as inverting, noninverting amplifiers. Summer, Difference Amplifier, Differentiator, Integrator. Feedback Amplifiers.\n" +
                "\n" +
                "BOOKS\n" +
                "A. “Electronic devices and circuit theory” by Boylestead and Nashelsky, Pearson                                 \n" +
                "B. “Electronic principle” by Albert Malvino and Davis J Bates, TMH\n" +
                "C. “Integrated Electronics”, By Jacob Millman and Christos Halkias..");

        List<String> ElectricalElectronicsMaterials = Arrays.asList("Module-1\n" +
                "Atomic structure and bonding in materials ( 8 Hrs )\n" +
                "Crystal structure of materials, Crystal systems, Unit cells and space lattices, Determination of structures of simple crystals by X-ray diffraction, Miller indices of planes and directions, Packing geometry in Metallic, Ionic and Covalent solids. Concept of amorphous, single and polycrystalline structures and their effect on properties of materials. Crystal growth techniques. Imperfections in crystalline solids and their role in influencing various properties.\n" +
                "\n" +
                "Module-2\n" +
                "Band theory of Solids ( 5 Hrs )\n" +
                "Energy band diagram, E – K Diagram, Reduced E – K Diagram, Insulators, Semiconductors & Conductors.\n" +
                "\n" +
                "Module-3\n" +
                "Semiconductor( 10 Lectures )\n" +
                "Single Crystal, Polycrystalline and Amorphous, Fermi – Dirac Distribution, Hall effect, Intrinsic & Extrinsic, N type & P type, Crystal growth – (1) Preparation of electronic grade polycrystal in Siemens reactor,(2) Czochrarlski Method & Float Zone method of bulk single crystal ingot preparation (3) Mirror finished wafer preparation (4) Epitaxial film growth – Chemical Vapor phase Deposition & Liquid Phase Epitaxy (5) Molecular Beam Epitaxy.\n" +
                "\n" +
                "Module-4\n" +
                "Dielectric behavior of materials ( 5 Hrs )\n" +
                "Polarization, Dielectric constant at low frequency & high frequency, Dielectric loss, Piezoelectricity & FerroElectricity.\n" +
                "\n" +
                "Module-5\n" +
                "Magnetic Properties ( 5 Hrs )\n" +
                "Origin of magnetism in metallic and ceramic materials, Paramagnetism, Diamagnetism, Antiferromagnetism, Ferromagnetism, Ferrimagnetism, magnetic hysteresis, Influence of temperature on magnetic behaviour, domains and Hysteresis.\n" +
                "\n" +
                "Module-6\n" +
                "Superconductors ( 4 Hrs )\n" +
                "Low and High temperature (YBaCuO) superconductors, Meissner effect, Applications.\n" +
                "\n" +
                "Module-7\n" +
                "Printed Circuit Board ( 5 Hrs )\n" +
                "Manufacturing process, Single- & Double-sided boards, surface mounted devices.\n" +
                "\n" +
                "BOOKS\n" +
                "A. “Solid State Physics”, by Kittel, McGraw Hill                                 \n" +
                "B. “Principles of Electric Engineering Materials & Devices”, by S.O. Kasp, McGraw Hill.\n" +
                "C.“Structure & properties of materials (VOL VI), Electronic Properties”, by Robert M. Rose, Lawrence A.Shepherd & John Wulf, Wiley Eastern Ltd..");


        List<Semester> thirdSemesters = new ArrayList<>();
        thirdSemesters.add(new Semester("Network Theory", NetworkTheory));
        thirdSemesters.add(new Semester("Signals and Systems", SignalsSystems));
        thirdSemesters.add(new Semester("Object Oriented Programming", OOPS));
        thirdSemesters.add(new Semester("Mathematics-III", MathThird));
        thirdSemesters.add(new Semester("Basic Electronics", BasicElectronics));
        thirdSemesters.add(new Semester("Electrical and Electronics Materials", ElectricalElectronicsMaterials));

        branches.add(new Branch("Semester 3", thirdSemesters));
        //3rd Semester End.....



        //4 Semester Start.....
        List<String> DigitalCircuits = Arrays.asList("Digital Circuits\n" +
                "\n" +
                "Digital Principle : Analog vs Digital, Number system, Computer Codes, Digital Signals, Waveforms Positive and Negative logic, Logic Gate : basic, universal and others, Truth Table, Logic functions, IC Chips, Timing Diagram, Electrical analogy. \n" +
                "\n" +
                "\n" +
                "Boolean laws and theorems : Logic functions, Conversion of logic functions into truth table and vice versa. SOP and POS forms of representation, Canonical form, minterms and maxterms, Simplification of logic functions by theorems and Karnaugh’s map, don’t care conditions. \n" +
                "\n" +
                "\n" +
                "Analysis and synthesis of Combinational logic circuits: Comparators, Multiplexers, Encoder, Decoder, 7 Segment Display, Half Adder and Full Adder, Subtractors, Serial and Parallel Adders, BCD Adder Sequential circuit blocks and latches : Flip-Flops-Race around condition, Master-Slave and Edge triggered SR, JK, D and T Flip Flop, Shift registers, Counters-Synchronous and Asynchronous: Design of ripple counter\n" +
                "\n" +
                "\n" +
                "Timing circuit : Multivibrators, Monostable and Astable timer: LM555 \n" +
                "\n" +
                "\n" +
                "Integrated circuit logic families : RTL, DTL, TTL, CMOS, IIL/I2L (Integrated Injection logic and Emitter Coupled logic). \n" +
                "\n" +
                "\n" +
                "Use of building blocks : Designing larger systems such as Digital-to-Analog\n" +
                "\n" +
                "\n" +
                "Converters (DAC) : Weighted resistors and R-2R, Analog-to-Digital(ADC)- converter, counter and succession. \n" +
                "\n" +
                "\n" +
                "Name of Authors / Books /Publishers\n" +
                "\n" +
                "1 “Digital Fundamentals”, Floyd and Jain., Pearson\n" +
                "\n" +
                "2 “Digital Logic and Computer Design”, M.Morris Mano, Pearson\n" +
                "\n" +
                "3 “Fundamentals of Digital Circuits”, A.Anand Kumar, PHI\n" +
                "\n" +
                "4 “Digital Systems”, Ronald J.Tocci, Neal S.Widmer, Pearson\n" +
                "\n" +
                "Digital Circuits and Systems Lab are according to the theory mentioned above..");

        List<String> AnalogCircuits = Arrays.asList("Analog Circuits\n" +
                "\n" +
                "Small signal amplifiers : CB, CE, CC configurations, hybrid model for transistor at low frequencies, RC coupled amplifiers, mid band model, gain and impedance, comparisons of different configurations, Emitter follower, Darlington pair (derive voltage gain, current gain, input and output impedance). Hybrid-model at high frequencies (pi - model).\n" +
                "\n" +
                "\n" +
                "Multistage Amplifiers : Cascade and Cascode amplifiers, Calculations of gain, impedance and bandwidth. Design of multistage amplifiers. Feedback Amplifiers: Feedback concept, Classification of Feedback amplifiers, Properties of negative Feedback amplifiers, Impedance considerations in different configurations. Analysis of feedback Amplifiers. \n" +
                "\n" +
                "\n" +
                "Field Effect Transistor : Introduction, Classification, FET characteristics, Operating point, Biasing, FET small signal Model, Enhancement and Depletion type MOSFETs, FET Amplifier configurations (CD,CG and CS).\n" +
                "\n" +
                "\n" +
                "Oscillators : Barkhausen criterion , Sinusoidal Oscillators, the RC phaseshift oscillator, resonant circuit Oscillators, a general form of oscillator circuit, the Wien -bridge oscillator, Crystal oscillators, Hartley, Colpitt’s and Clapp’s Oscillator.\n" +
                "\n" +
                "\n" +
                "Power Amplifiers : Power dissipations in transistors, Amplifiers Classification, (Class-A, Class-B, Class-C, Class-AB) Efficiency analysis, Push-Pull and Complementary Push-pull amplifiers, Cross over distortion and Harmonic distortion in Push-Pull amplifier. Tuned amplifiers (single, double and stagger tuned amplifier).\n" +
                "\n" +
                "\n" +
                "Name of Authors / Books /Publishers\n" +
                "\n" +
                "1 “Electronic Devices and Circuit Theory”, Boylestad and Nashelsky, PEARSON PUBLICATION.\n" +
                "\n" +
                "2 “Electronic devices and circuits”, Salivahanan, Suresh Kumar, Vallavaraj, TMH, 1999\n" +
                "\n" +
                "3 “Integrated Electronics, Analog and Digital Circuits and Systems”, J. Millman and Halkias, TMH, 2000\n" +
                "\n" +
                "4 “Micro Electronic Circuits”, Sedra and Smith, Oxford University Press, 2000\n" +
                "\n" +
                "5 “Electronic Devices and Circuits”, David A Bell, Oxford University Press, 2000 Analog Circuits Lab are according to the theory mentioned above..");

        List<String> SemiConductorPhysics = Arrays.asList("Semiconductor Physics and Devices\n" +
                "\n" +
                "Basics of Semiconductor Physics : Semiconductor carrier modellingBonding model, Energy band model, Carriers, Band gap, Carrier properties (Effective mass, Intrinsic carrier concentration, Doping), Density of states, Fermi function, Equilibrium carrier concentration (formula for n and p and np product), Charge neutrality relationship, Determination of Fermi level, Carrier concentration, Temperature dependence. Carrier Action - Drift, Mobility, Drift Current, Resistivity, Diffusion Current, Total current, Relation between the diffusion constants and mobility (Einstein’s relationship), Recombination-Generation (Band- to-Band, R-G Centres, Auger, Impact Ionization). Equation of state, Continuity equation, Minority Carrier Diffusion Equation.\n" +
                "\n" +
                "\n" +
                "PN Junction Diode : Step junction, Built-in potential, Depletion width, Depletion Approximation, Electrostatic relationship (Charge density, Depletion width, Potential, Electric field) for Va = 0, Va ¡ 0 and Va ¿ 0, Ideal Diode Equation (Qualitative and Quantitative derivation : Band Model, Assumptions, Approximation, Boundary condition), Deviation from Ideal (R-G Current, Series resistance, High Level Injection ), Junction Breakdown (Avalanche and Zener), Reverse Bias Junction Capacitance, forward Bias Diffusion Capacitance, Qualitative understanding of Turn on and Turn-off transients. Zener Diode, Tunnel diode, Varactor diode, Schottky diode. \n" +
                "\n" +
                "\n" +
                "Physics and technologies of BJT : Operational considerations, Modes and Configurations, Performance Parameters (Emitter Efficiency, Base Transport Factor, Common Base Current Gain, Common Emitter Current Gain and their derivation for an ideal transistor, Deviation from ideal (Base Width Modulation Punch Through, Avalanche Breakdown, Geometrical effects, R-G current), Small signal modelling. \n" +
                "\n" +
                "\n" +
                "Physics and technologies of FET : JUNCTION FET (Theory of operation, I-V relationship), MOS CAPACITOR (Energy Band diagram, Gate-Voltage relationship, Capacitance-Voltage characteristics), MOSFET (Theory of operation, Threshold voltage, I-V characteristics), NON IDEAL MOS (M-S work function difference, oxide charges, threshold adjustment and considerations) Introduction to UJT, SCR, Triac and Diac (Construction, Working, Characteristics and Application), UJT Relaxation oscillator. \n" +
                "\n" +
                "\n" +
                "Optoelectronic Devices : Photo diodes (PIN and Avalanche), Solar cell, LED, Solid State LASER diodes. \n" +
                "\n" +
                "\n" +
                "Name of Authors / Books /Publishers\n" +
                "\n" +
                "1 “Semiconductor Device Fundamentals”, by R. F. Pierret, Addison-Wesley publishing company, 1996\n" +
                "\n" +
                "2 “Semiconductor Physics and Devices: Basic Principles”, by Donald A. Neamen, 3rd Edition, 2003\n" +
                "\n" +
                "3 “Physics of Semiconductor Devices” S. M. Sze, 2nd edition, 1981 Semiconductor Physics Lab are according to the theory mentioned above..");

        List<String> AnalogCommunication = Arrays.asList("Analog Communication\n" +
                "\n" +
                "Introduction to the communication system : Block diagram of communication system and comparative study of analog and digital communication. \n" +
                "\n" +
                "\n" +
                "Modulation(upward frequency translation) and demodulation (downward frequency translation) and the need for modulation: broad classification of modulation [linear (amplitude-AM) and exponential (frequency-FM and phase-PM)] Generation of double side band (DSB) with carrier, double side band with suppressed carrier (DSB-SC) and single side band with suppressed carrier: Demodulation of double side band with carrier –incoherent detector or envelope detector, peak diode detector, coherent or synchronous detection of DSBSC and single side band with suppressed carrier. \n" +
                "\n" +
                "\n" +
                "Superhetrodyne Receivers : Characteristics , Intermediate Frequency and its advantages, image rejection of the Receiver. Generation of FM signals(direct and indirect methods) and Demodulation. Noise: Different types of Noise, SNR in AM, FM and PM System and use of emphasis Circuit in FM for SNR optimization. Analog pulse modulation : PAM, PWM, PPM and demodulation; comparative study of various analog pulse modulation \n" +
                "\n" +
                "\n" +
                "Name of Authors / Books /Publishers\n" +
                "\n" +
                "1 “Electronic Communication system”, by Kennedy. TMH.\n" +
                "\n" +
                "2 “Communication system”, by Haykin, Wiley\n" +
                "\n" +
                "3 “Communication system”, by Bruce carison . TMH.\n" +
                "\n" +
                "4 “Modern Digital And Analog Communication”, B.P.LATHI Oxford Analog Communication Lab are according to the theory mentioned above..");

        List<String> ElectromagneticTheory = Arrays.asList("Electromagnetic Theory\n" +
                "\n" +
                "Introduction to Vector Algebra, Coordinate Systems and Transformation, Vector Calculus. Electrostatics : Coulomb’s law, Gauss’s law and its applications, the potential functions, Equipotential surface, Poisson’s and Laplace’s equation, Applications (solution for some simple cases), Capacitance, Electrostatic energy, Conductor properties and boundary conditions between dielectricS and dielectric-conductor interface, Uniqueness Theorem.\n" +
                "\n" +
                "\n" +
                "Magnetostatics : Biot-Savart law, Ampere’s circuital law, Curl, Stoke’s theorem, Magnetic flux and magnetic flux density, Energy stored in magnetic field, Ampere’s force law, Magnetic vector potential, Analogy between electric and magnetic field. Maxwell’s equations, Equation of Continuity for time varying field. Inconsistency of Ampere’s circuital law, Maxwell’s equations in differential and integral form.\n" +
                "\n" +
                "\n" +
                "Electromagnetic waves : Solution of wave equation in free space, Uniform plane wave propagation, Uniform plane waves, the wave equation for conducting medium, Wave propagation in lossless medium and in conductive medium, Conductors and dielectrics, Polarization \n" +
                "\n" +
                "\n" +
                "Reflections and Refractions : Reflection by a perfect conductor with normal as well as oblique incidence. Reflection and refraction by perfect dielectrics with normal and oblique incidence. Surface impedance. Poynting vector : Poynting theorem, Instantaneous, Average and Complex Poynting vector, Power loss in a plane conductor. \n" +
                "\n" +
                "\n" +
                "Transmission Lines : Transmission line theory, low loss radio-frequency and UHF transmission line. UHF line as a transformer, voltage step up of the quarter wave transformer. Transmission line chart (Smith Chart). \n" +
                "\n" +
                "\n" +
                "Name of Authors / Books /Publishers\n" +
                "\n" +
                "\n" +
                "1 “Time-harmonic Electromagnetic Fields”, R. F. Harrington, Wiley-IEEE Press, 2001\n" +
                "\n" +
                "2 “Fields and Waves in Communication Electronics”, Ramo, S., Whinnery, J.R., and Van Duzer, T., 3rd Ed., John Wiley and Sons, 1994\n" +
                "\n" +
                "3 “Advanced Engineering Electromagnetics”, Balanis, C.E., Wiley India Pvt. Ltd., Reprint, 2008\n" +
                "\n" +
                "4 “Microwave Engineering”, Pozar, D.M., 3rd Ed., John Wiley and Sons, 2004..");


        List<Semester> fourthSemesters = new ArrayList<>();
        fourthSemesters.add(new Semester("Digital Circuits", DigitalCircuits));
        fourthSemesters.add(new Semester("Analog Circuits", AnalogCircuits));
        fourthSemesters.add(new Semester("Semi-Conductor Physics And Devices", SemiConductorPhysics));
        fourthSemesters.add(new Semester("Analog Communication", AnalogCommunication));
        fourthSemesters.add(new Semester("Electromagnetic Theory", ElectromagneticTheory));

        branches.add(new Branch("Semester 4", fourthSemesters));
        //4th Semester End....


        //5 Semester Start......
        List<String> DigitalSignalProcessing = Arrays.asList("Module-1\n" +
                "Introduction ( 7 Hrs )\n" +
                "Overview of DSP, Basic Elements of DSP system, Advantages of DSP over Analog, Classification of signals, Concept of frequency in continuous time and discrete Continuous time and Discrete time sinusoidal signals.\n" +
                "\n" +
                "Module-2\n" +
                "Discrete time systems ( 6 hours )\n" +
                "Linear time invariant, Response of LTI system convolution sum, description of discrete time system by difference equation and complete solution of difference equation, Implementation of discrete time systems, Correlation of discrete time signals.\n" +
                "\n" +
                "Module-3\n" +
                "LTI System ( 8 hrs )\n" +
                "Transform and its applications to the analysis of LTI Systems.\n" +
                "\n" +
                "Frequency domain representation of LTI Systems.\n" +
                "\n" +
                "Module-4\n" +
                "Discrete Fourier transform ( 9 Hrs )\n" +
                "Discrete Time Fourier Transform, Properties of DTFT.\n" +
                "\n" +
                "Discrete Fourier series, Discrete Fourier transform, Properties of DFT, FFT.\n" +
                "\n" +
                "Module-5\n" +
                "( 5 Lectures )\n" +
                "Sampling and reconstruction of Analog signals.\n" +
                "\n" +
                "Module-6\n" +
                "( 5 Hrs )\n" +
                "Digital filter structure: FIR and IIR designs.\n" +
                "\n" +
                "-->\n" +
                "BOOKS\n" +
                "Suggested books\n" +
                "1. “Digital Signal Processing” by Proakis and Manolakis, Pearson\n" +
                "2. “Digital Signal Processing” by Ingle and Proakis, Thomson\n" +
                "3. “Digital Time Signal Processing” by Oppenheim and Schafer, Pearson\n" +
                "4. “Digital Signal Processing : Computer Based Approach” by Mitra, TMH\n" +
                "\n" +
                "LAB\n" +
                "Digital Signal Processing Lab\n" +
                "1. To represent basic signals (Unit step, unit impulse, ramp, exponential, sine and cosine).\n" +
                "2. To develop program for discrete convolution.\n" +
                "3. To develop program for discrete correlation.\n" +
                "4. To understand stability test\n" +
                "5. To understand sampling theorem.\n" +
                "6. To design analog filters (low-pass, high pass, band pass, band stop).\n" +
                "7. To design digital filters (low-pass, high pass, band pass, band stop).\n" +
                "8. To design fir filters using windows techniques..");

        List<String> LinearControlSystems = Arrays.asList("Module-1\n" +
                "Control Systems ( 8 hours )\n" +
                "Basics & Components, Introduction to basic terms, Classifications and types of Control Systems, Block diagrams & Signal flow graphs. Transfer function, Determination of transfer function using Block diagram re-duction techniques and Mason’s Gain formula. Control system components: Electrical, Mechanical, Electronic, AC/DC Servo Motors, Stepper Motors, Tacho Generators, Synchros, Magnetic Amplifiers, Servo Amplifiers.\n" +
                "\n" +
                "Module-2\n" +
                "Time-Domain Analysis ( 8 hrs )\n" +
                "Time domain performance specifications, Transient response of first and second order systems, Steady state errors and Static error constants in unity feedback control systems, response with P, PI and PID controllers, Limitations of time domain analysis.\n" +
                "\n" +
                "Module-3\n" +
                "Frequency-response analysis ( 8 Hrs )\n" +
                "Polar and inverse polar plots, Frequency domain specifications and Performance of LTI systems, Logarithmic plots (Bode plots), Gain and Phase Margins, Relative stability. Correlation with time domain performance, Closed loop frequency responses from Open loop response. Limitations of frequency domain analysis, Minimum/Non-minimum phase sys- tems.\n" +
                "\n" +
                "Module-4\n" +
                "Stability and Compensation Techniques ( 8 Hrs )\n" +
                "Concepts, absolute, Asymptotic, Conditional and Marginal stability, Routh–Hurwitz and Nyquist stability criterion, Root locus technique and its application. Concepts of compensation, series/parallel/series- parallel/feedback compensation, Lag/Lead/Lag- Lead networks for compensation, Compensation using P, PI, PID controllers.\n" +
                "\n" +
                "Module-5\n" +
                "State variable Analysis ( 8 Hrs )\n" +
                "Control System Analysis using State Variable Methods Control Systems Engineering Syllabus State variable representation-Conversion of state variable models to transfer functions-Conversion of transfer functions to state variable models-Solution of state equations-Concepts of Controllability and Observability Stability of linear systems- Equivalence between transfer function and state variable representations-State variable analysis of digital control system-Digital control design using state feedback.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. “Automatic Control System”, B. C. Kuo, Prentice Hall of India, 7th edition, 2001\n" +
                "2. “Control Systems Engineering -Principles and Design”, Nagraath and Gopal New Age Publishers\n" +
                "3. “Control systems engineering”, Norman S. Nise, John Wiley and Sons (Asia) Singapore.\n" +
                "4. “Design of Feedback Control System”, Raymond T. Stefani, Oxford University Press..");

        List<String> MicroprocessorsMicrocontrollers = Arrays.asList("Module-1\n" +
                "Introduction to Microprocessor Systems ( 8 Hrs )\n" +
                "Architecture and Pin diagram of 8085, Timing Diagram, Memory organization, Addressing modes, Interrupts. Assembly Language Programming, 8085 interrupts, Additional I/O concepts and processes.\n" +
                "\n" +
                "Module-2\n" +
                "Interfacing of 8085 with 8255, 8254/ 8253, 8251, 8259 (12 Hours)\n" +
                "Introduction, Generation of I/O Ports, Programmable Peripheral Interface (PPI)-Intel 8255, Sample-and- Hold Circuit and Multiplexer, Keyboard and Display Interface, Keyboard and Display Controller (8279), Programmable Interval timers (Intel 8253/8254), USART (8251), PIC (8259), DAC, ADC, LCD, Stepper Motor.\n" +
                "\n" +
                "Module-3\n" +
                "Introduction to 8086, 80286, 80386 and 80486 Microprocessor (9 Hours)\n" +
                "8086 Architecture, Generation of physical address, Pin diagram of 8086, Minimum Mode and Maximum mode, Bus cycle, Memory Organization, Memory Interfacing, Addressing Modes, Assembler Directives, Instruction set of 8086, Assembly Language Programming, Hardware and Software Interrupts. Introduction of 80286, 80386, and 80486 microprocessor.\n" +
                "\n" +
                "Module-4\n" +
                "Overview of Microcontroller 8051 ( 11 Hours )\n" +
                "Introduction to 8051 Microcontroller, Architecture, Memory organization, Special function registers, Port Operation, Memory Interfacing, I/O Interfacing, Programming 8051 resources, interrupts, Programmer’s model of 8051, Operand types, Operand addressing, Data transfer instructions, Arithmetic instructions, Logic instructions, Control transfer instructions, Timer and Counter Programming, Interrupt Programming.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. “Microprocessors and Microcontrollers”, Muhammad Ali Mazidi, Pearson, 2006\n" +
                "2. “Microprocessors and Interfacing, Programming and Hardware”, Douglas V Hall, Tata McGraw Hill, 2006\n" +
                "3. “MicroProcessor Architecture, Programming and Applications with the 8085”, Ramesh Gaonkar, PHI\n" +
                "4. “The 8051 Microcontroller and Embedded Systems”, Muhammad Ali Mazidi, Janice Gillispie Mazidi, Rolin D. MCKinlay, 2nd Edition, Pearson Education, 2008..");

        List<String> LinearIntegratedCircuits = Arrays.asList("Module-1\n" +
                "IC Fabrication ( 9 Hrs )\n" +
                "IC classification, fundamental of monolithic IC technology, epitaxial growth, masking and etching, diffusion of impurities. Realization of monolithic ICs and packaging.\n" +
                "Fabrication of diodes, capacitance, resistance and FETs\n" +
                "\n" +
                "Module-2\n" +
                "Characteristics of OPAMP ( 9 Hrs )\n" +
                "Ideal OP-AMP characteristics, DC characteristics, AC characteristics, differential amplifier; frequency response of OP- AMP; Basic applications of Op-Amp – Inverting and Non-inverting Amplifiers, V/I and I/V converters, Summer, Differentiator and Integrator\n" +
                "\n" +
                "Module-3\n" +
                "Applications of OPAMP (9 Hours)\n" +
                "Instrumentation amplifier, Log and Antilog Amplifiers, first and second order active filters, comparators, multivibrators, wave- form generators, clippers, clampers, peak detector, S/H circuit, D/A converter (R- 2R ladder and weighted resistor types), A/D converters using Op-Amps.\n" +
                "\n" +
                "Module-4\n" +
                "Special ICs(9 Hours)\n" +
                "Functional block, characteristics and application circuits with 555 Timer IC-566 voltage controlled oscillator IC; 565-phase lock loop IC, Ana- log multiplier ICs.\n" +
                "\n" +
                "Module-5\n" +
                "Application ICs (9 Hours)\n" +
                "IC voltage regulators –LM78XX, 79XX Fixed voltage regulators- LM317, 723 Variable voltage regulators, switching regulator- SMPS- LM 380 power amplifier- ICL 8038 function generator IC.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. “Op-amp and Linear ICs”, David A. Bell, Oxford, 2013\n" +
                "2. “Linear Integrated Circuits”, D. Roy Choudhary, Sheil B. Jani, II edition, New Age, 2003\n" +
                "3. “Op-amps and Linear Integrated Circuits”, Ramakant A. Gayakward, IV edition, Pearson Education, PHI, 2000..");

        List<String> ProbabilityTheory = Arrays.asList("Module-1\n" +
                "Sets and set operations ( 4 Hrs )\n" +
                "Probability space; Conditional probability and Bayes theorem; Combinatorial probability and sampling models.\n" +
                "\n" +
                "Module-2\n" +
                "Random Variable ( 6 Hrs )\n" +
                "Discrete random variables, probability mass function, probability distribution function, example random variables and distributions; Continuous random variables, probability density function, probability distribution function, example distributions.\n" +
                "\n" +
                "Module-3\n" +
                "Distribution Function ( 8 Hrs )\n" +
                "Joint distributions, functions of one and two random variables, moments of random variables; Conditional distribution, densities and moments; Characteristic functions of a random variable; Markov, Chebyshev and Chernoff bounds.\n" +
                "\n" +
                "Module-4\n" +
                "( 10 Hrs )\n" +
                "Random sequences and modes of convergence (everywhere, almost everywhere, probability, distribution and mean square); Limit theorems; Strong and weak laws of large numbers, central limit theorem .\n" +
                "\n" +
                "Module-5\n" +
                "Random Process ( 10 Hrs )\n" +
                "Random process. Stationary processes. Mean and covariance functions. Er-godicity. Transmission of random process through LTI. Power spectral density, Markov chain and Markov processes.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "A “Probability and Random Processes with Applications to Signal Processing,” H. Stark and J. Woods, Third Edition, Pearson Education.                                 \n" +
                "B. “Probability, Random Variables and Stochastic Processes”, A.Papoulis and S. Unnikrishnan Pillai, Fourth Edition, McGraw Hill.\n" +
                "C.“Introduction to Probability Theory with Stochastic Processes”, K. L. Chung, Springer International..");

        List<String> ComputerNetworkSecurity = Arrays.asList("Module-1\n" +
                "Data communication Components ( 10 Hrs )\n" +
                "Representation of data and its flow Networks , Various Connection Topology, Protocols and Standards, OSI model, Transmission Media, LAN: Wired LAN, Wireless LANs, Connecting LAN and Virtual LAN, Techniques for Bandwidth utilization: Multiplexing - Frequency division, Time division and Wave division, Concepts on spread spectrum.\n" +
                "\n" +
                "Module-2\n" +
                "Data Link Layer and Medium Access Sub Layer (10 Hrs )\n" +
                "Error Detection and Error Correction Fundamentals, Block coding, Hamming Distance, CRC; Flow Control and Error control protocols - Stop and Wait, Go back - N ARQ, Se- lective Repeat ARQ, Sliding Window, Piggybacking, Random Access, Multiple access protocols -Pure ALOHA, Slotted ALOHA, CSMA/CD,CDMA/CA.\n" +
                "\n" +
                "Module-3\n" +
                "Network Layer ( 8 Hrs )\n" +
                "Network Layer : Switching, Logical addressing – IPv4, IPv6; Address mapping –ARP, RARP, BOOTP and DHCP–Delivery, Forwarding and Unicast Routing protocols.\n" +
                "\n" +
                "Transport Layer: Process to Process Communication, User Datagram Proto- col (UDP), Transmission Control Protocol (TCP), SCTP Congestion Control; Quality of Service, QoS improving techniques: Leaky Bucket and Token Bucket algorithm.\n" +
                "\n" +
                "Module-4\n" +
                "Application Layer ( 6 Hrs )\n" +
                "Domain Name Space (DNS), DDNS, TELNET, EMAIL, File Transfer Protocol (FTP), WWW, HTTP, SNMP, Bluetooth, Firewalls, Basic concepts of Cryptography.\n" +
                "\n" +
                "Module-5\n" +
                "Network Security ( 8 Hrs )\n" +
                "Passive and Active Attacks, Symmetric Encryption, Encryption Algorithms, Key Distribution, Traffic Padding, Message Authen- tication, Hash function, Secure Hash function, Public-key Encryption, Digital Signature, RSA Public Key Encryption algorithm, Key Management, Secure Socket Layer and Transport layer Security, SSL Architecture, SSL Record Pro- tocol, Change Cipher Spec Protocol, Alert Protocol, handshake Protocol, IP level security IPSEC, Application layer security PGP, Firewall, Virtual Private Networks.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. “Data Communication and Networking”, 4th Edition, Behrouz A. Forouzan, McGraw-Hill.\n" +
                "2. “Data and Computer Communication”, 8th Edition, William Stallings, Pearson Prentice Hall India\n" +
                "3. “Computer Networks”, 8th Edition, Andrew S. Tanenbaum, Pearson New International Edition..");

        List<String> DigitalSignalProcessingLAB = Arrays.asList("List of Experiments\n" +
                "\n" +
                "1. To represent basic signals (Unit step, unit impulse, ramp, exponential, sine and cosine).\n" +
                "\n" +
                "2. To develop program for discrete convolution\n" +
                "\n" +
                "3. To develop program for discrete correlation\n" +
                "\n" +
                "4. To understand stability test\n" +
                "\n" +
                "5. To understand sampling theorem\n" +
                "\n" +
                "6. To design analog filters (low-pass, high pass, band pass, band stop)\n" +
                "\n" +
                "7. To design digital filters (low-pass, high pass, band pass, band stop)\n" +
                "\n" +
                "8. To design fir filters using windows techniques..");

        List<String> MicroprocessorsMicrocontrollersLAB = Arrays.asList("Microprocessors and Microcontrollers Lab are according to the theory mentioned above.\n" +
                "\n" +
                "0L: 0T: 2P 1 Credit...");

        List<String> LinearIntegratedCircuitsApplicationsLAB = Arrays.asList("Linear Integrated Circuits and Applications Lab are according to the theory mentioned above. 0L: 0T: 2P 1 Credit...");

        List<String> EnvironmentalScience = Arrays.asList("We as human being are not an entity separate from the environment around us rather we are a constituent seamlessly integrated and co-exist with the environment around us. We are not an entity so separate from the environment that we can think of mastering and controlling it rather we must understand that each and every action of ours reflects on the environment and vice versa. Ancient wisdom drawn from Vedas about environment and its sustenance reflects these ethos. There is a direct application of this wisdom even in modern times. Idea of an activity based course on environment protection is to sensitize the students on the above issues through following two type of activities: \n" +
                "\n" +
                "(a) Awareness Activities: \n" +
                "  i) Small group meetings about water management, promotion of recycle use, generation of less waste, avoiding electricity waste \n" +
                "  ii) Slogan making events\n" +
                "  iii) Poster making events \n" +
                "  iv) Cycle rally\n" +
                "  v) Lectures from experts\n" +
                "\n" +
                "(b) Actual Activities: \n" +
                "  i) Plantation \n" +
                "  ii) Gifting a tree to see its full growth\n" +
                "  iii) Cleanliness drive\n" +
                "  iv) Drive for segregation of waste\n" +
                "  v) To live some big environmentalist for a week or so to understand his work\n" +
                "  vi) To work in kitchen garden for mess\n" +
                "  vii) To know about the different varieties of plants \n" +
                "  viii) Shutting down the fans and ACs of the campus for an hour or so...");

        List<String> SummerEntrepreneurshipTwo = Arrays.asList("Summer Entrepreneurship-II..");

        List<String> ConstitutionIndia = Arrays.asList("Constitution of India/Essence of Indian Knowledge Traditional..");


        List<Semester> fifthSemesters = new ArrayList<>();
        fifthSemesters.add(new Semester("Digital Signal Processing", DigitalSignalProcessing));
        fifthSemesters.add(new Semester("Linear Control Systems", LinearControlSystems));
        fifthSemesters.add(new Semester("Microprocessors and Microcontrollers", MicroprocessorsMicrocontrollers));
        fifthSemesters.add(new Semester("Linear Integrated Circuits and its Applications", LinearIntegratedCircuits));
        fifthSemesters.add(new Semester("Probability Theory and Stochastic Process", ProbabilityTheory));
        fifthSemesters.add(new Semester("Computer Network and Security", ComputerNetworkSecurity));
        fifthSemesters.add(new Semester("Digital Signal Processing : LAB", DigitalSignalProcessingLAB));
        fifthSemesters.add(new Semester("Microprocessors and Microcontrollers : LAB", MicroprocessorsMicrocontrollersLAB));
        fifthSemesters.add(new Semester("Linear Integrated Circuits and its Applications : LAB", LinearIntegratedCircuitsApplicationsLAB));
        fifthSemesters.add(new Semester("Environmental Science", EnvironmentalScience));
        fifthSemesters.add(new Semester("Summer Entrepreneurship-II", SummerEntrepreneurshipTwo));
        fifthSemesters.add(new Semester("Constitution of India/Essence of Indian Knowledge Traditional", ConstitutionIndia));

        branches.add(new Branch("Semester 5", fifthSemesters));
        //5th Semester Complete....


        //6 Semester Start....
        List<String> DigitalCommunication = Arrays.asList("Contents (Hours)\n" +
                "\n" +
                " 1 Introduction: Block Diagram of Digital Communication System, Advantages of Digital communication system over Analog communication systems, Sampling theorem, Signal reconstruction in time domain, Practical and Flat Top Sampling, Sampling of Band-pass Signal, Aliasing Problem, Uniform and Non-uniform quantization. Signal to Quantization ratio of Quantized Signal. (7 Hrs.)\n" +
                "\n" +
                " 2 Baseband Transmission: Line Coding and its properties, Various types of PCM waveforms. Attributes of PCM waveforms, Mary Pulse Modulation waveforms, Differential Pulse Code Modulation, Multiplexing of PCM signals, Delta modulation, Idling noise and slope overload, Adaptive Delta Modulation, Adaptive DPCM, Comparison of PCM and DM (9 Hrs.)\n" +
                "\n" +
                " 3 Baseband Detection: Error performance degradation in communication systems, Eb/NO parameter, Matched filter and its derivation, Inter-Symbol Interference (ISI), Nyquist criterion for zero ISI and raised cosine spectrum, Correlation detector : Decision threshold and Error probability for Binary, Unipolar (on-off ) signalling (7 Hrs. )\n" +
                "\n" +
                "4 Band-pass Modulation and Demodulation: Types of digital modulation, Waveforms for Amplitude, Frequency and Phase Shift Keying, Method of generation and detection of coherent and non-coherent binary ASK, FSK and PSK, Differential phase shift keying, Quadrature modulation techniques, M- ary FSK, Minimum Shift Keying (MSK), Probability of error and comparison of various digital modulation techniques (9 Hrs. )\n" +
                "\n" +
                "5 Error: A base band signal receiver, Probability of error, The Optimum filter, Matched Filter, Probability of error in Matched filter, Coherent reception, Coherent reception of ASK, PSK and FSK, Non-Coherent reception of ASK, FSK, PSK and QPSK, Calculation of bit error probability of BPSK and BFSK, Error probability for QPSK (6 Hrs.)\n" +
                "\n" +
                "6 Multiple Access Techniques: Time division multiplexing, Frequency division multiplexing, Code division multiplexing, Introduction to upcoming techniques of transmission (2 Hrs.) \n" +
                "\n" +
                "Name of Authors / Books /Publishers \n" +
                "\n" +
                "1. “Communication Systems”, Simon Haykin, Wiley publication, 4th Edition, 2004 \n" +
                "\n" +
                "2. “Digital Communication Fundamentals and Applications”, Bernard Sklar, Pearson Education India, 2nd Edition, 2009 \n" +
                "\n" +
                "3. “Modern Electronic Communication”, Miller Gary M, Prentice-Hall, 6th Edition, 1999 \n" +
                "\n" +
                "4. “Digital Communications”, John Proakis, Tata Mc Graw Hill, 5th Edition, 2007 \n" +
                "\n" +
                "5. “Electronic Communication Systems, Fundamentals Through Advanced”, Wayne Tomsi, Pearson Education, 4th Edition, 2001 \n" +
                "\n" +
                "Digital Communication Lab are according to the theory mentioned above. 0L: 0T: 2P 1 Credit..");

        List<String> ElectronicsInstruments = Arrays.asList("Contents (Hours)\n" +
                "\n" +
                " 1 Introduction to Standards of Measurement, Errors and their evaluation. Calibration, Accuracy, Precision Sensitivity, Resolution, Noise, etc. (3 Hrs.)\n" +
                "\n" +
                " 2 Measurements of voltage, current, power and energy: Moving iron, moving coil, thermal, Induction and Rectifier type. Measurements of power factor and frequency: Dynamometer and moving iron single and three phase power factor meters, Resonance, moving coil and moving iron frequency meters. Range extension of voltmeter, ammeter, Wattmeter and Energy meter: Voltmeter multipliers, Ammeter shunt, Current and Potential Transformers (10 Hrs.) \n" +
                "\n" +
                "3 Galvanometer: D’ Arsonval, Vibration and Ballistic galvanometers (5 Hrs.)\n" +
                "\n" +
                "4 Bridges: D.C. bridges: Kelvin double bridge, Wheatstone bridge and Carey-Foster bridge; A.C. bridges: Maxwell Bridge, Hay and Owen bridges, Anderson Bridge, Wien Bridge, Schering Bridge and Heaviside-Campbell Bridge (7 Hrs. )\n" +
                "\n" +
                "5 Potentiometer’s Principle, Standardization and application: D.C. Potentiometers: Crompton and Vernier potentiometers, A.C. Potentiometers: Coordinate type and Polar type (5 Hrs.)\n" +
                "\n" +
                " 6 Magnetic measurements: Measurement of magnetic flux by ballistic galvanometer and fluxmeter, Determination of B-H curve and hysteresis loop, Separation of iron loss into hysteresis and eddy current losses, Measurement of iron loss and its separation on LloyadFisher squares (5 Hrs. )\n" +
                "\n" +
                "7 Digital measurements: Digital voltmeter and multimeter Universal counter and its uses for measurements of frequency, ratio of two frequencies, Time period and Pulse width. (5 Hrs.)\n" +
                "\n" +
                "Name of Authors / Books /Publishers \n" +
                "\n" +
                "1 “Measurement System, Application and Design”, E O Doeblin, TMH \n" +
                "\n" +
                "2 “Course in Electrical and Electronic Measurement and Instrumentation”, A K Sawhney, Dhanpat Rai and Sons\n" +
                "\n" +
                " 3 “Electronic Measurements and Instrumentation”, Rajendra Prasad, Khanna Publishers \n" +
                "\n" +
                "4 “Basic Electrical Measurements”, M.B. Stout, Prentice Hall \n" +
                "\n" +
                "Electronic Instruments and Measurement Lab are according to the theory mentioned above. 0L: 0T: 2P 1 Credit...");

        List<String> ComputerOrganization = Arrays.asList(" Contents (Hours) \n" +
                "\n" +
                "1 Introduction: Computer Arithmetic, Instruction sets, Introduction to computer organization, CPU Design. Micro programmed Control: Control Memory, Address sequencing, Micro programming, sequencing and execution of microinstructions. (10 Hrs.)\n" +
                "\n" +
                "2 Memory system: Hierarchical memory structure, Cache memories, Set Associative memory, Virtual Memory, Paging, Segmentation, Input-Output Inter- face, Asynchronous Data Transfer, Programmed I/O, Interrupts, Direct Memory Access ( 8 Hrs. )\n" +
                "\n" +
                "3 Input-Output Organization: Basic Input/Output Structure of Computers, serial and parallel communications, Asynchronous Data Communication, Programmed I/O, Interrupt Driven I/O, Interrupt Controller, DMA, Device Drivers, Buses. (10 Hrs. )\n" +
                "\n" +
                "4 Introduction to Parallel Processing: Evolution of computer systems (RISC vs. CISC), Parallelism in uniprocessor systems, Architectural classification schemes. (5 Hrs.)\n" +
                "\n" +
                "5 Principles of Pipelining and Vector processing: Pipeline strategy, Pipeline performance, Controls and Data paths, Overlapped parallelism, Principles of designing pipelined processors, Vector processing requirements (7 Hrs. )\n" +
                "\n" +
                "Name of Authors / Books /Publishers \n" +
                "\n" +
                "1 Computer system architecture by M. Morris Mano\n" +
                "\n" +
                " 2 Computer Architecture and parallel processing by Kai Hwang, Briggs, McGraw \n" +
                "\n" +
                "3 Hill \n" +
                "\n" +
                "4 Computer Architecture by Carter, Tata McGraw Hill.\n" +
                "\n" +
                " 5 Computer System Organization and Architecture by John D. Carpinelli, Pearson Education ...");

        List<String> Biology = Arrays.asList("[3 credit course; 2 (one hour) lectures and one (one hour) tutorial per week. Only lecture hours are shown] \n" +
                "\n" +
                "Module 1. (2 hours)- Introduction\n" +
                "\n" +
                " Purpose: To convey that Biology is as important a scientific discipline as Mathematics, Physics and Chemistry Bring out the fundamental differences between science and engineering by drawing a comparison between eye and camera, Bird flying and aircraft. Mention the most exciting aspect of biology as an independent scientific discipline. Why we need to study biology? Discuss how biological observations of 18th Century that lead to major discoveries. Examples from Brownian motion and the origin of thermodynamics by referring to the original observation of Robert Brown and Julius Mayor. These examples will highlight the fundamental importance of observations in any scientific inquiry. \n" +
                "\n" +
                "Module 2. (3 hours)- Classification \n" +
                "\n" +
                "Purpose: To convey that classification per se is not what biology is all about. The underlying criterion, such as morphological, biochemical or ecological be highlighted. Hierarchy of life forms at phenomenological level. A common thread weaves this hierarchy Classification. Discuss classification based on (a) cellularity- Unicellular or multicellular (b) ultrastructure- prokaryotes or eucaryotes. (c) energy and Carbon utilization -Autotrophs, heterotrophs, lithotropes (d) Ammonia excretion – aminotelic, uricoteliec, ureotelic (e) Habitata- acquatic or terrestrial (e) Molecular taxonomy- three major kingdoms of life. A given organism can come under different category based on classification. Model organisms for the study of biology come from different groups. E.coli, S. cerevisiae, D. Melanogaster, C. elegance, A. Thaliana, M. musculus \n" +
                "\n" +
                "Module 3. (4 hours)-Genetics \n" +
                "\n" +
                "Purpose: To convey that “Genetics is to biology what Newton’s laws are to Physical Sciences” Mendel’s laws, Concept of segregation and independent assortment. Concept of allele. Gene mapping, Gene interaction, Epistasis. Meiosis and Mitosis be taught as a part of genetics. Emphasis to be give not to the mechanics of cell division nor the phases but how genetic material passes from parent to offspring. Concepts of recessiveness and dominance. Concept of mapping of phenotype to genes. Discuss about the single gene disorders in humans. Discuss the concept of complementation using human genetics. \n" +
                "\n" +
                "Module 4. (4 hours)-Biomolecules \n" +
                "\n" +
                "Purpose: To convey that all forms of life has the same building blocks and yet the manifestations are as diverse as one can imagine Molecules of life. In this context discuss monomeric units and polymeric structures. Discuss about sugars, starch and cellulose. Amino acids and proteins. Nucleotides and DNA/RNA. Two carbon units and lipids.\n" +
                "\n" +
                " Module 5. (4 Hours). Enzymes \n" +
                "\n" +
                "Purpose: To convey that without catalysis life would not have existed on earth Enzymology: How to monitor enzyme catalyzed reactions. How does an enzyme catalyzereactions. Enzyme classification. Mechanism of enzyme action. Discuss at least two examples. Enzyme kinetics and kinetic parameters. Why should we know these parameters to understand biology? RNA catalysis. \n" +
                "\n" +
                "Module 6. (4 hours)- Information Transfer\n" +
                "\n" +
                " Purpose: The molecular basis of coding and decoding genetic information is universal Molecular basis of information transfer. DNA as a genetic material. Hierarchy of DNA structure- from single stranded to double helix to nucleosomes. Concept of genetic code. Universality and degeneracy of genetic code. Define gene in terms of complementation and recombination. \n" +
                "\n" +
                "Module 7. (5 hours). Macromolecular analysis\n" +
                "\n" +
                " Purpose: How to analyses biological processes at the reductionistic level Proteins- structure and function. Hierarch in protein structure. Primary secondary, tertiary and quaternary structure. Proteins as enzymes, transporters, receptors and structural elements. \n" +
                "\n" +
                "Module 8. (4 hours)- Metabolism \n" +
                "\n" +
                "Purpose: The fundamental principles of energy transactions are the same in physical and biological world. Thermodynamics as applied to biological systems. Exothermic and endothermic versus endergonic and exergoinc reactions. Concept of Keq and its relation to standard free energy. Spontaneity. ATP as an energy currency. This should include the breakdown of glucose to CO2 + H2O (Glycolysis and Krebs cycle) and synthesis of glucose from CO2 and H2O (Photosynthesis). Energy yielding and energy consuming reactions. Concept of Energy charge \n" +
                "\n" +
                "Module 9. (3 hours)- Microbiology Concept of single celled organisms. Concept of species and strains. Identification and classification of microorganisms. Microscopy. Ecological aspects of single celled organisms. Sterilization and media compositions. Growth kinetics. \n" +
                "\n" +
                "Module 10: Plant Physiology covering, Transpiration; Mineral nutrition (3 Lectures) \n" +
                "\n" +
                "Module 10B: Ecology covering, Ecosystems- Components, types, flow of matter and energy in an ecosystem; Community ecology- Characteristics, frequency, life forms, and biological spectrum; Ecosystem structure- Biotic and a-biotic factors, food chain, food web, ecological pyramids; (3 Lectures) \n" +
                "\n" +
                "References: \n" +
                "\n" +
                "1. Biology: A global approach: Campbell, N. A.; Reece, J. B.; Urry, Lisa; Cain, M, L.; Wasserman, S. A.; Minorsky, P. V.; Jackson, R. B. Pearson Education Ltd \n" +
                "\n" +
                "2. Outlines of Biochemistry, Conn, E.E; Stumpf, P.K; Bruening, G; Doi, R.H., John Wiley and Sons \n" +
                "\n" +
                "3. Principles of Biochemistry (V Edition), By Nelson, D. L.; and Cox, M. M.W.H. Freeman and Company\n" +
                "\n" +
                "4. Molecular Genetics (Second edition), Stent, G. S.; and Calender, R.W.H. Freeman and company, Distributed by Satish Kumar Jain for CBS Publisher \n" +
                "\n" +
                "5. Microbiology, Prescott, L.M J.P. Harley and C.A. Klein 1995. 2nd edition Wm, C. Brown Publishers ...");

        List<String> ProgramElectiveFirst = Arrays.asList("DIGITAL CMOS VLSI DESIGN\n" +
                "DIGITAL IMAGE AND VIDEO PROCESSING\n" +
                "SCIENTIFIC COMPUTING");

        List<String> DisasterManagement = Arrays.asList("DISASTER MANAGEMENT..");

        List<String> MOOC = Arrays.asList("MOOCS / SWAYAM / NPTEL (COURSES - 2)..");

        List<String> WorkshopHeads = Arrays.asList("WORKSHOP/HEADS ON TRAINING/SOFT SKILL..");

        List<Semester> sixthSemesters = new ArrayList<>();
        sixthSemesters.add(new Semester("Digital Communication", DigitalCommunication));
        sixthSemesters.add(new Semester("Electronics Instruments And Measurements", ElectronicsInstruments));
        sixthSemesters.add(new Semester("Computer Organization And Architecture", ComputerOrganization));
        sixthSemesters.add(new Semester("Biology for Engineers", Biology));
        sixthSemesters.add(new Semester("Program Elective-I", ProgramElectiveFirst));
        sixthSemesters.add(new Semester("Disaster Management", DisasterManagement));
        sixthSemesters.add(new Semester("MOOCS/SWAYAM/NPTEL(COURSES-2)", MOOC));
        sixthSemesters.add(new Semester("Workshop/Heads on Training/Soft Skill", WorkshopHeads));

        branches.add(new Branch("Semester 6", sixthSemesters));
        //6th Semester Complete....


        //7 Semester Start....
        List<String> BusinessAnalytics = Arrays.asList("Contents \n" +
                "\n" +
                "1 Unit 1: (8 Lectures) Business analytics: Overview of Business analytics, Scope of Business analytics, Business Analytics Process, Relationship of Business An- alytics Process and organisation, competitive advantages of Business Analytics. Statistical Tools: Statistical Notation, Descriptive Statistical methods, Review of probability distribution and data modelling, sampling and estimation methods overview. 8\n" +
                "\n" +
                "2 Unit 2: (8 Lectures) Trendiness and Regression Analysis: Modelling Relationships and Trends in Data, simple Linear Regression. Important Resources, Business Analytics Personnel, Data and models for Business analytics, problem solving, Visualizing and Exploring Data, Business Analytics Technology. 8\n" +
                "\n" +
                "3 Unit 3: (8 Lectures) Organization Structures of Business analytics: Team management, Management Issues, Designing Information Policy, Outsourcing, Ensuring Data Quality, Measuring contribution of Business analytics, Managing Changes. Descriptive Analytics, predictive analytics, predictive Modelling Predictive analytics analysis, Data Mining, Data Mining Methodologies, Prescriptive analytics and its step in the business analytics Process, Prescriptive Modelling, nonlinear Optimization. 8\n" +
                "\n" +
                "4 Unit 4: (10 Lectures) Forecasting Techniques: Qualitative and Judgmental Forecasting, Statistical Forecasting Models, Forecasting Models for Stationary Time Series, Forecasting Models for Time Series with a Linear Trend, Fore- casting Time Series with Seasonality, Regression Forecasting with Casual Vari- ables, Selecting Appropriate Forecasting Models. Monte Carlo Simulation and Risk Analysis: Monte Carle Simulation Using Analytic Solver Platform, New- Product Development Model, Newsvendor Model, Overbooking Model, Cash Budget Model. 10\n" +
                "\n" +
                "5 Unit 5: (8 Lectures) Decision Analysis: Formulating Decision Problems, Decision Strategies with the without Outcome Probabilities, Decision Trees, The Value of Information, Utility and Decision Making. Recent trends: In Embedded and collaborative business intelligence, Visual data recovery, Data Storytelling and Data journalism. 8\n" +
                "\n" +
                "Name of Authors / Books /Publishers \n" +
                "\n" +
                "1. Business analytics Principles, Concepts, and Applications by Marc J.Schniederjans, Dara G. Schniederjans, Christopher M. Starkey, Pearson FT Press.\n" +
                "\n" +
                "2. Business Analytics by James Evans, persons Education..");

        List<String> CostManagement = Arrays.asList("Unit 1:(8 Lectures) Introduction and Overview of the Strategic Cost Management Process: Cost concepts in decision-making: Relevant cost, Differential cost. Incremental cost and Opportunity cost. Objectives of a Costing System: Inventory valuation: Creation of a Database for operational control.\n" +
                "\n" +
                "Unit 2: (8 Lectures) Provision of data for Decision-Making: Project: meaning. Different types, why to manage, cost overruns centers, various stages of project execution: conception to commissioning. Project execution is a conglomeration of technical and non-technical activities. Detailed Engineering activities. Pre-project execution main clearances and documents.\n" +
                "\n" +
                "Unit 3:(6 Lectures) Project team: Role of each member. Importance Project site: Data required with significance. Project contracts. Types and contents. 6 Project execution Project cost control. Bar charts and Network diagram.\n" +
                "\n" +
                "Unit 4:(12 Lectures) Project commissioning: Mechanical and process Cost Behavior and Profit Planning Marginal Costing: Distinction between Marginal Costing and Absorption Costing: Break-even Analysis. Cost-Volume-Profit Analysis. Various decision-making problems. Standard Costing and Variance Analysis. Pricing strategies: Pareto Analysis. Target costing. Life Cycle Costing. Costing of the service sector: Just-in-time approach. Material Requirement Planning, Enterprise Resource Planning. Total Quality Management and Theory of Constraints.\n" +
                "\n" +
                "Unit 5:(10 Lectures) Activity-Based Cost Management: Benchmarking, Balanced Score Card, Value-Chain Analysis, Budgetary Control: Flexible Budgets: Performance budgets: Zero-based budgets. Measurement of Divisional profitability pricing decisions including transfer pricing and quantitative techniques for cost management. Linear Programming, PERT CPM. Transportation problems. Assignment problems. Simulation, Learning Curve Theory.\n" +
                "\n" +
                "\n" +
                "Name of Authors/ Books /Publishers\n" +
                "Cost Accounting A Managerial Emphasis, Prentice Hall of India, New Delhi Charles T. Horngren and George Foster. Advanced Management Accounting Robert S Kaplan Anthony A. Atkinson, Management and Cost Accounting Ashish K. Bhattacharya. Principles and Practices of Cost Accounting A. H. Wheeler publisher\n" +
                "D. Vohra, Quantitative Techniques in Management, Tata McGraw Hill Book Co. Ltd..");

        List<String> WirelessCommunication = Arrays.asList("Contents \n" +
                "\n" +
                "1 Introduction to Wireless Communication Systems: Evolution of mobile radio communications; examples of wireless comm. systems; paging systems; Cordless telephone systems; overview of generations of cellular systems, comparison of various wireless systems. 4\n" +
                "\n" +
                "2 Introduction to Personal Communication Services (PCS): PCS architecture, Mobility management, Networks signalling. The Cellular Concept and Multiple Access Techniques: A basic cellular system, Frequency Reuse basic theory of hexagonal cell layout, spectrum efficiency, FDM/TDM, Cellular System, channel allocation schemes, Handover Analysis, cellular CDMA, Soft capacity, Erlang capacity comparison, multiple access techniques: FDMA, TDMA, CDMA. 9\n" +
                "\n" +
                "3 2G Networks: Second generation, digital, wireless systems: GSM, I S136 (DAMPS), IS-95 CDMA. Global system for Mobile Communication (GSM) system overview: GSM Architecture, Mobility Management, Network signalling, mobile management, voice signal processing and coding. Spread Spectrum Systems- Cellular code Division Access Systems-Principle, Power Control, effects of multipath propagation on code division multiple access. 11\n" +
                "\n" +
                "4 2.5G Mobile Data Networks: Introduction to Mobile Data Networks, General Packet Radio Services (GPRS): GPRS architecture, GPRS Network nodes, EDGE, Wireless LANs, (IEEE 802.11), Mobile IP. Third Generation (3G) Mo- bile Services: Introduction to International Mobile Telecommunications 2000 (IMT 2000) vision, Wideband Code Division Multiple Access (W-CDMA), and CDMA 2000, Quality of services in 3G, Introduction to 4G. 11\n" +
                "\n" +
                "5 Introduction to Wireless Channels and Diversity: Fast Fading Wireless Channel Modelling, Rayleigh/Ricean Fading Channels, BER Performance in Fading Channels, Introduction to Diversity modelling for Wireless Communications. 5\n" +
                "\n" +
                "Sl. No. Name of Authors / Books /Publishers \n" +
                "\n" +
                "1. Theodore S. Rappaport, “Wireless Communications: Principles and Practice” 2nd Edition (2008), 2008\n" +
                "\n" +
                "2. Andrew J Viterbi, “CDMA Principles of spread spectrum communications”,Addition Wesley, 1995\n" +
                "\n" +
                "3. J S Lee and L E Miller, “CDMA systems engineering handbook”, Artech House,1998\n" +
                "\n" +
                "4. Marvin K Simon, Jim K Omura, Robert A Scholtz, Bary Klevit, “Spread Spectrum Communications”, 1995\n" +
                "\n" +
                "5. Sergio Verdu, “Multiuser Detection”, Cambridge University Press, 1998\n" +
                "\n" +
                "6. Andrew S Tanenbaum, “Computer Network”, Pearson/ PHI, 4th edition, 2009..");

        List<String> GraduateEmployability = Arrays.asList("GRADUATE EMPLOYABILITY SKILLS AND COMPETITIVE COURSES (GATE, IES, ETC.)..");

        List<String> ProgramElectiveTwo = Arrays.asList("ANTENNAS AND WAVE PROPAGATION\n" +
                "OPTICAL FIBER COMMUNICARION\n" +
                "MICRO AND NANO ELECTRONICS\n" +
                "EMBEDDED SYSTEM\n" +
                "HIGH SPEED ELECRTONICS\n" +
                "DIGITAL SYSTEM DESIGN\n" +
                "VLSI TECHNOLOGY\n" +
                "INFORMATION AND CODING THEORY");

        List<String> ProgramElectiveThree = Arrays.asList("ANTENNAS AND WAVE PROPAGATION\n" +
                "OPTICAL FIBER COMMUNICARION\n" +
                "MICRO AND NANO ELECTRONICS\n" +
                "EMBEDDED SYSTEM\n" +
                "HIGH SPEED ELECRTONICS\n" +
                "DIGITAL SYSTEM DESIGN\n" +
                "VLSI TECHNOLOGY\n" +
                "INFORMATION AND CODING THEORY");

        List<String> ProjectFirst = Arrays.asList("PROJECT -I..");

        List<String> SummerEntrepreneurshipThree = Arrays.asList("SUMMER ENTREPENEURSHIP -III..");

        List<Semester> seventhSemesters = new ArrayList<>();
        seventhSemesters.add(new Semester("Business Analytics", BusinessAnalytics));
        seventhSemesters.add(new Semester("Cost Management of Engineering Projects", CostManagement));
        seventhSemesters.add(new Semester("Wireless Communication", WirelessCommunication));
        seventhSemesters.add(new Semester("Graduate Employability Skills And Competitive Courses(GATE,IES,Etc.)", GraduateEmployability));
        seventhSemesters.add(new Semester("Program Elective-II", ProgramElectiveTwo));
        seventhSemesters.add(new Semester("Program Elective-III", ProgramElectiveThree));
        seventhSemesters.add(new Semester("Project-I", ProjectFirst));
        seventhSemesters.add(new Semester("Summer Entrepreneurship-III", SummerEntrepreneurshipThree));

        branches.add(new Branch("Semester 7", seventhSemesters));
        //7th Semester Complete....


        //8 Semester Start....
        List<String> OpenElectiveFirst = Arrays.asList("MACHINE LEARNING\n" +
                "INTRODUCTION TO MEMS\n\n" +
                "100808 Common Paper (EE/ECE) :\n" +
                "INTERNET OF THINGS\n" +
                "POWER ELECTRONICS\n" +
                "BIG DATA ANALYSIS\n" +
                "TRANSDUCERS AND SENSOR");

        List<String> OpenElectiveSecond = Arrays.asList("MACHINE LEARNING\n" +
                "INTRODUCTION TO MEMS\n\n" +
                "100808 Common Paper (EE/ECE) :\n" +
                "INTERNET OF THINGS\n" +
                "POWER ELECTRONICS\n" +
                "BIG DATA ANALYSIS\n" +
                "TRANSDUCERS AND SENSOR");

        List<String> ProgramElectiveFour = Arrays.asList("MICROWAVE THEORY AND TECHNIQUES\n" +
                "ERROR CORRECTING CODES\n" +
                "SPEECH AND AUDIO PROCESSING\n" +
                "SATELLITE COMMUNICATION\n" +
                "WIRELESS SENSOR AND NETWORKS\n" +
                "ADAPTIVE SIGNAL PROCESSING\n" +
                "ANALOG CMOS VLSI DESIGN\n" +
                "BIOMEDICAL INSTRUMENTATION");

        List<String> ProgramElectiveFive = Arrays.asList("MICROWAVE THEORY AND TECHNIQUES\n" +
                "ERROR CORRECTING CODES\n" +
                "SPEECH AND AUDIO PROCESSING\n" +
                "SATELLITE COMMUNICATION\n" +
                "WIRELESS SENSOR AND NETWORKS\n" +
                "ADAPTIVE SIGNAL PROCESSING\n" +
                "ANALOG CMOS VLSI DESIGN\n" +
                "BIOMEDICAL INSTRUMENTATION");

        List<String> ProjectSecond = Arrays.asList("Project-II..");

        List<Semester> eightSemesters = new ArrayList<>();
        eightSemesters.add(new Semester("Open Elective-I", OpenElectiveFirst));
        eightSemesters.add(new Semester("Open Elective-II", OpenElectiveSecond));
        eightSemesters.add(new Semester("Program Elective-IV", ProgramElectiveFour));
        eightSemesters.add(new Semester("Program Elective-V", ProgramElectiveFive));
        eightSemesters.add(new Semester("Project-II", ProjectSecond));

        branches.add(new Branch("Semester 8", eightSemesters));






        return branches;
    }
}


