package com.example.beuengineers.Syllabus;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beuengineers.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MechanicalActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BranchAdapter branchAdapter;
    List<Branch> branchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        branchList = getBranches();
        branchAdapter = new BranchAdapter(branchList, this);
        recyclerView.setAdapter(branchAdapter);
    }

    private List<Branch> getBranches() {
        List<Branch> branches = new ArrayList<>();

        //1 Semester
        List<String> BasicElectricalEngineering = Arrays.asList("Module-1\n" +
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
                "4. BASIC ELECTRICAL ENGINEERING BY FITZERALD.");




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
                "Matrices & Determinants ( 10 Lectures )\n" +
                "Inverse and rank of matrix, Rank-Nullity theorem, System of linear equations,Symmetric, Skew-symmertic and Orthogonal matrices. Determinants: Cayley Hamilton theorem and orthogonal transformation.");



        List<String> EngineeringGraphicsDesign = Arrays.asList("Traditional Engineering Graphics\n" +
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
                "4. NARAYANA, K.L. & P KANNAIAH (2008), TEXT BOOK ON ENGINEERING DRAWING, SCITECHPUBLISHERS.");



        List<String> PhysicsElectromagnetism  = Arrays.asList("Module-1\n" +
                "ELECTROSTATICS IN VACUUM (8 LECTURES)\n" +
                "Calculation of electric field and electrostatic potential for a charge distribution; Divergence and Curl of electrostatic field; Laplace’s and Poisson’s equations for electrostatic potential and uniqueness of their solution and connection with steady state diffusion and thermal conduction; Practical examples like Farady’s cage and Coffee-ring effect; Boundary conditions of electric field and electrostatic potential; Method of images; Energy of a charge distribution and its expression in terms of Electric Field.\n" +
                "\n" +
                "Module-2\n" +
                "ELECTROSTATICS IN A LINEAR DIELECTRIC MEDIUM (4 LECTURES)\n" +
                "Electrostatic field and potential of a Dipole. Bound charges due to electric polarization; Electric displacement; Boundary conditions on displacement; Solving simple electrostatics problems in presence of dielectrics – Point charge at the centre of a Dielectric sphere, Charge in front of a dielectric slab, Dielectric slab and dielectric sphere in Uniform electric field.\n" +
                "\n" +
                "Module-3\n" +
                "MAGNETOSTATICS (6 LECTURES)\n" +
                "Bio-Savart law, Divergence and Curl of static magnetic field; Vector potential and Calculating it for a given magnetic field using Stokes’ theorem; The equation for the vector potential and its solution for given current Densities.\n" +
                "\n" +
                "Module-4\n" +
                "MAGNETOSTATICS IN A LINEAR MAGNETIC MEDIUM (3 LECTURES)\n" +
                "Magnetization and associated bound Currents; Auxiliary magnetic field; Boundary conditions on and. Solving for magnetic field due to simple magnets like a Bar Magnet; Magnetic susceptibility and Ferromagnetic, Paramagnetic and Diamagnetic materials; Qualitative discussion of magnetic field in presence of magnetic materials.\n" +
                "\n" +
                "Module-5\n" +
                "FARADAY’S LAW (4 LECTURES)\n" +
                "Faraday’s law in terms of EMF produced by changing Magnetic Flux; Equivalence of Faraday’s law and motional EMF; Lenz’s law; Electromagnetic breaking and its applications; Differential form of Faraday’s law expressing Curl of electric field in terms of Time-derivative of magnetic field and calculating electric field due to changing magnetic fields in Quasi-static approximation; Energy stored in a Magnetic Field.\n" +
                "\n" +
                "Module-6\n" +
                "DISPLACEMENT CURRENT, MAGNETIC FIELD DUE TO TIME-DEPENDENT ELECTRIC FIELD AND MAXWELL’S EQUATIONS (5 LECTURES)\n" +
                "Continuity equation for current densities; Modifying equation for the curl of magnetic field to satisfy continuity equation; Displace current and magnetic field arising from time- dependent electric field; Calculating magnetic field due to changing electric fields in Quasi- Static approximation. Maxwell’s equation in vacuum and Non-conducting medium; Energy in an electromagnetic field; Flow of energy and poynting vector with examples. Qualitative discussion of momentum in electromagnetic fields.\n" +
                "\n" +
                "Module-7\n" +
                "ELECTROMAGNETIC WAVES (8 LECTURES)\n" +
                "The wave equation; Plane Electromagnetic waves in vacuum, Their transverse nature and Polarization; Relation between electric and magnetic fields of an Electromagnetic wave; Energy carried by Electromagnetic waves and examples. Momentum carried by electromagnetic waves and resultant pressure. Reflection and transmission of electromagnetic waves from a Non-conducting medium-vacuum interface for normal incidence.");



        List<Semester> firstSemesters = new ArrayList<>();
        firstSemesters.add(new Semester("Basic Electrical Engineering", BasicElectricalEngineering));
        firstSemesters.add(new Semester("Mathematics-I ( Calculus and Linear Algebra )", MathFirst));
        firstSemesters.add(new Semester("Engineering Graphics and Design", EngineeringGraphicsDesign));
        firstSemesters.add(new Semester("Physics ( Electromagnetism )", PhysicsElectromagnetism));

        branches.add(new Branch("Semester 1", firstSemesters));
        //1st Semester Complete......



        //2 Semester Start.....
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
                "15. Use of capillary viscisimeter to the demonstrate of the iso electric point as the PH of minimum viscosity.");


        List<String> MatheSecond = Arrays.asList("Module-1\n" +
                "MULTIVARIABLE CALCULUS (INTEGRATION): (10 LECTURES)\n" +
                "Multiple integration: Double integrals (Cartesian), Change of order of integration in double integrals, Change of variables (cartesian to polar), Applications: Areas and volumes, Center of mass and gravity (Constant and variable densities); Triple integrals (Cartesian), Orthogonal Curvilinear co-ordinates, Simple applications involving cubes, Sphere and rectangular Parallelepipeds; Scalar line integrals, Vector line integrals, Scalar surface integrals, Vector surface integrals, Theorems of Green, Gauss and Stokes.\n" +
                "\n" +
                "Module-2\n" +
                "FIRST ORDER ORDINARY DIFFERENTIAL EQUATIONS: (6 LECTURES)\n" +
                "Exact, Linear and Bernoulli’s equations, Euler’s equations, Equations not of first degree: Equations solvable for P, equations solvable for Y, equations solvable for X and Clairaut’s type.\n" +
                "\n" +
                "Module-3\n" +
                "ORDINARY DIFFERENTIAL EQUATIONS OF HIGHER ORDERS: (8 LECTURES)\n" +
                "Second order linear differential equations with variable coefficients, Method of variation of parameters, Cauchy-Euler equation; Power series solutions; Legendre polynomials, Bessel functions of the first kind and their properties.\n" +
                "\n" +
                "Module-4\n" +
                "COMPLEX VARIABLE – DIFFERENTIATION: (8 LECTURES)\n" +
                "Differentiation, Cauchy-Riemann equations, Analytic functions, Harmonic functions, Finding harmonic conjugate; Elementary analytic functions (Exponential, Trigonometric, Logarithm) and their properties; Conformal mappings, Mobius transformations and their properties.\n" +
                "\n" +
                "Module-5\n" +
                "COMPLEX VARIABLE – INTEGRATION: (8 LECTURES)\n" +
                "Contour Integrals, Cauchy-Goursat theorem (without proof), Cauchy integral formula (without proof), Liouville’s theorem and maximum-modulus theorem (without proof); Taylor’s series, Zeros of analytic functions, Singularities, Laurent’s series; Residues, Cauchy residue theorem (without proof), Evaluation of definite integral involving sine and cosine, Evaluation of certain improper integrals using the Bromwich Contour.");


        List<String> ProgrammingProblemSolving = Arrays.asList("Module-1\n" +
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
                "11. File handling ( File Operations ).");


        List<String> WorkshopManufacturingPractice = Arrays.asList("Module-1\n" +
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
                "Workshop Practice ( 60 hours )                                                                                \n" +
                "1. Machine shop and Fitting shop( 18 hrs )                                     \n" +
                "2. Carpentary( 6 hrs )\n" +
                "3. Welding shop ( Arc welding + Gas welding )( 8 hrs )\n" +
                "4. Casting and smithy( 6 hrs )\n" +
                "5. Plastic Moulding and Glass cutting( 6 hrs )\n" +
                "6. 3-Printing of different models ( 8 hrs ).");


        List<String> English = Arrays.asList("Module-1\n" +
                "Vocabulary Building\n" +
                "A. The concept of word formation                                                                                                               \n" +
                "B. Root words from foreign languages and their use in English.\n" +
                "C. Acquantance with prefixes and suffixes from foreign languages in English to from derivatives.\n" +
                "D. Synonyms, Antonyms and standard abbreviations.\n" +
                "E. Affixes, Acronyms\n" +
                "\n" +
                "Module-2\n" +
                "Basic writing skills\n" +
                "A. Sentences structures.                                                                                                                                                    \n" +
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
                "A. Subject-Verb agreement.                                                                                                                                                    \n" +
                "B. Noun-Pronoun agreement.\n" +
                "C. Misplaced modifiers\n" +
                "D. Articles\n" +
                "E. Prepositions, Redundancies,Cliches.\n" +
                "F. Common english errors\n" +
                "Module-4\n" +
                "Nature and style of sensible writing\n" +
                "A. Describing                        \n" +
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
                "A. Comprehension                                                                                                                                     \n" +
                "B. Formal letter writing/application/Report writing/writing minutes of meetings.\n" +
                "C. Essay writing\n" +
                "D. Formal Email writing\n" +
                "E. Resume/ CV writing /Cover letter\n" +
                "F. Statement of purpose\n" +
                "\n" +
                "Module-6\n" +
                "Oral communication\n" +
                "( This unit involves interactive practices in language Lab. )                                                                                                                       \n" +
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
                "A. Reading comprehension                                                                                                                                    \n" +
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
                "A. Narrative chain                                                                                                                                                                       \n" +
                "B. Describing / Narrating\n" +
                "C. Writing essay in relay\n" +
                "D. Peer / Group activities\n" +
                "E. Brain storming vocabulary\n" +
                "F. Debates.");


        List<Semester> secondSemesters = new ArrayList<>();
        secondSemesters.add(new Semester("Chemistry", Chemistry));
        secondSemesters.add(new Semester("Mathematics-II ( ODE and Complex Variable )", MatheSecond));
        secondSemesters.add(new Semester("Programming for Problem Solving", ProgrammingProblemSolving));
        secondSemesters.add(new Semester("Workshop Manufacturing Practice", WorkshopManufacturingPractice));
        secondSemesters.add(new Semester("English", English));

        branches.add(new Branch("Semester 2", secondSemesters));
        //2nd Semester Complete......



        //3 Semester Start.....
        List<String> BasicElectronicEngineering = Arrays.asList("Module-1\n" +
                "Semiconductor Devices and Applications ( 10 Lectures )\n" +
                "Semiconductor Devices and Applications: Introduction to P-N Junction Diode and V-I characteristics, Half wave and Full-wave rectifiers, capacitor filter. Zener diode and its characteristics, Zener diode as voltage regulator. Regulated power supply IC based on 78XX and 79XX series, Introduction to BJT, its input-output and transfer characteristics, BJT as a single stage CE amplifier, frequency response and bandwidth.\n" +
                "\n" +
                "Module-2\n" +
                "Operational amplifier and its applications ( 8 Lectures )\n" +
                "Operational amplifier and its applications: Introduction to operational amplifiers, Op-amp input modes and parameters, Op-amp in open loop configuration, op-amp with negative feedback, study of practical op-amp IC 741, inverting and non-inverting amplifier applications: summing and difference amplifier, unity gain buffer, comparator, integrator and differentiator\n" +
                "\n" +
                "Module-3\n" +
                "Timing Circuits and Oscillators( 6 Lectures )\n" +
                "Timing Circuits and Oscillators: RC-timing circuits, IC 555 and its applications as table and mono-stable multi-vibrators, positive feedback, Barkhausen's criteria for oscillation, R-C phase shift and Wein bridge oscillator.\n" +
                "\n" +
                "Module-4\n" +
                "Digital Electronics Fundamentals\n" +
                "Digital Electronics Fundamentals: Difference between analog and digital signals, Boolean algebra, Basic and Universal Gates, Symbols, Truth tables, logic expressions, Logic simplification using Kmap, Logic ICs, half and full adder/subtractor, multiplexers, de-multiplexers, flip-flops, shift registers, counters, Block diagram of microprocessor/microcontroller and their applications.\n" +
                "\n" +
                "Module-5\n" +
                "Electronic Communication Systems\n" +
                "Electronic Communication Systems: The elements of communication system, IEEE frequency spectrum, Transmission media: wired and wireless, need of modulation, AM and FM modulation schemes, Mobile communication systems: cellular concept and block diagram of GSM system.");


        List<String> EngineeringMechanics = Arrays.asList("Module-1\n" +
                "Statics ( 7 Lectures )\n" +
                "Force System, Moment of a force about a point and an axis; Equivalent force and moment.                  \n" +
                "\n" +
                "Module-2\n" +
                "Equilibrium ( 6 Lectures )\n" +
                "Free body diagram; equations of equilibrium; problems in two and three dimension; plane frames and trusses.\n" +
                "\n" +
                "Module-3\n" +
                "Friction ( 8 Lectures )\n" +
                "Laws of Coulomb friction, impending motion problems involving large and small contact surfaces; square threaded screw; principle of virtual work and stability.\n" +
                "\n" +
                "Module-4\n" +
                "Dynamics ( 6 Lectures )\n" +
                "Kinematics and kinetics of particles dynamics in rectangular coordinates cylindrical coordinates and in terms of path variables.\n" +
                "\n" +
                "module-5\n" +
                "Properties of Area ( 8 lectures )\n" +
                "Center of mass; Moments of inertia; kinematics of rigid bodies;Chasle’s Theorem, concept of fixed vector, velocity and acceleration of particles in different frames of references. General plane motion.\n" +
                "\n" +
                "Module-6\n" +
                "Work, Energy and Momentum ( 7 lectures )\n" +
                "Work & Energy and impulse and Momentum methods for particles and rigid bodies: Conservation of momentum, coefficient of restitution, moment of momentum equation.");


        List<String> Thermodynamics = Arrays.asList("Module-1\n" +
                "Fundamentals - System & Control volume ( 5 Lectures )\n" +
                "Fundamentals - System & Control volume; Property, State & Process; Exact & Inexact differentials; Work-Thermodynamic definition of work; examples; Displacement work; Path dependence of displacement work and illustrations for simple processes; electrical, magnetic, gravitational, spring and shaft work.\n" +
                "\n" +
                "Module-2\n" +
                "Thermal Equilibrium ( 5 Lectures )\n" +
                "Temperature, Definition of thermal equilibrium and Zeroth law; Temperature scales; Various Thermometers- Definition of heat; examples of heat/work interaction in systems- First Law for Cyclic & Non-cyclic processes; Concept of total energy E; Demonstration that E is a property; Various modes of energy, Internal energy and Enthalpy.\n" +
                "\n" +
                "Module-3\n" +
                "Definition of Pure substance, Ideal Gases and ideal gas mixtures, Real gases and real gas mixtures, Compressibility charts- Properties of two phase systems - Const. temperature and Const. pressure heating of water; Definitions of saturated states; P-v-T surface; Use of steam tables; Saturation tables; Superheated tables; Identification of states & determination of properties, Mollier’s chart.\n" +
                "\n" +
                "Module-4\n" +
                "First Law for Flow Processes ( 5 Lectures )\n" +
                "Derivation of general energy equation for a control volume; Steady state steady flow processes including throttling; Examples of steady flow devices; Unsteady processes; examples of steady and unsteady I law applications for system and control volume.\n" +
                "\n" +
                "Module-5\n" +
                "Second Law for Flow process ( 5 Lectures )\n" +
                "Second law - Definitions of direct and reverse heat engines; Definitions of thermal efficiency and COP; Kelvin-Planck and Clausius statements; Definition of reversible process; Internal and external irreversibility; Carnot cycle; Absolute temperature scale.\n" +
                "\n" +
                "Module-6\n" +
                "Clausius inequality ( 8 Lectures )\n" +
                "Clausius inequality; Definition of entropy S ; Demonstration that entropy S is a property; Evaluation of Entropy for solids, liquids, ideal gases and ideal gas mixtures undergoing various processes; Determination of entropy from steam tables-Principle of increase of entropy; Illustration of processes in T-s coordinates; Definition of Isentropic efficiency for compressors, turbines and nozzles- Irreversibility and Availability, Availability function for systems and Control volumes undergoing different processes, Lost work. Second law analysis for a control volume. Exergy balance equation and Exergy analysis.\n" +
                "\n" +
                "Module-7\n" +
                "Properties of dry and wet air, use of psychometric chart, processes involving heating/cooling and humidification/dehumidification, dew point.");


        List<String> MachineDrawing = Arrays.asList("Module-1\n" +
                "( 2 Lectures )\n" +
                "Introduction to full section, half section, revolved-section off-set section.                            \n" +
                "\n" +
                "Module-2\n" +
                "( 3 Lectures )\n" +
                "Nut Bolts, Riveted joints, Thread profiles, Screw jack.                            \n" +
                "\n" +
                "Module-3\n" +
                "( 3 Lectures )\n" +
                "Bushed bearing, pedestal, bearing, foot step bearing.                            \n" +
                "\n" +
                "Module-4\n" +
                "( 2 Lectures )\n" +
                "Flanged coupling, flexible coupling, solid coupling.                            \n" +
                "\n" +
                "Module-5\n" +
                "( 2 Lectures )\n" +
                "Engine parts - Stuffing box, Connecting rod, Atomizer, spark plug, etc.                            \n" +
                "\n" +
                "Module-6\n" +
                "( 4 Lectures )\n" +
                "Eccentric.                                                        \n" +
                "Cross Head.\n" +
                "\n" +
                "Module-7\n" +
                "( 2 Lectures )\n" +
                "Assembly of dissembled parts. disassembly of assembly parts.");


        List<String> MathematicsThree = Arrays.asList("Module-1\n" +
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
                "Purpose: The fundamental principles of energy transactions are the same in physical and biological world. Thermodynamics as applied to biological systems. Exothermic and endothermic versus endergonic and exergonic reactions. Concept of Keq and its relation to standard free energy. Spontaneity. ATP as an energy.");


        List<Semester> thirdSemesters = new ArrayList<>();
        thirdSemesters.add(new Semester("Basic Electronic Engineering", BasicElectronicEngineering));
        thirdSemesters.add(new Semester("Engineering Mechanics", EngineeringMechanics));
        thirdSemesters.add(new Semester("Thermodynamics", Thermodynamics));
        thirdSemesters.add(new Semester("Machine Drawing", MachineDrawing));
        thirdSemesters.add(new Semester("Mathematics-III ( PDE, Probability and Statics )", MathematicsThree));
        thirdSemesters.add(new Semester("Biology", Biology));

        branches.add(new Branch("Semester 3", thirdSemesters));
        //3rd Semester Complete.....




        //4th Semester  Start......
        List<String> FluidMechanics = Arrays.asList("Fluid Mechanics\n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "1. To learn about the application of mass and momentum conservation laws for fluid flows\n" +
                "\n" +
                "2. To understand the importance of dimensional analysis\n" +
                "\n" +
                "3. To obtain the velocity and pressure variations in various types of simple flows\n" +
                "\n" +
                "4. To analyze the flow in water pumps and turbines. Contents:\n" +
                "\n" +
                "\n" +
                "Module: 1 (8 lectures)\n" +
                "\n" +
                "Definition of fluid, Units and dimensions, Newton’s law of viscosity, Properties of fluids, mass, density, specific volume, specific gravity, viscosity, surface tension and capillarity, vapor pressure, compressibility and bulk modulus.Hydrostatics; fluid force on plane and curved surfaces, manometers, buoyancy, uniformly accelerated motion.\n" +
                "\n" +
                "\n" +
                "Module: 2 (4 lectures)\n" +
                "\n" +
                "Kinematics of fluid flow: Generalized continuity equation, Irrotational motion and solution to Laplace equation. Concept of stream lines, Equipotential Lines, Flow Nets.\n" +
                "\n" +
                "\n" +
                "Module: 3 (6 lectures)\n" +
                "\n" +
                "Dynamics of fluid flow: Control volume and control surface, application of continuity equation and momentum equation, Bernoulli’s equation and its applications.\n" +
                "\n" +
                "\n" +
                "Module: 4 (4 lectures)\n" +
                "\n" +
                "Concept of boundary layer, boundary layer thickness, Displacement thickness, momentum thickness, energy thickness.\n" +
                "\n" +
                "\n" +
                "Module: 5 (8 lectures)\n" +
                "\n" +
                "Laminar viscous flow through circular conduits, Couette and Poisuielle flow, Turbulent flow through pipes, Darcy Weisbach equation, friction factor for smooth and rough pipes, Moody’s diagram. \n" +
                "\n" +
                "\n" +
                "Module: 6 (6 lectures)\n" +
                "\n" +
                "Need for dimensional analysis, methods of dimension analysis, Similitude and types of similitude, Dimensionless parameters, application of dimensionless parameters Model analysis. \n" +
                "\n" +
                "\n" +
                "Module: 7 (6 lectures) Forces on immersed bodies, concepts of separation, drag force, circulation and lift force. \n" +
                "\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "1. Frank M. White, Fluid Mechanics (Sixth Edition), Tata McGraw-Hill, New Delhi (2008).\n" +
                "\n" +
                "2. J. O. Wilkes, Fluid Mechanics for Chemical Engineers, Prentice Hall (1999).\n" +
                "\n" +
                "3. Som and Biswas; Fluid Mechanics and machinery; TMH\n" +
                "\n" +
                "4. Cengal; Fluid Mechanics; TMH\n" +
                "\n" +
                "5. Modi & Seth; Fluid Mechanics; Standard Book House, Delhi\n" +
                "\n" +
                "\n" +
                "Practical:\n" +
                "\n" +
                "\n" +
                "1. Determination of density & viscosity of oil.\n" +
                "\n" +
                "2. To determine the meta-centric height of a floating body.\n" +
                "\n" +
                "3. Measurement of Coefficient of Discharge of given Orifice and Venturimeter\n" +
                "\n" +
                "4. To determine the coefficient of discharge of Notch (Vand Rectangular types)\n" +
                "\n" +
                "5. To determine the friction factor for the pipes.\n" +
                "\n" +
                "6. To verify the Bernoulli’s Theorem.\n" +
                "\n" +
                "7. To find critical Reynolds number for a pipe flow.\n" +
                "\n" +
                "8. To determine the minor losses due to sudden enlargement, sudden contraction and bends.\n" +
                "\n" +
                "9. To show the velocity and pressure variation with radius in a free and forced vortex\n" +
                "\n" +
                "\n" +
                "*Atleast 8 experiments should be performed from above list\n" +
                "\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "\n" +
                "1. State the Newton’s law of viscosity and explain the mechanics of fluids at rest and in motion by observing the fluid phenomena.\n" +
                "\n" +
                "2. Compute force of buoyancy on a partially or fully submerged body and analyze the stability of a floating body.\n" +
                "\n" +
                "3. Derive Euler’s Equation of motion and deduce Bernoulli’s equation.\n" +
                "\n" +
                "4. Examine energy losses in pipe transitions and sketch energy gradient lines.\n" +
                "\n" +
                "5. Evaluate pressure drop in pipe flow using Hagen-Poiseuille’s equation.\n" +
                "\n" +
                "6. Distinguish the types of flows.");


        List<String> AppliedThermodynamics = Arrays.asList("Applied Thermodynamics\n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "1. To learn about of I law for reacting systems and heating value of fuels\n" +
                "\n" +
                "2. To learn about gas and vapor cycles and their first law and second law efficiencies\n" +
                "\n" +
                "3. To understand about the properties of dry and wet air and the principles of psychometric\n" +
                "\n" +
                "4. To learn about gas dynamics of air flow and steam through nozzles\n" +
                "\n" +
                "5. To learn the about reciprocating compressors with and without intercooling\n" +
                "\n" +
                "6. To analyze the performance of steam turbines\n" +
                "\n" +
                "\n" +
                "Module 1: (8 lectures)\n" +
                "\n" +
                "Introduction to solid, liquid and gaseous fuels–Stoichiometry, exhaust gas analysis- First law analysisof combustion reactions. Heat calculations using enthalpy tables. Adiabatic flame temperature. Chemical equilibrium and equilibrium composition calculations using free energy.\n" +
                "\n" +
                "\n" +
                "Module 2: (10 lectures)\n" +
                "\n" +
                "Thermodynamic cycles, Gas power cycles: Air standard Otto, Diesel and Dual Cycles. Air standard Brayton cycle, effect of reheat, regeneration and intercooling. Combined gas and vapor power cycles. Vapor compression refrigeration cycles cycle and comparison with Carnot cycle, refrigerants and their properties.\n" +
                "\n" +
                "\n" +
                "Module 3: (6 lectures)\n" +
                "\n" +
                "Vapor power cycles: Basic Rankine cycle, Rankine cycle with superheat, reheat and regeneration, exergy analysis. Super- critical and ultra-super-critical Rankine cycle.\n" +
                "\n" +
                "\n" +
                "Module 4: (8 lectures)\n" +
                "\n" +
                "Basics of compressible flow. Stagnation properties, Isentropic flow of a perfect gas through a nozzle, choked flow, subsonic and supersonic flows- normal shocks- use of ideal gas tables for isentropic flow and normal shock flow- Flow of steam and refrigerant through nozzle, super saturationcompressible flow in diffusers, efficiency of nozzle and diffuser.\n" +
                "\n" +
                "\n" +
                "Module 5: (5 lectures)\n" +
                "\n" +
                "Analysis of steam turbines, velocity and pressure compounding of steam turbines.\n" +
                "\n" +
                "\n" +
                "Module 6: (5 lectures)\n" +
                "\n" +
                "Reciprocating compressors, staging of reciprocating compressors, optimal stage pressure ratio, effect of intercooling, minimum work for multistage reciprocating compressors.\n" +
                "\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "1. Sonntag, R. E, Borgnakke, C. and Van Wylen, G. J., 2003, 6th Edition, Fundamentals of Thermodynamics, John Wiley andSons.\n" +
                "\n" +
                "2. Jones, J. B. and Duggan, R. E., 1996, Engineering Thermodynamics, Prentice-Hall of India\n" +
                "\n" +
                "3. Moran, M. J. and Shapiro, H. N., 1999, Fundamentals of Engineering Thermodynamics, John Wiley andSons.\n" +
                "\n" +
                "4. Nag, P. K, 1995, Engineering Thermodynamics, Tata McGraw-Hill Publishing Co. Ltd\n" +
                "\n" +
                "\n" +
                "Outcomes:\n" +
                "\n" +
                "\n" +
                "1. After completing this course, the students will get a good understanding of various practical power cycles and heat pump cycles.\n" +
                "\n" +
                "2. They will be able to analyze energy conversion in various thermal devices such as combustors, air coolers, nozzles, diffusers, steam turbines and reciprocating compressors.3. They will be able to understand phenomena occurring in high speed compressible flows.");


        List<String> StrengthMaterials = Arrays.asList("Strength of Materials\n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "\n" +
                "1. To understand the nature of stresses developed in simple geometries such as bars, cantilevers, beams, shafts, cylinders and spheres for various types of simple loads.\n" +
                "\n" +
                "2. To calculate the elastic deformation occurring in various simple geometries for different types of loading.\n" +
                "\n" +
                "\n" +
                "Module :1 (8 lectures)\n" +
                "\n" +
                "Deformation in solids- Hooke’s law, stress and strain- tension, compression and shear stresseselastic constants and their relations- volumetric, linear and shear strains- principal stresses and principal planes- Mohr’s circle, theories of failure,\n" +
                "\n" +
                "\n" +
                "Module :2 (8 lectures)\n" +
                "\n" +
                "Beams and types transverse loading on beams- shear force and bend moment diagrams- Types of beam supports, simply supported and over-hanging beams, cantilevers. Theory of bending of beams, bending stress distribution and neutral axis, shear stress distribution, point and distributed loads.\n" +
                "\n" +
                "\n" +
                "Module :3 (8 lectures)\n" +
                "\n" +
                "Moment of inertia about an axis and polar moment of inertia, deflection of a beam using double integration method, computation of slopes and deflection in beams, Maxwell’s reciprocal theorems.\n" +
                "\n" +
                "\n" +
                "Module :4 (8 lectures)\n" +
                "\n" +
                "Torsion, stresses and deformation in circular and hollow shafts, stepped shafts, deflection of shafts fixed at both ends, stresses and deflection of helical springs.\n" +
                "\n" +
                "\n" +
                "Module :5 (8 lectures)\n" +
                "\n" +
                "Axial and hoop stresses in cylinders subjected to internal pressure, deformation of thick and thin cylinders, deformation in spherical shells subjected to internal pressure.\n" +
                "\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "1. Egor P. Popov, Engineering Mechanics of Solids, Prentice Hall of India, New Delhi,2001.\n" +
                "\n" +
                "2. R. Subramanian, Strength of Materials, Oxford University Press,2007.\n" +
                "\n" +
                "3. Ferdinand P. Been, Russel Johnson Jr. and John J. Dewole, Mechanics of Materials, Tata GrawHill Publishing Co. Ltd., New Delhi2005.\n" +
                "\n" +
                "\n" +
                "Practical:\n" +
                "\n" +
                "\n" +
                "1. Hooke’s Law\n" +
                "\n" +
                "2. Hardness Test: Rockwell, Brinell, Vicker\n" +
                "\n" +
                "3. Izod & Charpy Impact Test\n" +
                "\n" +
                "4. Bending Test\n" +
                "\n" +
                "5. Torsion Test\n" +
                "\n" +
                "6. Shear test\n" +
                "\n" +
                "7. Compressive strength test\n" +
                "\n" +
                "8. Fatigue Test\n" +
                "\n" +
                "9. Verification of Maxwell’s reciprocal theorem\n" +
                "\n" +
                "10. Continuous beam deflection test\n" +
                "\n" +
                "11. Strain Measurement\n" +
                "\n" +
                "\n" +
                "*Atleast 8 experiments should be performed from above list\n" +
                "\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "\n" +
                "1. After completing this course, the students should be able to recognize various types loads applied on machine components of simple geometry and understand the nature of internal stresses that will develop within the components\n" +
                "\n" +
                "2. The students will be able to evaluate the strains and deformation that will result due to the elastic stresses developed within the materials for simple types of loading.");


        List<String> EngineeringMaterials = Arrays.asList("Engineering Materials\n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "\n" +
                "1. Understanding of the correlation between the internal structure of materials, their mechanical properties and various methods to quantify their mechanical integrity and failure criteria.\n" +
                "\n" +
                "2. To provide a detailed interpretation of equilibrium phase diagrams and Learning about different phases and heat treatment methods to tailor the properties of Fe-C alloys. Contents\n" +
                "\n" +
                "\n" +
                "Module:1 (6 lectures)\n" +
                "\n" +
                "Crystal Structure: Unit cells, Metallic crystal structures, Ceramics. Imperfection in solids: Point, line, interfacial and volume defects; dislocation strengthening mechanisms and slip systems, critically resolved shear stress.\n" +
                "\n" +
                "\n" +
                "Module:2 (8 lectures)\n" +
                "\n" +
                "Alloys, substitutional and interstitial solid solutions- Phase diagrams: Interpretation of binary phase diagrams and microstructure development; eutectic, peritectic, peritectoid and monotectic reactions. Iron Iron-carbide phase diagram and microstrctural aspects of ledeburite, austenite, ferrite and cementite, cast iron.\n" +
                "\n" +
                "\n" +
                "Module: 3 (10 lectures)\n" +
                "\n" +
                "Mechanical Property measurement: Tensile, compression and torsion tests; Young’s modulus, relations between true and engineering stress-strain curves, generalized Hooke’s law, yielding and yield strength, ductility, resilience, toughness and elastic recovery; Hardness: Rockwell, Brinell and Vickers and their relation to strength, Introduction to non-destructive testing (NDT).\n" +
                "\n" +
                "\n" +
                "Module: 4 (10 lectures)\n" +
                "\n" +
                "Heat treatment of Steel: Annealing, tempering, normalising and spheroidising, isothermal transformation diagrams for Fe-C alloys and microstructure development. Continuous cooling curves, T-T-T diagram and interpretation of final microstructures and properties- austempering, martempering, case hardening, carburizing, nitriding, cyaniding, carbo-nitriding, flame and induction hardening, vacuum and plasma hardening.\n" +
                "\n" +
                "\n" +
                "Module: 5 (8 lectures)Alloying of steel, properties of stainless steel and tool steels, maraging steels- cast irons; grey, white, malleable and spheroidal cast irons- copper and copper alloys; brass, bronze and cupronickel; Aluminium and Al-Cu – Mg alloys- Nickel based superalloys and Titanium alloys.\n" +
                "\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "\n" +
                "1. W. D. Callister, 2006, “Materials Science and Engineering-An Introduction”, 6th Edition, Wiley India.\n" +
                "\n" +
                "2. Kenneth G. Budinski and Michael K. Budinski, “Engineering Materials”, Prentice Hall of India Private Limited, 4th Indian Reprint, 2002.\n" +
                "\n" +
                "3. V. Raghavan, “Material Science and Engineering’, Prentice Hall of India Private Limited, 1999.\n" +
                "\n" +
                "4. U. C. Jindal, “Engineering Materials and Metallurgy”, Pearson, 2011.\n" +
                "\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "\n" +
                "1. Student will be able to identify crystal structures for various materials and understand the defects in such structures\n" +
                "\n" +
                "2. Understand how to tailor material properties of ferrous and non-ferrous alloys\n" +
                "\n" +
                "3. How to quantify mechanical integrity and failure in materials.");


        List<String> InstrumentationAndControl = Arrays.asList("Instrumentation and Control\n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "\n" +
                "1. To provide a basic knowledge about measurement systems and their components\n" +
                "\n" +
                "2. To learn about various sensors used for measurement of mechanical quantities\n" +
                "\n" +
                "3. To learn about system stability and control\n" +
                "\n" +
                "4. To integrate the measurement systems with the process for process monitoring and control\n" +
                "\n" +
                "\n" +
                "Module: 1 (10 lectures)\n" +
                "\n" +
                "Measurement systems and performance -configuration of a measuring system, Methods for correction for interfering and modifying inputs– accuracy, range, resolution, error sources, precision, error sensitivity etc.Classification of errors and statistical analysis of experimental data. \n" +
                "\n" +
                "\n" +
                "Module: 2 (8 lectures)\n" +
                "\n" +
                "Instrumentation system elements -sensors for common engineering measurements. Transducers based on variable resistance, variable induction, variable capacitance and piezo-electric effects, Displacement transducer.\n" +
                "\n" +
                "\n" +
                "Module: 3 (6 lectures)\n" +
                "\n" +
                "Signal processing and conditioning; correction elements- actuators: pneumatic, hydraulic, electric. \n" +
                "\n" +
                "\n" +
                "Module :4 (10 lectures)\n" +
                "\n" +
                "Control systems – basic elements, open/closed loop, design of block diagram; control method – P, PI, PID, when to choose what, tuning of controllers.\n" +
                "\n" +
                "\n" +
                "Module :5 (6 lectures)\n" +
                "\n" +
                "System models, transfer function and system response, frequency response; Nyquist diagrams and their use.Practical group based project utilizing above concepts.\n" +
                "\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "\n" +
                "1. Instrumentation and control systems by W. Bolton, 2nd edition, Newnes, 2000\n" +
                "\n" +
                "2. Thomas G. Beckwith, Roy D. Marangoni, John H. Lienhard V, Mechanical Measurements (6th Edition) 6th Edition, Pearson Education India, 2007\n" +
                "\n" +
                "3. Gregory K. McMillan, Process/Industrial Instruments and Controls Handbook, Fifth Edition, McGraw-Hill: New York, 1999.\n" +
                "\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "\n" +
                "Upon completion of this course, the students will be able to understand the measurement of various quantities using instruments, their accuracy & range, and the techniques for controlling devices automatically.");



        List<Semester> fourthSemesters = new ArrayList<>();
        fourthSemesters.add(new Semester("Fluid Mechanics", FluidMechanics));
        fourthSemesters.add(new Semester("Applied Thermodynamics", AppliedThermodynamics));
        fourthSemesters.add(new Semester("Strength of Materials", StrengthMaterials));
        fourthSemesters.add(new Semester("Engineering Materials", EngineeringMaterials));
        fourthSemesters.add(new Semester("Instrumentation And Control", InstrumentationAndControl));


        branches.add(new Branch("Semester 4", fourthSemesters));
        //4th Semester End.....



        //5 Semester Start.....
        List<String> HeatTransfer = Arrays.asList("Module-1\n" +
                "Introduction ( 12 Lectures )\n" +
                "Introduction to three modes of heat transfer, Derivation of heat balance equation- Steady one dimensional solution for conduction heat transfer in Cartesian, cylindrical and spherical geometry, concept of conduction and film resistances, critical insulation thickness, lumped system approximation and Biot number, heat transfer through pin fins- Two dimensional conduction solutions for both steady and unsteady heat transfer-approximate solution to unsteady conduction heat transfer by the use of Heissler charts.\n" +
                "\n" +
                "Module-2\n" +
                "Heat convection, basic equations, boundary layer ( 8 Lectures )\n" +
                "Heat convection, basic equations, boundary layers- Forced convection, external and internal flows- Natural convective heat transfer- Dimensionless parameters for forced and free convection heat transfer-Correlations for forced and free convection- Approximate solutions to laminar boundary layer equations (momentum and energy) for both internal and external flow- Estimating heat transfer rates in laminar and turbulent flow situations using appropriate correlations for free and forced convection\n" +
                "\n" +
                "Module-3\n" +
                "Interaction of radiation with materials( 8 Lectures )\n" +
                "Interaction of radiation with materials, definitions of radiative properties, Stefan Boltzmann’s law, black and gray body radiation, Calculation of radiation heat transfer between surfaces using radiative properties, view factors and the radiosity method.\n" +
                "\n" +
                "Module-4\n" +
                "Type of Heat Exchanger( 6 hrs )\n" +
                "Types of heat exchangers, Analysis and design of heat exchangers using\n" +
                "bothLMTD and ε-NTU methods.\n" +
                "\n" +
                "Module-5\n" +
                "( 3 Lectures )\n" +
                "Boiling and Condensation heat transfer, Pool boiling curve.\n" +
                "\n" +
                "Module-6\n" +
                "Introduction mass transfer, Similarity between heat and mass transfer .\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested books\n" +
                "1. Bejan, Heat Transfer John Wiley, 1993\n" +
                "2. J.P.Holman, Heat Transfer, Eighth Edition, McGraw Hill, 1997.\n" +
                "3. F.P.Incropera, and D.P. Dewitt, Fundamentals of Heat and Mass Transfer, John Wiley, Sixth Edition, 2007.\n" +
                "4. MassoudKaviany, Principles of Heat Transfer, John Wiley, 2002\n" +
                "\n" +
                "Practicals\n" +
                "1. Determination of Thermal Conductivity of a Metal Rod.                                                \n" +
                "2. Determination of Overall Heat Transfer Coefficient of a Composite wall.\n" +
                "3. To find the effectiveness of a pin fin in a rectangular duct natural convective condition and plot temperature distribution along its length.\n" +
                "4. To find the effectiveness of a pin fin in a rectangular duct under forced convective and plot temperature distribution along its length.\n" +
                "5. Determination of Heat Transfer Coefficient in a free Convection on a vertical tube.\n" +
                "6. Determination of Heat Transfer Coefficient in a Forced Convention Flow through a Pipe.\n" +
                "7. Determination of Emissivity of a Surface.\n" +
                "8. Determination of Stefan Boltzmann’s Constant.\n" +
                "9. Determination of LMDT and Effectiveness in a Parallel Flow and Counter Flow Heat Exchangers.");


        List<String> FluidMachinery = Arrays.asList("Module-1\n" +
                "Introduction ( 2 hours )\n" +
                "Introduction – Classification of fluid machinery.\n" +
                "\n" +
                "Module-2\n" +
                "Dynamic action of fluid jet ( 4 hrs )\n" +
                "Dynamic action of fluid jet – Impact of fluid jet on fixed and moving flat places, impact of jet on fixed and moving curved vanes, flow over radial vanes, jet propulsions.                                         \n" +
                "\n" +
                "Module-3\n" +
                "Eiler's Equation ( 2 Hrs )\n" +
                "Euler’s fundamental equation, degree of reaction.                                                                                                    \n" +
                "\n" +
                "Module-4\n" +
                "Hydraulic Turbines ( 10 Hrs )\n" +
                "Hydraulic turbines, introduction, classification, impulse turbine, construction details, velocity triangles, power and efficiency calculations, reaction turbines; constructional details, working principle, velocity triangles, power and efficiency calculations, draft tube, cavitation, governing.\n" +
                "\n" +
                "Module-5\n" +
                "Principle of Machinery( 3 Hrs )\n" +
                "Principle of similarity in fluid machinery; unit and specific quantities, testing models and selection of hydraulic turbines.                            \n" +
                "\n" +
                "Module-6\n" +
                "Positive displacement pumps ( 4 Hrs )\n" +
                "Positive displacement pumps: Reciprocating pump; working principle, classification, slip, indicator diagram, effect of friction and acceleration, theory of air vessel, performance characteristics gas gear oil pump and screw pump.\n" +
                "\n" +
                "Module-7\n" +
                "Rotodynamic pump ( 7 Hrs )\n" +
                "Introduction, classification, centrifugal pump; main components, working principle velocity triangle, effect of shape of blade specific speed, heats, power and efficiency, calculations minimum steering speed, multi stage pumps, performance characteristic, comparison with reciprocating pump.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. G. T. Mase, R. E. Smelser and G. E. Mase, Continuum Mechanics for Engineers, Third Edition, CRC Press,2004.\n" +
                "2. Y. C. Fung, Foundations of Solid Mechanics, Prentice Hall International, 1965.\n" +
                "3. Lawrence. E. Malvern, Introduction to Mechanics of a Continuous Medium, Prentice Hall international, 1969.\n" +
                "4. Hydrantic Machine by RD Purohit\n" +
                "\n" +
                "Practicals\n" +
                "1. Performance on hydraulic turbines:\n" +
                "    a. Pelton wheel\n" +
                "    b. Francis turbine\n" +
                "    c. Kaplan turbine.\n" +
                "2. Performance on hydraulic pumps: a. Single stage and multi stage centrifugal pumps b. Reciprocating pump.\n" +
                "3. Performance test of a two stage reciprocating air compressor\n" +
                "4. Performance test on an air blower\n" +
                "\n" +
                "OPTIONAL\n" +
                "1. Visit to hydraulic power station/Municipal water pump house and case studies.\n" +
                "2. Demonstration of cut section models of hydraulic turbines and pumps.");


        List<String> ManufacturingProcess = Arrays.asList("Module-1\n" +
                "Conventional Manufacturing processes ( 6 Hrs )\n" +
                "Casting and Moulding: Metal casting processes and equipment, Heat transfer and solidification, shrinkage, riser design, casting defects and residual stresses.\n" +
                "\n" +
                "Module-2\n" +
                "Introduction to bulk and sheet metal forming ( 6 Lectures )\n" +
                "Introduction to bulk and sheet metal forming, plastic deformation and yield criteria: fundamentals of hot and cold working processes; load estimation for bulk forming(forging, rolling, extrusion, drawing) and sheet forming (shearing, deep drawing, bending) principles of powder metallurgy.\n" +
                "\n" +
                "Module-3\n" +
                "Metal cutting (8 Hours)\n" +
                "Single and multi-point cutting; Orthogonal cutting, various force components: Chip formation, Tool wear and tool life, Surface finish and integrity, Machinability, Cutting tool materials, Cutting fluids, Coating; Turning, Drilling, Milling and finishing processes, Introduction to CNC machining.\n" +
                "\n" +
                "Module-4\n" +
                "Joining/fastening processes (5 Hours )\n" +
                "Physics of welding, brazing and soldering; design considerations in welding, Solid and liquid state joining processes; Adhesive bonding.\n" +
                "Additive manufacturing: Rapid prototyping and rapid tooling .\n" +
                "\n" +
                "Module-5\n" +
                "Machine Tools (15 hours)\n" +
                "(a) Lathe: Principle, types, operations, turret/capstan, semi/automatic, Tool layout.\n" +
                "(b) Shaper, slotted, planer, operation, drive.\n" +
                "(c) Milling, Milling cutter, up & down milling, dividing head indexing, Max chip thickness, power required.\n" +
                "(d) Drilling and boring, reaming tools, Geometry of twist drill, Grinding, Grinding wheel, Abrasive, cutting action, grinding wheel specification, Grinding wheel wear, alterations, wear, fracture wear, dressing and trimming. Max chip thickness and guest criteria, Flat and cylindrical grinding, Centerless grinding, Super finishing, Honing lapping, Polishing\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. Kalpakjian and Schmid, Manufacturing processes for engineering materials (5th Edition)Pearson India, 2014\n" +
                "2. Mikell P. Groover, Fundamentals of Modern Manufacturing: Materials, Processes, and Systems\n" +
                "3. Degarmo, Black &Kohser, Materials and Processes in Manufacturing\n" +
                "Practicals\n" +
                "Minimum of 10 Experiment need to be performed\n" +
                "I. Metal Casting Lab:\n" +
                "1. Pattern Design and making – for one casting drawing.\n" +
                "2. Sand properties testing (strengths and permeability)\n" +
                "3. Moulding, Melting and Casting\n" +
                "\n" +
                "II. Welding Lab:\n" +
                "1. ARC Welding Lap & Butt Joint\n" +
                "2. Spot Welding\n" +
                "3. Gas Welding\n" +
                "\n" +
                "III. Mechanical Press Working:\n" +
                "1. Blanking & Piercing operation and study of simple, compound and progressivepress tool.\n" +
                "2. Bending and other operations\n" +
                "\n" +
                "IV. Machining Lab:\n" +
                "1. Cutting operation (Orthogonal & Oblique) on lathe machine\n" +
                "2. Bolt making on lathe machine\n" +
                "3. Facing, plain turning and step turning knurling\n" +
                "4. Boring and internal thread cutting.\n" +
                "5. Finishing of a surface on surface –grinding machine\n" +
                "6. Gear cutting on milling machine (Spur Gear).\n" +
                "7. Machining a block on shaper machine.\n" +
                "8. Drilling holes on drilling machine.");


        List<String> KinematicsMachine = Arrays.asList("Module-1\n" +
                "Introduction ( 5 Lectures )\n" +
                "Classification of mechanisms: -Basic kinematic concepts and Definitions-Degree of freedom, mobility-Grashof’s law, Kinematic inversions of four bar chain and slider crank chains.\n" +
                "\n" +
                "Module-2\n" +
                "Kinematic analysis of plane mechanism ( 6 Hrs )\n" +
                "Displacement, velocity and acceleration analysis of simple mechanisms, graphical velocity analysis using instantaneous centers, kinematic analysis of simple mechanisms- slider crank mechanism dynamics- Coriolis component of acceleration.\n" +
                "\n" +
                "Module-3\n" +
                "Friction devices ( 6 Lectures )\n" +
                "Belt drive, Clutch, Shoe brakes, Band and block brakes.                                                                           \n" +
                "\n" +
                "Module-4\n" +
                "Gear ( 10 Lectures )\n" +
                "Gear: gear terminology, Involute and Cycloidal gear profiles, gear parameters, fundamental law of gearing and conjugate action, spur gear contact ratio and interference/undercutting.\n" +
                "Gear Train: Analysis of simple, compound, reverted and epicyclic gear train with problems.\n" +
                "\n" +
                "Module-5\n" +
                "Balancing of rotating masses (8 lectures )\n" +
                "Balancing of rotating masses in the same plane by a single revolving mass. Balancing of several rotating masses in the same plane. Balancing of several rotating masses in different planes by two revolving masses in suitable planes.\n" +
                "\n" +
                "Module-6\n" +
                "Governor ( 6 Lectures )\n" +
                "Watt, Porter, Proel & Hartnell Governors, Effect of friction, controlling force, governor effort and power, sensitivity and isochronisms.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. Thomas Bevan, Theory of Machines, 3rd edition, CBS Publishers & Distributors, 2005.\n" +
                "2. CleghornW.L. , Mechanisms of Machines, Oxford University Press, 2005.\n" +
                "3. Robert L. Norton, Kinematics and Dynamics of Machinery, Tata McGrawHill, 2009.");


        List<String> ConstitutionIndia = Arrays.asList("Constitution of India/Essence of Indian Knowledge Tradition.");

        List<String> SummerEntrepreneurship = Arrays.asList("Summer Entrepreneurship-||.");

        List<String> MOOC = Arrays.asList("Open Elective-|(MOOC/SWAYAM/NPTEL Courses-2).");

        List<String> GraduateEmployabilitySkills = Arrays.asList("Graduate Employability Skills And Competitive Courses(GATE,IES,Etc.).");


        List<Semester> fifthSemesters = new ArrayList<>();
        fifthSemesters.add(new Semester("Heat Transfer", HeatTransfer));
        fifthSemesters.add(new Semester("Fluid Machinery", FluidMachinery));
        fifthSemesters.add(new Semester("Manufacturing Process", ManufacturingProcess));
        fifthSemesters.add(new Semester("Kinematics of Machine", KinematicsMachine));
        fifthSemesters.add(new Semester("Constitution of India/Essence of Indian Knowledge Tradition", ConstitutionIndia));
        fifthSemesters.add(new Semester("Summer Entrepreneurship-||", SummerEntrepreneurship));
        fifthSemesters.add(new Semester("Open Elective-|(MOOC/SWAYAM/NPTEL Courses-2)", MOOC));
        fifthSemesters.add(new Semester("Graduate Employability Skills And Competitive Courses(GATE,IES,Etc.)", GraduateEmployabilitySkills));

        branches.add(new Branch("Semester 5", fifthSemesters));
        //5th Semester complete......



        //6 Semester Start.....
        List<String> DynamicsOfMachinery = Arrays.asList("Objectives: \n" +
                "\n" +
                "1. To equip the student with fundamental knowledge of dynamics of machines so that student can appreciate problems of dynamic force balance, transmissibility of forces, isolation of systems, vibrations. \n" +
                "\n" +
                "2. Develop knowledge of analytical and graphical methods for calculating balancing of reciprocating masses. \n" +
                "\n" +
                "3. Develop understanding of vibrations and its significance on engineering design. \n" +
                "\n" +
                "4. Develop understanding of dynamic balancing, flywheel analysis, gyroscopic forces and moments. Contents: \n" +
                "\n" +
                "Module: 1 \n" +
                "\n" +
                "Force analysis of mechanism: Dynamics of plane motion of a rigid body, dynamically equivalent two mass system, correction torque, forced in mechanism and machines. (Lectures 3) \n" +
                "\n" +
                "Module: 2 \n" +
                "\n" +
                "Turning moment diagram: Fluctuations of crankshaft speed and energy in a direct acting engine mechanism, flywheels. (Lectures 5) \n" +
                "\n" +
                "Module: 3 \n" +
                "\n" +
                "Cams: Classification of cams and followers, types of follower and retardation, cam profile and generation of concentric and offset radial cam profiles by graphical method. Cams with specified contours tangent cam with roller follower, circular arc cam with flat follower. (Lectures 8) \n" +
                "\n" +
                "Module: 4 \n" +
                "\n" +
                "Analysis of gyroscopic motion : Principle of gyroscope, gyroscopic couple and gyroscopic reaction couple, Gyroscopic effects on the movement of ships, aeroplanes, two wheeled and four wheeled vehicles, gyrostabilizers. (Lectures 6) \n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                " Effects of inertia of reciprocating masses on engine frame: Unbalanced primary and secondary forces and couples, balancing of primary and secondary forces, partial balancing of locomotives, balancing of multicylinder in line and radial engines, direct and reverse cranks methods for balancing of radial engines. (Lecture 8) \n" +
                "\n" +
                "Module: 6\n" +
                "\n" +
                " Mechanical vibrations : Basic concepts degree of freedom, types of damping and viscous damping; natural free, damped free and damped forced vibrations of a single degree of freedom spring mass system, reciprocating and rotating unbalance, vibration isolation and transmissibility, whirling of shaft, elementary treatment of two degree of freedom systems torsional vibrations of single rotor and two rotor systems, transverse vibration of simply supported beam energy method, Rayleigh’s and Dankerley method. (Lecture 12) \n" +
                "\n" +
                "Course outcomes: \n" +
                "\n" +
                "Upon successful completion of this course the student should be able to: \n" +
                "\n" +
                "1. Analyze stabilization of sea vehicles, aircrafts and automobile vehicles.\n" +
                "\n" +
                " 2. Compute frictional losses, torque transmission of mechanical systems.\n" +
                "\n" +
                " 3. Analyze dynamic force analysis of slider crank mechanism and design of flywheel. \n" +
                "\n" +
                "4. Understand how to determine the natural frequencies of continuous systems starting from the general equation of displacement. \n" +
                "\n" +
                "5. Understand balancing of reciprocating and rotary masses. \n" +
                "\n" +
                "Text/References Books:\n" +
                "\n" +
                " 1. Theory of Machines / S.S Ratan/ Mc. Graw Hill Publ. \n" +
                "\n" +
                "2. Mechanism and machine theory by Ashok G. Ambedkar, PHI Publications. \n" +
                "\n" +
                "3. Mechanism and Machine Theory / JS Rao and RV Dukkipati / New Age.\n" +
                "\n" +
                " 4. Theory of Machines / Shiegly / MGH\n" +
                "\n" +
                " 5. Theory of Machines / Thomas Bevan / CBS Publishers\n" +
                "\n" +
                " 6. Theory of machines / Khurmi / S.Chand. \n" +
                "\n" +
                "Laboratory: Minimum of 10 Experiment need to be performed \n" +
                "\n" +
                "1. To study various types of Links, Pairs, Chain and Mechanism \n" +
                "\n" +
                "2. To study inversion of Four Bar Mechanism \n" +
                "\n" +
                "3. To study velocity diagram for Slider Crank Mechanism. \n" +
                "\n" +
                "4. To study various kinds of belts drives. \n" +
                "\n" +
                "5. To study and find coefficient of friction between belt and pulley.\n" +
                "\n" +
                " 6. To study various types of Cam and Follower arrangement. \n" +
                "\n" +
                "7. To plot follower displacement Vs cam rotation graph for various cam follower arrangement. \n" +
                "\n" +
                "8. To study Different types of Gears.\n" +
                "\n" +
                " 9. To study Different types of Gear Trains. \n" +
                "\n" +
                "10. To Perform Experiment on Watt, Porter, Proell and Hartnell Governors and prepare Performance Characteristic Curves also analyze Stability & Sensitivity \n" +
                "\n" +
                "11. To study gyroscopic effects through models. \n" +
                "\n" +
                "12. To determine gyroscopic couple on Motorized Gyroscope.\n" +
                "\n" +
                " 13. To perform the experiment of Balancing of rotating parts and find the unbalanced couple and forces. \n" +
                "\n" +
                "14. To study Dynamically Equivalent System. \n" +
                "\n" +
                "15. Determine the moment of inertial of connecting rod by compound pendulum method and trifler suspension pendulum. \n" +
                "\n" +
                "16. To study the various types of dynamometers. 18. To find out critical speed experimentally and to compare the Whirling Speed of a shaft with theoretical values .");


        List<String> ManufacturingTechnology = Arrays.asList("Objectives: \n" +
                "\n" +
                "(i) To provide knowledge on machines and related tools for manufacturing various components. \n" +
                "\n" +
                "(ii) To understand the relationship between process and system in manufacturing domain. \n" +
                "\n" +
                "(iii) To identify the techniques for the quality assurance of the products and the optimality of the process in terms of resources and time management. Course Contents: \n" +
                "\n" +
                "Module:1 Tooling for conventional and non-conventional machining processes: Mould and die design, Press tools, Cutting tools; Holding tools: Jigs and fixtures, principles, applications and design; press tools – configuration, design of die and punch; principles of forging die design. (Lectures 10) \n" +
                "\n" +
                "Module:2 Metrology: Dimensions, forms and surface measurements, Limits, fits and tolerances; linear and angular measurements; comparators; gauge design; interferometry; Metrology in tool wear and part quality including surface integrity, alignment and testing methods; tolerance analysis in manufacturing and assembly. Process metrology for emerging machining processes such as microscale machining, Inspection and workpiece quality. (Lectures 10) \n" +
                "\n" +
                "Module:3 Assembly practices: Manufacturing and assembly, process planning, selective assembly, Material handling and devices. (Lectures 6)\n" +
                "\n" +
                " Module:4 Unconventional Machining Processes: Abrasive Jet Machining, Water Jet Machining, Abrasive Water Jet Machining, Ultrasonic Machining, principles and process parameters. Electrical Discharge Machining, principle and processes parameters, MRR, surface finish, tool wear, Dielectric, power and control circuits, wire EDM; Electro-chemical machining (ECM), etchant & maskant, process parameters, MRR and surface finish. Laser Beam Machining (LBM), Plasma Arc Machining (PAM) and Electron Beam Machining (Lectures 14) Course Outcomes: Upon completion of this course, students will be able to the tooling needed for manufacturing, the dimensional accuracy and tolerances of products, assembly of different components and the application of optimization methods in manufacturing. \n" +
                "\n" +
                "Text Books: \n" +
                "\n" +
                "1. Kalpakjian and Schmid, Manufacturing processes for engineering materials (5th Edition)- PearsonIndia, 2014. \n" +
                "\n" +
                "2. Taha H. A., Operations Research, 6th Edition, Prentice Hall of India, 2003. \n" +
                "\n" +
                "3. Shenoy G.V. and Shrivastava U.K., Operations Research for Management, Wiley Eastern, 1994.\n" +
                "\n" +
                " Laboratory: \n" +
                "\n" +
                "1. Measurement of angle using Sine Center / Sine bar / bevel protractor \n" +
                "\n" +
                "2. Measurement of alignment using Autocollimator / Roller set \n" +
                "\n" +
                "3. Measurement of cutting tool forces using \n" +
                "\n" +
                "a. Lathe tool Dynamometer \n" +
                "\n" +
                "b. Drill tool Dynamometer. \n" +
                "\n" +
                "4. Measurement of Screw Threads Parameters using Two wire or Three-wire method. \n" +
                "\n" +
                "5. Measurements of Surface roughness, Using Tally Surf/Mechanical Comparator \n" +
                "\n" +
                "6. Measurement of gear tooth profile using gear tooth Vernier/Gear tooth micrometer \n" +
                "\n" +
                "7. Calibration of Micrometer using slip gauges 8. Measurement using Optical Flats .");


        List<String> DesignMachineElements = Arrays.asList("Objectives: \n" +
                "\n" +
                "This course seeks to provide an introduction to the design of machine elements commonly encountered in mechanical engineering practice, through \n" +
                "\n" +
                "1. A strong background in mechanics of materials based failure criteria underpinning the safety-critical design of machine components \n" +
                "\n" +
                "2. An understanding of the origins, nature and applicability of empirical design principles, based on safety considerations \n" +
                "\n" +
                "3. An overview of codes, standards and design guidelines for different elements \n" +
                "\n" +
                "4. An appreciation of parameter optimization and design iteration \n" +
                "\n" +
                "5. An appreciation of the relationships between component level design and overall machine system design and performance Course Contents: \n" +
                "\n" +
                "Module: 1 Introduction to design: Steps in design process, design factors, practical considerations in design, selection of materials, strength of mechanical elements, impact load, shock load, fatigue loading, effects of surface, size, temperature and stress concentration, consideration of creep and thermal stress in design. (Lectures8) \n" +
                "\n" +
                "Module: 2 Design of shafts: stresses in shafts, design of static loads, combined stresses, reversed bending and steady loads, design of shafts based on deflection and strength, critical speed of shafts. Analysis and design of sliding and rolling contact bearings, (Lectures10) \n" +
                "\n" +
                "Module: 3 Riveted joint: Stresses in riveted joint, design of riveted joints with central and eccentric loads, boiler and tank joints, structural joints. \n" +
                "\n" +
                "Bolt Joints: Stresses in bolt joint, design of bolt joints with central and eccentric loads. \n" +
                "\n" +
                "Welded joints: types of welded joints, stresses, design of welded joints subjected to axial, torsional and bending loads, welds subjected to fluctuating loads. (Lectures8) \n" +
                "\n" +
                "Module: 4 Design of Clutches: Friction clutches, uniform wear and uniform pressure assumptions, centrifugal clutches. \n" +
                "\n" +
                "Brakes: Design of internal expansion elements, assumptions, design of external contraction elements, band type brakes. (Lectures6) \n" +
                "\n" +
                "Module: 5 Design of transmission elements: spur, helical, bevel and worm gears; \n" +
                "\n" +
                "Springs: stresses in helical springs, deflection of helical compression and tension springs, springs subjected to fatigue loading, concentric and helical torsion spring, critical frequency of springs, leaf springs, and design of automotive leaf springs. (Lectures 8) \n" +
                "\n" +
                "Course Outcomes: \n" +
                "\n" +
                "Upon completion of this course, students will get an overview of the design methodologies employed for the design of various machine components. \n" +
                "\n" +
                "Data books allowed for Examination: \n" +
                "\n" +
                "1. Mahadevan & Balaveera Reddy : Design Data Hand Book\n" +
                "\n" +
                " 2. Dr. Linghaigh & Prof. Narayana Iyengar, Vol.1 & 2 : Design Data Hand Book \n" +
                "\n" +
                "3. P.S.G. Tech : Design Data Hand Book \n" +
                "\n" +
                "Text Books: \n" +
                "\n" +
                "1. Shigley, J.E. and Mischke, C.R., Mechanical Engineering Design, Fifth Edition, McGraw-Hill International; 1989.\n" +
                "\n" +
                " 2. Deutschman, D., Michels, W.J. and Wilson, C.E., Machine Design Theory and Practice, Macmillan, 1992. \n" +
                "\n" +
                "3. Juvinal, R.C., Fundamentals of Machine Component Design, John Wiley, 1994. \n" +
                "\n" +
                "4. Spottes, M.F., Design of Machine elements, Prentice-Hall India, 1994. \n" +
                "\n" +
                "5. R. L. Norton, Mechanical Design – An Integrated Approach, Prentice Hall, 1998 \n" +
                "\n" +
                "Laboratory: \n" +
                "\n" +
                "1. To study the design procedure of Knuckle & Cotter joint. 2. Design of shafts subjected to torsion, bending moment and combined bending and torsion. \n" +
                "\n" +
                "3. Design of flat and square key\n" +
                "\n" +
                " 4. Design and drawing of riveted joints \n" +
                "\n" +
                "5. Design and drawing of screw jack \n" +
                "\n" +
                "6. Journal Bearing Test Rig .");


        List<String> AutomationManufacturing = Arrays.asList("Objectives: \n" +
                "\n" +
                "1. To understand the importance of automation in the of field machine tool based manufacturing\n" +
                "\n" +
                " 2. To get the knowledge of various elements of manufacturing automation – CAD/CAM, sensors, pneumatics, hydraulics and CNC\n" +
                "\n" +
                " 3. To understand the basics of product design and the role of manufacturing automation \n" +
                "\n" +
                "Course Contents: \n" +
                "\n" +
                "Module: 1 Introduction: Why automation, Current trends, CAD, CAM, CIM; Rigid automation: Part handling, Machine tools. Flexible automation: Computer control of Machine Tools and Machining Centers, NC and NC part programming, CNC-Adaptive Control, Automated Material handling. Assembly, Flexible fixturing. (Lectures12) \n" +
                "\n" +
                "Module: 2 Computer Aided Design: Fundamentals of CAD - Hardware in CAD-Computer Graphics Software and Data Base, Geometric modeling for downstream applications and analysis methods; Computer Aided Manufacturing: CNC technology, PLC, Micro-controllers, CNC-Adaptive Control. (Lectures12) \n" +
                "\n" +
                "Module: 3 Low cost automation: Mechanical & Electro mechanical Systems, Pneumatics and Hydraulics, Illustrative Examples and case studies. (Lectures8) \n" +
                "\n" +
                "Module: 4 Introduction to Modeling and Simulation: Product design, process route modeling, Optimization techniques, Case studies & industrial applications. (Lectures8) \n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                " Upon completion of this course, the students will get a comprehensive picture of computer based automation of manufacturing operations \n" +
                "\n" +
                "Text Books: \n" +
                "\n" +
                "1. Mikell P. Groover, Automation, Production Systems, and Computer-integrated Manufacturing, prenticeHall \n" +
                "\n" +
                "2. Serope Kalpakjian and Steven R. Schmid, Manufacturing – Engineering and Technology,7th edition, Pearson\n" +
                "\n" +
                " 3. YoramKoren, Computer control of manufacturing system, 1stedition\n" +
                "\n" +
                " 4. Ibrahim Zeid , CAD/CAM : Theory & Practice, 2ndedition. \n" +
                "\n" +
                "Practical: At-least 10 experiment should be performed. \n" +
                "\n" +
                "1. Case study on automated system of any industry.\n" +
                "\n" +
                "2. Practice programming on manual part program. \n" +
                "\n" +
                "3. Practice programming on APT. \n" +
                "\n" +
                "4. Demonstration on robot. \n" +
                "\n" +
                "5. Performance on robot. \n" +
                "\n" +
                "6. Demonstration on CNC lathe. \n" +
                "\n" +
                "7. Performance on CNC lathe. \n" +
                "\n" +
                "8. Performance and simulation with CNC lathe software.\n" +
                "\n" +
                " 9. Demonstration on CNC milling. \n" +
                "\n" +
                "10. Performance on CNC milling. \n" +
                "\n" +
                "11. Performance and simulation with CNC milling software.\n" +
                "\n" +
                " 12. Case study on computer aided process planning \n" +
                "\n" +
                "13. Case study on part coding and group technology \n" +
                "\n" +
                "14. Case study on computer aided quality control \n" +
                "\n" +
                "15. Case study on flexible manufacturing system .");


        List<String> OpenElectiveFirst = Arrays.asList("Open Elective-|.");


        List<String> ProgramElectiveFirst = Arrays.asList("PROCESS PLANNING AND COST ESTIMATION",
                "MECHATRONIC SYSTEMS",
                "MICROPROCESSORS IN AUTOMATION",
                "COMPOSITE MATERIALS",
                "POWER PLANT ENGINEERING");


        List<String> ProgramElectiveSecond = Arrays.asList("PROCESS PLANNING AND COST ESTIMATION",
                "MECHATRONIC SYSTEMS",
                "MICROPROCESSORS IN AUTOMATION",
                "COMPOSITE MATERIALS",
                "POWER PLANT ENGINEERING");


        List<String> GraduateEmployability = Arrays.asList("Graduate Employability Skills And Competitive Courses(GATE,IES,Etc)..");


        List<Semester> sixthSemesters = new ArrayList<>();
        sixthSemesters.add(new Semester("Dynamics of Machinery", DynamicsOfMachinery));
        sixthSemesters.add(new Semester("Manufacturing Technology", ManufacturingTechnology));
        sixthSemesters.add(new Semester("Design of Machine Elements", DesignMachineElements));
        sixthSemesters.add(new Semester("Automation in Manufacturing", AutomationManufacturing));
        sixthSemesters.add(new Semester("Open Elective-|", OpenElectiveFirst));
        sixthSemesters.add(new Semester("Program Elective-|", ProgramElectiveFirst));
        sixthSemesters.add(new Semester("Program Elective-||", ProgramElectiveSecond));
        sixthSemesters.add(new Semester("Graduate Employability Skills And Competitive Courses(GATE,IES,Etc.)", GraduateEmployability));

        branches.add(new Branch("Semester 6", sixthSemesters));
        //6th Semester End.....



        //7 Semester Start......
        List<String> InductionProgram = Arrays.asList("Induction program (mandatory) \n" +
                "Induction program for students to be offered right at the start of the first year. \n" +
                "\n" +
                "3 weeks duration \n" +
                "~Physical activity \n" +
                "~Creative Arts \n" +
                "~Universal Human Values \n" +
                "~Literary Proficiency Modules \n" +
                "~Lectures by Eminent People \n" +
                "~Visits to local Areas \n" +
                "~Familiarization to Dept./Branch &Innovations.");


        List<String> InternalCombustionEngines = Arrays.asList("Objectives: \n" +
                "1. To familiarize with the terminology associated with IC engines. \n" +
                "2. To understand the basics of IC engines. \n" +
                "3. To understand combustion, and various parameters and variables affecting it in various types of IC engines. \n" +
                "4. To learn about various systems used in IC engines and the type of IC engine required for various applications \n" +
                "\n" +
                "Course Contents: \n" +
                "\n" +
                "Module:1 Basics of IC Engines, Engine components and classification: Two strokes, four stroke (SI and CI) engines, engines parts, engines working principle and valve timing diagram. Ideal cycles and Fuel-air cycles. (Lectures 6) \n" +
                "\n" +
                "Module: 2 Engine performance-test: purpose and types, measurement of power, Engine system & performance parameters evaluation. (Lectures 4)\n" +
                "\n" +
                "Module: 3 Combustion in SI and CI engines: Stages of combustion in SI engines, abnormal combustion and knocking in SI engines, factors affecting knocking, effects of knocking, control of knocking, combustion chambers for SI engines, Stages of combustion in CI engines, detonation in C.I. engines, factors affecting detonation, controlling detonation, combustion chamber for SI and CI engine. (Lectures 7)\n" +
                "\n" +
                "Module: 4 Fuel supply systems in SI and CI engines, carburetors, Port fuel injection, Direct injection and Common rail injection. (Lectures 6) \n" +
                "\n" +
                "Module: 5 Ignition system: Battery and magneto ignition system, spark plug, firing order, quality, quantity & hit and miss governing. Lubrication system and Cooling system: Lubrication of engine components, Lubrication system – wet sump and dry sump, crankcase ventilation, Types of cooling systems – liquid and air cooled, comparison of liquid and air cooled systems. (Lectures 7) \n" +
                "\n" +
                "Module: 6 Measurement and Testing of IC engines: Measurement of indicated power, brake power, fuel consumption and emission, Measurement of friction power by Willan’s Line Method and Morse Test, calculation of brake thermal efficiency, brake power and brake specific fuel consumption of IC Engines, variable compression ratio engines, heat balance sheet of IC Engines. Engine Emission and their control: Air pollution due to IC engines, constituent and types of emission HC, CO and NOx emission, catalytic convertor. Advanced IC Engine concepts. (Lectures 8) \n" +
                "\n" +
                "Module: 7 Super charging, engine lubrication and cooling. (Lectures 4) \n" +
                "\n" +
                "Text Books: \n" +
                "1. Obert E. F, “Internal Combustion Engines and Air Pollution”, Harper and Row Publication Inc. NY, 1973. \n" +
                "2. Heisler H, “Advanced Engine Technology”, Edward Arnold, 1995. \n" +
                "3. Heywood J. B, “Internal Combustion Engine Fundamentals”, McGraw Hill Book Co. NY, 1989 \n" +
                "4. Heldt P. M, “High Speed Combustion Engines”, Oxford & IBH publishing Co. India, 1985. \n" +
                "5. Stockel M W, Stockel T S and Johanson C, “Auto Fundamentals”, The Goodheart, Wilcox Co. \n" +
                "6. Inc., Illinois, 1996. Course Outcomes: Students who have done this course will have a good idea of the basics of IC engines and how different parameters influence the operational characteristics of IC Engines \n" +
                "\n" +
                "Laboratory: \n" +
                "1. To study the cross-sectional view of I.C. engine.\n" +
                "2. Determination of the calorific value of a given fuel and its flash & fire points. \n" +
                "3. To study the actual valve timing diagram of 4-stroke engine.\n" +
                "4. To prepare the heat balance sheet by conducting performance test on a single cylinder 4-stroke diesel engine. \n" +
                "5. To prepare the heat balance sheet by conducting performance test on a single cylinder 4-stroke petrol engine. \n" +
                "6. Performance evaluation of multi cylinder Diesel Engine. \n" +
                "7. Conduct the Morse test on a multi cylinder petrol engine and find out the friction power.");


        List<String> OpenElectiveTwo = Arrays.asList("REFRIGERATION AND AIR CONDITIONING",
                "COMPUTER AIDED DESIGN",
                "FINITE ELEMENT ANALYSIS",
                "AUTOMOBILE ENGINEERING",
                "OPERATIONS RESEARCH");


        List<String> ProgramElectiveThree = Arrays.asList("REFRIGERATION AND AIR CONDITIONING",
                "COMPUTER AIDED DESIGN",
                "FINITE ELEMENT ANALYSIS",
                "AUTOMOBILE ENGINEERING",
                "OPERATIONS RESEARCH");


        List<String> ProgramElectiveFour = Arrays.asList("REFRIGERATION AND AIR CONDITIONING",
                "COMPUTER AIDED DESIGN",
                "FINITE ELEMENT ANALYSIS",
                "AUTOMOBILE ENGINEERING",
                "OPERATIONS RESEARCH");


        List<String> ProjectFirst = Arrays.asList("Project-I.");


        List<String> EntrepreneurshipThree = Arrays.asList("Summer Entrepreneurship-III.");



        List<Semester> seventhSemesters = new ArrayList<>();
        seventhSemesters.add(new Semester("Induction Program", InductionProgram));
        seventhSemesters.add(new Semester("Internal Combustion Engines", InternalCombustionEngines));
        seventhSemesters.add(new Semester("Open Elective-II", OpenElectiveTwo));
        seventhSemesters.add(new Semester("Program Elective-III", ProgramElectiveThree));
        seventhSemesters.add(new Semester("Program Elective-IV", ProgramElectiveFour));
        seventhSemesters.add(new Semester("Project-I", ProjectFirst));
        seventhSemesters.add(new Semester("Summer Entrepreneurship-III", EntrepreneurshipThree));

        branches.add(new Branch("Semester 7", seventhSemesters));
        //7th Semester End.....



        //8 Semester Start....
        List<String> OpenElectiveThree = Arrays.asList("CHOOSE ANY ONE SUBJECT :\n" +
                "\n" +
                "------------------------------------------------------------\n" +
                "\n" +
                "Computational Fluid Dynamics :\n" +
                "\n" +
                "Pre-requisite: Heat Transfer and Numerical Analysis Techniques.\n" +
                "\n" +
                "Objective: To introduce the CFD techniques and tools for modelling, simulating and analysing practical engineering problems with hands on experience using commercial software packages used in industry.\n" +
                "\n" +
                "Outcome: Students are able to understand the use of different CFD techniques and tools for modelling, simulation and analysis of complex engineering problems.\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Introduction: Philosophy of Computational Fluid Dynamics, Computational Fluid Dynamics as a research tool, Computational Fluid Dynamics as a design tool, the impact of Computational Fluid Dynamics on automobile and engine applications, Industrial manufacturing applications, environmental engineering applications. (Lectures 9)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Governing equations of Computational Fluid Dynamics: Models of the flow, the substantial derivative, divergence of velocity, continuity equation, momentum equation, energy equation, Physical boundary conditions.(Lectures8)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Partial differential equations: General method of determining the classification of partial differential equations, The impact of different equation on Computational Fluid Dynamics: Hyperbolic equations, Parabolic equations and Elliptic equations. (Lectures 6)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Basic aspects of Discretization: Introduction to finite differences, Difference equations, Explicit and implicit approaches.(Lectures 6)\n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Grids with appropriate transformation: General transformation of the equations, Matrices and Jacobians, Stretched (compressed) grids.(Lectures 5)\n" +
                "\n" +
                "Module: 6\n" +
                "\n" +
                "Some Simple Computational Fluid Dynamics Techniques: Lax-Wendroff Technique, Mac Cormack’s Technique, Relaxation Technique, Pressure Correction Technique, etc.(Lectures 8)\n" +
                "\n" +
                "Text/Reference Books: \n" +
                "\n" +
                "John D. Anderson, Jr. “Computational Fluid Dynamics”, McGraw-Hill, Inc.\n" +
                "\n" +
                "Date, A. W., “Introduction to Computational Fluid Dynamics”, Cambridge University Press, 2005.\n" +
                "\n" +
                "Sengupta, T. P. “Fundamental of Computational Fluid Dynamics”, Orient Longman, Hyderabad, India, 2004.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " ------------------------------------------------------------\n" +
                "\n" +
                " \n" +
                "\n" +
                "Safety Management :\n" +
                "\n" +
                " \n" +
                "\n" +
                "Objectives: This course is directed towards creating safety awareness, identifying hazards and mitigation of accidents along with introduction of legal requirements and following up action.\n" +
                "\n" +
                "Outcome: After reading the course an engineer may develop confidence of over safe operations.\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Need, Modern safety concepts, OSHA norms.(Lectures 3)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Safety Management function, Cost analysis of accidents, system safety analysis. (Lectures 6)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Hazards identification and control. Pressure hazard, fire hazard and Electrical hazard. (Lectures 12)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Hazard in construction industry, Hazard due to acceleration and fall, Mechanical hazard, Hazard due to heat and temperature. (Lectures 11)\n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Safe practices rules, Personal protective equipment.(Lectures 4)\n" +
                "\n" +
                "Module: 6 Ergonomics. (Lectures 6)\n" +
                "\n" +
                "Text/Reference Books: \n" +
                "\n" +
                "Safety Management - John V. Grimaldi & Rollin H Simmands.\n" +
                "\n" +
                "Ergonomics at work - Osborne, D. J, John wiley & Sons.s\n" +
                "\n" +
                "Industrial safety Handbook - Handey, W, Mcgraw Hill.\n" +
                "\n" +
                "Designer’s Guide to OSHA - Mcgraw Hill.\n" +
                "\n" +
                "Handbook of occupational safety and Health – Johnwiley & Sons.\n" +
                "\n" +
                "Industrial Accident Prevention – Heinrich, Hetal, Mcgraw Hill.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " ------------------------------------------------------------\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Non-Conventional Manufacturing :\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Objective: To understand how the material removal by using various energy and to know how the new materials and complex parts are produced with high accuracy by using new technology.\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Introduction: Historical background of non-conventional machining processes, Classification, Basic fundamentals of various process and related comparison.(Lectures 4)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Mechanical Machining Process: Principle and working and applications of mechanical machining processes such as ultrasonic machining, water jet cutting(Lectures 7)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Thermal and Chemical Machining Process: Principle and working and applications of thermal and chemical machining processes such as electro-discharge machining, electro-chemical machining. (Lectures 7)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Non-conventional welding process: Principle and working and application of non-conventional welding processes such as laser beam welding, electron beam welding, ultrasonic welding, plasma arc welding. explosive welding, cladding under water welding, metallising.(Lectures 10)\n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Non-conventional forming process: Principle, working and applications of high energy forming processes such as explosive forming, electro-magnetic forming, electro-discharge forming, water hammer forming, explosive compaction.(Lectures 10)\n" +
                "\n" +
                "Module: 6\n" +
                "\n" +
                "Introduction to Micro Manufacturing: Micro manufacturing fundamentals, significance, application of NCMPs for micro manufacturing, Micro to Nano finishing processing information. (Lectures 4)\n" +
                "\n" +
                "Text Books/ References Books: \n" +
                "\n" +
                "C. Pandey and H.S. Shah, Modern Machining Processes, Tata Mcgraw-Hill Publishing Co. Ltd, New Delhi, 1980.\n" +
                "\n" +
                "Ghosh and A.K. Mallik, Manufacturing Science, 2nd edition, Affiliated East West Press, New Delhi.\n" +
                "\n" +
                "F. Benedict, Nontraditional Manufacturing Processes, Marcel Dekker Inc., New York (ISBN 0-8247-7352-7), 1987.\n" +
                "\n" +
                "K. Jain, Advanced Machining Processes, Allied Publishers, 2009.\n" +
                "\n" +
                "A. Mc Geough, Micromachining of Engineering Materials, Taylor & Francis, 2001.\n" +
                "\n" +
                "Outcome: Students will be able to understand the fundamentals of various non-conventional machining processes and their influence on performance and their applications.");


        List<String> OpenElectiveFour = Arrays.asList("CHOOSE ANY ONE SUBJECT :\n" +
                "\n" +
                "------------------------------------------------------------\n" +
                "\n" +
                "Computational Fluid Dynamics :\n" +
                "\n" +
                "Pre-requisite: Heat Transfer and Numerical Analysis Techniques.\n" +
                "\n" +
                "Objective: To introduce the CFD techniques and tools for modelling, simulating and analysing practical engineering problems with hands on experience using commercial software packages used in industry.\n" +
                "\n" +
                "Outcome: Students are able to understand the use of different CFD techniques and tools for modelling, simulation and analysis of complex engineering problems.\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Introduction: Philosophy of Computational Fluid Dynamics, Computational Fluid Dynamics as a research tool, Computational Fluid Dynamics as a design tool, the impact of Computational Fluid Dynamics on automobile and engine applications, Industrial manufacturing applications, environmental engineering applications. (Lectures 9)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Governing equations of Computational Fluid Dynamics: Models of the flow, the substantial derivative, divergence of velocity, continuity equation, momentum equation, energy equation, Physical boundary conditions.(Lectures8)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Partial differential equations: General method of determining the classification of partial differential equations, The impact of different equation on Computational Fluid Dynamics: Hyperbolic equations, Parabolic equations and Elliptic equations. (Lectures 6)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Basic aspects of Discretization: Introduction to finite differences, Difference equations, Explicit and implicit approaches.(Lectures 6)\n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Grids with appropriate transformation: General transformation of the equations, Matrices and Jacobians, Stretched (compressed) grids.(Lectures 5)\n" +
                "\n" +
                "Module: 6\n" +
                "\n" +
                "Some Simple Computational Fluid Dynamics Techniques: Lax-Wendroff Technique, Mac Cormack’s Technique, Relaxation Technique, Pressure Correction Technique, etc.(Lectures 8)\n" +
                "\n" +
                "Text/Reference Books: \n" +
                "\n" +
                "John D. Anderson, Jr. “Computational Fluid Dynamics”, McGraw-Hill, Inc.\n" +
                "\n" +
                "Date, A. W., “Introduction to Computational Fluid Dynamics”, Cambridge University Press, 2005.\n" +
                "\n" +
                "Sengupta, T. P. “Fundamental of Computational Fluid Dynamics”, Orient Longman, Hyderabad, India, 2004.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " ------------------------------------------------------------\n" +
                "\n" +
                " \n" +
                "\n" +
                "Safety Management :\n" +
                "\n" +
                " \n" +
                "\n" +
                "Objectives: This course is directed towards creating safety awareness, identifying hazards and mitigation of accidents along with introduction of legal requirements and following up action.\n" +
                "\n" +
                "Outcome: After reading the course an engineer may develop confidence of over safe operations.\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Need, Modern safety concepts, OSHA norms.(Lectures 3)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Safety Management function, Cost analysis of accidents, system safety analysis. (Lectures 6)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Hazards identification and control. Pressure hazard, fire hazard and Electrical hazard. (Lectures 12)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Hazard in construction industry, Hazard due to acceleration and fall, Mechanical hazard, Hazard due to heat and temperature. (Lectures 11)\n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Safe practices rules, Personal protective equipment.(Lectures 4)\n" +
                "\n" +
                "Module: 6 Ergonomics. (Lectures 6)\n" +
                "\n" +
                "Text/Reference Books: \n" +
                "\n" +
                "Safety Management - John V. Grimaldi & Rollin H Simmands.\n" +
                "\n" +
                "Ergonomics at work - Osborne, D. J, John wiley & Sons.s\n" +
                "\n" +
                "Industrial safety Handbook - Handey, W, Mcgraw Hill.\n" +
                "\n" +
                "Designer’s Guide to OSHA - Mcgraw Hill.\n" +
                "\n" +
                "Handbook of occupational safety and Health – Johnwiley & Sons.\n" +
                "\n" +
                "Industrial Accident Prevention – Heinrich, Hetal, Mcgraw Hill.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " ------------------------------------------------------------\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Non-Conventional Manufacturing :\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Objective: To understand how the material removal by using various energy and to know how the new materials and complex parts are produced with high accuracy by using new technology.\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Introduction: Historical background of non-conventional machining processes, Classification, Basic fundamentals of various process and related comparison.(Lectures 4)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Mechanical Machining Process: Principle and working and applications of mechanical machining processes such as ultrasonic machining, water jet cutting(Lectures 7)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Thermal and Chemical Machining Process: Principle and working and applications of thermal and chemical machining processes such as electro-discharge machining, electro-chemical machining. (Lectures 7)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Non-conventional welding process: Principle and working and application of non-conventional welding processes such as laser beam welding, electron beam welding, ultrasonic welding, plasma arc welding. explosive welding, cladding under water welding, metallising.(Lectures 10)\n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Non-conventional forming process: Principle, working and applications of high energy forming processes such as explosive forming, electro-magnetic forming, electro-discharge forming, water hammer forming, explosive compaction.(Lectures 10)\n" +
                "\n" +
                "Module: 6\n" +
                "\n" +
                "Introduction to Micro Manufacturing: Micro manufacturing fundamentals, significance, application of NCMPs for micro manufacturing, Micro to Nano finishing processing information. (Lectures 4)\n" +
                "\n" +
                "Text Books/ References Books: \n" +
                "\n" +
                "C. Pandey and H.S. Shah, Modern Machining Processes, Tata Mcgraw-Hill Publishing Co. Ltd, New Delhi, 1980.\n" +
                "\n" +
                "Ghosh and A.K. Mallik, Manufacturing Science, 2nd edition, Affiliated East West Press, New Delhi.\n" +
                "\n" +
                "F. Benedict, Nontraditional Manufacturing Processes, Marcel Dekker Inc., New York (ISBN 0-8247-7352-7), 1987.\n" +
                "\n" +
                "K. Jain, Advanced Machining Processes, Allied Publishers, 2009.\n" +
                "\n" +
                "A. Mc Geough, Micromachining of Engineering Materials, Taylor & Francis, 2001.\n" +
                "\n" +
                "Outcome: Students will be able to understand the fundamentals of various non-conventional machining processes and their influence on performance and their applications.");


        List<String> ProgramElectiveFive = Arrays.asList("CHOOSE ANY ONE SUBJECT :\n" +
                "\n" +
                " \n" +
                "\n" +
                "Principles of Management\n" +
                "\n" +
                " \n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "To understand the principles of management and their application to the functioning of an organization\n" +
                "\n" +
                "Contents:\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Definition of management, science or art, manager vs entrepreneur; Types of managers- managerial roles and skills; Evolution of management- scientific, human relations, system and contingency approaches; Types of Business Organizations, sole proprietorship, partnership, company, public and private enterprises; Organization culture and environment; Current trends and issues in management. (Lectures 8)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Nature and purpose of Planning, types of Planning, objectives, setting objectives, policies, Strategic Management, Planning Tools and Techniques, Decision making steps & processes. (Lectures 6)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Nature and purpose of Organizing, formal and informal organization, organization structure, types, line and staff authority, departmentalization, delegation of authority, centralization and decentralization, job design, human resource management, HR planning, Recruitment selection, Training & Development, Performance Management, Career planning and Management.(Lectures 10)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Directing, individual and group behavior, motivation, motivation theories, motivational techniques, job satisfaction, job enrichment, leadership, types & theories of leadership, effective communication. (Lectures 8)\n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Controlling, system and process of controlling, budgetary and non-budgetary control techniques, use of computers and IT in management control, productivity problems and management, control and performance, direct and preventive control, reporting.(Lectures 8)\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "Upon completion of this course, the students will get a clear understanding of management functions in an organization\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "Robins S.P. and Couiter M., Management, Prentice Hall India, 10th,2009.\n" +
                "\n" +
                "Stoner JAF, Freeman RE and Gilbert DR, Management, 6th, Pearson Education,2004.\n" +
                "\n" +
                "Tripathy PC & Reddy PN, Principles of Management, Tata McGraw Hill,1999.\n" +
                "\n" +
                " ------------------------------------------------------------------------------------------\n" +
                "\n" +
                "Design of Transmission Systems\n" +
                "\n" +
                " \n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "To learn about the design procedures for mechanical power transmission components\n" +
                "\n" +
                "Contents:\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Flexible transmission elements- design of flat belts & pulleys, selection of V-belts and pulleys, selection of hoisting wire ropes and pulleys, design of chains and sprockets. (Lectures 4)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Gear transmission- speed ratios and number of teeth, force analysis, tooth stresses, dynamic effects, fatigue strength, factor safety, gear materials; Design of straight tooth spur gear and parallel axis helical gears based on strength and wear considerations, pressure angle in the normal and transverse plane; equivalent number of teeth and forces for helical gears.(Lectures 10)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Straight bevel gear- tooth terminology, tooth forces and stresses, equivalent number of teeth. Estimating the dimensions of a pair of straight bevel gears; Worm gear, merits & demerits, terminology, thermal capacity, materials, forces & stresses, efficiency, estimating the size of worm gear pair. Cross helical gears, terminology, helix angles, sizing of a pair of helical gears.  (Lectures 10)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Gear box- geometric progression, standard step ratio; Ray diagram, kinematics layout; Design of sliding mesh gear box- Design of multi-seed gear box for machine tool applications; constant mesh gear box, speed reducer unit; Variable speed gear box; Fluid couplings, Torque converters for automotive applications. (Lectures 10)\n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Cam design, types: pressure angle and undercutting base circle determination, forces and surface stresses; Design of plate clutches, axial clutches, cone clutches, internal expanding rim clutches; Electromagnetic clutches; Band and Block brakes, external shoe brakes, internal expanding shoe brake.(Lectures 8)\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "Upon completing this course the students will be able to design transmission systems for engines and machines.\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "Shigley J., Mischke C., Budynas R. and Nisbett K., Mechanical Engineering Design, 8th, Tata McGraw Hill,2010.\n" +
                "\n" +
                "Jindal U.C., Machine Design: Design of Transmission System, Dorling Kindersley,2010.\n" +
                "\n" +
                "Maitra and Prasad L., Handbook of Mechanical Design, 2nd ed., Tata McGraw Hill,2001.\n" +
                "\n" +
                " \n" +
                "\n" +
                " ------------------------------------------------------------------------------------\n" +
                "\n" +
                "Total Quality Management\n" +
                "\n" +
                " \n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "To facilitate the understanding of total quality management principles and processes\n" +
                "\n" +
                "Contents:\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Introduction, need for quality, evolution of quality; Definitions of quality, product quality and service quality; Basic concepts of TQM, TQM framework, contributions of Deming, Juran and Crosby. Barriers to TQM; Quality statements, customer focus, customer orientation & satisfaction, customer complaints, customer retention; costs toquality (Lectures 8)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "TQM principles; leadership, strategic quality planning; Quality councils- employee involvement, motivation; Empowerment; Team and Teamwork; Quality circles, recognition and reward, performance appraisal; Continuous process improvement; PDCE cycle, 5S, Kaizen; Supplier partnership, Partnering, Supplier rating & selection.      (Lectures 8)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "The seven traditional tools of quality; New management tools; Six sigma- concepts, methodology, applications to manufacturing, service sector including IT, Bench marking process; FMEA- stages, types.  (Lectures 8)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "TQM tools and techniques, control charts, process capability, concepts of six sigma, Quality Function Development (QFD), Taguchi quality loss function; TPM- concepts, improvement needs, performance measures.(Lectures 8)\n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Quality systems, need for ISO 9000, ISO 9001-9008; Quality system- elements, documentation; Quality auditing, QS 9000, ISO 14000- concepts, requirements and benefits; TQM implementation in manufacturing and service sectors.(Lectures 8)\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "Upon completion of this course, the students will be able to use the tools and techniques of TQM in manufacturing and service sectors.\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "Bester field D.H. et al., Total quality Management, 3rd, Pearson Education Asia, 2006.\n" +
                "\n" +
                "Evans J.R. and Lindsay W.M., The management and Control of Quality, 8th, first Indian edition, Cengage Learning, 2012.\n" +
                "\n" +
                "Janakiraman B. and Gopal R.K., Total Quality Management, Prentice Hall India, 2006.\n" +
                "\n" +
                "Suganthi L. and Samuel A., Total Quality Management, Prentice Hall India, 2006.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " ---------------------------------------------------------------------------------------------\n" +
                "\n" +
                " \n" +
                "\n" +
                "Energy Conservation and Management\n" +
                "\n" +
                " \n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "To understand the energy data from industries and carry out energy audit for energy savings\n" +
                "\n" +
                "Contents:\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Introduction to energy & power scenario of world, National Energy consumption data, environmental aspects associated with energy utilization; Energy Auditing- need, types, methodology and barriers, role of energy managers, instruments of energyauditing.(Lectures 8)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Components of EB billing, HT and LT supply, transformers, cable sizing; Concept of capacitors, power factor improvement, harmonics; Electric motors- motor efficiency computation, energy efficient motors; Illumination- Lux, Lumens, types of lighting, efficacy, LED lighting and scope of energy conservation in lighting.   (Lectures 10)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Thermal systems, Boilers, Furnaces and Thermic Fluid heaters- efficiency computation and energy conservation measures; Steam distribution and usage, steam traps, condensate recovery, flash steam utilization; Insulation & Refractories.  (Lectures 10)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Energy Conservation in major utilities, pumps, fans, blowers, compressed, air systems, Refrigeration & Air Conditioning system, Cooling Towers, DG sets.(Lectures 6)\n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Energy Economics- discount period, payback period, internal rate of return, net present value; Life Cycle costing- ESCO concept.(Lectures 6)\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "Upon completion of this course, the students will be able to perform of energy auditing for the energy consumption of industries.\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "Witte L.C., Schmidt P.S. and Brown D.R., Industrial Energy Management and Utilization, Hemisphere Publ., Washington, 1988.\n" +
                "\n" +
                "Callaghn P.W., Design and Management for Energy Conservation, Pergamon Press, Oxford,\n" +
                "\n" +
                "Murphy W.R. and McKay G., Energy Management, Butterworths, London, 1987.\n" +
                "\n" +
                "Energy Manager Training Manual, Bureau of Energy Efficiency (BEE) under Ministry of Power, GOI, 2004 (available at energymanagertraining.com).\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " --------------------------------------------------------------------------------------------\n" +
                "\n" +
                " \n" +
                "\n" +
                "Gas Dynamics and Jet Propulsion\n" +
                "\n" +
                " \n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "To understand the features of compressible isentropic flows and irreversibility like shocks.\n" +
                "\n" +
                "To provide a basic knowledge of jet and rocket propulsion technologies.\n" +
                "\n" +
                "Contents:\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Compressible flow, definition, Mach waves and Mach cone, stagnation states, Mass, momentum and energy equations of one-dimensional flow, Isentropic flow through variable area ducts, nozzle s and diffusers, subsonic and supersonic flow I variable area ducts, choked flow, Area-Mach number relations for isentropic flow.                              (Lectures 12)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Non-isentropic flow in constant area ducts, Rayleigh and Fanno flows, Normal shock relations, oblique shock relations, isentropic and shock tables. (Lectures 8)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Theory of jet propulsion, thrust equation, thrust power and propulsive efficiency, Operating principle and cycle analysis of ramjet, turbojet, turbofan and turboprop engines. (Lectures 10)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Types of rocket engines, propellants & feeding systems, ignition and combustion, theory of rocket propulsion, performance study, staging, terminal and characteristic velocity, space flights.(Lectures 10)\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "Upon completion of this course, the students will be able to apply gas dynamics principles to jet and space propulsion systems.\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "Ahmed El-Sayed, Aircraft Prpoulsion and Gas Turbine Engines, CRC Press, 2008.\n" +
                "\n" +
                "S. Mukunda, “Understanding Aerospace Chemical Propulsion”, Interline Publishing, 2004.\n" +
                "\n" +
                "Hill P. and Peterson C., Mechanics & Thermodynamics of Propulsion, Addison Wesley,\n" +
                "\n" +
                "Zucrow N. J., Aircraft and Missile Propulsion, Vol.I& II, John Wiley,\n" +
                "\n" +
                "Sutton G.P., Rocket Propulsion Elements, John Wiley, New York, 1986.");


        List<String> ProgramElectiveSix = Arrays.asList("CHOOSE ANY ONE SUBJECT :\n" +
                "\n" +
                " \n" +
                "\n" +
                "Principles of Management\n" +
                "\n" +
                " \n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "To understand the principles of management and their application to the functioning of an organization\n" +
                "\n" +
                "Contents:\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Definition of management, science or art, manager vs entrepreneur; Types of managers- managerial roles and skills; Evolution of management- scientific, human relations, system and contingency approaches; Types of Business Organizations, sole proprietorship, partnership, company, public and private enterprises; Organization culture and environment; Current trends and issues in management. (Lectures 8)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Nature and purpose of Planning, types of Planning, objectives, setting objectives, policies, Strategic Management, Planning Tools and Techniques, Decision making steps & processes. (Lectures 6)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Nature and purpose of Organizing, formal and informal organization, organization structure, types, line and staff authority, departmentalization, delegation of authority, centralization and decentralization, job design, human resource management, HR planning, Recruitment selection, Training & Development, Performance Management, Career planning and Management.(Lectures 10)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Directing, individual and group behavior, motivation, motivation theories, motivational techniques, job satisfaction, job enrichment, leadership, types & theories of leadership, effective communication. (Lectures 8)\n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Controlling, system and process of controlling, budgetary and non-budgetary control techniques, use of computers and IT in management control, productivity problems and management, control and performance, direct and preventive control, reporting.(Lectures 8)\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "Upon completion of this course, the students will get a clear understanding of management functions in an organization\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "Robins S.P. and Couiter M., Management, Prentice Hall India, 10th,2009.\n" +
                "\n" +
                "Stoner JAF, Freeman RE and Gilbert DR, Management, 6th, Pearson Education,2004.\n" +
                "\n" +
                "Tripathy PC & Reddy PN, Principles of Management, Tata McGraw Hill,1999.\n" +
                "\n" +
                " ------------------------------------------------------------------------------------------\n" +
                "\n" +
                "Design of Transmission Systems\n" +
                "\n" +
                " \n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "To learn about the design procedures for mechanical power transmission components\n" +
                "\n" +
                "Contents:\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Flexible transmission elements- design of flat belts & pulleys, selection of V-belts and pulleys, selection of hoisting wire ropes and pulleys, design of chains and sprockets. (Lectures 4)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Gear transmission- speed ratios and number of teeth, force analysis, tooth stresses, dynamic effects, fatigue strength, factor safety, gear materials; Design of straight tooth spur gear and parallel axis helical gears based on strength and wear considerations, pressure angle in the normal and transverse plane; equivalent number of teeth and forces for helical gears.(Lectures 10)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Straight bevel gear- tooth terminology, tooth forces and stresses, equivalent number of teeth. Estimating the dimensions of a pair of straight bevel gears; Worm gear, merits & demerits, terminology, thermal capacity, materials, forces & stresses, efficiency, estimating the size of worm gear pair. Cross helical gears, terminology, helix angles, sizing of a pair of helical gears.  (Lectures 10)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Gear box- geometric progression, standard step ratio; Ray diagram, kinematics layout; Design of sliding mesh gear box- Design of multi-seed gear box for machine tool applications; constant mesh gear box, speed reducer unit; Variable speed gear box; Fluid couplings, Torque converters for automotive applications. (Lectures 10)\n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Cam design, types: pressure angle and undercutting base circle determination, forces and surface stresses; Design of plate clutches, axial clutches, cone clutches, internal expanding rim clutches; Electromagnetic clutches; Band and Block brakes, external shoe brakes, internal expanding shoe brake.(Lectures 8)\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "Upon completing this course the students will be able to design transmission systems for engines and machines.\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "Shigley J., Mischke C., Budynas R. and Nisbett K., Mechanical Engineering Design, 8th, Tata McGraw Hill,2010.\n" +
                "\n" +
                "Jindal U.C., Machine Design: Design of Transmission System, Dorling Kindersley,2010.\n" +
                "\n" +
                "Maitra and Prasad L., Handbook of Mechanical Design, 2nd ed., Tata McGraw Hill,2001.\n" +
                "\n" +
                " \n" +
                "\n" +
                " ------------------------------------------------------------------------------------\n" +
                "\n" +
                "Total Quality Management\n" +
                "\n" +
                " \n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "To facilitate the understanding of total quality management principles and processes\n" +
                "\n" +
                "Contents:\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Introduction, need for quality, evolution of quality; Definitions of quality, product quality and service quality; Basic concepts of TQM, TQM framework, contributions of Deming, Juran and Crosby. Barriers to TQM; Quality statements, customer focus, customer orientation & satisfaction, customer complaints, customer retention; costs toquality (Lectures 8)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "TQM principles; leadership, strategic quality planning; Quality councils- employee involvement, motivation; Empowerment; Team and Teamwork; Quality circles, recognition and reward, performance appraisal; Continuous process improvement; PDCE cycle, 5S, Kaizen; Supplier partnership, Partnering, Supplier rating & selection.      (Lectures 8)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "The seven traditional tools of quality; New management tools; Six sigma- concepts, methodology, applications to manufacturing, service sector including IT, Bench marking process; FMEA- stages, types.  (Lectures 8)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "TQM tools and techniques, control charts, process capability, concepts of six sigma, Quality Function Development (QFD), Taguchi quality loss function; TPM- concepts, improvement needs, performance measures.(Lectures 8)\n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Quality systems, need for ISO 9000, ISO 9001-9008; Quality system- elements, documentation; Quality auditing, QS 9000, ISO 14000- concepts, requirements and benefits; TQM implementation in manufacturing and service sectors.(Lectures 8)\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "Upon completion of this course, the students will be able to use the tools and techniques of TQM in manufacturing and service sectors.\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "Bester field D.H. et al., Total quality Management, 3rd, Pearson Education Asia, 2006.\n" +
                "\n" +
                "Evans J.R. and Lindsay W.M., The management and Control of Quality, 8th, first Indian edition, Cengage Learning, 2012.\n" +
                "\n" +
                "Janakiraman B. and Gopal R.K., Total Quality Management, Prentice Hall India, 2006.\n" +
                "\n" +
                "Suganthi L. and Samuel A., Total Quality Management, Prentice Hall India, 2006.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " ---------------------------------------------------------------------------------------------\n" +
                "\n" +
                " \n" +
                "\n" +
                "Energy Conservation and Management\n" +
                "\n" +
                " \n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "To understand the energy data from industries and carry out energy audit for energy savings\n" +
                "\n" +
                "Contents:\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Introduction to energy & power scenario of world, National Energy consumption data, environmental aspects associated with energy utilization; Energy Auditing- need, types, methodology and barriers, role of energy managers, instruments of energyauditing.(Lectures 8)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Components of EB billing, HT and LT supply, transformers, cable sizing; Concept of capacitors, power factor improvement, harmonics; Electric motors- motor efficiency computation, energy efficient motors; Illumination- Lux, Lumens, types of lighting, efficacy, LED lighting and scope of energy conservation in lighting.   (Lectures 10)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Thermal systems, Boilers, Furnaces and Thermic Fluid heaters- efficiency computation and energy conservation measures; Steam distribution and usage, steam traps, condensate recovery, flash steam utilization; Insulation & Refractories.  (Lectures 10)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Energy Conservation in major utilities, pumps, fans, blowers, compressed, air systems, Refrigeration & Air Conditioning system, Cooling Towers, DG sets.(Lectures 6)\n" +
                "\n" +
                "Module: 5\n" +
                "\n" +
                "Energy Economics- discount period, payback period, internal rate of return, net present value; Life Cycle costing- ESCO concept.(Lectures 6)\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "Upon completion of this course, the students will be able to perform of energy auditing for the energy consumption of industries.\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "Witte L.C., Schmidt P.S. and Brown D.R., Industrial Energy Management and Utilization, Hemisphere Publ., Washington, 1988.\n" +
                "\n" +
                "Callaghn P.W., Design and Management for Energy Conservation, Pergamon Press, Oxford,\n" +
                "\n" +
                "Murphy W.R. and McKay G., Energy Management, Butterworths, London, 1987.\n" +
                "\n" +
                "Energy Manager Training Manual, Bureau of Energy Efficiency (BEE) under Ministry of Power, GOI, 2004 (available at energymanagertraining.com).\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " --------------------------------------------------------------------------------------------\n" +
                "\n" +
                " \n" +
                "\n" +
                "Gas Dynamics and Jet Propulsion\n" +
                "\n" +
                " \n" +
                "\n" +
                "Objectives:\n" +
                "\n" +
                "To understand the features of compressible isentropic flows and irreversibility like shocks.\n" +
                "\n" +
                "To provide a basic knowledge of jet and rocket propulsion technologies.\n" +
                "\n" +
                "Contents:\n" +
                "\n" +
                "Module: 1\n" +
                "\n" +
                "Compressible flow, definition, Mach waves and Mach cone, stagnation states, Mass, momentum and energy equations of one-dimensional flow, Isentropic flow through variable area ducts, nozzle s and diffusers, subsonic and supersonic flow I variable area ducts, choked flow, Area-Mach number relations for isentropic flow.                              (Lectures 12)\n" +
                "\n" +
                "Module: 2\n" +
                "\n" +
                "Non-isentropic flow in constant area ducts, Rayleigh and Fanno flows, Normal shock relations, oblique shock relations, isentropic and shock tables. (Lectures 8)\n" +
                "\n" +
                "Module: 3\n" +
                "\n" +
                "Theory of jet propulsion, thrust equation, thrust power and propulsive efficiency, Operating principle and cycle analysis of ramjet, turbojet, turbofan and turboprop engines. (Lectures 10)\n" +
                "\n" +
                "Module: 4\n" +
                "\n" +
                "Types of rocket engines, propellants & feeding systems, ignition and combustion, theory of rocket propulsion, performance study, staging, terminal and characteristic velocity, space flights.(Lectures 10)\n" +
                "\n" +
                "Course Outcomes:\n" +
                "\n" +
                "Upon completion of this course, the students will be able to apply gas dynamics principles to jet and space propulsion systems.\n" +
                "\n" +
                "Text Books:\n" +
                "\n" +
                "Ahmed El-Sayed, Aircraft Prpoulsion and Gas Turbine Engines, CRC Press, 2008.\n" +
                "\n" +
                "S. Mukunda, “Understanding Aerospace Chemical Propulsion”, Interline Publishing, 2004.\n" +
                "\n" +
                "Hill P. and Peterson C., Mechanics & Thermodynamics of Propulsion, Addison Wesley,\n" +
                "\n" +
                "Zucrow N. J., Aircraft and Missile Propulsion, Vol.I& II, John Wiley,\n" +
                "\n" +
                "Sutton G.P., Rocket Propulsion Elements, John Wiley, New York, 1986.");


        List<String> ProjectTwo = Arrays.asList("Project-II.");



        List<Semester> eightSemesters = new ArrayList<>();
        eightSemesters.add(new Semester("Open Elective-III", OpenElectiveThree));
        eightSemesters.add(new Semester("Open Elective-IV", OpenElectiveFour));
        eightSemesters.add(new Semester("Program Elective-V", ProgramElectiveFive));
        eightSemesters.add(new Semester("Program Elective-VI", ProgramElectiveSix));
        eightSemesters.add(new Semester("Project-II", ProjectTwo));

        branches.add(new Branch("Semester 8", eightSemesters));






        return branches;
    }
}


