package com.example.beuengineers.Syllabus;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beuengineers.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LtActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BranchAdapter branchAdapter;
    List<Branch> branchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lt);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        branchList = getBranches();
        branchAdapter = new BranchAdapter(branchList, this);
        recyclerView.setAdapter(branchAdapter);
    }

    private List<Branch> getBranches() {
        List<Branch> branches = new ArrayList<>();

        //1 Semester
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
                "4. BASIC ELECTRICAL ENGINEERING BY FITZERALD...");

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
                "Inverse and rank of matrix, Rank-Nullity theorem, System of linear equations,Symmetric, Skew-symmertic and Orthogonal matrices. Determinants: Cayley Hamilton theorem and orthogonal transformation...");

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
                "4. NARAYANA, K.L. & P KANNAIAH (2008), TEXT BOOK ON ENGINEERING DRAWING, SCITECHPUBLISHERS...");

        List<String> ElectromagnetismPhy = Arrays.asList("Module-1\n" +
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
                "The wave equation; Plane Electromagnetic waves in vacuum, Their transverse nature and Polarization; Relation between electric and magnetic fields of an Electromagnetic wave; Energy carried by Electromagnetic waves and examples. Momentum carried by electromagnetic waves and resultant pressure. Reflection and transmission of electromagnetic waves from a Non-conducting medium-vacuum interface for normal incidence...");


        List<Semester> firstSemesters = new ArrayList<>();
        firstSemesters.add(new Semester("Basic Electrical Engineering", BEE));
        firstSemesters.add(new Semester("MATHEMATICS-1 (Calculus and Linear Algebra)", MathFirst));
        firstSemesters.add(new Semester("Engineering Graphics and Design", EGD));
        firstSemesters.add(new Semester("Physics ( Electromagnetism )", ElectromagnetismPhy));

        branches.add(new Branch("Semester 1", firstSemesters));
        //1st Semester End...



        //2 Semester Start....
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
                "15. Use of capillary viscisimeter to the demonstrate of the iso electric point as the PH of minimum viscosity...");

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
                "Contour Integrals, Cauchy-Goursat theorem (without proof), Cauchy integral formula (without proof), Liouville’s theorem and maximum-modulus theorem (without proof); Taylor’s series, Zeros of analytic functions, Singularities, Laurent’s series; Residues, Cauchy residue theorem (without proof), Evaluation of definite integral involving sine and cosine, Evaluation of certain improper integrals using the Bromwich Contour...");

        List<String> PPS = Arrays.asList("Module-1\n" +
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
                "11. File handling ( File Operations )...");

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
                "F. Debates...");

        List<Semester> secondSemesters = new ArrayList<>();
        secondSemesters.add(new Semester("Chemistry", Chemistry));
        secondSemesters.add(new Semester("MATHEMATICS-II ( PDE and Complex Variables )", MatheSecond));
        secondSemesters.add(new Semester("Programming for Problem Solving", PPS));
        secondSemesters.add(new Semester("Workshop Manufacturing Practice", Workshop));
        secondSemesters.add(new Semester("English", English));

        branches.add(new Branch("Semester 2", secondSemesters));
        //2nd Semester ENd....



        //3 Semester Start....
        List<String> BEEng = Arrays.asList("Module-1\n" +
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
                "Electronic Communication Systems: The elements of communication system, IEEE frequency spectrum, Transmission media: wired and wireless, need of modulation, AM and FM modulation schemes, Mobile communication systems: cellular concept and block diagram of GSM system...");

        List<String> EM = Arrays.asList("Module-1\n" +
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
                "Work & Energy and impulse and Momentum methods for particles and rigid bodies: Conservation of momentum, coefficient of restitution, moment of momentum equation.\n" +
                "\n" +
                "Practicals\n" +
                "1. Verification of triangle law & parallelogram law of forces.\n" +
                "2. Verification of polygon law of forces.\n" +
                "3. Crank Lever apparatus.\n" +
                "4. Verification of support reactions of a simply supportedbeam.\n" +
                "5. Verification of condition of equilibrium of a system offorces.\n" +
                "6. Verification of axial forces in the members of a truss.\n" +
                "7. Verification of equilibrium of three dimensional forces..\n" +
                "8. Determination of coefficient of friction between twosurfaces...");

        List<String> PHyWO = Arrays.asList("Module-1\n" +
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
                "SOLUTION OF WAVE EQUATION (6 LECTURES)\n" +
                "Solution of Stationary-State Schrodinger equation for One Dimensional problems–particle in a box, Particle in attractive Delta-function potential, Square-well potential, Linear Harmonic oscillator. scattering from a potential Barrier and Tunneling; Related examples like Alpha- decay, Field-ionization and scanning tunneling Microscope, Tunneling in semiconductor structures. Three Dimensional problems: Particle in three Dimensional box and related examples...");

        List<String> ILT = Arrays.asList("Module-1\n" +
                "( 5 Lectures )\n" +
                "Live stock population, animal mortality and availability of hides and skns in India.\n" +
                "\n" +
                "Module-2\n" +
                "( 12 Lectures )\n" +
                "Statistical analysis of leather Industries, Leather, Leather products ( National & International Scenario).\n" +
                "\n" +
                "Module-3\n" +
                "( 5 Lectures )\n" +
                "Chemical constituents of hides and skins.\n" +
                "\n" +
                "Module-4\n" +
                "( 15 Lectures )\n" +
                "General principles involved in raw hide and skin preservation,\n" +
                "assortment and their processing, pre tanning, tanning and post tanning operations.\n" +
                "\n" +
                "Module-5\n" +
                "( 5 Lectures )\n" +
                "Defects in leather, Microscopy & Bacteriology...");

        List<String> MathPDE = Arrays.asList("Module-1\n" +
                "PDE ( 14 Lectures )\n" +
                "Definition of Partial Differential Equations, First order partial differential equations, solutions of first order linear PDEs; Solution to homogenous and non-homogenous linear partial differential equations of second order by complimentary function and particular integral method. Second-order linear equations and their classification, Initial and boundary conditions, D'Alembert's solution of the wave equation; Duhamel's principle for one dimensional wave equation. Heat diffusion and vibration problems, Separation of variables method to simple problems in Cartesian coordinates. The Laplacian in plane, cylindrical and spherical polar coordinates, solutions with Bessel functions and Legendre functions. One dimensional diffusion equation and its solution by separation of variables.\n" +
                "\n" +
                "Module-2\n" +
                "Probability ( 12 Lectures )\n" +
                "Probability spaces, conditional probability, independence; Discrete random variables, Independent random variables, the multinomial distribution, Poisson approximation to the binomial distribution, infinite sequences of Bernoulli trials, sums of independent random variables; Expectation of Discrete Random Variables, Moments, Variance of a sum, Correlation coefficient, Chebyshev's Inequality. Continuous random variables and their properties, distribution functions and densities, normal, exponential and gamma densities. Bivariate distributions and their properties, distribution of sums and quotients, conditional densities, Bayes' rule.\n" +
                "\n" +
                "Module-3\n" +
                "Statics ( 12 Lectures )\n" +
                "Basic Statistics, Measures of Central tendency: Moments, skewness and Kurtosis - Probability distributions: Binomial, Poisson and Normal - evaluation of statistical parameters for these three distributions, Correlation and regression – Rank correlation. Curve fitting by the method of least squares- fitting of straight lines, second degree parabolas and more general curves. Test of significance: Large sample test for single proportion, difference of proportions, Tests for single mean, difference of means, and difference of standard deviations. Test for ratio of variances - Chi- square test for goodness of fit and independence of attributes...");

        List<String> Internship = Arrays.asList("Internship..");

        List<Semester> thirdSemesters = new ArrayList<>();
        thirdSemesters.add(new Semester("Basic Electronic Engineering", BEEng));
        thirdSemesters.add(new Semester("Engineering Mechanics", EM));
        thirdSemesters.add(new Semester("Physics ( Waves and Optics )", PHyWO));
        thirdSemesters.add(new Semester("Introduction to Leather Technology", ILT));
        thirdSemesters.add(new Semester("Mathematics-III ( PDE, Probability and Statics )", MathPDE));
        thirdSemesters.add(new Semester("Internship", Internship));

        branches.add(new Branch("Semester 3", thirdSemesters));
        //3rd Semester End...


        //4 Semester Start....
        List<String> ACL = Arrays.asList("Module 1. Analysis of Lime (03 hours)\n" +
                "Principles underlying determination of following in lime\n" +
                "(a) Available lime\n" +
                "(b) Total based by titration method\n" +
                "(c) Iron by colorimetric method\n" +
                "\n" +
                "Module 2. Analysis of Na2S (02 hours)\n" +
                "Principles underlying analysis of Na2S by official international method.\n" +
                "\n" +
                "Module 3. (03 hours)\n" +
                "Analysis of lime liquors (Fresh & used)\n" +
                "Principles underlying determination of following in line liquor :-\n" +
                "(a) Total Alkalinity (b) Total lime (c) Total nitrogen\n" +
                "(d) Hide substance (e) Amino acids\n" +
                "\n" +
                "Module 4. Analysis of limed pelt (03 hours)\n" +
                "Principles underlying determination of following in limed pelt\n" +
                "(a) Total Alkalinity (b) Total Ammonia (c) Hide Substance\n" +
                "\n" +
                "Module 5. (07 hour)\n" +
                "Analysis of Boric acid, Analysis of deliming agent (Ammonium chloride and Ammonium\n" +
                "sulfate), Analysis of enzyme bates, Analysis of used pickle liquors for following – (a)\n" +
                "Determination of acid, (b) Determination of salt, Analysis of Sodium formate\n" +
                "\n" +
                "Module 6. (06 hour)\n" +
                "Analysis of Chrome liquor to determine- (a) Basic chromium, (b)Basicity of chrome liquor\n" +
                "(c) Degree of Olation. Analysis of basic chromium sulfate for following :-\n" +
                "(Power of Crystal) (a) Moisture (b) Chromium\n" +
                "\n" +
                "Module 7. (06 hour)\n" +
                "Analysis of acids & salts in vegetable tannin extracts by different methods. Analysis of\n" +
                "Zirconium and Alum. Tanning agents. Analysis of Formaldehyde. Analysis of chrome tanned\n" +
                "leather for following :-Moisture, ash, Chromic oxide content, Solvent extractable substances,\n" +
                "Water soluble matter and difference figure.\n" +
                "\n" +
                "Module 08. (03 hour)\n" +
                "Analysis of followings of Veg. tanned leather :-Moisture, ash, Water soluble matter, Solvent\n" +
                "extractable substances and difference figure, Degree of tannage.\n" +
                "\n" +
                "Module 09. (04 hour)\n" +
                "Analysis of followings of Alum. Tanned leather moisture, total ash, Solvent extractable\n" +
                "substances, Aluminium as Alumina. Analysis of followings of Zirconium tanned leather:-\n" +
                "Moisture, Ash, Solvent extractable substances, Zirconium content.\n" +
                "\n" +
                "Module 10. (08 hour)\n" +
                "Analysis of followings of combined tanned leather :-Moisture, Ash, Solvent Extractable\n" +
                "substances, Water soluble matter and difference figure, Chromic oxide content, Degree of tannage.Analytical Chemistry of Post tanning and Finishing agent .Analysis of lipids for\n" +
                "following :\n" +
                "(a) Acid value\n" +
                "(b) Saponification value by reflux method.\n" +
                "(c) Iodine value by Hanus method.\n" +
                "(d) Unsaponifiables by extraction method.\n" +
                "(e) Analysis of sulfated oils and ready made fat liquors.\n" +
                "\n" +
                "Module 11. (04hour)\n" +
                "Principles underlying examination and analysis of dyes used in leather manufacture.\n" +
                "Principles underlying examination and analysis of readymade finishes and finishing materials\n" +
                "used in leather manufacture.\n" +
                "\n" +
                "Texts/References:\n" +
                "1. Analytical Chemistry of leather manufacture - P. K. Sarkar, ILTA, Kolkata.\n" +
                "2. The Chemistry and Technology of leather – F – O Flaharty, Roddy, Lollar. Krieger\n" +
                "Publishing Co. Florida USA.\n" +
                "3. Official methods of Analysis SLTC, U.K.\n" +
                "4. Different standards issued by BIS from time to time...");

        List<String> BP = Arrays.asList("Module 1:\n" +
                "Fundamentals of Biochemistry\n" +
                "(5Hours)\n" +
                "\n" +
                "The molecular logic of life, strong and weak interactions, introductory concept of cell, bio- molecules and water.\n" +
                "\n" +
                "Module 2: (3Hours)\n" +
                "Histology and fibre packing in commercially viable hides/skins.\n" +
                "\n" +
                "\n" +
                "Module 3:\n" +
                "Amino acids, peptides and proteins (8Hours)\n" +
                "Chemistry, Classification determination of amino acids, Qualitative and Quantitative determinations, Structure of Various amino acids, formation of peptides, polypeptides and separation of proteins, covalent structure of proteins, Reaction of Proteins with acid, bases and salts\n" +
                "\n" +
                "\n" +
                "Module 4: (12Hours)\n" +
                "Polarity of amino acids and ionization of proteins, electro-phoresis, hydration, solubility of proteins, dielectric properties, intermolecular forces of proteins cross linking in collagen, Iso- electric point of collagen and its manipulation in various stages of leather manufacture. Acid and base binding capacity of collagen, reversible and irreversible acid and base binding capacity of collagen, Effects of anions, swelling (osmotic and lyotropic) and phase transition in collagen, helix-coil transition, Denaturation and melting of collagen. Glass transition of collagen, Shrinkage denaturation and optical birefrigence of collagen.\n" +
                "\n" +
                "Module 5: (9Hours)\n" +
                "Structure, function and chemical features of collagen reactive groups and Cross linking,\n" +
                "Tropo collagen molecules, Sub-units of collagen, Types of collagen, Structure and function,\n" +
                "Fibril formation, Precipitated forms of collegen, Electron microscopy of the collagen fibre,\n" +
                "Bio-Synthesis.\n" +
                "\n" +
                "\n" +
                "Module 6: (6Hours)\n" +
                "Structure and functional role of other skin proteins like keratin, Reticelin and Elastic,\n" +
                "albumin, globulin and mucine etc.\n" +
                "\n" +
                "\n" +
                "Text Book/Reference\n" +
                "1. Nelson, D.L. and Cox, M.M. (2000), Lehninger principles of biochemistry, 3rd Edn.\n" +
                "WorthPublishers, N.Y.\n" +
                "2. Gilbert, F.G. (1997) Development Biology, 5th Edn. Sinauer Associates,\n" +
                "Massachusetts.\n" +
                "3. Kleinsmith, L.J. and Kish, V.M. (1998), Principles of cell biology, Harpar& Row\n" +
                "publishers,N.Y.\n" +
                "4. Gustavson, K.H. (1956), The chemistry and reactivity of collagen, Academic press,\n" +
                "N.Y.\n" +
                "5. Hames, B.D., Hooper, N.M. and Houghton, J.D. (1999), Instant notes on\n" +
                "Biochemistry,Viva Books Pvt. Ltd. N.D.\n" +
                "6. Turner, P.C., McLennan, A.G., Bates, A.D. and White, M.R.H. (1999), Instant notes\n" +
                "onMolecular Biology, Viva Books Pvt. Ltd. N.D.\n" +
                "7. Elden, H.R. Biophysical properties of skins, vol.1 of treatise of skin, Wiley\n" +
                "Interscienceadivn. of John Wiley & sons. N.Y.\n" +
                "8. Dutta, S.S. (2000), An introduction to the principles of leather manufacture, 4th Edn.\n" +
                "Indian Leather Technologists Association, Calcutta...");

        List<String> CE = Arrays.asList("Module 1: (8 hours)\n" +
                "Introduction to process fluid mechanics; Fundamental concepts: Definition of a fluid;\n" +
                "Continuum hypothesis; Velocity field; Stress field; Newtonian and non-Newtonian fluids,\n" +
                "Fluid statics:pressure variation in a static fluid, hydrostatic forces on submerged surfaces,\n" +
                "buoyancy,Manometers.\n" +
                "\n" +
                "\n" +
                "Module 2: (8 hours)\n" +
                "\n" +
                "Macroscopic Balances: derivation of integral balances for mass, energy and\n" +
                "momentum;Derivation of engineering Bernoulli equation with losses, Application of\n" +
                "macroscopic balances:Losses in expansion. Flow measurement: Orifice meter, venturi meter,\n" +
                "Pitot tube, and Rotameter.\n" +
                "\n" +
                "\n" +
                "Module 3: (10 hours)\n" +
                "Differential balances of fluid flow: derivation of continuity and momentum (Navier-Stokes)\n" +
                "equations for a Newtonian fluid, Boundary layer theory, Pipe flows and fittings: laminar and\n" +
                "turbulent flows; friction factor charts, losses in fittings, Fluid transportation: Valves and\n" +
                "Pumpsand Compressors.\n" +
                "\n" +
                "\n" +
                "Module 4: (8 hours)\n" +
                "Flow through packed and fluidized beds: Flow through beds of solids, motion of particles\n" +
                "through the fluid, Particle settling, Fluidization, minimum fluidization velocity, Mixing and\n" +
                "Agitation- power consumption, mixing times, scale up\n" +
                "\n" +
                "\n" +
                "Module 5: (10 hours)\n" +
                "Filtration: Governing equations, constant pressure operation, constant flow operation, cycle\n" +
                "time, types of filters. Centrifuges and Cyclones: Gravity settling, centrifugal separation,\n" +
                "cycloneseparations, separation efficiency, pressure loss,\n" +
                "\n" +
                "\n" +
                "Text/References:\n" +
                "\n" +
                "\n" +
                "1. Frank M. White, Fluid Mechanics (Sixth Edition), Tata McGraw-Hill, New Delhi\n" +
                "(2008).\n" +
                "2. J. O. Wilkes, Fluid Mechanics for Chemical Engineers, Prentice Hall (1999).\n" +
                "3. W. L. McCabe, W. L. Smith, and P. Harriot, Unit Operations of Chemical\n" +
                "Engineering, McGraw-Hill International Edition (Sixth edition) (2001).\n" +
                "4. R. B. Bird, W. L. Stewart and E. L. Lightfoot, Transport Phenomena (Second\n" +
                "edition),Wiley Singapore (2002).\n" +
                "5. M. M. Denn, Process Fluid Mechanics, Prentice Hall (1980)...");

        List<String> TheoryP = Arrays.asList("Module 1: Preservation of Hides and Skins (5 Hours)\n" +
                "\n" +
                "Principles and practice involved in long and short term preservation techniques for hides and skin, Preservation, defects.\n" +
                "\n" +
                "PRETANNING PROCESSES:\n" +
                "\n" +
                "Module 2. Soaking (4 Hours)\n" +
                "\n" +
                "Physico-chemical explanation of wetting, objectives materials, methods and different controls in soaking operation\n" +
                "\n" +
                "Module 3: Liming (6Hours)\n" +
                "\n" +
                "Chemistry of Unhairing, Unhairing by different methods, Objectives of liming, Effects of liming in collagen, controls in liming operation to achieve different physical properties of leather.\n" +
                "\n" +
                "Module 4:Deliming and Drenching (3 Hours)\n" +
                "\n" +
                "Objectives, Principles and controls of deliming and drenching.\n" +
                "\n" +
                "Module 5:Bating (5 Hours)\n" +
                "\n" +
                "Chemistry of proteolytic enzymes used for bating, Necessity of bating, its necessity and controls for desired properties of leather.\n" +
                "\n" +
                "Module 6 :Pickling (4 Hours) Acid binding capacity of collagen, use of organic acids or salts in pickling, its necessity and controls, concept of De-pickling.\n" +
                "\n" +
                "Module 7:Degreasing (3 Hours)\n" +
                "\n" +
                "Objectives and necessity of Degreasing, different degreasing systems and methods.\n" +
                "\n" +
                "Module 8:Cleaner processing practices in beam house (10 Hours)\n" +
                "\n" +
                "Salt free curing option, Sulfide free unhairing system, ammonia free deliming, salt free pickling system, eco friendly degreasing system, strategies to bring down BOD, COD and TDS of tannery effluents.\n" +
                "\n" +
                "Text Books :-\n" +
                "\n" +
                "1. Introduction to the Principles of Leather Manufacture. By – S. S. Dutta, 4th Edition, ILTA, Kolkata.\n" +
                "\n" +
                "2. Chemistry & Technology of Leather. By – Roddy, O’ Flahorty&Lollar, Vol – 2 &3, Robert E. Kreiger. Publishing Co., N.Y.\n" +
                "\n" +
                "3. Theory & Practice of Leather Manufacture. By – K. T. Sarkar, Macmillan India Press, Chennai.\n" +
                "\n" +
                "4. Fundamentals of Leather Manufacture. By- EckentHidem\n" +
                "\n" +
                "5. Chemistry of Tanning Processes. By – K. H. Gustavson, Academic Press, N.Y...");

        List<String> PIT = Arrays.asList("Module 1. Tanning (10hours)\n" +
                "Theory, Chemistry, Factors and objectives of following inorganic tanning operations :- (a)\n" +
                "Chrome Tannage (b) Aluminum Tannage (c) Iron Tannage (d) Zirconium Tannage (e)\n" +
                "Titanium Tannage (f) Poly Phosphate Tannage and (g) Silica Tannage.\n" +
                "\n" +
                "\n" +
                "Module. 2 Introduction to Co-ordination Chemistry, metal ion in tanning (10hours)\n" +
                "Historical introduction to mineral tanning, Introduction of factors controlling molecular\n" +
                "stability of transition metal complexes, Werner’s theory of Co-ordination, Role of d and f\n" +
                "orbitals, Definition of ligands, Ligand Bond in Collage, Chelation, Masking agent :- Their\n" +
                "requirement for use in chrome tanning, Effect of masking on chrome tanned leather & as\n" +
                "chrome liquor.\n" +
                "\n" +
                "\n" +
                "Module 3. Aqueous Chemistry of Chromium (07hours)\n" +
                "Electric configuration, common oxidation states of chromium, stabilities of Chromium (IV)\n" +
                "and Chromium (III) salt, Basicity, Olation, Oxolation and polymerization, complexity of\n" +
                "chrome complexes.\n" +
                "\n" +
                "Module 4.Factor Controlling Chrome tanning (07hours)\n" +
                "Single and double bath chrome tannage and their relative merits and demerits, preperation of\n" +
                "Basic chromium sulphate salt, Effects of float Volume, PH, basicity, Masking temperature,\n" +
                "drum speed, ageing chrome tanned substrate.\n" +
                "\n" +
                "\n" +
                "Module 5. Mechanism of chrome tanning (07hours)\n" +
                "Theories of chrome tanning, Absorption, Coating, Electrostatic and hydrogen bond\n" +
                "interaction and co-ordinative forces involved in chrome tanning, hydro thermal stability of\n" +
                "chrome-collagen compound.\n" +
                "\n" +
                "\n" +
                "Texts/References:\n" +
                "1. Introduction to the Principles of Leather Manufacture. By – S. S. Dutta, 4th Edition,\n" +
                "ILTA, Kolkata\n" +
                "2. Theory & Practice of Leather Manufacture. By – K. T. Sarkar, Macmillan India Press,\n" +
                "Chennai...");

        List<String> OEMOOC = Arrays.asList("OPEN ELECTIVE -I (MOOC)..");

        List<String> EScience = Arrays.asList("ENVIRONMENTAL SCIENCE - 0 Credit...");

        List<Semester> fourthSemesters = new ArrayList<>();
        fourthSemesters.add(new Semester("ANALYTICAL CHEMISTRY OF LEATHER", ACL));
        fourthSemesters.add(new Semester("BIOCHEMISTRY OF PROTEIN", BP));
        fourthSemesters.add(new Semester("CHEMICAL ENGINEERING -I", CE));
        fourthSemesters.add(new Semester("THEORY AND PRACTICES OF PRESERVATION AND PRE TANNING PROCESS", TheoryP));
        fourthSemesters.add(new Semester("PRINCIPLES OF INORGANIC TANNAGE", PIT));
        fourthSemesters.add(new Semester("OPEN ELECTIVE -I (MOOC)", OEMOOC));
        fourthSemesters.add(new Semester("ENVIRONMENTAL SCIENCE", EScience));

        branches.add(new Branch("Semester 4", fourthSemesters));
        //4th Semester End....



        //5 Semester Start...
        List<String> CETwo = Arrays.asList("Module-1\n" +
                "Basic Concepts, Conduction ( 8 Hrs )\n" +
                "Modes of heat transfer, conduction, convection and radiation, analogy between heat flow and electrical flow. Conduction: One dimensional steady state heat conduction, the Fourier heat conduction equation, conduction through plane wall, conduction through cylindrical wall, spherical wall, variable thermal conductivity, conduction through composite slab, cylinder and sphere, thermal contact resistance, critical radius of insulation, Extended surfaces: heat transfer from a fin, fin effectiveness and efficiency, Introduction to unsteady state heat conduction.\n" +
                "\n" +
                "Module-2\n" +
                "Convection ( 10 Hr)\n" +
                "The convective heat transfer coefficient, thermal boundary layers for the cases of flow of fluid over a flat plate and flow through pipe, dimensionless numbers in heat transfer and their significance, dimensional analysis, application of dimensional analysis to forced convection and natural convection. Forced Convection: Correlation equations for heat transfer in laminar and turbulent flows in a Circular tube and duct, heat transfer to liquid metals and heat transfer to tubes in cross flow. Natural Convection: Natural convection from vertical and horizontal surfaces, Grash of and Rayleigh numbers.\n" +
                "\n" +
                "Module-3\n" +
                "Heat transfer by radiation (8 Hr )\n" +
                "Basic Concepts of radiation from surface: black body radiation, Planks law, Wien’s displacement law, Stefan Boltzmann’s law, Kirchhoff’s law, grey body, Radiation intensity of black body, View factor, emissivity, radiation between black surfaces and grey surfaces. Solar radiations.\n" +
                "\n" +
                "Module-4\n" +
                "Boiling and Condensation ( 8 hrs )\n" +
                "Pool boiling, pool boiling curve for water, maximum and minimum heat fluxes, correlations for nucleate and film pool boiling, drop wise and film wise condensation, Nusselt analysis for laminar film wise condensation on a vertical plate, film wise condensation on a horizontal tube. Evaporation: Types of evaporators, boiling point elevation and Duhring’s rule, material and energy balances for single effect evaporator, multiple effect evaporators: forward, mixed and backward feeds, capacity and economy of evaporators.\n" +
                "\n" +
                "Module-5\n" +
                "Heat Exchangers( 10 Lectures )\n" +
                "Types of heat exchangers, Principal Components of a Concentric tube & Shell-and Tube Heat Exchanger, Baffles, Tubes and Tube Distribution, Tubes to Tube sheets Joint, Heat Exchangers with Multiple Shell & tube Passes, Fixed-Tube sheet and Removable-Bundle Heat Exchangers, log-mean temperature difference, overall heat transfer coefficient, fouling factors .\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested books\n" +
                "1. “Heat transfer principles and applications” Dutta, B.K., PHI\n" +
                "2. “Heat Transfer” Holman J.P., 9th Ed., McGraw Hill.\n" +
                "3. “Chemical Engineering: Vol-1”, Coulson, J. M. & Richardson, J. F., 6 th ed. Butterworth- Heinemann\n" +
                "4. “Process Heat Transfer”, Kern, D. Q McGraw Hill Book...");

        List<String> POOT = Arrays.asList("Module-1\n" +
                "Vegetable Tannins ( 12 hrs )\n" +
                "Classification of Vegetable tannins – Structural aspects, Analysis of Chemistry of Hydrolysable & Condensed tannins, Manufacture of vegetable tannin extract use of additive for product notification, Reactions of vegetable tannins with collagen, Principle of vegetable tanning, Factors affecting tannin diffusion & factors affecting tannin fixation with collagen, Principle of Rapid tanning methods.\n" +
                "\n" +
                "Module-2\n" +
                "Synthetic tannins ( 12 hrs )\n" +
                "Chemistry & Multifunctional properties of syntans, Nontans in synthetic tannins, General Manufacturing methods of Phenol, Formaldehyde Naphthalene, Formaldehyde and Naphthol, Formaldehyde condensates, Supra Syntans, Use of Syntans for the Manufacture of various Leathers & for chemical modifications for specific objectives, use of Lignosulfonic acids in Leather processing.\n" +
                "\n" +
                "Module-3\n" +
                "Resin Syntans ( 8 Hrs )\n" +
                "Urea, Formaldehyde & Melamine, Formaldehyde condensates as tanning agents for leather, their chemistry & structure, Property, Relationship, Polyacrylates & Polyurethanes as Resin tanning agent Principles of their use.\n" +
                "\n" +
                "Module-4\n" +
                "Aldehydes as tannins( 8 Hrs )\n" +
                "Formaldehyde and other mono, difunctional ablehydes their chemistry, Structure and general properties, Reaction of aldehydes with different functional groups of protein. Tanning faculty at different pH reactions, oil, sulphony/chloride quinone tannage.\n" +
                "\n" +
                "Module-5\n" +
                "Combination tannages ( 8 Lectures )\n" +
                "Deficiencies of single tannage, Machanistic classification of tannages. All chrome based combination tannages, semi-chrome & semi – alum tannages.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. Introduction to the Principles of Leather Manufacture. By – S. S. Dutta, 4 th Edition, ILTA, Kolkata\n" +
                "2. Theory & Practice of Leather Manufacture. By – K. T. Sarkar, Macmillan India Press, Chennai...");

        List<String> POLM = Arrays.asList("Practice of Leather Manufacturing-I..");

        List<String> LPTFirst = Arrays.asList("Module-1\n" +
                "Introduction ( 3 Hrs )\n" +
                "History of Footwear industry, Functions of footwear, Different parts of Footwear (Upper, Bottom and hidden components).\n" +
                "\n" +
                "Module-2\n" +
                "Anatomy of Human foot ( 5 Hrs )\n" +
                "Bones, Joints, Muscles, Ligaments, arches of skin of human foot, Internal and external changes of human foot from infant to adult stage, Analysis of human locomotion, Common foot abnormalities and their remedies. Foot comfort and foot care.\n" +
                "\n" +
                "Module-3\n" +
                "Last ( 5 hrs )\n" +
                "Definition, Classification of last, Different parts of last, Seasoning of wood for wooden last, Last measurement, Comparison of last with human foot.\n" +
                "\n" +
                "Module-4\n" +
                "Shoe Sizes and Fittings ( 4 Hrs )\n" +
                "Relation between foot sizes and fittings and shoe, sizes and fittings, English, American, French, Continental and mondopoint shoe sizes and fittings system.\n" +
                "\n" +
                "Module-5\n" +
                "Designing ( 12 Hrs )\n" +
                "Introduction, Classification of Basic design, Elements of Design, Elements of Fashion design procedure, Concept of inside form, outside form and mean form, Making standard of oxford and derby shoe, different pattern making allowances, lasting margin, folding ,underlay and seam margin, Grading (Grading m/c).\n" +
                "\n" +
                "Module-6\n" +
                "Footwear materials ( 9 Hrs )\n" +
                "Upper and Lining materials – Different natural and synthetic materials. Adhesive – Definition, Different types of adhesives use in footwear industry and their relative advantages and disadvantages. Sole, Insole, Toe puff, Stiffner. Different types of sole material and their properties. Different types of thread and its properties. Footwear accessories.\n" +
                "\n" +
                "Module-7\n" +
                "Footwear Costing (4 Hrs )\n" +
                "Material, Labour and Overhead cost, Determining the material consumption, Leather consumption – One pair by tracing methods, calculation by Russ & Small method (0 & 180 0 Adhesive and thread consumption etc.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. Manual of Shoe making –Clark.\n" +
                "2. The text book of Footwear menu – J. H. Throntin.\n" +
                "3. Principle of Footwear Manufacture – Somnath ganguly...");

        List<String> POPTO = Arrays.asList("Module-1\n" +
                "Neutralisation ( 3 Hrs )\n" +
                "Its objectives, necessities and control to achieve desired uptake of dyes and fat liquors.                       \n" +
                "\n" +
                "Module-2\n" +
                "Bleaching ( 3 Hrs )\n" +
                "Definition, Theory, Mechanism of chemical bleaching, classification and application of different methods of bleaching to leathers.                                       \n" +
                "\n" +
                "Module-3\n" +
                "DYEING ( 10 Hrs )\n" +
                "Classification of dyes based on their chemical nature and also according to their application, Theory of colour, Manual colour matching, Theory and mechanism of dyeing, Chemistry and application of dyeing auxiliaries such as levelling agents, wetting agents, dispersing agents and dye fixative, Metal complex dye.\n" +
                "\n" +
                "Module-4\n" +
                "FAT LIQUORING ( 10 Hrs )\n" +
                "Theory of stability of Emulsion (Surface tension theories and Electrical theories), Fatliquor based on natural oils, their chemistry and preparation, Oxidation, Sulphation, Sulphonation, Bisulphitation and their properties, Synthetic Fat liquor :- Preparation and Properties, Principles and objectives of fatliquoring, Differences between synthetic and natural fat & oils concept of curring.\n" +
                "\n" +
                "Module-5\n" +
                "RETANNING SYNTANS AND RETANNING ( 7 Hrs )\n" +
                "Classification of retanning syntans, Tanning power of retanning syntan, Dipole theory of syntan tanning, General method of manufacture of aromatic syntans their general properties, Objective of retanage, Effect of different retanning agents on properties of leather principle of bondage of retanning material.\n" +
                "\n" +
                "Module-6\n" +
                "THEORY OF LEATHER DRYING ( 7 Hrs )\n" +
                "Principles of energy and mass transfer, Physio-Chemical aspect of leather drying, Different methods of drying followed in leather Industry.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. Introduction to the Principles of Leather Manufacture. By – S. S. Dutta, 4 th Edition, ILTA, Kolkata.                                 \n" +
                "B. Theory & Practice of Leather Manufacture. By – K. T. Sarkar, Macmillan India Press, Chennai...");

        List<String> EH = Arrays.asList("Module-1\n" +
                "( 10 Lectures )\n" +
                "Engineering economics and its definition, Nature and scope, Overview of Indian Financial Scenario. Utility, Theory of demand, law of demand and its exceptions, Elasticity of demand, Law of supply and elasticity of supply, Determination of equilibrium price under perfect competition. Time value of money-Simple and Compound Interest, Cash Flow Diagram, Principle of Economic Equivalence Evaluation of Engineering projects, Concept of Internal rate of return (IRR).\n" +
                "\n" +
                "Module-2\n" +
                "( 10 Lectures )\n" +
                "Cost Concepts, Elements of costs, Preparation of cost sheet, Segregation of costs into Fixed and variable costs, Break-even Analysis-Linear Approach. Engineering Accounting, Manufacturing Cost, Manufacturing Cost Estimation, Preparing Financial Business Cases, Profit and loss A/c Balance sheet. Asset Depreciation and its Impact on Economic Analyses, Depreciation Policy, Straight line method and declining balance method, Economic Justification of Asset Replacements.\n" +
                "\n" +
                "Module-3\n" +
                "( 10 Lectures )\n" +
                "Types of business ownership: Private ownership- individual, Partnership, Joint stock companies, Co-operative societies, State ownership-government departmental organization, Public corporations, Government companies, Public Private Partnership (PPP) and its management. Store keeping, Elements of Materials management and control polices.\n" +
                "\n" +
                "Banking: Meaning and functions of commercial banks, Function of Reserve Bank of India.\n" +
                "\n" +
                "Module-4\n" +
                "( 10 Lectures )\n" +
                "Asset Depreciation and its Impact on Economic Analyses, Depreciation Policy, Straight line method and declining balance method, Economic Justification of Asset Replacements.\n" +
                "\n" +
                "Development of business case analyses for new product development projects and the impact of taxes on engineering economic decisions. Inflation and its impact on economy...");

        List<String> EIT = Arrays.asList("Essence of India Traditional..");

        List<String> IEI = Arrays.asList("Innovation/IPR/Entrepreneurship/Internship/At The End of 4th Semester FOT 6 Weeks..");

        List<Semester> fifthSemesters = new ArrayList<>();
        fifthSemesters.add(new Semester("Chemical Engineering - II", CETwo));
        fifthSemesters.add(new Semester("Principal of Organic Tannage", POOT));
        fifthSemesters.add(new Semester("Practices of Leather Manufacturing - I", POLM));
        fifthSemesters.add(new Semester("Leather Product Technology- I", LPTFirst));
        fifthSemesters.add(new Semester("Principles of Post Tanning Operation", POPTO));
        fifthSemesters.add(new Semester("Economics (Humanities )", EH));
        fifthSemesters.add(new Semester("Essence of India Traditional", EIT));
        fifthSemesters.add(new Semester("Innovation/IPR/Entrepreneurship/Internship/At The End of 4th Semester FOT 6 Weeks", IEI));

        branches.add(new Branch("Semester 5", fifthSemesters));
        //5th Semester End...



        //6 Semester Start...
        List<String> Biology = Arrays.asList("[3 credit course; 2 (one hour) lectures and one (one hour) tutorial per week. Only lecture hours are\n" +
                "shown]\n" +
                "\n" +
                "\n" +
                "Module 1. (2 hours)- Introduction\n" +
                "Purpose: To convey that Biology is as important a scientific discipline as Mathematics, Physics and\n" +
                "Chemistry\n" +
                "Bring out the fundamental differences between science and engineering by drawing a comparison\n" +
                "between eye and camera, Bird flying and aircraft. Mention the most exciting aspect of biology as an\n" +
                "independent scientific discipline. Why we need to study biology? Discuss how biological\n" +
                "observations of 18th Century that lead to major discoveries. Examples from Brownian motion and\n" +
                "the origin of thermodynamics by referring to the original observation of Robert Brown and Julius\n" +
                "Mayor. These examples will highlight the fundamental importance of observations in any scientific\n" +
                "inquiry.\n" +
                "\n" +
                "\n" +
                "Module 2. (3 hours)- Classification\n" +
                "Purpose: To convey that classification per se is not what biology is all about. The underlying\n" +
                "criterion, such as morphological, biochemical or ecological be highlighted. Hierarchy of life forms at\n" +
                "phenomenological level. A common thread weaves this hierarchy Classification. Discuss\n" +
                "classification based on (a) cellularity- Unicellular or multicellular (b) ultrastructure- prokaryotes or\n" +
                "eucaryotes. (c) energy and Carbon utilization -Autotrophs, heterotrophs, lithotropes (d) Ammonia\n" +
                "excretion – aminotelic, uricoteliec, ureotelic (e) Habitata- acquatic or terrestrial (e) Molecular\n" +
                "taxonomy- three major kingdoms of life. A given organism can come under different category based\n" +
                "on classification. Model organisms for the study of biology come from different groups. E.coli, S.\n" +
                "cerevisiae, D. Melanogaster, C. elegance, A. Thaliana, M. musculus\n" +
                "\n" +
                "Module 3. (4 hours)-Genetics\n" +
                "Purpose: To convey that “Genetics is to biology what Newton’s laws are to Physical Sciences”\n" +
                "Mendel’s laws, Concept of segregation and independent assortment. Concept of allele. Gene\n" +
                "mapping, Gene interaction, Epistasis. Meiosis and Mitosis be taught as a part of genetics. Emphasis\n" +
                "to be give not to the mechanics of cell division nor the phases but how genetic material passes from\n" +
                "parent to offspring. Concepts of recessiveness and dominance. Concept of mapping of phenotype to\n" +
                "genes. Discuss about the single gene disorders in humans. Discuss the concept of complementation\n" +
                "using human genetics.\n" +
                "\n" +
                "Module 4. (4 hours)-Biomolecules\n" +
                "Purpose: To convey that all forms of life has the same building blocks and yet the manifestations\n" +
                "are as diverse as one can imagine Molecules of life. In this context discuss monomeric units and polymeric structures. Discuss about\n" +
                "sugars, starch and cellulose. Amino acids and proteins. Nucleotides and DNA/RNA. Two carbon\n" +
                "units and lipids.\n" +
                "\n" +
                "Module 5. (4 Hours). Enzymes\n" +
                "Purpose: To convey that without catalysis life would not have existed on earth\n" +
                "Enzymology: How to monitor enzyme catalyzed reactions. How does an enzyme catalyzereactions.\n" +
                "Enzyme classification. Mechanism of enzyme action. Discuss at least two examples. Enzyme kinetics\n" +
                "and kinetic parameters. Why should we know these parameters to understand biology? RNA\n" +
                "catalysis.\n" +
                "\n" +
                "Module 6. (4 hours)- Information Transfer\n" +
                "Purpose: The molecular basis of coding and decoding genetic information is universal Molecular\n" +
                "basis of information transfer. DNA as a genetic material. Hierarchy of DNA structure- from single\n" +
                "stranded to double helix to nucleosomes. Concept of genetic code. Universality and degeneracy of\n" +
                "genetic code. Define gene in terms of complementation and recombination.\n" +
                "\n" +
                "Module 7. (5 hours). Macromolecular analysis\n" +
                "Purpose: How to analyses biological processes at the reductionistic level\n" +
                "Proteins- structure and function. Hierarch in protein structure. Primary secondary, tertiary and\n" +
                "quaternary structure. Proteins as enzymes, transporters, receptors and structural elements.\n" +
                "\n" +
                "Module 8. (4 hours)- Metabolism\n" +
                "Purpose: The fundamental principles of energy transactions are the same in physical and biological\n" +
                "world.\n" +
                "Thermodynamics as applied to biological systems. Exothermic and endothermic versus endergonic\n" +
                "and exergoinc reactions. Concept of Keq and its relation to standard free energy. Spontaneity. ATP\n" +
                "as an energy currency. This should include the breakdown of glucose to CO2 + H2O (Glycolysis and\n" +
                "Krebs cycle) and synthesis of glucose from CO2 and H2O (Photosynthesis). Energy yielding and\n" +
                "energy consuming reactions. Concept of Energy charge\n" +
                "\n" +
                "Module 9. (3 hours)- Microbiology\n" +
                "Concept of single celled organisms. Concept of species and strains. Identification and classification\n" +
                "of microorganisms. Microscopy. Ecological aspects of single celled organisms. Sterilization and\n" +
                "media compositions. Growth kinetics.\n" +
                "\n" +
                "Module 10: Plant Physiology covering, Transpiration; Mineral nutrition (3 Lectures)\n" +
                "\n" +
                "Module 10B: Ecology covering, Ecosystems- Components, types, flow of matter and energy in an\n" +
                "ecosystem; Community ecology- Characteristics, frequency, life forms, and biological spectrum;\n" +
                "Ecosystem structure- Biotic and a-biotic factors, food chain, food web, ecological pyramids; (3\n" +
                "Lectures)\n" +
                "\n" +
                "\n" +
                "References:\n" +
                "1. Biology: A global approach: Campbell, N. A.; Reece, J. B.; Urry, Lisa; Cain, M, L.; Wasserman,\n" +
                "S. A.; Minorsky, P. V.; Jackson, R. B. Pearson Education Ltd\n" +
                "2. Outlines of Biochemistry, Conn, E.E; Stumpf, P.K; Bruening, G; Doi, R.H., John Wiley and Sons\n" +
                "3. Principles of Biochemistry (V Edition), By Nelson, D. L.; and Cox, M. M.W.H. Freeman and\n" +
                "Company\n" +
                "4. Molecular Genetics (Second edition), Stent, G. S.; and Calender, R.W.H. Freeman and\n" +
                "company, Distributed by Satish Kumar Jain for CBS Publisher\n" +
                "5. Microbiology, Prescott, L.M J.P. Harley and C.A. Klein 1995. 2nd edition Wm, C. Brown\n" +
                "Publishers...");

        List<String> CEThree = Arrays.asList("Module I: Mass Transfer and Diffusion (12hours)\n" +
                "Steady-state ordinary molecular diffusion: Fick’s law of diffusion; Velocities in mass transfer,\n" +
                "Equimolar counter diffusion; unimolecular diffusion, Diffusion coefficients: Diffusivity in gas\n" +
                "mixtures, diffusivity in liquid mixtures, Diffusivity in solids, One-dimensional, steady-state,\n" +
                "molecular diffusion through stationary media, Models for mass transfer at a fluid-fluid interface:\n" +
                "Film theory; Penetration theory; surface-renewal theory; film-penetration theory, Two-film theory\n" +
                "and overall mass transfer coefficients\n" +
                "\n" +
                "\n" +
                "Module 2: Absorption and Stripping (08hours)\n" +
                "Equipment, Gas-liquid equilibrium, Henry’s law, Selection of solvent, Absorption in tray column,\n" +
                "Graphical and analytical methods, Absorption in packed columns.\n" +
                "\n" +
                "\n" +
                "Module 3: Adsorption (08hours)\n" +
                "Description of adsorption processes and their application, Types of adsorption, Nature of adsorbents;\n" +
                "Adsorption isotherms and adsorption hysteresis; Stagewise and continuous contact adsorption\n" +
                "operations, Determination of number of stages, Equipment.\n" +
                "\n" +
                "Module 4: Drying (06hours)\n" +
                "Solid-gas equilibrium, Different modes of drying operations, Definitions of moisture contents, Types\n" +
                "of batch and continuous dryers, Rate of batch drying, Time of drying, Mechanism of batch drying,\n" +
                "Continuous drying,\n" +
                "\n" +
                "\n" +
                "Module 5: Crystallization (08hours)\n" +
                "Crystal geometry-Crystal-size distribution; Thermodynamic considerations Solubility and material\n" +
                "balances, Enthalpy balance; Kinetic and transport considerations Supersaturation, Nucleation, Crystal\n" +
                "growth; Equipment for solution crystallization-Circulating, batch crystallizers, Continuous, cooling\n" +
                "crystallizers, Continuous, vacuum evaporating crystallizers\n" +
                "\n" +
                "\n" +
                "Texts/References:\n" +
                "1. Treybal, R.E. “Mass Transfer Operations”, 3rd ed. New York: McGraw-Hill, (1980).\n" +
                "2. Seader, J.D. and Henley, E.J., “Separation Process Principles”, 2nd ed., Wiley India Pvt. Ltd.,\n" +
                "New Delhi (2013).\n" +
                "3. Sherwood, T. K., Pigford, R. L. and Wilke, C.R. “Mass Transfer” McGraw Hill (1975).\n" +
                "4. Geankoplis, C.J. “Transport Processes and Separation Process Principles”, 4th ed., PHI\n" +
                "Learning Private Limited, New Delhi (2012)...");

        List<String> FAG = Arrays.asList("Module 1\n" +
                "Various definitions of Economics: Nature of Economic Problem, Relation between science\n" +
                "Engineering. Technology & Economics (3 lectures)\n" +
                "\n" +
                "Module 2\n" +
                "Meaning of demand, Law of Demand, Elasticity of demand, Practical importance & application of\n" +
                "the concept of elasticity of Demand (5 lectures)\n" +
                "\n" +
                "Module 3\n" +
                "Meaning of Production and factor of Production:Land, labor, Capital, Entrepreneur&\n" +
                "Organization –their Characteristics law of variable Proportion. Return to Scale (5 lectures)\n" +
                "\n" +
                "Module 4\n" +
                "Cost Analysis: Various concepts of cost, Cost function, Short & Long run cost. Concept of\n" +
                "Revenue, Break-Even Analysis (5 lectures)\n" +
                "\n" +
                "Module 5\n" +
                "Meaning of Market: Type of market –Perfect completion, Monopoly, Oligopoly, Monopolistic\n" +
                "competition, Main feature of these market), Meaning of Supply and Law of Supply, R ole of Demand\n" +
                "& Supply in price in prime determination imperfect t competition (7 lectures)\n" +
                "\n" +
                "Module 6\n" +
                "Engineering Economy:\n" +
                "(a) Simple and compound interest, Annuities, (b)Basic methods For making economy Studies -(i) Present worth method, (ii) Future worth method (iii)I.R.R method (c) Comparison of alternative –(i)\n" +
                "Present worth method, (ii\\) Future Worth method (iii) I.R.R method. (7 Lecture)\n" +
                "\n" +
                "\n" +
                "Module 7\n" +
                "Accounting: Meaning Scope and Role of accounting, Accounting concept & Convention.\n" +
                "Accounting as information System. Recording of transaction in journal and Ledgers. Trial –Balance,\n" +
                "Preparation of final Account. (9 Lecture)\n" +
                "\n" +
                "\n" +
                "Text Book:\n" +
                "1. Modern Micro Economics by Theory -H.L.Ahuja-S.Chand\n" +
                "2. Advance Economic Theory by M .L.Jhingan-Konark Publication\n" +
                "3. Engineering Economics by Degarmo , Sullican & Canada –McMillan\n" +
                "4. Double Entry Book Keeping by T.S.Grewal –S .Chand\n" +
                "\n" +
                "Reference Books:\n" +
                "1. Stonier & Hague by A test book of Economic Theory-Pearson\n" +
                "2. Industrial Organisation and Engg. Economics by Banga & Sharma..");

        List<String> LFMA = Arrays.asList("Module1. Pigments (08hours)\n" +
                "Inorganic and Organic Pigments, Preparation of Pigments, Methods of Preparation of Pigments,\n" +
                "Aqueous Pigment Paste, Properties required in Pigments.\n" +
                "\n" +
                "\n" +
                "Module 2. Principles of Finishing, Finish Formulation and their Application (06hours)\n" +
                "Definition, Aim, Film- Formation mechanism, Properties of films such as transparency, Gloss and\n" +
                "resistance to heat, light and solvent, Role is dispersion and stability – Requirement in multiple coat\n" +
                "technique- Single coat, Composition and methods of application like spraying, Curtain coating,\n" +
                "Roller coating etc., Cationic finishes and their relative merits.\n" +
                "\n" +
                "Module 3. (06hours)\n" +
                "Chemistry and Preparation of Nitrocellulose, lacquers, lacuuer emulsion, Coloured lacquers, Wax\n" +
                "emulsions, Silicone emlsion.\n" +
                "\n" +
                "\n" +
                "Module4. (06hours)\n" +
                "Chemistry and Properties required of Synthetic Polymers, Impregnatin agents, Binders, Chemistry of\n" +
                "Polyurethane lacquers.\n" +
                "\n" +
                "\n" +
                "Module 5. (06hours)\n" +
                "Chemistry and Mechanism of Plasticization, Internal and External Plasticizers.\n" +
                "\n" +
                "\n" +
                "Module 6. (06hours)\n" +
                "Definition of Water proofing, Theory of water Proofing, Chemistry &Mechanism involved in water\n" +
                "proofing.\n" +
                "\n" +
                "\n" +
                "Module 7. (06hours)\n" +
                "Upgradation technologies in finishing. General introduction to addition, condensation, Natural\n" +
                "polymer, Caesin, Cellulose\n" +
                "\n" +
                "\n" +
                "Text/References\n" +
                "1. Acrylics and their uses in leather manufacture. By Rajadesa, S. and Kula Sekhran, S. CLRI 3\n" +
                "Chennai –1956.\n" +
                "2. Chemistry of Tanning Process. By Gustavson, K.H. Academic Press, New York- 1956.\n" +
                "3. The Chemistry and Technology of Leather. By Fred O, Flaherty, Toddy T.W. and Hollar, R.\n" +
                "M. Vol – II, Types of tannages, Rober E. Krieger, Publishing Co. New York – 1977...");

        List<String> PLMTwo = Arrays.asList("PRACTICES OF LEATHER MANUFACTURING -II...");

        List<String> PMT = Arrays.asList("PRINCIPLES OF MATERIAL TESTING...");

        List<String> MOOCTwo = Arrays.asList("MOOCS / SWAYAM / NPTEL (COURSES -II)");

        List<String> IP = Arrays.asList("INDUCTION PROGRAM..");

        List<String> GES = Arrays.asList("GRADUATE EMPLOYABILITY SKILLS AND COMPETETIVE COURSES (GATE, IES, ETC.)..");

        List<Semester> sixthSemesters = new ArrayList<>();
        sixthSemesters.add(new Semester("BIOLOGY FOR ENGINEERS", Biology));
        sixthSemesters.add(new Semester("CHEMICAL ENGINEERING -III", CEThree));
        sixthSemesters.add(new Semester("FINANCE AND ACCOUNTING (HUMANITIES)", FAG));
        sixthSemesters.add(new Semester("LEATHER FINISHING MATERIALS AND AUXILIARIES", LFMA));
        sixthSemesters.add(new Semester("PRACTICES OF LEATHER MANUFACTURING -II", PLMTwo));
        sixthSemesters.add(new Semester("PRINCIPLES OF MATERIAL TESTING", PMT));
        sixthSemesters.add(new Semester("MOOCS / SWAYAM / NPTEL COURSES -II", MOOCTwo));
        sixthSemesters.add(new Semester("INDUCTION PROGRAM", IP));
        sixthSemesters.add(new Semester("GRADUATE EMPLOYABILITY SKILLS AND COMPETETIVE COURSES (GATE, IES, ETC.)", GES));

        branches.add(new Branch("Semester 6", sixthSemesters));
        //6 Semester End...



        //7 Semester Start...
        List<String> CRE = Arrays.asList("Module 1 (10hours) \n" +
                "\n" +
                "Rate of Reaction, Elementary and non-elementary homogeneous reactions, Molecularity and order of reaction, Mechanism of reaction, temperature dependency from thermodynamics, collision and activated complex theories. Integral and differential methods for analyzing kinetic data, interpretation of constant volume reactor, zero, first, second and third order reactions, half life period, irreversible reaction in parallel and series, catalytic reaction, auto catalytic reaction, reversible reactions. \n" +
                "\n" +
                "Module 2 (8hours) \n" +
                "\n" +
                "Interpretation of variable volume batch reactions for zero, first and second order reactions, Space-time and state-velocity, design equation for ideal batch, steady-state continuous stirred tank, steady-state plug flow reactors for isothermal reaction.\n" +
                "\n" +
                " Module 3 (10hours) \n" +
                "\n" +
                "Design for single reactions, Size comparison of single reactors, Multiple reactor systems, plug flow/mixed flow reactors in series and parallel, reactors of different types in series, optimum reactor size, recycle reactor, autocatalytic reactions. \n" +
                "\n" +
                "Module 4 (10hours) \n" +
                "\n" +
                "Introduction to multiple reactions, qualitative discussion about product distribution, quantitative treatment of product distribution and of reactor size, selectivity, the side entry reactor, irreversible first-order reactions in series, Quantitative treatment: plug flow or batch reactor, Quantitative treatment: mixed flow reactor, Successive irreversible reactions of different orders, reversible reactions, irreversible series-parallel reactions. \n" +
                "\n" +
                "Module 5 (8hours) \n" +
                "\n" +
                "Residence time distribution of fluids in vessels, State of aggregation of the flowing systems,Earliness of mixing, Role of RTD, Conversion in Non-ideal flow reactors. \n" +
                "\n" +
                "Text /References \n" +
                "\n" +
                "Levenspiel, O., “Chemical Reaction Engineering”, 3rd edition, John Wiley (1998). ...");

        List<String> LPTT = Arrays.asList("Module 1. Clicking \n" +
                "\n" +
                "Characteristics and variations in leather, Material selection, Clicking of upper linings, Socks and fabrics. \n" +
                "\n" +
                "Module 2. Preparation (Pre – Closing) \n" +
                "\n" +
                "(a) Identification making, stitch making, Punching, Perforating and embossing. \n" +
                "\n" +
                "(b) Skiving – Objectives, different types skiving. \n" +
                "\n" +
                "(c) Reinforcements. \n" +
                "\n" +
                "(d) Topline and edge treatments.  \n" +
                "\n" +
                "Module 3. Closing operations \n" +
                "\n" +
                "(a) Stitching – Types of stitching m/c, Types of stitch, Different types of seam. \n" +
                "\n" +
                "(b) Eyeleting , lasting, etc \n" +
                "\n" +
                "Module 4. Construction Assembly, Definition of construction, Types of Construction, Flowchart of different construction, Details of cemented construction – Methods, Details of moulded construction – DVP construction, Direct PVC moulded construction, Direct PU moulded construction, Veldtschoen construction, Machine welted construction. Slip – lasted construction, string lasted shoes. \n" +
                "\n" +
                "Module 5. Treeing Department (Shoe-room operations) Shoe-room operations for grain, leather and suede leather uppers. 03 Module 6. Quality control in footwear industry, Marketing of footwear, Hand tools and fittings for footwear industry.\n" +
                "\n" +
                "Suggested Books: \n" +
                "\n" +
                "1. Manual of Shoe – making – Clark.\n" +
                "\n" +
                "2. Text book of Footwear Manufacture – J. H. Thronton. \n" +
                "\n" +
                "3. Principle of Footwear Manufacture – Dr. Somnath Ganguly. ...");

        List<String> PEF = Arrays.asList("PROGRAM ELECTIVE -I.");

        List<String> TOLSAS = Arrays.asList("Module 1 Chemistry of the most common Polymeric materials used in leather industry as supplements. 04 \n" +
                "\n" +
                "Module 2 Concept of a macromolecule, natural & synthetics polymer, modes of polymerization, radical, condensation, stereo regular polymerization, polymerization kinetics, mechanism, anionic and cationic polymerization. 10 \n" +
                "\n" +
                "Module 3 Manufacture of industrially important polymer for plastics, fibres and elastomer, polyethylene, polypropylene, polyvinyl, chloride, polyvinyl, alcohol, polyacrylonitrile, polyurethane, fluoro – carbon polymer, epoxy resins, polyamides, polyesters, alkyd resin, silicon polymers, cellulosics, polyacrylates, polyurethanes and their common applications. 12 \n" +
                "\n" +
                "Module 4 Testing of Polymers, Mechanical and thermal testing. 04 \n" +
                "\n" +
                "Module 5 Polymer and Rubber industries in India. 04 Module 6 Manufacture of Rubber and Synthetic rubber, Natural rubber processing and vulcanizing synthetic elastomers, butadiene copolymer, Polyisoprene, Polybutadiene, Thermosetting, Thermoplastic. 10 \n" +
                "\n" +
                "Text/References: \n" +
                "\n" +
                "1. Introduction to the Principles of Leather Manufacture. By – S. S. Dutta, 4th Edition, ILTA, Kolkata \n" +
                "\n" +
                "2. Theory & Practice of Leather Manufacture. By – K. T. Sarkar, Macmillan India Press, Chennai. ..");

        List<String> WorkshopHeads = Arrays.asList("WORKSHOP/Heads om TRAINING/SOFT SKILL..");

        List<String> LPTTwoP = Arrays.asList("LEATHER PRODUCT TECHNOLOGY -II (PRACTICAL)..");

        List<String> SummerEntreThree = Arrays.asList("SUMMER ENTREPRENEURSHIP -III..");

        List<String> PFirst = Arrays.asList("PROJECT -I..");

        List<Semester> seventhSemesters = new ArrayList<>();
        seventhSemesters.add(new Semester("CHEMICAL REACTION ENGINEERING", CRE));
        seventhSemesters.add(new Semester("LEATHER PRODUCT TECHNOLOGY -II", LPTT));
        seventhSemesters.add(new Semester("PROGRAM ELECTIVE -I", PEF));
        seventhSemesters.add(new Semester("THEORY OF LEATHER SUPPLEMENTS AND SYNTHETICS", TOLSAS));
        seventhSemesters.add(new Semester("WORKSHOP/HEADS OM TRAINING/SOFT SKILL", WorkshopHeads));
        seventhSemesters.add(new Semester("LEATHER PRODUCT TECHNOLOGY -II (PRACTICAL)", LPTTwoP));
        seventhSemesters.add(new Semester("SUMMER ENTREPRENEURSHIP -III", SummerEntreThree));
        seventhSemesters.add(new Semester("PROJECT -I", PFirst));

        branches.add(new Branch("Semester 7", seventhSemesters));
        //7th Semester End...



        //8 Semester Start...
        List<String> PETwo = Arrays.asList("SURFACE AND COLLOID CHEMISTRY\n" +
                "FASHION STYLING AND COMPUTER ADDED DESIGN OF LEATHER PRODUCT\n" +
                "ADVANCE LEATHER PROCESS TECHNOLOGY\n" +
                "APPLIED STATISTICS AND QUALITY CONTROL\n" +
                "PROFESSIONAL ETHICS\n" +
                "COMPUTER APPLICATION FOR LEATHER TECHNOLOGY\n" +
                "ENTREPRENEURSHIP\n" +
                "LEATHER PRODUCT TECHNOLOGY -III");

        List<String> PEThree = Arrays.asList("SURFACE AND COLLOID CHEMISTRY\n" +
                "FASHION STYLING AND COMPUTER ADDED DESIGN OF LEATHER PRODUCT\n" +
                "ADVANCE LEATHER PROCESS TECHNOLOGY\n" +
                "APPLIED STATISTICS AND QUALITY CONTROL\n" +
                "PROFESSIONAL ETHICS\n" +
                "COMPUTER APPLICATION FOR LEATHER TECHNOLOGY\n" +
                "ENTREPRENEURSHIP\n" +
                "LEATHER PRODUCT TECHNOLOGY -III");

        List<String> OEFirst = Arrays.asList("OPEN ELECTIVE -I (MOOC -IV) FOUR WEEK..");

        List<String> ProjectTwo = Arrays.asList("PROJECT -II..");

        List<String> POLMTwo = Arrays.asList("PRACTICES OF LEATHER MANUFACTURING -II..");

        List<String> TWM = Arrays.asList("TANNERY WASTE MANAGEMENT..");

        List<String> POLMThree = Arrays.asList("PRACTICES OF LEATHER MANUFACTURING -III..");

        List<String> TWMP = Arrays.asList("TANNERY WASTE MANAGEMENT -(PRACTICAL)..");

        List<Semester> eightSemesters = new ArrayList<>();
        eightSemesters.add(new Semester("PROGRAM ELECTIVE -II", PETwo));
        eightSemesters.add(new Semester("PROGRAM ELECTIVE -III", PEThree));
        eightSemesters.add(new Semester("OPEN ELECTIVE -I (MOOC -IV) FOUR WEEK", OEFirst));
        eightSemesters.add(new Semester("PROJECT -II", ProjectTwo));
        eightSemesters.add(new Semester("PRACTICES OF LEATHER MANUFACTURING -II", POLMTwo));
        eightSemesters.add(new Semester("TANNERY WASTE MANAGEMENT", TWM));
        eightSemesters.add(new Semester("PRACTICES OF LEATHER MANUFACTURING -III", POLMThree));
        eightSemesters.add(new Semester("TANNERY WASTE MANAGEMENT -(PRACTICAL)", TWMP));

        branches.add(new Branch("Semester 8", eightSemesters));






        return branches;
    }
}


