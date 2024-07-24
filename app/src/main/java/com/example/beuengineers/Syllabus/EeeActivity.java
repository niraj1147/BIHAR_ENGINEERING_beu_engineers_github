package com.example.beuengineers.Syllabus;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beuengineers.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EeeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BranchAdapter branchAdapter;
    List<Branch> branchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee);

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
                "1. Manufacturing methods- Casting, Forming, Machining, Joining Advanced manufacturing methods.                                        \n" +
                "2. CNC Machining, Additive Manufacturing.\n" +
                "3. Fitting Operations and Power tools.\n" +
                "4. Carpentary\n" +
                "5. Plastic Moulding, Glass cutting.\n" +
                "6. Metal Casting\n" +
                "7. Welding (Arc welding and Gas welding Brazing, soldering )\n" +
                "\n" +
                "Module-2\n" +
                "Workshop Practice ( 60 hours )\n" +
                "1. Machine shop and Fitting shop( 18 hrs )                                     \n" +
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
                "I. Coherence, writing introduction,body and conclusion techniques for writing precisely,grammar and accuracy.\n" +
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
                "F. Debates..");


        List<Semester> firstSemesters = new ArrayList<>();
        firstSemesters.add(new Semester("Chemistry", Chemistry));
        firstSemesters.add(new Semester("MATHEMATICS-1 (Calculus and Differential Equations)", MathFirst));
        firstSemesters.add(new Semester("Programming for Problem Solving", Pps));
        firstSemesters.add(new Semester("Workshop Manufacturing Practice", Workshop));
        firstSemesters.add(new Semester("English", English));

        branches.add(new Branch("Semester 1", firstSemesters));
        //1st Semester Complete.....



        //2 Semester Start......
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
                "4. BASIC ELECTRICAL ENGINEERING BY FITZGERALD..");

        List<String> MatheSecond = Arrays.asList("Module-1\n" +
                "Matrices ( 10 Lectures )\n" +
                "Algebra of matrices, Inverse and rank of a matrix, Rank-Nullity theorem; System of linear equations; Symmetric, Skew-Symmetric and Orthogonal matrices; Determinants; Eigenvalues and Eigenvectors; Diagonalization of matrices; Cayley-Hamilton theorem, Orthogonal transformation and quadratic to Canonical forms.\n" +
                "\n" +
                "Module-2\n" +
                "Numerical Methods-1 ( 10 Lectures )\n" +
                "Solution of polynomial and Transcendental Equations – Bisection method, Newton-Raphson method and Regula-Falsi method. Finite differences, Interpolation using Newton’s forward and backward difference formulae. Central difference Interpolation: Gauss’s forward and backward formulae. Numerical integration: Trapezoidal rule and Simpson’s 1/3rd and 3/8 rules.\n" +
                "\n" +
                "Module-3\n" +
                "Numerical Methods-II ( 10 Lectures )\n" +
                "Ordinary differential equations: Taylor’s series, Euler and modified Euler’s methods. Runge- Kutta method of fourth order for solving first and second order equations. Milne’s and Adam’s Predicator-corrector methods. Partial differential equations: Finite difference solution two dimensional laplace equation and poisson equation, Implicit and explicit Methods for one Dimensional Heat equation (Bender-Schmidt and Crank-Nicholson methods), Finite difference explicit method for Wave equation.\n" +
                "\n" +
                "Module-4\n" +
                "Transform Calculus ( 10 lectures )\n" +
                "Laplace transform, Properties of Laplace Transform, Laplace transform of Periodic functions. Finding inverse laplace transform by different methods, Convolution theorem. Evaluation of integrals by Laplace transform, Solving odes and PDEs by Laplace transform method. Fourier transforms..");

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

        List<String> WavesPHY = Arrays.asList("Module-1\n" +
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
        secondSemesters.add(new Semester("Mathematics-II ( Linear Algebra, Transformation Calculus and Numerical Methods )", MatheSecond));
        secondSemesters.add(new Semester("Engineering Graphics and Design", EGD));
        secondSemesters.add(new Semester("Physics ( Waves and Optics abd Quantum Mechanics)", WavesPHY));

        branches.add(new Branch("Semester 2", secondSemesters));
        //2nd Semester Complete........



        //3 Semester Start......
        List<String> ElectricalCircuitAnalysis = Arrays.asList("Module-1\n" +
                "Network Theorems (9 Hours)\n" +
                "Superposition theorem, Thevenin theorem, Norton theorem, Maximum power transfer theorem, Reciprocity theorem, Compensation theorem. Analysis with dependent current and voltage sources. Node and Mesh Analysis. Concept of duality and dual networks.\n" +
                "\n" +
                "Module-2\n" +
                "Solution of First and Second order networks (8 Hours)\n" +
                "Solution of first and second order differential equations for Series and parallel R-L, R-C, R-L-C circuits, initial and final conditions in network elements, forced and free response, time constants, steady state and transient state response.\n" +
                "\n" +
                "Module-3\n" +
                "Sinusoidal steady state analysis (8 Hours)\n" +
                "Representation of sine function as rotating phasor, phasor diagrams, impedances and admittances, AC circuit analysis, effective or RMS values, average power and complex power. Three-phase circuits. Mutual coupled circuits, Dot Convention in coupled circuits, Ideal Transformer.\n" +
                "\n" +
                "Module-4\n" +
                "Electrical Circuit Analysis Using Laplace Transforms (8 Hours)\n" +
                "Review of Laplace Transform, Analysis of electrical circuits using Laplace Transform for standard inputs, convolution integral, inverse Laplace transform, transformed network with initial conditions. Transfer function representation. Poles and Zeros. Frequency response (magnitude and phase plots), series and parallel resonances\n" +
                "\n" +
                "Module-5\n" +
                "Two Port Network and Network Functions (6 Hours)\n" +
                "Two Port Networks, terminal pairs, relationship of two port variables, impedance parameters, admittance parameters, transmission parameters and hybrid parameters, interconnections of two port networks.\n" +
                "\n" +
                "Module-6\n" +
                "Network Topology and Graph Theory (3 Hours)\n" +
                "Introductory concepts of network graphs, cut sets, loops, cut set and loop analysis.                                            \n" +
                "\n" +
                "BOOKS\n" +
                "Suggested books\n" +
                "1. M. E. Van Valkenburg, “Network Analysis”, Prentice Hall, 2006.                                                            \n" +
                "2. D. Roy Choudhury, “Networks and Systems”, New Age International Publications, 1998.\n" +
                "3. W. H. Hayt and J. E. Kemmerly, “Engineering Circuit Analysis”, McGraw Hill Education, 2013.\n" +
                "4. C. K. Alexander and M. N. O. Sadiku, “Electric Circuits”, McGraw Hill Education, 2004..");

        List<String> DigitalElectronics = Arrays.asList("Module-1\n" +
                "Fundamentals of Digital Systems and logic families (7Hours)\n" +
                "Digital signals, digital circuits, AND, OR, NOT, NAND, NOR and Exclusive-OR operations, Boolean algebra, examples of IC gates, number systems-binary, signed binary, octal hexadecimal number, binary arithmetic, one’s and two’s complements arithmetic, codes, error detecting and correcting codes, characteristics of digital lCs, digital logic families, TTL, Schottky TTL and CMOS logic, interfacing CMOS and TTL, Tri-statelogic.\n" +
                "\n" +
                "Module-2\n" +
                "Combinational Digital Circuits (7Hours)\n" +
                "Standard representation for logic functions, K-map representation, simplification of logic functions using K-map, minimization of logical functions. Don’t care conditions, Multiplexer, De- Multiplexer/Decoders, Adders, Subtractors, BCD arithmetic, carry look ahead adder, serial ladder, ALU, elementary ALU design, popular MSI chips, digital comparator, paritychecker/generator, code converters, priority encoders, decoders/drivers for display devices, Q-M method of function realization.\n" +
                "\n" +
                "Module-3\n" +
                "Sequential circuits and systems (7Hours)\n" +
                "A 1-bit memory, the circuit properties of Bistable latch, the clocked SR flip flop, J- K- T and D- Types flip flops, applications of flip flops, shift registers, applications of shift registers, serial to parallel converter, parallel to serial converter, ring counter, sequence generator, ripple(Asynchronous) counters, synchronous counters, counters design using flip flops, special counter IC’s, asynchronous sequential counters, applications of counters.\n" +
                "\n" +
                "Module-4\n" +
                "A/D and D/A Converters (7Hours)\n" +
                "Digital to analog converters: weighted resistor/converter, R-2R Ladder D/A converter, specifications for D/A converters, examples of D/A converter lCs, sample and hold circuit, analog to digital converters: quantization and encoding, parallel comparator A/D converter, successive approximation A/D converter, counting A/D converter, dual slope A/D converter, A/D converter using voltage to frequency and voltage to time conversion, specifications of A/D converters, example of A/D converter ICs\n" +
                "\n" +
                "Module-5\n" +
                "Memory organization and operation, expanding memory size, classification and characteristics of memories, sequential memory, read only memory (ROM), read and write memory (RAM), content addressable memory (CAM), charge de coupled device memory (CCD), commonly used memory chips, ROM as a PLD, Programmable logic array, Programmable array logic, complex Programmable logic devices (CPLDS), Field Programmable Gate Array (FPGA)..");

        List<String> ElectricalMachines = Arrays.asList("Module-1\n" +
                "Magnetic fields and magnetic circuits (6 Hours)\n" +
                "Review of magnetic circuits - MMF, flux, reluctance, inductance; review of Ampere Law and Biot Savart Law; Visualization of magnetic fields produced by a bar magnet and a current carrying coil - through air and through a combination of iron and air; influence of highly permeable materials on the magnetic flux lines.\n" +
                "\n" +
                "Module-2\n" +
                "Electromagnetic force and torque (9 Hours)\n" +
                "B-H curve of magnetic materials; flux-linkage vs current characteristic of magnetic circuits; linear and nonlinear magnetic circuits; energy stored in the magnetic circuit; force as a partial derivative of stored energy with respect to position of a moving element; torque as a partial derivative of stored energy with respect to angular position of a rotating element. Examples - galvanometer coil, relay contact, lifting magnet, rotating element with eccentricity or saliency.\n" +
                "\n" +
                "Module-3\n" +
                "DC machines (8 Hours)\n" +
                "Basic construction of a DC machine, magnetic structure - stator yoke, stator poles, polefaces or shoes, air gap and armature core, visualization of magnetic field produced by the field winding excitation with armature winding open, air gap flux density distribution, flux per pole, induced EMF in an armature coil. Armature winding and commutation - Elementary armature coil and commutator, lap and wave windings, construction of commutator, linear commutation Derivation of back EMF equation, armature MMF wave, derivation of torque equation, armature reaction, air gap flux density distribution with armature reaction.\n" +
                "\n" +
                "Module-4\n" +
                "DC machine - motoring and generation (7 Hours)\n" +
                "Armature circuit equation for motoring and generation, Types of field excitations - separately excited, shunt and series. Open circuit characteristic of separately excited DC generator, back EMF with armature reaction, voltage build-up in a shunt generator, critical field resistance and critical speed. V-I characteristics and torque-speed characteristics of separately excited, shunt and series motors. Speed control through armature voltage. Losses, load testing and back-to-back testing of DC machines\n" +
                "\n" +
                "Module-5\n" +
                "Transformers (12 Hours)\n" +
                "Principle, construction and operation of single-phase transformers, equivalent circuit, phasor diagram, voltage regulation, losses and efficiency Testing - open circuit and short circuit tests, polarity test, back-to-back test, separation of hysteresis and eddy current losses Three-phase transformer - construction, types of connection and their comparative features, Parallel operation of single-phase and three-phase transformers, Autotransformers - construction, principle, applications and comparison with two winding transformer, Magnetizing current, effect of nonlinear B-H curve of magnetic core material, harmonics in magnetization current, Phase conversion - Scott connection, three-phase to six-phase conversion, Tap-changing transformers - No-load and on-load tap-changing of transformers, Three-winding transformers. Cooling of transformers..");

        List<String> ElectromagneticFields = Arrays.asList("Modul-1\n" +
                "Review of Vector Calculus ( 6 Hrs )\n" +
                "Vector algebra-addition, subtraction, components of vectors, scalar and vector multiplications, triple products, three orthogonal coordinate systems (rectangular, cylindrical and spherical). Vector calculus-differentiation, partial differentiation, integration, vector operator del, gradient, divergence a n d curl; integral theorems of vectors. Conversion of a vector from one coordinate system to an other.\n" +
                "\n" +
                "Module-2\n" +
                "Static Electric Field ( 6 Hrs )\n" +
                "Coulomb’s law, Electric field intensity, Electrical field due to point charges. Line, Surface and Volume charge distributions. Gauss law and its applications. Absolute Electric potential, Potential difference, Calculation of potential differences for different configurations. Electric dipole, Electrostatic Energy and Energy density.\n" +
                "\n" +
                "Module-3\n" +
                "Conductors, Dielectric and Capacitance ( 6 Hrs )\n" +
                "Current and current density, Ohms Law in Point form, Continuity of current, Boundary conditions of perfect dielectric materials. Permittivity of dielectric materials, Capacitance, Capacitance of a two wire line, Poisson’s equation, Laplace’s equation, Solution of Laplace and Poisson’s equation, Application of Laplace’s and Poisson’s equations.\n" +
                "\n" +
                "Module-4\n" +
                "Static Magnetic Fields ( 6 Hrs )\n" +
                "Biot-Savart Law, Ampere Law, Magnetic flux and magnetic flux density, Scalar and Vector Magnetic potentials. Steady magnetic fields produced by current carrying conductors.\n" +
                "\n" +
                "Module-5\n" +
                "Magnetic Forces,Material and Inductance ( 6 Hrs )\n" +
                "Force on a moving charge, Force on a differential current element, Force between differential current elements, Nature of magnetic materials, Magnetization and permeability, Magnetic boundary conditions, Magnetic circuits, inductances and mutual inductances.\n" +
                "\n" +
                "Module-6\n" +
                "Time Variying Fields and MAxxwell's Equations ( 6 Hrs )\n" +
                "Faraday’s law for Electromagnetic induction, Displacement current, Point form of Maxwell’s equation, Integral form of Maxwell’s equations, Motional Electromotive forces. Boundary Conditions.\n" +
                "\n" +
                "Module-7\n" +
                "Electromagnetic Waves ( 6 Hrs )\n" +
                "Derivation of Wave Equation, Uniform Plane Waves, Maxwell’s equation in Phasor form, Wave equation in Phasor form, Plane waves in free space and in a homogenous material. Wave equation for a conducting medium, Plane waves in lossy dielectrics, Propagation in good conductors, Skin effect. Poynting theorem.\n" +
                "\n" +
                "Module-8\n" +
                "Transmission line (4 Hours)\n" +
                "Introduction, Concept of distributed elements, Equations of voltage and current, Standing waves and impedance transformation, Lossless and low-loss transmission lines, Power transfer on a transmission line, Analysis of transmission line in terms of admittances, Transmission line calculations with the help of Smith chart, Applications of transmission line, Impedance matching using transmission lines..");

        List<String> EngineeringMechanics = Arrays.asList("Module-1\n" +
                "Introduction to Vectors, Tensors and Co-ordinate system ( 5 Hrs )\n" +
                "Introduction to vectors and tensors and coordinate systems; Vector and tensor algebra; Indical notation; Symmetric and anti-symmetric tensors; Eigenvalues and Principal axes..\n" +
                "\n" +
                "Module-2\n" +
                "Three-Dimensional Rotation ( 4 Hrs )\n" +
                "Three-dimensional rotation: Euler’s theorem, Axis-angle formulation and Euler angles; Coordinate transformation of vectors and tensors.\n" +
                "\n" +
                "Module-3\n" +
                "Kinematics of Rigid Body ( 6 Hrs )\n" +
                "Kinematics of rigid bodies: Dentition and motion of a rigid body; Rigid bodies as coordinate systems; Angular velocity of a rigid body, and its rate of change; Distinction between two-and three-dimensional rotational motion; Integration of angular velocity to find orientation; Motion relative to a rotating rigid body: Five term acceleration formula.\n" +
                "\n" +
                "Module-4\n" +
                "Kinetics of Rigid Body ( 5 Hrs )\n" +
                "Kinetics of rigid bodies: Angular momentum about a point; Inertia tensor: Dentition and computation, Principal moments and axes of inertia, Parallel and perpendicular axes theorems; Mass moment of inertia of symmetrical bodies, cylinder, sphere, cone etc., Area moment of inertia and Polar moment of inertia, Forces and moments; Newton-Euler’s laws of rigid body motion.\n" +
                "\n" +
                "Module-5\n" +
                "Free Body Diagram and General Motion ( 10 Hrs )\n" +
                "Free body diagrams; Examples on modelling of typical supports and joints and discussion on the kinematic and kinetic constraints that they impose.\n" +
                "Examples and problems. General planar motions. General 3-D motions. Free precession, Gyroscopes, Rolling coin.\n" +
                "\n" +
                "Module-6\n" +
                "Bending Moment ( 5 Hrs )\n" +
                "Transverse loading on beams, shear force and bending moment in beams, analysis of cantilevers, simply supported beams and overhanging beams, relationships between loading, shear force and bending moment, shear force and bending moment diagrams.\n" +
                "\n" +
                "Module-7\n" +
                "Torsional Motion and Friction ( 5 Hrs )\n" +
                "s\n" +
                "Torsion of circular shafts, derivation of torsion equation, stress and deformation in circular and hollow shafts.\n" +
                "Concept of Friction; Laws of Coulomb friction; Angle of Repose; Coefficient of friction..");

        List<String> ElectricalMachinesLAB = Arrays.asList("Electrical Machines-I LAB");

        List<Semester> thirdSemesters = new ArrayList<>();
        thirdSemesters.add(new Semester("Electrical Circuit Analysis", ElectricalCircuitAnalysis));
        thirdSemesters.add(new Semester("Digital Electronics", DigitalElectronics));
        thirdSemesters.add(new Semester("Electrical Machines-I", ElectricalMachines));
        thirdSemesters.add(new Semester("Electromagnetic Fields", ElectromagneticFields));
        thirdSemesters.add(new Semester("Engineering Mechanics", EngineeringMechanics));
        thirdSemesters.add(new Semester("Electrical Machines-I LAB", ElectricalMachinesLAB));

        branches.add(new Branch("Semester 3", thirdSemesters));
        //3rd Semester Complete...



        //4 Semester Start....
        List<String> AnalogElectronicCircuit = Arrays.asList("Module-1\n" +
                "Diode circuits (4 Hours)\n" +
                "P-N junction diode, I-V characteristics of a diode; review of half-wave and full-wave rectifiers, Zener diodes, clamping and clipping circuits.\n" +
                "\n" +
                "Module-2\n" +
                "BJT circuits (8 Hours)\n" +
                "Structure and I-V characteristics of a BJT; BJT as a switch. BJT as an amplifier: small-signal model, biasing circuits, current mirror; common-emitter, common-base and common-collector amplifiers; Small signal equivalent circuits, high-frequency equivalent circuits\n" +
                "\n" +
                "Module-3\n" +
                "MOSFET circuits (8 Hours)\n" +
                "MOSFET structure and I-V characteristics. MOSFET as a switch. MOSFET as an amplifier: smallsignal model and biasing circuits, common-source, common-gate and common-drain amplifiers; small signal equivalent circuits - gain, input and output impedances, trans-conductance, high frequency equivalent circuit.\n" +
                "\n" +
                "Module-4\n" +
                "Differential, multi-stage and operational amplifiers (8 Hours)\n" +
                "Differential amplifier; power amplifier; direct coupled multi-stage amplifier; internal structure of an operational amplifier, ideal op-amp, non-idealities in an op-amp (Output offset voltage, input bias current, input offset current, slew rate, gain bandwidth product), Frequency Response of the amplifier.\n" +
                "\n" +
                "Module-5\n" +
                "Linear applications of op-amp (8 Hours)\n" +
                "Idealized analysis of op-amp circuits. Inverting and non-inverting amplifier, differential amplifier, +instrumentation amplifier, integrator, active filter, P, PI and PID controllers and lead/lag compensator using an op-amp, voltage regulator, Feedback amplifiers and Oscillators design (Wein bridge and phase shift). Analog to Digital Conversion.\n" +
                "\n" +
                "Module-6\n" +
                "Nonlinear applications of op-amp (6 Hours)\n" +
                "Hysteretic Comparator, Zero Crossing Detector, Square-wave and triangular-wave generators. Precision rectifier, peak detector. Monoshot..");

        List<String> ElectricalMachinesSecond = Arrays.asList("Module-1\n" +
                "Fundamentals of AC machine windings (8 Hours)\n" +
                "Physical arrangement of windings in stator and cylindrical rotor; slots for windings; single-turn coil - active portion and overhang; full-pitch coils, concentrated winding, distributed winding, winding axis, 3D visualization of the above winding types, Air-gap MMF distribution with fixed current through winding-concentrated and distributed, Sinusoidally distributed winding, winding distribution factor\n" +
                "\n" +
                "Module-2\n" +
                "Pulsating and revolving magnetic fields (4 Hours)\n" +
                "Constant magnetic field, pulsating magnetic field - alternating current in windings with spatial displacement, Magnetic field produced by a single winding - fixed current and alternating current Pulsating fields produced by spatially displaced windings, Windings spatially shifted by 90 degrees, Addition of pulsating magnetic fields, Three windings spatially shifted by 120 degrees (carrying three-phase balanced currents), revolving magnetic field.\n" +
                "\n" +
                "Module-3\n" +
                "Induction Machines (12 Hours)\n" +
                "Construction, Types (squirrel cage and slip-ring), Torque Slip Characteristics, Starting and Maximum Torque. Equivalent circuit. Phasor Diagram, Losses and Efficiency. Effect of parameter variation on torque speed characteristics (variation of rotor and stator resistances, stator voltage, frequency). Methods of starting, braking and speed control for induction motors. Generator operation. Self-excitation. Doubly-Fed Induction Machines.\n" +
                "\n" +
                "Module-4\n" +
                "Single-phase induction motors (6 Hours)\n" +
                "Constructional features, double revolving field theory, equivalent circuit, determination of parameters. Split-phase starting methods and applications\n" +
                "\n" +
                "module-5\n" +
                "Synchronous machines (10 Hours)\n" +
                "Constructional features, cylindrical rotor synchronous machine - generated EMF, equivalent circuit and phasor diagram, armature reaction, synchronous impedance, voltage regulation. Operating characteristics of synchronous machines, V-curves. Salient pole machine - two reaction theory, analysis of phasor diagram, power angle characteristics. Parallel operation of alternators - synchronization and load division..");

        List<String> Microprocessors = Arrays.asList("Module-1\n" +
                "Fundamentals of Microprocessors: (7 Hours)\n" +
                "Fundamentals of Microprocessor Architecture. 8-bitMicroprocessor and Microcontroller architecture, Comparison of 8-bit microcontrollers, 16-bit and 32-bit microcontrollers. Definition of embedded system and its characteristics, Role of microcontrollers in embedded Systems. Overview of the 8051 family.\n" +
                "\n" +
                "Module-2\n" +
                "The 8051 Architecture (8 Hours)\n" +
                "Internal Block Diagram, CPU, ALU, address, data and control bus, Working registers, SFRs, Clock and RESET circuits, Stack and Stack Pointer, Program Counter, I/O ports, Memory Structures, Data and Program Memory, Timing diagrams and Execution Cycles.\n" +
                "\n" +
                "Module-3\n" +
                "Instruction Set and Programming (8 Hours)\n" +
                "Addressing modes: Introduction, Instruction syntax, Data types, Subroutines Immediate addressing, Register addressing, Direct addressing, Indirect addressing, Relative addressing, Indexed addressing, Bit inherent addressing, bit direct addressing. 8051 Instruction set, Instruction timings. Data transfer instructions, Arithmetic instructions, Logical instructions, Branch instructions, Subroutine instructions, Bit manipulation instruction. Assembly language programs, C language programs. Assemblers and compilers. Programming and debugging tools.\n" +
                "\n" +
                "Module-4\n" +
                "Memory and I/O Interfacing (6 Hours)\n" +
                "Memory and I/O expansion buses, control signals, memory wait states. Interfacing of peripheral devices such as General Purpose I/O, ADC, DAC, timers, counters, memory devices.\n" +
                "\n" +
                "Module-5\n" +
                "External Communication Interface (6 Hours)\n" +
                "Synchronous and Asynchronous Communication. RS232, SPI, I2C. Introduction and interfacing to protocols like Blue-tooth and Zig-bee. Module 6: Applications (6 Hours) LED, LCD and keyboard interfacing. Stepper motor interfacing, DC Motor interfacing, sensor interfacing.\n" +
                "\n" +
                "Module-6\n" +
                "Applications (6 Hours)\n" +
                "LED, LCD and keyboard interfacing. Stepper motor interfacing, DC Motor interfacing, sensor interfacing..");

        List<String> SignalSystems = Arrays.asList("Module-1\n" +
                "Introduction to Signals and Systems (3 hours)\n" +
                "Signals and systems as seen in everyday life, and in various branches of engineering and science. Signal properties: periodicity, absolute integrability, determinism and stochastic character. Some special signals of importance: the unit step, the unit impulse, the sinusoid, the complex exponential, some special time-limited signals; continuous and discrete time signals, continuous and discrete amplitude signals. System properties: linearity: additivity and homogeneity, shift-invariance, causality, stability, realizability. Examples.\n" +
                "\n" +
                "Module-2\n" +
                "Behavior of continuous and discrete-time LTI systems (8 hours)\n" +
                "Impulse response and step response, convolution, input-output behavior with aperiodic convergent inputs, cascade interconnections. Characterization of causality and stability of LTI systems. System representation through differential equations and difference equations. State-space Representation of systems. State-Space Analysis, Multi-input, multi-output representation. State Transition Matrix and its Role. Periodic inputs to an LTI system, the notion of a frequency response and its relation to the impulse response.\n" +
                "\n" +
                "Module-3\n" +
                "Fourier, Laplace and z- Transforms (10 hours)\n" +
                "Fourier series representation of periodic signals, Waveform Symmetries, Calculation of Fourier Coefficients. Fourier Transform, convolution/multiplication and their effect in the frequency domain, magnitude and phase response, Fourier domain duality. The Discrete-Time Fourier Transform (DTFT) and the Discrete Fourier Transform (DFT). Parseval's Theorem. Review of the Laplace Transform for continuous time signals and systems, system functions, poles and zeros of system functions and signals, Laplace domain analysis, solution to differential equations and system behavior. The z-Transform for discrete time signals and systems, system functions, poles and zeros of systems and sequences, z- domain analysis.\n" +
                "\n" +
                "Module-4\n" +
                "Sampling and Reconstruction (4 hours)\n" +
                "The Sampling Theorem and its implications. Spectra of sampled signals. Reconstruction: ideal interpolator, zero-order hold, first-order hold. Aliasing and its effects. Relation between continuous and discrete time systems. Introduction to the applications of signal and system theory: modulation for communication, filtering, feedback control systems..");

        List<String> MathematicsThree = Arrays.asList("Module-1\n" +
                "Basic Probability (12 hours)\n" +
                "Probability spaces, conditional probability, independence; Discrete random variables, Independent random variables, the multinomial distribution, Poisson approximation to the binomial distribution, infinite sequences of Bernoulli trials, sums of independent random variables; Expectation of Discrete Random Variables, Moments, Variance of a sum, Correlation coefficient, Chebyshev's Inequality.\n" +
                "\n" +
                "Module-2\n" +
                "Continuous Probability Distributions (4 hours)\n" +
                "Continuous random variables and their properties, distribution functions and densities, normal, exponential and gamma densities.\n" +
                "\n" +
                "Module-3\n" +
                "Bivariate Distributions (4 hours)\n" +
                "Bivariate distributions and their properties, distribution of sums and quotients, conditional densities, Bayes' rule.\n" +
                "\n" +
                "Module-4\n" +
                "Basic Statistics (8 hours)\n" +
                "Measures of Central tendency: Moments, skewness and Kurtosis - Probability distributions: Binomial, Poisson and Normal - evaluation of statistical parameters for these three distributions, Correlation and regression – Rank correlation.\n" +
                "\n" +
                "Module-5\n" +
                "Applied Statistics (8 hours)\n" +
                "Curve fitting by the method of least squares- fitting of straight lines, second degree parabolas and more general curves. Test of significance: Large sample test for single proportion, difference of proportions, single mean, difference of means, and difference of standard deviations.\n" +
                "\n" +
                "Module-6\n" +
                "Small samples (4 hours)\n" +
                "Test for single mean, difference of means and correlation coefficients, test for ratio of variances - Chi-square test for goodness of fit and independence of attributes..");

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
                "Purpose: The fundamental principles of energy transactions are the same in physical and biological world. Thermodynamics as applied to biological systems. Exothermic and endothermic versus endergonic and exergonic reactions. Concept of Keq and its relation to standard free energy. Spontaneity. ATP as an energy..");

        List<Semester> fourthSemesters = new ArrayList<>();
        fourthSemesters.add(new Semester("Analog Electronic Circuit", AnalogElectronicCircuit));
        fourthSemesters.add(new Semester("Electrical Machines-II", ElectricalMachinesSecond));
        fourthSemesters.add(new Semester("Microprocessors", Microprocessors));
        fourthSemesters.add(new Semester("Signal and Systems", SignalSystems));
        fourthSemesters.add(new Semester("Mathematics-III (Probability and Statics )", MathematicsThree));
        fourthSemesters.add(new Semester("Biology", Biology));

        branches.add(new Branch("Semester 4", fourthSemesters));
        //4th Semester emd.....



        //5 Semester Start.....
        List<String> ANALOGDIGITALCOMMUNICATIONSYSTEM = Arrays.asList("Course Outcome:\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\uF0B7 Understand the basics of communication system, analog and digital modulation techniques.\n" +
                "\uF0B7 Apply the knowledge of digital electronics and understand the error control coding techniques.\n" +
                "\uF0B7 Summarize different types of communication systems and its requirements.\n" +
                "\n" +
                "Module 1: Basic blocks of Communication System. Analog Modulation - Principles of Amplitude Modulation, DSBSC, SSB-SC and VSB-SC. AM transmitters and receivers.\n" +
                "\n" +
                "Module 2: Angle Modulation - Frequency and Phase Modulation. Transmission Bandwidth of FM signals, Methods of generation and detection. FM Transmitters and Receivers.\n" +
                "\n" +
                "Module 3: Sampling theorem - Pulse Modulation Techniques - PAM, PWM and PPM concepts - PCM system – Data transmission using analog carriers (ASK, FSK, BPSK, QPSK).\n" +
                "\n" +
                "Module 4: Error control coding techniques – Linear block codes- Encoder and decoder. Cyclic codes – Encoder, Syndrome Calculator. Convolution codes.\n" +
                "\n" +
                "Module 5: Modern Communication Systems – Microwave communication systems - Optical communication system - Satellite communication system - Mobile communication system.\n" +
                "\n" +
                "Text / References:\n" +
                "1. Simon Haykins, ‘Communication Systems’, John Wiley, 3rd Edition, 1995.\n" +
                "2. D.Roddy & J.Coolen, ‘Electronic Communications’, Prentice Hall of India, 4th Edition, 1999.\n" +
                "3. Kennedy G, ‘Electronic Communication System’, McGraw Hill, 1987.\n" +
                "PCC-EEE20: Analog & Digital Communication System Laboratory (0:0:2 – 1 credit)\n" +
                "Hands-on/Computer experiments related to the course contents of PCC-EEE19..");

        List<String> CAPSTONEDESIGNPROJECT = Arrays.asList("CAPSTONE DESIGN PROJECT..");

        List<String> CONSTITUTIONINDIA = Arrays.asList("The Constitution of India is the supreme law of India. Parliament of India cannot make any law which violates the Fundamental Rights enumerated under the Part III of the Constitution. The Parliament of India has been empowered to amend the Constitution under Article 368, however, it cannot use this power to change the “basic structure” of the constitution, which has been ruled and explained by the Supreme Court of India in its historical judgments. The Constitution of India reflects the idea of “Constitutionalism” – a modern and progressive concept historically developed by the thinkers of “liberalism” – an ideology which has been recognized as one of the most popular political ideology and result of historical struggles against arbitrary use of sovereign power by state. The historic revolutions in France, England, America and particularly European Renaissance and Reformation movement have resulted into progressive legal reforms in the form of “constitutionalism” in many countries. The Constitution of India was made by borrowing models and principles from many countries including United Kingdom and America.\n" +
                "\n" +
                "The Constitution of India is not only a legal document but it also reflects social, political and economic perspectives of the Indian Society. It reflects India’s legacy of “diversity”. It has been said that Indian constitution reflects ideals of its freedom movement, however, few critics have argued that it does not truly incorporate our own ancient legal heritage and cultural values. No law can be “static” and therefore the Constitution of India has also been amended more than one hundred times. These amendments reflect political, social and economic developments since the year 1950. The Indian judiciary and particularly the Supreme Court of India has played an historic role as the guardian of people. It has been protecting not only basic ideals of the Constitution but also strengthened the same through progressive interpretations of the text of the Constitution. The judicial activism of the Supreme Court of India and its historic contributions has been recognized throughout the world and it gradually made it “as one of the strongest court in the world”.\n" +
                "\n" +
                "Course content:\n" +
                "1. Meaning of the constitution law and constitutionalism\n" +
                "2. Historical perspective of the Constitution of India\n" +
                "3. Salient features and characteristics of the Constitution of India\n" +
                "4. Scheme of the fundamental rights\n" +
                "5. The scheme of the Fundamental Duties and its legal status\n" +
                "6. The Directive Principles of State Policy – Its importance and implementation\n" +
                "7. Federal structure and distribution of legislative and financial powers between the Union and the States\n" +
                "8. Parliamentary Form of Government in India – The constitution powers and status of the President of India\n" +
                "9. Amendment of the Constitutional Powers and Procedure\n" +
                "10. The historical perspectives of the constitutional amendments in India\n" +
                "11. Emergency Provisions: National Emergency, President Rule, Financial Emergency\n" +
                "12. Local Self Government – Constitutional Scheme in India\n" +
                "13. Scheme of the Fundamental Right to Equality\n" +
                "14. Scheme of the Fundamental Right to certain Freedom under Article 19\n" +
                "15. Scope of the Right to Life and Personal Liberty under Article 21..");

        List<String> CONTROLSYSTEMS = Arrays.asList("Course Outcomes:\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\uF0B7 Understand the modelling of linear-time-invariant systems using transfer function and state- space representations.\n" +
                "\uF0B7 Understand the concept of stability and its assessment for linear-time invariant systems.\n" +
                "\uF0B7 Design simple feedback controllers.\n" +
                "\n" +
                "Module 1: Introduction to control problem (4 hours)\n" +
                "Industrial Control examples. Mathematical models of physical systems. Control hardware and their models. Transfer function models of linear time-invariant systems.\n" +
                "Feedback Control: Open-Loop and Closed-loop systems. Benefits of Feedback. Block diagram\n" +
                "algebra.\n" +
                "\n" +
                "Module 2: Time Response Analysis (10 hours)\n" +
                "Standard test signals. Time response of first and second order systems for standard test inputs.\n" +
                "Application of initial and final value theorem. Design specifications for second-order systems based on the time-response.\n" +
                "Concept of Stability. Routh-Hurwitz Criteria. Relative Stability analysis. Root-Locus technique. Construction of Root-loci.\n" +
                "\n" +
                "Module 3: Frequency-response analysis (6 hours)\n" +
                "Relationship between time and frequency response, Polar plots, Bode plots. Nyquist stability criterion. Relative stability using Nyquist criterion – gain and phase margin. Closed-loop frequency response.\n" +
                "\n" +
                "Module 4: Introduction to Controller Design (10 hours)\n" +
                "Stability, steady-state accuracy, transient accuracy, disturbance rejection, insensitivity and robustness of control systems.\n" +
                "Root-loci method of feedback controller design.\n" +
                "Design specifications in frequency-domain. Frequency-domain methods of design.\n" +
                "Application of Proportional, Integral and Derivative Controllers, Lead and Lag compensation in designs. Analog and Digital implementation of controllers.\n" +
                "\n" +
                "Module 5: State variable Analysis (6 hours)\n" +
                "Concepts of state variables. State space model. Diagonalization of State Matrix. Solution of state equations. Eigenvalues and Stability Analysis. Concept of controllability and observability.\n" +
                "Pole-placement by state feedback.\n" +
                "Discrete-time systems. Difference Equations. State-space models of linear discrete-time systems.\n" +
                "Stability of linear discrete-time systems.\n" +
                "Module 6: Introduction to Optimal Control and Nonlinear Control (5 hours)\n" +
                "Performance Indices. Regulator problem, Tracking Problem. Nonlinear system–Basic concepts and analysis.\n" +
                "\n" +
                "Text/References:\n" +
                "1. M. Gopal, “Control Systems: Principles and Design”, McGraw Hill Education, 1997.\n" +
                "2. B. C. Kuo, “Automatic Control System”, Prentice Hall, 1995.\n" +
                "3. K. Ogata, “Modern Control Engineering”, Prentice Hall, 1991.\n" +
                "4. I. J. Nagrath and M. Gopal, “Control Systems Engineering”, New Age International, 2009\n" +
                "PCC-EEE16: Control Systems Laboratory (0:0:2 – 1 credit)\n" +
                "Hands-on/Computer experiments related to the course contents of PCC-EEE15..");

        List<String> MOOCS = Arrays.asList("MOOCS / SWAYAM / NPTEL (COURSES-2)");

        List<String> POWERELECTRONICS = Arrays.asList("Course Outcomes:\n" +
                "At the end of this course students will demonstrate the ability to\n" +
                "\uF0B7 Understand the differences between signal level and power level devices.\n" +
                "\uF0B7 Analyse controlled rectifier circuits.\n" +
                "\uF0B7 Analyse the operation of DC-DC choppers.\n" +
                "\uF0B7 Analyse the operation of voltage source inverters.\n" +
                "\n" +
                "Module 1: Power switching devices (8 Hours)\n" +
                "Diode, Thyristor, MOSFET, IGBT: I-V Characteristics; Firing circuit for thyristor; Voltage and current commutation of a thyristor; Gate drive circuits for MOSFET and IGBT.\n" +
                "\n" +
                "Module 2: Thyristor rectifiers (7 Hours)\n" +
                "Single-phase half-wave and full-wave rectifiers, Single-phase full-bridge thyristor rectifier with R- load and highly inductive load; Three-phase full-bridge thyristor rectifier with R-load and highly\n" +
                "inductive load; Input current wave shape and power factor.\n" +
                "\n" +
                "Module 3: DC-DC buck converter (5 Hours)\n" +
                "Elementary chopper with an active switch and diode, concepts of duty ratio and average voltage,\n" +
                "power circuit of a buck converter, analysis and waveforms at steady state, duty ratio control of output voltage.\n" +
                "\n" +
                "Module 4: DC-DC boost converter (5 Hours)\n" +
                "Power circuit of a boost converter, analysis and waveforms at steady state, relation between duty ratio and average output voltage.\n" +
                "\n" +
                "Module 5: Single-phase voltage source inverter (10 Hours)\n" +
                "Power circuit of single-phase voltage source inverter, switch states and instantaneous output voltage,\n" +
                "square wave operation of the inverter, concept of average voltage over a switching cycle, bipolar sinusoidal modulation and unipolar sinusoidal modulation, modulation index and output voltage\n" +
                "\n" +
                "Module 6: Three-phase voltage source inverter (8 Hours)\n" +
                "Power circuit of a three-phase voltage source inverter, switch states, instantaneous output voltages, average output voltages over a sub-cycle, three-phase sinusoidal modulation\n" +
                "\n" +
                "Module 7: A.C. to A.C. Converter (8 Hours) [14]\n" +
                "Classification, principle of operation of step up and step down cyclo-converter, single phase to single phase cyclo-converter with resistive and inductive load, three phase to single phase cyclo-converter, half wave and full wave, cosine wave crossing technique. three phase to three phase cyclo-converter. output voltage equation of cyclo-converter.\n" +
                "\n" +
                "Text/References:\n" +
                "1. M. H. Rashid, “Power electronics: circuits, devices, and applications”, Pearson Education India, 2009.\n" +
                "2. N. Mohan and T. M. Undeland, “Power Electronics: Converters, Applications and Design”,\n" +
                "John Wiley & Sons, 2007.\n" +
                "3. R. W. Erickson and D. Maksimovic, “Fundamentals of Power Electronics”, Springer Science & Business Media, 2007.\n" +
                "4. L. Umanand, “Power Electronics: Essentials and Applications”, Wiley India, 2009.\n" +
                "PCC-EEE18: Power Electronics Laboratory (0:0:2 – 1 credit)\n" +
                "Hands-on experiments related to the course contents of PCC-EEE17..");

        List<String> POWERSYSTEMFirs = Arrays.asList("Course Outcomes:\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\uF0B7 Understand the concepts of power systems.\n" +
                "\uF0B7 Understand the various power system components.\n" +
                "\uF0B7 Evaluate fault currents for different types of faults.\n" +
                "\uF0B7 Understand the generation of over-voltages and insulation coordination.\n" +
                "\uF0B7 Understand basic protection schemes.\n" +
                "\uF0B7 Understand concepts of HVDC power transmission and renewable energy generation.\n" +
                "\n" +
                "Module 1: Basic Concepts (4 hours)\n" +
                "Evolution of Power Systems and Present-Day Scenario. Structure of a power system: Bulk Power\n" +
                "Grids and Micro-grids.\n" +
                "Generation: Conventional and Renewable Energy Sources. Distributed Energy Resources. Energy\n" +
                "Storage. Transmission and Distribution Systems: Line diagrams, transmission and distribution voltage levels and topologies (meshed and radial systems). Synchronous Grids and Asynchronous (DC) interconnections. Review of Three-phase systems. Analysis of simple three-phase circuits. Power Transfer in AC circuits and Reactive Power.\n" +
                "\n" +
                "Module 2: Power System Components (15 hours)\n" +
                "Overhead Transmission Lines and Cables: Electrical and Magnetic Fields around conductors, Corona. Parameters of lines and cables. Capacitance and Inductance calculations for simple\n" +
                "configurations. Travelling-wave Equations. Sinusoidal Steady state representation of Lines: Short, medium and long lines. Power Transfer, Voltage profile and Reactive Power.\n" +
                "Characteristics of transmission lines. Surge Impedance Loading. Series and Shunt Compensation of transmission lines.\n" +
                "Transformers: Three-phase connections and Phase-shifts. Three-winding transformers, auto- transformers, Neutral Grounding transformers. Tap-Changing in transformers.\n" +
                "Transformer Parameters. Single phase equivalent of three-phase transformers.\n" +
                "Synchronous Machines: Steady-state performance characteristics. Operation when connected to infinite bus. Real and Reactive Power Capability Curve of generators. Typical waveform under balanced terminal short circuit conditions – steady state, transient and sub-transient equivalent circuits. Loads: Types, Voltage and Frequency Dependence of Loads. Per-unit System and per-unit calculations.\n" +
                "\n" +
                "Module 3: Over-voltages and Insulation Requirements (4 hours)\n" +
                "Generation of Over-voltages: Lightning and Switching Surges. Protection against Over-voltages, Insulation Coordination. Propagation of Surges. Voltages produced by traveling surges. Bewley\n" +
                "Diagrams.\n" +
                "\n" +
                "Module 4: Fault Analysis and Protection Systems (10 hours)\n" +
                "\n" +
                "Method of Symmetrical Components (positive, negative and zero sequences). Balanced and Unbalanced Faults. Representation of generators, lines and transformers in sequence networks. Computation of Fault Currents. Neutral Grounding.\n" +
                "Switchgear: Types of Circuit Breakers. Attributes of Protection schemes, Back-up Protection. Protection schemes (Over-current, directional, distance protection, differential protection) and their application.\n" +
                "\n" +
                "Module 5: Introduction to DC Transmission & Renewable Energy Systems (9 hours)\n" +
                "DC Transmission Systems: Line-Commutated Converters (LCC) and Voltage Source Converters (VSC). LCC and VSC based dc link, Real Power Flow control in a dc link. Comparison of ac and dc\n" +
                "transmission. Solar PV systems: I-V and P-V characteristics of PV panels, power electronic interface of PV to the grid. Wind Energy Systems: Power curve of wind turbine. Fixed and variable speed turbines. Permanent Magnetic Synchronous Generators and Induction Generators. Power Electronics interfaces of wind generators to the grid.\n" +
                "\n" +
                "Text/References:\n" +
                "1. J. Grainger and W. D. Stevenson, “Power System Analysis”, McGraw Hill Education, 1994.\n" +
                "2. O. I. Elgerd, “Electric Energy Systems Theory”, McGraw Hill Education, 1995.\n" +
                "3. A. R. Bergen and V. Vittal, “Power System Analysis”, Pearson Education Inc., 1999.\n" +
                "4. D. P. Kothari and I. J. Nagrath, “Modern Power System Analysis”, McGraw Hill Education, 2003.\n" +
                "5. B. M. Weedy, B. J. Cory, N. Jenkins, J. Ekanayake and G. Strbac, “Electric Power Systems”, Wiley, 2012.\n" +
                "PCC-EEE14: Power Systems – I Laboratory (0:0:2 – 1 credit)\n" +
                "Hands-on experiments related to the course contents of PCC-EEE13. Visits to power system installations (generation stations, EHV substations etc.) are suggested. Exposure to fault analysis and Electro- magnetic transient program (EMTP) and Numerical Relays are suggested..");

        List<String> PROFESSIONALELECTIVELABFirst = Arrays.asList("PROFESSIONAL ELECTIVE LAB -I..");

        List<String> SUMMERENTREPRENEURSHIPSecond = Arrays.asList("SUMMER ENTREPRENEURSHIP -II..");

        List<Semester> fifthSemesters = new ArrayList<>();
        fifthSemesters.add(new Semester("ANALOG AND DIGITAL COMMUNICATION SYSTEM", ANALOGDIGITALCOMMUNICATIONSYSTEM));
        fifthSemesters.add(new Semester("CAPSTONE DESIGN PROJECT", CAPSTONEDESIGNPROJECT));
        fifthSemesters.add(new Semester("CONSTITUTION OF INDIA/ESSENCE OF INDIAN KNOWLEDGE TRADITIONAL", CONSTITUTIONINDIA));
        fifthSemesters.add(new Semester("CONTROL SYSTEMS", CONTROLSYSTEMS));
        fifthSemesters.add(new Semester("MOOCS / SWAYAM / NPTEL (COURSES-2)", MOOCS));
        fifthSemesters.add(new Semester("POWER ELECTRONICS", POWERELECTRONICS));
        fifthSemesters.add(new Semester("POWER SYSTEM-I (APPARATUS AND MODELLING)", POWERSYSTEMFirs));
        fifthSemesters.add(new Semester("PROFESSIONAL ELECTIVE LAB -I", PROFESSIONALELECTIVELABFirst));
        fifthSemesters.add(new Semester("SUMMER ENTREPRENEURSHIP -II", SUMMERENTREPRENEURSHIPSecond));

        branches.add(new Branch("Semester 5", fifthSemesters));
        //5th Semester End.......



        //6 Semester Start.....
        List<String> DIGITALSIGNALPROCESSING = Arrays.asList("Course Outcomes: \n" +
                "\n" +
                " At the end of this course, students will demonstrate the ability to \n" +
                "\n" +
                " Represent signals mathematically in continuous and discrete-time, and in the frequency domain. \n" +
                "\n" +
                " Analyse discrete-time systems using z-transform. \n" +
                "\n" +
                " Understand the Discrete-Fourier Transform (DFT) and the FFT algorithms. \n" +
                "\n" +
                " Design digital filters for various applications. \n" +
                "\n" +
                " Apply digital signal processing for the analysis of real-life signals. \n" +
                "\n" +
                "Module 1: Discrete-time signals and systems (6 hours) Discrete time signals and systems: Sequences; representation of signals on orthogonal basis; Representation of discrete systems using difference equations, Sampling and reconstruction of signals - aliasing; Sampling theorem and Nyquist rate. \n" +
                "\n" +
                "Module 2: Z-transform (6 hours) z-Transform, Region of Convergence, Analysis of Linear Shift Invariant systems using z-transform, Properties of z-transform for causal signals, Interpretation of stability in z-domain, Inverse z-transforms. \n" +
                "\n" +
                "Module 2: Discrete Fourier Transform (10 hours) Frequency Domain Analysis, Discrete Fourier Transform (DFT), Properties of DFT, Connvolution of signals, Fast Fourier Transform Algorithm, Parseval’s Identity, Implementation of Discrete Time Systems. \n" +
                "\n" +
                "Module 3: Designof Digital filters(12 hours) Design of FIR Digital filters: Window method, Park-McClellan's method. Design of IIR Digital Filters: Butterworth, Chebyshev and Elliptic Approximations; Low-pass, Band-pass, Band-stop and Highpass filters. Effect of finite register length in FIR filter design. Parametric and non-parametric spectral estimation. Introduction to multi-rate signal processing. \n" +
                "\n" +
                "Module 4: Applications of Digital Signal Processing (6 hours) Correlation Functions and Power Spectra, Stationary Processes, Optimal filtering using ARMA Model, Linear Mean-Square Estimation, Wiener Filter. \n" +
                "\n" +
                "Text/ReferenceBooks: \n" +
                "\n" +
                "1. S. K. Mitra, “Digital Signal Processing: A computer based approach”, McGraw Hill, 2011. \n" +
                "\n" +
                "2. A.V. Oppenheim and R. W. Schafer, “Discrete Time Signal Processing”, Prentice Hall, 1989. \n" +
                "\n" +
                "3. J. G. Proakis and D.G. Manolakis, “Digital Signal Processing: Principles, Algorithms And Applications”, Prentice Hall, 1997.\n" +
                "\n" +
                " 4. L. R. Rabiner and B. Gold, “Theory and Application of Digital Signal Processing”, Prentice Hall, 1992. \n" +
                "\n" +
                "5. J. R.Johnson, “Introduction toDigital Signal Processing”, PrenticeHall, 1992. \n" +
                "\n" +
                "6. D. J. DeFatta, J. G. Lucas andW. S. Hodgkiss, “Digital Signal Processing”, John Wiley & Sons, 1988. \n" +
                "\n" +
                "PCC-EEE24: Digital Signal Processing Laboratory (0:0:2 – 1 credit) \n" +
                "\n" +
                "Hands-on/Computer experiments related to the course contents of PCC-EEE23 ..");

        List<String> MEASUREMENTINSTRUMENTATION = Arrays.asList("Course Outcomes: \n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to \n" +
                "\n" +
                "Design and validate DC and AC bridges. \n" +
                "\n" +
                " Analyze the dynamic response and the calibration of few instruments. \n" +
                "\n" +
                " Learn about various measurement devices, their characteristics, their operation and their limitations. \n" +
                "\n" +
                "Understand statistical data analysis. \n" +
                "\n" +
                "Understand computerized data acquisition. \n" +
                "\n" +
                "Lectures/Demonstrations: \n" +
                "\n" +
                "1. Concepts relating to Measurements: True value, Accuracy, Precision, Resolution, Drift, Hysteresis, Dead-band, Sensitivity. \n" +
                "\n" +
                "2. Errors in Measurements. Basic statistical analysis applied to measurements: Mean, Standard Deviation, Six-sigma estimation, Cp, Cpk. \n" +
                "\n" +
                "3. Sensors and Transducers for physical parameters: temperature, pressure, torque, flow. Speed and Position Sensors.\n" +
                "\n" +
                " 4. Current and Voltage Measurements. Shunts, Potential Dividers. Instrument Transformers, Hall Sensors. \n" +
                "\n" +
                "5. Measurements of R, L and C. \n" +
                "\n" +
                "6. Digital Multi-meter, True RMS meters, Clamp-on meters, Meggers, \n" +
                "\n" +
                "7. Digital Storage Oscilloscope. \n" +
                "\n" +
                "8. Basic components of bio-medical instruments, bio-electric signals & recording electrodes, transducers, recording and display devices. Patient care and monitoring systems, cardiovascular measurements-blood pressure, blood flow, cardiac output, heart sounds etc.; instrumentation for respiratory and nervous systems, analysis of EEG, ECG, EMG, EOG and action potentials, non- invasive diagnostic measurements - temperature, ultrasonic diagnosis, CAT scan techniques, sensory measurements-motor response. \n" +
                "\n" +
                "PCC-EEE26: Measurements and Instrumentation Laboratory (0:0:2 – 1 credit)\\\n" +
                "\n" +
                " List of Experiments \n" +
                "\n" +
                "1. Measurement of a batch of resistors and estimating statistical parameters.\n" +
                "\n" +
                "2. Measurement of Lusing abridgetechnique aswell as LCRmeter. \n" +
                "\n" +
                "3. Measurement of C using a bridge technique as well as LCR meter. \n" +
                "\n" +
                "4. Measurement of Low Resistance using Kelvin’s double bridge.\n" +
                "\n" +
                "5. Measurement of High resistance and Insulation resistance using Megger. \n" +
                "\n" +
                "6. Usage of DSO for steady state periodic waveforms produced by a function generator.\n" +
                "\n" +
                "    a. Selection of trigger source and trigger level, selection of time-scale and voltage scale.\n" +
                "\n" +
                "    b. Bandwidth of measurement and sampling rate. \n" +
                "\n" +
                "7. Download of one-cycle data of a periodic waveform from a DSO and use values to compute the RMS values using a C program. \n" +
                "\n" +
                "8. Usage of DSO to capture transients like a step change in R-L-C circuit. \n" +
                "\n" +
                "9. CurrentMeasurementusingShunt,CT,andHallSensor. ..");

        List<String> PROFESSIONALSKILLDEVELOPMENT = Arrays.asList("Objectives of the course: \n" +
                "\n" +
                "5. To learn various interpersonal skills \n" +
                "\n" +
                "6. To help in developing various professionals skills. \n" +
                "\n" +
                "7. To cover the facets of verbal and non-verbal languages, public speech, reading gestures and body languages, preparing for group discussion and enhancing presentations skills. \n" +
                "\n" +
                "8. To enable learners to speak fluently and flawlessly in all kinds of communicative Contexts with speakers of all nationalities. \n" +
                "\n" +
                "Detail contents: \n" +
                "\n" +
                "Module 1 Lecture 10 hrs. Communication skills: Public speaking, Group discussion, Gestures and body language & professional presentation skills \n" +
                "\n" +
                "Module 2 Lecture 10 hrs. Interpersonal skills: Group dynamics, Negotiation skills, Leadership, Emotional intelligence \n" +
                "\n" +
                "Module 3 Lecture 10 hrs. Employability and Corporate Skills: Time management and effective planning, Stress management, People skills, Team work, development of leadership qualities, Decision making and Negotiation skills, Positive attitude, Self-motivation, Professional ethics, Business etiquettes, balancing board room. \n" +
                "\n" +
                "Module 4 Lecture 10 hrs. Business writing skills, Resume Writing. Interview Skills, Technical Presentation, Guest Lecture, Professional Ethics, Project Management, Entrepreneurship. \n" +
                "\n" +
                "Suggested reference books: \n" +
                "\n" +
                "5. “Personality Development and Soft Skills”, Barun Mitra, Oxford University Press. \n" +
                "\n" +
                "6. “Managing Soft Skills for Personality Development”, B.N. Ghosh, McGraw Hill. \n" +
                "\n" +
                "7. “Communication Skills and Soft Skills: An Integrated Approach”, E. Suresh Kumar, Pearson \n" +
                "\n" +
                "8. “Communication to Win”, Richard Denny, Kogan Page India Pvt. Ltd. \n" +
                "\n" +
                "Course outcomes \n" +
                "\n" +
                "4. Student can able to write their resume and can prepare for presentation, group discussion and interview. \n" +
                "\n" +
                "5. Student can develop interpersonal skills like negotiation and leadership skills. \n" +
                "\n" +
                "6. Students can develop Employability and Corporate Skills with proper time management and stress management. \n" +
                "\n" +
                "Students learn to practice the professional ethics, project management and Entrepreneurship..");

        List<String> INTRODUCTIONVLSIDESIGN = Arrays.asList(" Course Outcomes: \n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to \n" +
                "\n" +
                "1. Understand the mathematical methods and circuit analysis models in analysis of CMOS digital electronics circuits, including logic components and their inter connect. . \n" +
                "\n" +
                "2. Understand the CMOS technology-specific layout rules in the placement and routing of transistors and interconnect, and to verify the functionality, timing, power, and parasitic effects \n" +
                "\n" +
                "3. Understand the concepts and techniques of modern integrated circuit design and testing (CMOS VLSI). \n" +
                "\n" +
                "Module 1: Introduction MOSFET, threshold voltage, current, Channel length modulation, body bias effect and short channel effects, MOS switch, MOSFET capacitances, MOSFET models for calculation- Transistors and Layout, CMOS layout elements, parasitics, wires and vias-design rules-layout design SPICE simulation of MOSFET I-V characteristics and parameter extraction (10 hours) \n" +
                "\n" +
                "Module 2: CMOS inverter, static characteristics, noise margin, effect of process variation, supply scaling, dynamic characteristics, inverter design for a given VTC and speed, effect of input rise time and fall time, static and dynamic power dissipation, energy & power delay product, sizing chain of inverters, latch up effect-Simulation of static and dynamic characteristics, layout, post layout simulation (10 hours) \n" +
                "\n" +
                "Module 3: Static CMOS design, Complementary CMOS, static properties, propagation delay, Elmore delay model, power consumption, low power design techniques, logical effort for transistor sizing, ratioed logic, pseudo NMOS inverter, DCVSL, PTL, DPTL & Transmission gate logic, dynamic CMOS design, speed and power considerations, Domino logic and its derivatives, C2MOS, TSPC registers, NORA CMOS – Course project (10 hours) \n" +
                "\n" +
                "Module 4: Circuit design considerations of Arithmetic circuits, shifter, CMOS memory design - SRAM and DRAM, BiCMOS logic - static and dynamic behaviour -Delay and power consumption in BiCMOS Logic. (10 hours) \n" +
                "\n" +
                "Text / References: \n" +
                "\n" +
                "1. David A. Hodges, Horace G. Jackson, and Resve A. Saleh, “Analysis and Design of Digital Integrated Circuits”, McGraw-Hill, Third edition, 2004..\n" +
                "\n" +
                " 2. R. J. Baker, H. W. Li, and D. E. Boyce, “MOS circuit design, layout, and simulation”, Wiley-IEEE Press, 2007. \n" +
                "\n" +
                "3. Sung-Mo Kang & Yusuf Leblebici, “CMOS Digital Integrated Circuits - Analysis & Design”, Tata McGraw Hill, Third edition, 2003. \n" +
                "\n" +
                "4. Wayne Wolf, “Modern VLSI design”, Pearson Education, 2003\n" +
                "\n" +
                " 5. Christopher Saint and Judy Saint, “IC layout basics: A practical guide”, Tata McGraw Hill Professional, 2001. \n" +
                "\n" +
                "PCC-EEE22: Introduction to VLSI Design Laboratory (0:0:2 – 1 credit)\n" +
                "\n" +
                " Hands-on/Computer experiments related to the course contents of PCC-EEE21 ..");

        List<String> PROGRAMELECTIVEFirst = Arrays.asList("INFORMATION THEORY AND CODING\n" +
                "SPEECH AND AUDIO PROCESSING\n" +
                "INTRODUCTION TO MEMS\n" +
                "BIO-MEDICAL ELECTRONICS\n" +
                "CMOS DESIGN\n" +
                "POWER ELECTRONICS\n" +
                "NANO ELECTRONICS\n" +
                "SCIENTIFIC COMPUTING");

        List<String> PROGRAMELECTIVESecond = Arrays.asList("INFORMATION THEORY AND CODING\n" +
                "SPEECH AND AUDIO PROCESSING\n" +
                "INTRODUCTION TO MEMS\n" +
                "BIO-MEDICAL ELECTRONICS\n" +
                "CMOS DESIGN\n" +
                "POWER ELECTRONICS\n" +
                "NANO ELECTRONICS\n" +
                "SCIENTIFIC COMPUTING");

        List<String> ELECTRONICSDESIGNLABORATORY = Arrays.asList("Course Outcomes: \n" +
                "\n" +
                "At the end of the course, students will demonstrate the ability to \n" +
                "\n" +
                "Understand the practical issues related to practical implementation of applications using electronic circuits. \n" +
                "\n" +
                " Choose appropriate components, software and hardware platforms. \n" +
                "\n" +
                " Design a Printed Circuit Board, get it made and populate/solder it with components. \n" +
                "\n" +
                "Work as a team with other students to implement an application. Basic concepts on measurements; Noise in electronic systems; Sensors and signal conditioning circuits; Introduction to electronic instrumentation and PC based data acquisition; Electronic system design, Analog system design, Interfacing of analog and digital systems, Embedded systems, Electronic system design employing microcontrollers, CPLDs, and FPGAs, PCB design and layout; System assembly considerations. Group projects involving electronic hardware (Analog, Digital, mixed signal) leading to implementation of an application. \n" +
                "\n" +
                "Text/Reference Books \n" +
                "\n" +
                "1. A. S. Sedra and K. C. Smith, “Microelectronic circuits”, Oxford University Press, 2007. \n" +
                "\n" +
                "2. P. Horowitz and W. Hill, “The Art of Electronics”, Cambridge University Press, 1997.\n" +
                "\n" +
                "3. H.W.Ott, “Noise Reduction Techniques in Electronic Systems”, Wiley, 1989. \n" +
                "\n" +
                "4. W.C. Bosshart, “Printed Circuit Boards:Design and Technology”, Tata McGraw Hill, 1983. \n" +
                "\n" +
                "5. G.L. Ginsberg, “Printed Circuit Design”, McGraw Hill, 1991. ..");

        List<String> GRADUATEEMPLOYABILITYSKILLS = Arrays.asList("GRADUATE EMPLOYABILITY SKILLS AND COMPETITIVE COURSES (GATE, IES, ETC.)..");

        List<Semester> sixthSemesters = new ArrayList<>();
        sixthSemesters.add(new Semester("DIGITAL SIGNAL PROCESSING", DIGITALSIGNALPROCESSING));
        sixthSemesters.add(new Semester("MEASUREMENTS AND INSTRUMENTATION", MEASUREMENTINSTRUMENTATION));
        sixthSemesters.add(new Semester("PROFESSIONAL SKILL DEVELOPMENT", PROFESSIONALSKILLDEVELOPMENT));
        sixthSemesters.add(new Semester("INTRODUCTION TO VLSI DESIGN", INTRODUCTIONVLSIDESIGN));
        sixthSemesters.add(new Semester("PROGRAM ELECTIVE-I", PROGRAMELECTIVEFirst));
        sixthSemesters.add(new Semester("PROGRAM ELECTIVE-II", PROGRAMELECTIVESecond));
        sixthSemesters.add(new Semester("ELECTRONICS DESIGN LABORATORY", ELECTRONICSDESIGNLABORATORY));
        sixthSemesters.add(new Semester("GRADUATE EMPLOYABILITY SKILLS AND COMPETITIVE COURSES (GATE, IES, ETC.)", GRADUATEEMPLOYABILITYSKILLS));

        branches.add(new Branch("Semester 6", sixthSemesters));
        //6th Semester  End....



        //7 Semester Start......
        List<String> OPENELECTIVEFirst = Arrays.asList("ELECTROMAGNETIC WAVES\n" +
                "HIGH VOLTAGE ENGINEERING\n" +
                "INDUSTRIAL ELECTRICAL SYSTEMS\n" +
                "DIGITAL CONTROL SYSTEMS\n" +
                "ELECTRICAL AND HYBRID VEHICLES");

        List<String> OPENELECTIVESecond = Arrays.asList("ELECTROMAGNETIC WAVES\n" +
                "HIGH VOLTAGE ENGINEERING\n" +
                "INDUSTRIAL ELECTRICAL SYSTEMS\n" +
                "DIGITAL CONTROL SYSTEMS\n" +
                "ELECTRICAL AND HYBRID VEHICLES");

        List<String> PROGRAMELECTIVEThree = Arrays.asList("ELECTROMAGNETIC WAVES\n" +
                "HIGH VOLTAGE ENGINEERING\n" +
                "INDUSTRIAL ELECTRICAL SYSTEMS\n" +
                "DIGITAL CONTROL SYSTEMS\n" +
                "ELECTRICAL AND HYBRID VEHICLES");

        List<String> PROGRAMELECTIVEFour = Arrays.asList("ELECTROMAGNETIC WAVES\n" +
                "HIGH VOLTAGE ENGINEERING\n" +
                "INDUSTRIAL ELECTRICAL SYSTEMS\n" +
                "DIGITAL CONTROL SYSTEMS\n" +
                "ELECTRICAL AND HYBRID VEHICLES");

        List<String> PROJECTFirst = Arrays.asList("PROJECT -I..");

        List<String> SEMINAR = Arrays.asList("SEMINAR..");

        List<String> SUMMERENTREPRENEURSHIPThree = Arrays.asList("SUMMER ENTREPRENEURSHIP -III..");

        List<Semester> seventhSemesters = new ArrayList<>();
        seventhSemesters.add(new Semester("OPEN ELECTIVE -I", OPENELECTIVEFirst));
        seventhSemesters.add(new Semester("OPEN ELECTIVE -II", OPENELECTIVESecond));
        seventhSemesters.add(new Semester("PROGRAM ELECTIVE -III", PROGRAMELECTIVEThree));
        seventhSemesters.add(new Semester("PROGRAM ELECTIVE -IV", PROGRAMELECTIVEFour));
        seventhSemesters.add(new Semester("PROJECT -I", PROJECTFirst));
        seventhSemesters.add(new Semester("SEMINAR", SEMINAR));
        seventhSemesters.add(new Semester("SUMMER ENTREPRENEURSHIP -III", SUMMERENTREPRENEURSHIPThree));

        branches.add(new Branch("Semester 7", seventhSemesters));
        //7th Semester End.....



        //8 Semester Start.....
        List<String> OPENELECTIVEThree = Arrays.asList("CHOOSE ANY ONE SUBJECT :\n" +
                "\n" +
                "--------------------------------------------------------------------------\n" +
                "\n" +
                " \n" +
                "\n" +
                "Power Plant Engineering\n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "To provide an overview of power plants and the associated energy conversion issues\n" +
                "\n" +
                "Contents:\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Coal based thermal power plants, basic Rankine cycle and its modifications, layout of modern coal power plant, super critical boilers, FBC boilers, turbines, condensers, steam and heating rates. Sub systems of thermal power plants, fuel and ash handling, draught system, feed water treatment, binary cycles and cogeneration systems. (Lectures 8) \n" +
                "\n" +
                "Module : 2\n" +
                "\n" +
                "Gas turbine and combined cycle power plants, Brayton cycle analysis and optimization, components of gas turbine power plants, combined cycle power plants, (Lectures 4) \n" +
                "\n" +
                "Module : 3\n" +
                "\n" +
                "Basics of nuclear energy conversion, Layout and subsystems of nuclear power plants, Boiling Water Reactor (BWR), Pressurized Water Reactor (PWR), CANDU Reactor, Pressurized Heavy Water Reactor (PHWR), Fast Breeder Reactors (FBR), gas cooled and liquid metal cooled reactors, safety measures for nuclear power plants. (Lectures 8) \n" +
                "\n" +
                "Module : 4\n" +
                "\n" +
                "Hydroelectric power plants, Hydrological cycle, Rainfall & run-off measurement & plotting of various curves for estimating stream flow, site selection, classification, comparison with other types of power plant, typical layout and components, principles of wind, tidal, solar PV and solar thermal, geothermal, biogas and fuel cell power systems. (Lectures 8) \n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Energy, economic and environmental issues, power tariffs, load distribution parameters, load curve, capital and operating cost of different power plants, pollution control technologies including waste disposal options for coal and nuclear plants, Geothermal power plants, Ocean thermal electric conversion„ M.H.D power generation.                                                                               \n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "Upon completion of the course, the students can understand the principles of operation for different power plants and their economics.\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "1  Power Plant Engineering, 5th Edition„ Laxmi Publications(P) Ltd 3rd ea. .\n" +
                "\n" +
                "2  Nag P.K., Power Plant Engineering, 3r , Tata McGraw Hill, 2008.\n" +
                "\n" +
                "3 El Wakil M.M., Power Plant Technology, Tata McGraw Hill, 2010.\n" +
                "\n" +
                "4 Elliot T.C., Chen K and Swanekamp R.C., Power Plant Engineering, 2nd ed., McGraw\n" +
                "\n" +
                "Hill, 1998.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "--------------------------------------------------------------------------\n" +
                "\n" +
                "Automobile Engineering\n" +
                "\n" +
                " \n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "To understand the construction and working principle of various parts of an automobile Contents:\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Types of automobiles, vehicle construction and layouts, Car body Style, chassis, frame and body, vehicle aerodynamics, IC engines-components, function and materials, variable valve timing (VVT), Front engine front wheel drive, Front engine Rear wheel drive, foure wheel drive. (Lectures 6) \n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Engine auxiliary systems, electronic injection for SI and CI engines, unit injector system, rotary distributor type and common rail direct injection system, transistor based coil ignition & capacitive discharge ignition systems, turbo chargers (WGT, VGT), engine emission control by 3-way catalytic converter system, Emission norms (Euro & BS). (Lectures 6) \n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Transmission systems, clutch types, cone clutch, Single plate, multi plate, diaphragm spring & centrifugal clutch, electromagnetic clutch & construction, gear boxes- manual and automatic gear shift mechanisms, over drive principles, transfer box, Transaxles, flywheel, torque converter, propeller shaft, slip joints, universal joints, differential and rear axle, Hotchkiss drive and Torque tube drive.                                                                              \n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Steering geometry and types of steering gear box, power steering, types of front axle, types of suspension systems, constructional details & characteristics of Leaf spring, pneumatic and hydraulic braking systems, antilock braking system (ABS), electronic brake force distribution (EBD) and traction control.                                                                              \n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Caster, Camber, King pin inclination Toe in Toe out, Full Floating, three quarter floating &semi Floating rear axles.                                  \n" +
                "Module: 6\n" +
                "\n" +
                "Alternative energy sources, natural gas, LPG, biodiesel, bio-ethanol, gasohol and hydrogen fuels in automobiles, modifications needed, performance, combustion & emission characteristics of alternative fuels in SI and CI engines, Electric and Hybrid vehicles, application of Fuel Cells.    \n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "Upon completion of this course, students will understand the function of each automobile component and also have a clear idea about the overall vehicle performance.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Text books:\n" +
                "\n" +
                "      1. Kirpal Singh, Automobile Engineering, -ed., Standard Publishers, New Delhi, 1997.\n" +
                "\n" +
                "Jain K.K. and Asthana R.B., Automobile Engineering, Tata McGraw Hill, New Delhi,\n" +
                "\n" +
                "Heitner , Automotive Mechanics, 2nd ed., East-West Press, 1999.\n" +
                "\n" +
                "Heisler , Advanced Engine Technology, SAE International Publ., USA, 1998. \n" +
                "\n" +
                " Practical:\n" +
                "\n" +
                "To study and prepare report on the constructional details, operation of the Automotive Clutches.\n" +
                "\n" +
                "To study and prepare report on the constructional details, operation of the Automotive Transmission systems.\n" +
                "\n" +
                "To study and prepare report on the constructional details, operation of the Automotive Drive Lines & Differentials.\n" +
                "\n" +
                "To study and prepare report on the constructional details, operation of the Multi-cylinder: Diesel and Petrol Engines.\n" +
                "\n" +
                "To study and prepare report on the constructional details, operation of the Fuels supply systems.\n" +
                "\n" +
                "To study and prepare report on the constructional details,operation of the Engine cooling & lubricating Systems.\n" +
                "\n" +
                "To study and prepare report on the constructional details,operation of the Automotive Suspension Systems.\n" +
                "\n" +
                "To study and prepare report on the constructional details, operation of the Automotive Steering Systems.\n" +
                "\n" +
                "To study and prepare report on the constructional details, operation of the Automotive Brake systems.\n" +
                "\n" +
                " --------------------------------------------------------------------------\n" +
                "\n" +
                " \n" +
                "\n" +
                " E-Commerce and ERP\n" +
                "\n" +
                "Module 1\n" +
                "\n" +
                "Introduction to E- Commerce: Evolution of E-commerce, Advantage and Disadvantage of E Commerce, Roadmap of E-Commerce in India. Business Models of E—Commerce: Model Based On Transaction Party: B2B, B2C, C2B, C2C.\n" +
                "\n" +
                "Module 2\n" +
                "\n" +
                "E marketing: The scope of E-Marketing, Identifying Web Presence goals, Uniqueness of the web, Meeting the need of website visitors, Website Design Issues: Factors that make People Return to Your Site, Strategies for Website Development. Site Adhesion: Content, format and access: maintaining a Website, E- Advertising, [-Branding,\n" +
                "\n" +
                "Module 3 \n" +
                "\n" +
                "E—Payment System: Digital Payment Requirement, Digital Token based E-Payment System, Electronic Cash, Smart card and Electronics payment system: Credit and Debit Card, Virtual Currency, Digital wallet, Risk of Electronics payment system, Digital Signature.\n" +
                "\n" +
                "E Security: Security On the Internet: Network and Website Security Risk: Denial-of-Service attack, Viruses, Unauthorized access to computer Network. Security Standards: Firewall, Cryptography, Key Management, Password Systems, Digital certificates, Digital signatures.\n" +
                "\n" +
                "Module 4\n" +
                "\n" +
                "Enterprise Resource Planning (ERP): Introductory Concepts, Advantages & disadvantages of ERP, ERP and Related Technologies: - Business Process Reengineering, Data Warehousing, Data Mining, Supply Chain Management. ERP Implementation: ERP Implementation Life Cycle —Implementation Methodology, Hidden Costs , Organizing Implementation — Contracts with Vendors, Consultants and Users , Project Management and Monitoring.\n" +
                "\n" +
                "Module 5 \n" +
                "\n" +
                "ERP Business Modules: Introduction to basic Modules of ERP System, Business Modules in an ERP Package- Finance — Manufacturing — Human Resource — Plant Maintenance — Materials Management — Quality Management — Sales and Distribution.\n" +
                "\n" +
                "Case Study: Recent business issues on E-Commerce Perspective.\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "Alexis Leon, \"ERP Demystified\", Tata McGraw Hill.\n" +
                "\n" +
                "E-Commerce An Indian Perspective by P.T.Joseph, PHI\n" +
                "\n" +
                " \n" +
                "\n" +
                "Reference Books\n" +
                "\n" +
                "K. Bajaj, D. Nag \"E-Commerce\", 2nd Edition, McGraw-Hill Education, New Delhi.\n" +
                "\n" +
                "Bhaskar Bharat, \"Electronic Commerce-Technology and Application\", McGraw-Hill Education, New Delhi.\n" +
                "\n" +
                "Mary Sumner, \"Enterprise Resource Planning\", 2005, PHI Learning India Pvt. Ltd. /Pearson Education, New Delhi.\n" +
                "\n" +
                "Chan, \"E-Commerce fundamentals and Applications\", Wiley India, New Delhi.\n" +
                "\n" +
                "Vinod Kumar Garg and N.K .Venkata Krishnan, \"Enterprise Resource Planning —concepts and Planning\", Prentice Hall, 1998.\n" +
                "\n" +
                "*************************************************************** \n" +
                "***");

        List<String> OPENELECTIVEFour = Arrays.asList("CHOOSE ANY ONE SUBJECT :\n" +
                "\n" +
                "--------------------------------------------------------------------------\n" +
                "\n" +
                " \n" +
                "\n" +
                "Electrical Materials :\n" +
                "\n" +
                " \n" +
                "\n" +
                "MODULE 1 ELECTRICAL ENGINEERING MATERIALS (6H)\n" +
                "\n" +
                "Introduction to Electrical Engineering Materials, Classification of materials, Material of importance-carbonated beverages container, Advanced Materials, Modern Material need, Atomic Structure and Interatomic Bonding, bonding forces and energies, secondary bonding and van-der-waals bonding,\n" +
                "\n" +
                "MODULE II THE STRUCTURE OF CRYSTALLINE SOLIDS (8H)\n" +
                "\n" +
                "The structure of crystalline solids, crystallographic points, directions and planes, X-Ray diffraction, determination of crystalline structure, imperfections and defects in solids, diffusion mechanisms, steady state diffusion, diffusion in semiconducting materials, material of importance- Aluminum for integrated circuit interconnects, mechanical properties of material, stress strain behavior. Structure and properties of ceramics, crystal ceramics, silicate ceramics, material of importance- carbon nano-tubes, Imperfections in ceramics, application and processing of ceramics, Glass ceramics, refractories, abrasives, cements, materials of importance –piezoelectric ceramics\n" +
                "\n" +
                "MODULE III INSULATING PROPERTIES OF MATERIAL (8H)\n" +
                "\n" +
                "Insulating materials; General Properties, Electrical Properties: Volume resistivity, surface resistance, dielectric loss, dielectric strength (breakdown voltage) dielectric constant, Thermal conductivity, Electro-thermal breakdown in solid dielectrics Insulating Materials and their applications:\n" +
                "\n" +
                "Plastics, Definition and classification, Thermosetting materials, Phenol-formaldehyde resins (i.e. Bakelite) amino resins (urea formaldehyde and Malamine-formaldehyde), epoxy resins – their important properties and applications, Thermo-plastic materials: Polyvinyl chloride (PVC), polyethelene, silicons, their important properties and applications, Bitumen - Mineral and insulating oil for transformers switchgear capacitors, high voltage insulated cables, insulating varnishes for coating and impregnation - Enamels for winding wires, Glass fiber sleeves, SF6 their properties and applications\n" +
                "\n" +
                "MODULE IV ELECTRICAL PROPERTIES OF MATERAILS (6H)\n" +
                "\n" +
                "Electrical conduction ,electronic and ionic conduction, energy band structures in solids ,conduction in terms of band and atomic bonding models, electron mobility ,electrical resistivity of metals, materials of importance—aluminum electrical wires, semi conductivity , intrinsic semi conduction, extrinsic semi conduction, carrier mobility, semiconductor devices, electrical properties of polymers dielectric behavior, capacitance , field vectors and polarization, types of polarization, frequency dependence of the dielectric constant, dielectric materials, ferroelectricity, piezoelectricity.\n" +
                "\n" +
                "MODULE V OPTICAL AND MAGNETIC PRPERTIES OF MATERIALS (10 H)\n" +
                "\n" +
                "Optical properties ,basic concepts, electromagnetic radiation, light interactions with solids atomic and electronic interactions optical properties of metals, optical properties of nonmetals, refraction, reflection, absorption, transmission, applications of optical phenomena, luminescence, Materials of importance—light-emitting diodes, photoconductivity , lasers , optical fibers in communications Diamagnetism and Paramagnetism Ferromagnetism , Antiferromagnetism and Ferrimagnetism , The Influence of Temperature on Magnetic Behavior, Domains and Hysteresis, Magnetic Anisotropy, Soft Magnetic Materials, Materials of Importance—An Iron–Silicon Alloy That Is Used in Transformer Cores, Hard Magnetic Materials Magnetic Storage , Superconductivity\n" +
                "\n" +
                "MODULE VI SUPERCONDUCTIVITY (6H)\n" +
                "\n" +
                "Properties of superconductors, London equations, Quantum explanation of superconductivity, Applications of superconductors. Nanomaterials: Introduction to nanotechnology, Nanowire and Nanotube, Carbon nanotubes, Single wall carbon nanotubes, Multiwall carbon nanotubes, Fabrications, Properties and applications\n" +
                "\n" +
                " \n" +
                "\n" +
                "Economic, Environmental, and Societal Issues in Materials Science and Engineering introduction , economic considerations , component design , materials , manufacturing techniques, environmental and societal considerations , recycling issues in materials science and engineering, materials of importance—biodegradable and biorenewable polymers/ plastics\n" +
                "\n" +
                " \n" +
                "\n" +
                " --------------------------------------------------------------------------\n" +
                "\n" +
                "110814      Satellite Communication 3L: OT: OP 3 Credits\n" +
                "\n" +
                "1 Introduction to Satellite Communication: Principles and architecture of satellite\n" +
                "\n" +
                "Communication, Brief history of Satellite systems, advantages, disadvantages, applications and frequency bands used for satellite communication.\n" +
                "\n" +
                "2 Orbital Mechanics: Orbital equations, Kepler's laws, Apogee and Perigee for an elliptical orbit, evaluation of velocity, orbital period, angular velocity etc. of a satellite, concepts of Solar day and Sidereal day\n" +
                "\n" +
                "3 Satellite sub-systems: Study of Architecture and Roles of various sub systems of a satellite system such as Telemetry, tracking, command and monitoring (TTC and M), Attitude and orbit control system (AOCS), Communication sub-system.\n" +
                "\n" +
                "4 Typical Phenomena in Satellite Communication: Solar Eclipse on satellite, its effects, remedies for Eclipse, Sun Transit Outage phenomena, its effects and remedies, Doppler frequency shift Phenomena and expression for Doppler shift\n" +
                "\n" +
                "5 Flux density and received signal power equations, Calculation of System noise temperature for satellite receiver, noise power calculation, C/N ratio calculations in clear air and rainy conditions\n" +
                "\n" +
                "No. Name of Authors / Books /Publishers\n" +
                "\n" +
                "Timothy Pratt Charles W. Bostian, Jeremy E. Allnutt: Satellite Communications; Wiley\n" +
                "\n" +
                "Tri T. Ha: Digital Satellite Communications: Tata McGraw Hill\n" +
                "\n" +
                "Dennis Roddy: Satellite Communication: 4th Edition, McGraw Hill.\n" +
                "\n" +
                " \n" +
                "\n" +
                "1 Biomedical signals and Physiological transducers : Source of biomedical signal, Origin of bioelectric signals, recording electrodes, Electrodes for ECG, EMG and EEG Physiological transducers: Pressure, Temperature, photoelec- tric and ultrasound Transducers. Measurement in Respiratory system: Physi- ology of respiratory system, Measurement of breathing mechanics Spiro meter, Respiratory therapy equipments Inhalators ventilators and Respirators, Hu- midifiers, Nebulizers Aspirators, Biomedical recorders: ECG, EEG and EMG.\n" +
                "\n" +
                "2 Patient Monitoring systems and Audiometers : Cardiac monitor, Bed-side patient monitor, measurement of heart rate, blood pressure, temperature, respiration rate, Arrhythmia monitor, Methods of monitoring fatal heart rate, Monitoring labor activity. Audiometers: Audiometers, Blood cell counters, Oximeter, Blood flow meter, cardiac output measurement, Blood gas analyz- ers.\n" +
                "\n" +
                "3 Modern Imaging systems : Introduction, Basic principle and Block diagram of x-ray machine, x- ray Computed Tomography (CT), Magnetic resonance imaging system (NMR), ultrasonic imaging system. Eco-Cardiograph, Eco Encephalography, Ophthalmic scans, MRI. Therapeutic Equipments: Cardiac pacemakers, cardiac defibrillators, Hemodialysis machine, Surgical diathermy machine.\n" +
                "\n" +
                "4 Patient's safety : Precaution, safety codes for electro medical equipment, Electric\n" +
                "\n" +
                "safety analyzer, Testing of biomedical equipment, Ultrasound therapy unit. Electrotherapy Equipments, Ventilators.\n" +
                "\n" +
                "No. Name of Authors / Books /Publishers\n" +
                "\n" +
                "1 \"Hand book of Biomedical Instrumentation\", R.S.Khandpur, TMH\n" +
                "\n" +
                "2 \"Biomedical Instruments: Theory and Design\", Walter Welko- Witiz and Sid Doutsch, Wiley\n" +
                "\n" +
                "3 \"Biomedical Instrumentation and Measurements\", Lesile Cromwell, Fred J. Weibell and Erich A. Pfeiffer, PHI\n" +
                "\n" +
                "4 \"Introduction to Biomedical Equipment Technology\", Joseph J. Carr and John M. Brown, Pearson\n" +
                "\n" +
                "5 \"Textbook of Biomedical Instrumentation System\", Shakti Chatterjee, Cengage Learning\n" +
                "\n" +
                " --------------------------------------------------------------------------");

        List<String> PROGRAMELECTIVEFive = Arrays.asList("CHOOSE ANY ONE SUBJECT :\n" +
                "\n" +
                "\n" +
                "------------------------------------------------------------------------------------------------------------------\n" +
                "\n" +
                "Fiber Optic Communications [EC] \n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\n" +
                "Understand the principles fiber-optic communication, the components and the bandwidth advantages.\n" +
                "\n" +
                "Understand the properties of the optical fibers and optical components.\n" +
                "\n" +
                "Understand operation of lasers, LEDs, and detectors\n" +
                "\n" +
                "Analyze system performance of optical communication systems\n" +
                "\n" +
                "Design optical networks and understand non-linear effects in optical fibers\n" +
                "\n" +
                "Module 1: Introduction to vector nature of light, propagation of light, propagation of light ina cylindrical dielectric rod, Ray model, wave model.\n" +
                "\n" +
                "Module 2: Different types of optical fibers, Modal analysis of a step index fiber. Signal degradation on optical fiber due to dispersion and attenuation. Fabrication of fibers and measurement techniques like OTDR.\n" +
                "\n" +
                "Module 3: Optical sources - LEDs and Lasers, Photo-detectors - pin-diodes, APDs, detectorresponsivity, noise, optical receivers. Optical link design - BER calculation, quantum limit, power penalties.\n" +
                "\n" +
                "Module 4:Optical switches - coupled mode analysis of directional couplers, electroopticswitches. Module 5: Optical amplifiers - EDFA, Raman amplifier.\n" +
                "\n" +
                "Module 6: WDM and DWDM systems. Principles of WDM networks.\n" +
                "\n" +
                "Module 7: Nonlinear effects in fiber optic links. Concept of self-phase modulation, groupvelocity dispersion and solition based communication.\n" +
                "\n" +
                "Text/Reference Books\n" +
                "\n" +
                "J. Keiser, Fibre Optic communication, McGraw-Hill, 5th Ed. 2013 (Indian Edition).\n" +
                "\n" +
                "T. Tamir, Integrated optics, (Topics in Applied Physics Vol.7), Springer-Verlag, 1975.\n" +
                "\n" +
                "J. Gowar, Optical communication systems, Prentice Hall India, 1987.\n" +
                "\n" +
                "S.E. Miller and A.G. Chynoweth, eds., Optical fibres telecommunications, Academic Press, 1979.\n" +
                "\n" +
                "G. Agrawal, Nonlinear fibre optics, Academic Press, 2nd Ed. 1994.\n" +
                "\n" +
                "G. Agrawal, Fiber optic Communication Systems, John Wiley and sons, New York, 1997\n" +
                "\n" +
                "F.C. Allard, Fiber Optics Handbook for engineers and scientists, McGraw Hill, New York (1990).\n" +
                "\n" +
                "\n" +
                "------------------------------------------------------------------------------------------------------------------\n" +
                "\n" +
                "\n" +
                "Micro and Nano-Electronics [EC]   \n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\n" +
                "Analyze semiconductor devices, through numerical problems, using fundamental characteristics of semiconductor materials, such as carrier densities, transport, lifetime, generation and recombination.\n" +
                "\n" +
                "Understand various aspects of nano-technology and the processes involved in making nano components and material.\n" +
                "\n" +
                "Leverage advantages of the nano-materials and appropriate use in solving practical problems.\n" +
                "\n" +
                "Understand various aspects of nano-technology and theprocesses involved in making nano components and material.\n" +
                "\n" +
                "Leverage advantages of the nano-materials and appropriate use in solving practical problems.\n" +
                "\n" +
                "Module 1: Semiconductor crystal lattice and growth of high purity semiconductor materials Energy bands, Fermi-Dirac distribution function, and energy band diagrams Doping of semiconductors; carrier concentration in doped and intrinsic semiconductors Carrier transport phenomena - drift and diffusion current; device current equations\n" +
                "\n" +
                "Module 2: Generation, recombination, carrier lifetime and mobility Semiconductor junctions p-n diodes: creation of space charge region in a p-n junction and current-voltage characteristics Metal-semiconductor contacts — Schottky and Ohmic contact LED —Application of p-n junction Basic operation principle of BJT and MOSFET transistors\n" +
                "\n" +
                "Module 3: Introduction to nanotechnology, meso structures, Basics of Quantum Mechanics: Schrodinger equation, Density of States. Particle in a box Concepts, Degeneracy. Band Theory of Solids. Kronig-Penny Model. Brillouin Zones.\n" +
                "\n" +
                "Module 4: Shrink-down approaches: Introduction, CMOS Scaling, The nanoscale MOSFET, Finfets, Vertical MOSFETs, limits to scaling, system integration limits (interconnect issues etc.),\n" +
                "\n" +
                "Module 5: Resonant Tunneling Diode, Coulomb dots, Quantum blockade, Single electron transistors,Carbon nanotube electronics, Bandstructure and transport, devices, applications, 2D semiconductors and electronic devices, Graphene, atomistic simulation\n" +
                "\n" +
                "Text/ Reference Books:\n" +
                "\n" +
                "Semiconductor Physics and Devices, Donald A. Neamen, 4th edition, McGraw Hill Higher Education, ISBN # 978-0-07-352958-5\n" +
                "\n" +
                "G.W. Hanson, Fundamentals of Nanoelectronics, Pearson, 2009.\n" +
                "\n" +
                "W. Ranier, Nanoelectronics and Information Technology (Advanced Electronic Material and Novel Devices), Wiley-VCH, 2003.\n" +
                "\n" +
                "K.E. Drexler, Nanosystems, Wiley, 1992.\n" +
                "\n" +
                "J.H. Davies, The Physics of Low-Dimensional Semiconductors, Cambridge University Press,1998.\n" +
                "\n" +
                "C.P. Poole, F. J. Owens, Introduction to Nanotechnology, Wiley, 2003\n" +
                "\n" +
                "\n" +
                "------------------------------------------------------------------------------------------------------------------\n" +
                "\n" +
                "\n" +
                "\n" +
                "Transducer & Signal Conditioning   \n" +
                "\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\n" +
                "• Understand the basics oknowledge of the principles, working and characteristics of transducers and the associated signal conditioning circuits for industrial applications.\n" +
                "\n" +
                "Module 1: Transducers (10 hours)\n" +
                "\n" +
                "Introduction, classification, mechanical devices as primary detectors, basic requirements of a transducer, electrical transducers, type of transducers for measuring displacement, strain, vibration, pressure, flow, temperature, force, torque, liquid level, humidity, P. H. value, velocity (angular & linear), acceleration, basic principles of resistive transducers, inductive transducers, capacitive transducers, thermoelectric transducers, piezoelectric transducers, hall effect transducers, electromechanical transducers, photoelectric transducers, digital transducers.\n" +
                "\n" +
                "Module 2: Signal Processing Circuits (11 hours)\n" +
                "\n" +
                "crossing detector, zero crossing detector with hysteresis, inverting and non-inverting amplifiers, voltage-follower, adder, subtractor, multiplier, divider, integrator, differentiator, voltage to current converter, current to voltage converter, phase shifter circuit, absolute-value circuit, peak detector, ac to dc converter, logarithmic converter, differential-amplifier, instrumentation amplifier, analog modulators & demodulators.\n" +
                "\n" +
                "Module 3: Data Display and Recording Systems (6 hours)\n" +
                "\n" +
                "Introduction to analog and digital display methods, analog recorders, C.R.O., magnetic tape recorders, digital input-output devices, digital frequency meter, digital voltmeter.\n" +
                "\n" +
                "Module 4: Data Transmission and Telemetry (6 hours)\n" +
                "\n" +
                "Introduction, characteristics of frequency division multiplexing, time- division multiplexing, transmission channels and media.\n" +
                "\n" +
                "Module 5: Data Acquisition and Conversion (7 hours)\n" +
                "\n" +
                "Introduction, signal conditioning of the inputs, single channel DAS, Multi-channel DAS, data conversion, multiplexer, S/H circuit, A/D converter.\n" +
                "\n" +
                "Text / References:\n" +
                "\n" +
                "D. V. S. Murty, \"Transducers and Instrumentation\", Prentice-Hall of India Private Limited, 2013.\n" +
                "\n" +
                "C.S. Rangan, G.R. Sarma and V. S.V. Mani, \"Instrumentation Devices & Systems\", Mc Graw Hill.\n" +
                "\n" +
                "A. K. Sawhney, \"A course in Electrical & Electronic Measurements & Instrumentation\", Dhanpat Rai & Sons.\n" +
                "\n" +
                "\n" +
                "------------------------------------------------------------------------------------------------------------------\n" +
                "\n" +
                "\n" +
                "Power System Protection \n" +
                "\n" +
                "Course Outcomes: At the end of this course, students will demonstrate the ability to\n" +
                "\n" +
                "Understand the different components of a protection system.\n" +
                "\n" +
                "Evaluate fault current due to different types of fault in a network.\n" +
                "\n" +
                "Understand the protection schemes for different power system components.\n" +
                "\n" +
                "Understand the basic principles of digital protection.\n" +
                "\n" +
                "Understand system protection schemes, and the use of wide-area measurements.\n" +
                "\n" +
                "Module 1: Introduction and Components of a Protection System (4 hours)\n" +
                "\n" +
                "Principles of Power System Protection, Relays, Instrument transformers, Circuit Breakers\n" +
                "\n" +
                "Module 2: Faults and Over-Current Protection (8 hours)\n" +
                "\n" +
                "Review of Fault Analysis, Sequence Networks. Introduction to Overcurrent Protection and overcurrent relay co-ordination.\n" +
                "\n" +
                "Module 3: Equipment Protection Schemes (8 hours)\n" +
                "\n" +
                "Directional, Distance, Differential protection. Transformer and Generator protection. Bus bar Protection, Bus Bar arrangement schemes.\n" +
                "\n" +
                "Module 4: Digital Protection (8 hours)\n" +
                "\n" +
                "Computer-aided protection, Fourier analysis and estimation of Phasors from DFT. Sampling, aliasing issues.\n" +
                "\n" +
                "Module 5: Modeling and Simulation of Protection Schemes (8 hours)\n" +
                "\n" +
                "CT/PT modeling and standards, Simulation of transients using Electro-Magnetic Transients (EMT) programs. Relay Testing.\n" +
                "\n" +
                "Module 6: System Protection (4 hours)\n" +
                "\n" +
                "Effect of Power Swings on Distance Relaying. System Protection Schemes. Under-frequency, under- voltage and df/dt relays, Out-of-step protection, Synchro-phasors, Phasor Measurement Units and Wide-Area Measurement Systems (WAMS). Application of WAMS for improving protection systems.\n" +
                "\n" +
                "Text/References\n" +
                "\n" +
                "J. L. Blackburn, \"Protective Relaying: Principles and Applications\", Marcel Dekker, New York, 1987.\n" +
                "\n" +
                "Y. G.Paithankar and S. R. Bhide, \"Fundamentals of power system protection\", Prentice Hall, India, 2010.\n" +
                "\n" +
                "A. G. Phadke and J. S. Thorp, \"Computer Relaying for Power Systems\", John Wiley & Sons, 1988.\n" +
                "\n" +
                "A. G. Phadke and J. S. Thorp, \"Synchronized Phasor Measurements and their Applications\", Springer, 2008.\n" +
                "\n" +
                "D. Reimert, \"Protective Relaying for Power Generation Systems\", Taylor and Francis, 2006...");

        List<String> PROGRAMELECTIVESix = Arrays.asList("CHOOSE ANY ONE SUBJECT :\n" +
                "\n" +
                "\n" +
                "------------------------------------------------------------------------------------------------------------------\n" +
                "\n" +
                "\n" +
                "Smart Grid  Course Outcomes:\n" +
                "\n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\n" +
                "Understand thebackground and fundamental building blocks of smart grid with stringent emphasis on practical applications in the existing power system network\n" +
                "\n" +
                "Emphasizes on renewable energy source integration in present grids as well as in micro and nano grids as part of the course and explores its issues in operation, analysis, management, control, protection and monitoring.\n" +
                "\n" +
                "Module 1: Introduction to Smart Grid: (8 hours)\n" +
                "\n" +
                "Evolution of Electric Grid, Concept, Definitions and Need for Smart Grid, Smart grid drivers, functions, opportunities, challenges and benefits.\n" +
                "\n" +
                "Difference between conventional & Smart Grid, Concept of Resilient &Self-Healing Grid, Present development & International policies in Smart Grid, Diverse perspectives from experts and global Smart Grid initiatives.\n" +
                "\n" +
                "Module 2: Smart Grid Technologies (8 hours)\n" +
                "\n" +
                "Technology Drivers, Smart energy resources, Smart substations, Substation Automation, Feeder Automation,Transmission systems: EMS, FACTS and HVDC, Wide area monitoring, Protection and Control, Distribution Systems: DMS, Volt/Var control, Fault Detection, Isolation and service restoration, Outage management, High-Efficiency, Distribution Transformers, Phase Shifting Transformers, Plug in Hybrid Electric Vehicles (PHEV).\n" +
                "\n" +
                "Module 3: Smart Meters and Advanced Metering Infrastructure (8 hours)\n" +
                "\n" +
                "Introduction to Smart Meters, Advanced Metering infrastructure (AMI) drivers and benefits, AMI protocols, standards and initiatives,. AMI needs in the smart grid, Phasor Measurement, Unit (PMU), Intelligent Electronic Devices (IED) & their application for monitoring & protection.\n" +
                "\n" +
                "Module 4: Power Quality Management in Smart Grid: (8 hours)\n" +
                "\n" +
                "Power Quality & EMC in Smart Grid, Power Quality issues of Grid connected Renewable Energy Sources,. Power Quality Conditioners for Smart Grid, Web based Power Quality monitoring, Power Quality Audit.\n" +
                "\n" +
                "Module 5: High Performance Computing for Smart Grid Applications (8 hours)\n" +
                "\n" +
                "Local Area Network (LAN), House Area Network (HAN), Wide Area Network (WAN), Broad band over Power line (BPL), IP based Protocols, Basics of Web Service and CLOUD Computing to make Smart Grids smarter, Cyber Security for Smart Grid\n" +
                "\n" +
                "Text / References:\n" +
                "\n" +
                "Vehbi C. Giingor, Dilan Sahin, Taskin Kocak, Salih Ergiit, Concettina Buccella, Carlo Cecati, and Gerhard P. Hancke: Smart Grid Technologies- Communication Technologies and Standards IEEE Transactions on Industrial Informatics, Vol. 7, No. 4, November 2011\n" +
                "\n" +
                "Xi Fang, Satyajayant Misra, Guoliang Xue, and Dejun Yang: Smart Grid — The New and Improved Power Grid- A Survey, IEEE Transaction on Smart Grids, 2011.\n" +
                "\n" +
                "Stuart Borlase: Smart Grid-Infrastructure, Technology and Solutions, CRC Press, 2012.\n" +
                "\n" +
                "A Keyhani, M Marwali, \"Smart power grids\", .\n" +
                "\n" +
                "ArunPhadke, \"omputer Relaying for Power Systems\", .\n" +
                "\n" +
                "Nikos Hatziargyriou, \"Microgrids Architecture and control\", .\n" +
                "\n" +
                "Fang Lin Luo, Hong Ye , \"Renewable Energy Systems\", .\n" +
                "\n" +
                "------------------------------------------------------------------------------------------------------------------\n" +
                "\n" +
                "\n" +
                "Wind and Solar Energy Systems            \n" +
                "\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "At the end of this course, students will demonstrate the ability to\n" +
                "\n" +
                "Understand the energy scenario and the consequent growth of the power generation from renewable energy sources.\n" +
                "\n" +
                "Understand the basic physics of wind and solar power generation.\n" +
                "\n" +
                "Understand the power electronic interfaces for wind and solar generation.\n" +
                "\n" +
                "Understand the issues related to the grid-integration of solar and wind energy systems.\n" +
                "\n" +
                "Module 1: Physics of Wind Power: (5 Hours)\n" +
                "\n" +
                "History of wind power, Indian and Global statistics, Wind physics, Betz limit, Tip speed ratio, stall and pitch control, Wind speed statistics-probability distributions, Wind speed and power-cumulative distribution functions.\n" +
                "\n" +
                "Module 2: Wind generator topologies: (12 Hours)\n" +
                "\n" +
                "Review of modem wind turbine technologies, Fixed and Variable speed wind turbines, Induction Generators, Doubly-Fed Induction Generators and their characteristics, Permanent-Magnet Synchronous Generators, Power electronics converters. Generator-Converter configurations, Converter Control.\n" +
                "\n" +
                "Module 3: The Solar Resource: (3 Hours)\n" +
                "\n" +
                "Introduction, solar radiation spectra, solar geometry, Earth Sun angles, observer Sun angles, solarday length, Estimation of solar energy availability.\n" +
                "\n" +
                "Module 4: Solar photovoltaic: (8 Hours)\n" +
                "\n" +
                "Technologies-Amorphous, monocrystalline, polycrystalline; V-I characteristics of a PV cell, PV module, array, Power Electronic Converters for Solar Systems, Maximum Power Point Tracking (MPPT) algorithms .Converter Control.\n" +
                "\n" +
                "Module 5: Network Integration Issues: (8 Hours)\n" +
                "\n" +
                "Overview of grid code technical requirements. Fault ride-through for wind farms -real and reactive power regulation, voltage and frequency operating limits, solar PV and wind farm behavior during grid disturbances. Power quality issues. Power system interconnection experiences in the world. Hybrid and isolated operations of solar PV and wind systems.\n" +
                "\n" +
                "Module 6: Solar thermal power generation: (3 Hours)\n" +
                "\n" +
                "Technologies, Parabolic trough, central receivers, parabolic dish, Fresnel, solar pond, elementary analysis.\n" +
                "\n" +
                "Text / References:\n" +
                "\n" +
                "T. Ackermann, \"Wind Power in Power Systems\", John Wiley and Sons Ltd.,2005.\n" +
                "\n" +
                "G. M. Masters, \"Renewable and Efficient Electric Power Systems\", John Wiley and Sons,2004.\n" +
                "\n" +
                "S. P. Sukhatme, \"Solar Energy: Principles of Thermal Collection and Storage\", McGraw Hi11,1984.\n" +
                "\n" +
                "H. Siegfried and R. Waddington, \"Grid integration of wind energy conversion systems\" John Wiley and Sons Ltd.,2006.\n" +
                "\n" +
                "G. N. Tiwari and M. K. Ghosal, \"Renewable Energy Applications\", Narosa Publications,2004.\n" +
                "\n" +
                "J. A. Duffie and W. A. Beckman, \"Solar Engineering of Thermal Processes\", John Wiley & Sons,1991...");

        List<String> PROJECTSecond = Arrays.asList("PROJECT-II..");

        List<Semester> eightSemesters = new ArrayList<>();
        eightSemesters.add(new Semester("OPEN ELECTIVE-III", OPENELECTIVEThree));
        eightSemesters.add(new Semester("OPEN ELECTIVE-IV", OPENELECTIVEFour));
        eightSemesters.add(new Semester("PROGRAM ELECTIVE-V", PROGRAMELECTIVEFive));
        eightSemesters.add(new Semester("PROGRAM ELECTIVE-VI", PROGRAMELECTIVESix));
        eightSemesters.add(new Semester("PROJECT-II", PROJECTSecond));

        branches.add(new Branch("Semester 8", eightSemesters));






        return branches;
    }

}


