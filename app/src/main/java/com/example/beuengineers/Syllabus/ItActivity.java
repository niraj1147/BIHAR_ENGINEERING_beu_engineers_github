package com.example.beuengineers.Syllabus;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beuengineers.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BranchAdapter branchAdapter;
    List<Branch> branchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);

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
                "4. BASIC ELECTRICAL ENGINEERING BY FITZERALD..");

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
                "Inverse and rank of matrix, Rank-Nullity theorem, System of linear equations,Symmetric, Skew-symmertic and Orthogonal matrices. Determinants: Cayley Hamilton theorem and orthogonal transformation..");

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

        List<String> PHYSEMI = Arrays.asList("Module-1\n" +
                "Review of Semiconductor Physics ( 10 Lectures )\n" +
                "E-K Diagram, Density of states, Occupation probability, Fermi level and Quasi-Fermi level ( variation by carrier concentration and temperature ), P-N Junction, Metal-Semiconductor Junction ( Ohmic and Schottky ), Carrier transport, Generation, and Recombination, Semiconductor materials of interest for Optoelectronic Devices, Bandgap modification, Heterostructures, Light- Semiconductor interaction: Rates of optical transitions, Joint density of states, Condition for optical Amplification.\n" +
                "\n" +
                "Module-2\n" +
                "Semiconductor Light Emitting Diodes ( LEDs ) ( 6 Lectures )\n" +
                "Rate equations for carrier density, Radiative and Non-Radiative recombination mechanisms in Semiconductors, LED: Device structure, Materials, Characteristics and Figures of Merit.\n" +
                "\n" +
                "Module-3\n" +
                "Semiconductor LASERS ( 8 Lectures )\n" +
                "Review of Laser Physics; Rate equations for carrier- and Photon-Density and their Steady state solutions, Laser Dynamics, Relaxation oscillations, Input-Output characteristics of Lasers. Semiconductor Laser: Structure, Materials, Device characteristics and figures of Merit; DFB, DBR, and verticalcavity Surface-Emitting Lasers (vecsel), Tunable Semiconductor Lasers.\n" +
                "\n" +
                "Module-4\n" +
                "PHOTODETECTORS ( 6 Lectures )\n" +
                "Types of Semiconductor Photodetectors P-N Junction, PIN and Availanche and Their structure, Materials, Working principle and characteristics, Noise Limits on Performance, Solar cells.\n" +
                "\n" +
                "Module-5\n" +
                "Low-Dimensional Optoelectronic Devices ( 6 Lectures )\n" +
                "Quantum-Well, wire and DOT Based LEDs, LASER, and PHOTODECTORS...");


        List<Semester> firstSemesters = new ArrayList<>();
        firstSemesters.add(new Semester("Basic Electrical Engineering", BEE));
        firstSemesters.add(new Semester("MATHEMATICS-1 (Calculus and Linear Algebra)", MathFirst));
        firstSemesters.add(new Semester("Engineering Graphics and Design", EGD));
        firstSemesters.add(new Semester("Physics ( Semiconductor Physics )", PHYSEMI));

        branches.add(new Branch("Semester 1", firstSemesters));
        //1st Semester Complete...



        //2 Semester Start...
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

        List<String> MatheSecond = Arrays.asList("Module-1\n" +
                "Basic Probability ( 12 Lectures )\n" +
                "Probability Spaces, Conditional probability, Independence; Discrete Random Variables, Independent Random variables, The multinomial Distribution, Poisson approximation to the Binomial Distribution, Infinite Sequences of Bernoulli Trials, Sums of independent Random Rariables; Expectation of discrete random variables, Moments, Variance of a sum, Correlation Coefficient, Chebyshev's Inequality.\n" +
                "\n" +
                "Module-2\n" +
                "Continuous Probability Distributions ( 4 Lectures )\n" +
                "Continuous Random Variables and their properties, Distribution functions and densities, Normal, Exponential and Gamma Densities\n" +
                "\n" +
                "Module-3\n" +
                "Bivariate Distributions ( 4 Lectures )\n" +
                "Bivariates distribution and their properties, Distribution of sums and quotients, Conditional densitiess, Bayes rule.\n" +
                "\n" +
                "Module-4\n" +
                "Basic Statics (8 lectures )\n" +
                "Measures of central tendency: Moments, Skewness and Kurtosis, Probability Distribution: Binomial, poisson and Normal- Evaluation of statical parameters for these three distributions, Correlation and Regression-Rank Correlaton\n" +
                "\n" +
                "Module-5\n" +
                "Applied Statics ( 8 Lectures )\n" +
                "Curve fitting by the method of least squares- Fitting of straight lines, Second degree Parabolas and more General Curves. Test of significance: Large sample test for single proportion,Difference of proportions, Single Mean, Difference of Means and difference of Standard Deviations (SD).\n" +
                "\n" +
                "Module-6\n" +
                "Small Samples ( 4 Lectures )\n" +
                "Test for single Mean, Difference of Means and Correlation Coeffiecients, Test for ratio and Variance- CHI-Square Test for Goodness of fit and independence of Attributes..");

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
                "F. Debates....");

        List<Semester> secondSemesters = new ArrayList<>();
        secondSemesters.add(new Semester("Chemistry", Chemistry));
        secondSemesters.add(new Semester("Mathematics-II ( Probability and Statics)", MatheSecond));
        secondSemesters.add(new Semester("Programming for Problem Solving", PPS));
        secondSemesters.add(new Semester("Workshop Manufacturing Practice", Workshop));
        secondSemesters.add(new Semester("English", English));

        branches.add(new Branch("Semester 2", secondSemesters));
        //2nd Semester End....



        //3 Semester Start....
        List<String> DigitalElectronics = Arrays.asList("Module-1\n" +
                "Fundamentals of Digital Systems and logic families ( 7 Hrs )\n" +
                "Fundamentals of Digital Systems and logic families: Digital signals, digital circuits, AND, OR, NOT, NAND, NOR and Exclusive-OR operations, Boolean algebra, examples of IC gates, number systems-binary, signed binary, octal hexadecimal number, binary arithmetic, one’s and two’s complements arithmetic, codes, error detecting and correcting codes, characteristics of digital lCs, digital logic families, TTL, Schottky TTL and CMOS logic, interfacing CMOS and TTL, Tri - state logic.\n" +
                "\n" +
                "Module-2\n" +
                "Combinational Digital Circuits (7 Hrs )\n" +
                "Combinational Digital Circuits: Standard representation for logic functions K-map representation, simplification of logic functions using K-map, minimization of logical functions. Don’t care conditions, Multiplexer, DeMultiplexer/Decoders, Adders, Subtractors, BCD arithmetic, carry look ahead adder, serial adder, ALU, elementary ALU design, popular MSI chips, digital comparator, parity checker/generator, code converters, priority encoders, decoders/drivers for display devices, Q-M method of function realization.\n" +
                "\n" +
                "Module-3\n" +
                "Sequential circuits and systems ( 7 Hrs )\n" +
                "Sequential circuits and systems: A 1-bit memory, the circuit properties of Bistable latch, the clocked SR flip flop, J- K-T and D types flip flops, applications of flip flops, shift registers, applications of shift registers, serial to parallel converter, parallel to serial converter, ring counter, sequence generator, ripple (Asynchronous) counters, synchronous counters, counters design using flip flops, special counter IC’s, asynchronous sequential counters, applications of counters.\n" +
                "\n" +
                "Module-4\n" +
                "A/D and D/A Converters ( 7 Hrs )\n" +
                "Digital to analog converters: weighted resistor/converter, R-2RLadder D/A converter, specifications for D/A converters, examples of D/A converter lCs, sample and hold circuit, analog to digital converters: quantization and encoding, parallel comparator A/D converter, successive approximation A/D converter, counting A/D converter, dual slope A/D converter, A/D converter using\n" +
                "Voltage to frequency and voltage to time conversion, specifications of A/D converters, example of A/D converter ICs.\n" +
                "\n" +
                "Module-5\n" +
                "Semiconductor memories and Programmable logic devices ( 7 Hrs )\n" +
                "Semiconductor memories and Programmable logic devices: Memory organization and operation, expanding memory size, classification and characteristics of memories, sequential memory, read only memory (ROM), read and write memory(RAM), content addressable memory (CAM), charge de coupled device memory (CCD), commonly used memory chips, ROM as a PLD, Programmable logic array, Programmable array logic, complex Programmable logic devices (CPLDS), Field Programmable Gate Array (FPGA).\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "A. R. P. Jain, Modern Digital Electronics, McGraw Hill Education, 2009.                                  \n" +
                "B. M. M. Mano, Digital logic and Computer design, Pearson Education India, 2016.\n" +
                "C. A. Kumar, Fundamentals of Digital Circuits, Prentice Hall India, 2016..");

        List<String> DSA = Arrays.asList("Module-1\n" +
                "Introduction to Basic Terminology ( 4 Hrs )\n" +
                "Introduction: Basic Terminologies: Elementary Data Organizations, Data Structure Operations: insertion, deletion, traversal etc.; Analysis of an Algorithm, Asymptotic Notations, Time-Space trade off.\n" +
                "\n" +
                "Module-2\n" +
                "Stack and Queue ( 10 Hrs )\n" +
                "Stacks and Queues: ADT Stack and its operations: Algorithms and their complexity analysis, Applications of Stacks: Expression Conversion and evaluation – corresponding algorithms and complexity analysis. ADT queue, Types of Queue: Simple Queue, Circular Queue, Priority Queue; Operations on each Type of Queues: Algorithms and their analysis.\n" +
                "\n" +
                "Module-3\n" +
                "Linked List ( 6 Hrs )\n" +
                "Linked Lists: Singly linked lists: Representation in memory, Algorithms of several operations: Traversing, Searching, Insertion into, Deletion from linked list; Linked representation of Stack and Queue, Header nodes, doubly linked list: operations on it and algorithmic analysis; Circular Linked Lists: all operations their algorithms and the complexity analysis.\n" +
                "\n" +
                "Module-4\n" +
                "Searching, Sorting and Hashing ( 12 Hrs )\n" +
                "Searching, Sorting and Hashing: Linear Search and Binary Search Techniques and their complexity analysis. Objective and properties of different sorting algorithms: Selection Sort, Bubble Sort, Insertion Sort, Quick Sort, Merge Sort, Heap Sort; Performance and Comparison among all the methods, Hashing.\n" +
                "\n" +
                "Module-5\n" +
                "Trees and Graphs ( 8 Hrs )\n" +
                "Basic Tree Terminologies, Different types of Trees: Binary Tree, Threaded Binary Tree, Binary Search Tree, AVL Tree; Tree operations on each of the trees and their algorithms with complexity analysis. Applications of Binary Trees. B Tree, B+ Tree: definitions, algorithms and analysis.\n" +
                "Graph: Basic Terminologies and Representations, Graph search and traversal algorithms and complexity analysis.\n" +
                "\n" +
                "LAB\n" +
                "Able to Practice\n" +
                "1.For a given Search problem (Linear Search and Binary Search) student will able to implement it.\n" +
                "2. For a given algorithm student will able to analyze the algorithms to determine the time and computation complexity and justify the correctness.\n" +
                "3. For a given problem of Stacks, Queues and linked list student will able to implement it and analyze the same to determine the time and computation complexity.\n" +
                "4. Student will able to write an algorithm Selection Sort, Bubble Sort, Insertion Sort, Quick Sort, Merge Sort, Heap Sort and compare their performance in term of Space and Time complexity.\n" +
                "5. Student will able to implement Graph search and traversal algorithms and determine the time and computation complexity...");

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
                "Pointers, Arrays and Exception Handling: Void Pointers, Pointer to Class, Pointer to Object, Void Pointer, Arrays. The keywords try, throw and catch. Creating own Exception Classes, Exception Handling Techniques (Terminate the Program, Fix the Error and Continue, Log the Error and Continue), Stack Unwinding...");

        List<String> MathThird = Arrays.asList("Module-1\n" +
                "Successive Differentiation, Leibnitz’s Theorem. Limit, Continuity and Differentiability of function for one variable.\n" +
                "\n" +
                "Module-2\n" +
                "Limit, Continuity and Differentiability ( 8 Hrs )\n" +
                "Limit, Continuity and Differentiability of function for several variables. Partial Derivatives, Euler’s Theorem for Homogeneous functions, Total derivatives, Change of Variables. Maxima and Minima of Several Variables. Methods of Lagrange Multipliers. Taylor’s and Maclaurin’s Theorem with remainders of several variables.\n" +
                "\n" +
                "Module-3\n" +
                "Vector Calculus ( 8 Hrs )\n" +
                "Vector Calculus: Gradient, Divergence and Curl of a Vector and their Physical Interpretations, Vector Identities. Directional Derivatives. Line, Surface and Volume integrals, Application of Green’s, Stokes and Gauss Divergence Theorem (Without Proof).\n" +
                "\n" +
                "Module-4\n" +
                "First Order Ordinary Differential Equations ( 6 Hrs )\n" +
                "Exact, Linear and Bernoulli’s Equations, Euler’s Equations, Equations not of First Degree: Equations Solvable for P, Equations Solvable for Y, Equations Solvable for X and Clairaut’s Type.\n" +
                "\n" +
                "Module-5\n" +
                "Ordinary Differential Equations od Higher Orders ( 8 Hrs )\n" +
                "Ordinary Differential Equations of Higher Orders: Second Order Linear Differential Equations with Variable Coefficients, Method of Variation of Parameters, Cauchy-Euler Equation; Power Series Solutions; Legendre Polynomials, Bessel Functions of the First Kind and their properties.\n" +
                "\n" +
                "Module-6\n" +
                "Partial Differential Equations ( 6 Hrs )\n" +
                "Partial Differential Equations – First Order: First Order Partial Differential Equations, Solutions of First Order Linear and Non-Linear PDEs...");

        List<String> TWriting = Arrays.asList("Module-1\n" +
                "Introduction ( 10 Hrs )\n" +
                "Introduction: Fundamentals of Technical Writing: Need for Clear and Concise Technical Writing, Attributes of Technical Writing, Types of Technical Writing, Benefits of Technical Writing, Technical, Managerial and General Readers, Expressing versus Impressing, Correct use of Noun, Pronoun, Verb, Adjective, Adverbs, Tense and Punctuation.\n" +
                "\n" +
                "Module-2\n" +
                "Performing Technical Studies ( 10 Hrs )\n" +
                "Performing Technical Studies: Types of Technical Studies, General Methodology- Proposing a Project, Gathering Background Information, Designing Test Plans, Performing Experiments, Reporting Results.\n" +
                "Writing Strategy: Analysis of Readers, Scope of Writing, Purpose and Objective.\n" +
                "Document Options: Document Hierarchy, Report Types and Selection.\n" +
                "Criteria for Good Technical Writing: Technical Content, Presentation, Language Skills.\n" +
                "Writing Style: Elements of Style, Examples of Writing Styles, Recommended Style, Learn to Prepare Effective Illustrations\n" +
                "\n" +
                "Module-3\n" +
                "Formal Reports ( 10 Lectures )\n" +
                "The Outline and Introduction ( Outline, Title, Front Matter, Writing the Introduction ), Writing the Body ( Writing a Procedure, Describing Machines/Processes, Writing Test Results, Writing the Discussion Section ), Closure ( Conclusions, Recommendations, References, Abstract, Back Matter, Report Distribution, Saving Reports ).\n" +
                "Informal Reports: Elements of an Informal Report, Investigation Reports, Service Work, Action Letters and Proposals. Typical Memo Reports.\n" +
                "\n" +
                "Module-4\n" +
                "Review and Editing ( 10 Hrs )\n" +
                "Review and Editing: Types of Review and Edit, Review and Editing Methodology, Examples of Reviews.\n" +
                "Oral Presentations: Types of Oral Presentations, Preparation, Visual Aids, Impediments to Technical Writing, Maintaining Writing Skills, Measuring Report Results.\n" +
                "\n" +
                "BOOKS\n" +
                "A.A Guide to Technical Writing”, T. A. Rickard, Franklin Classics.                                  \n" +
                "B. Technical Writing”, S. Jayprakash, Himalaya Publishing House Pvt. Ltd.\n" +
                "C. Technical Writing”, O. N. Pandey...");

        List<String> DMath = Arrays.asList("Module-1\n" +
                "Set, Relation and Funtion ( 6 Hrs )\n" +
                "Sets, Relation and Function: Operations and Laws of Sets, Cartesian Products, Binary Relation, Partial Ordering Relation, Equivalence Relation, Image of a Set, Sum and Product of Functions, Bijective functions, Inverse and Composite Function, Size of a Set, Finite and infinite Sets, Countable and uncountable Sets, Cantor's diagonal argument and The Power Set theorem, Schroeder-Bernstein theorem.\n" +
                "\n" +
                "Module-2\n" +
                "Principal of Mathematical Induction ( 8 Hrs )\n" +
                "Principles of Mathematical Induction: The Well-Ordering Principle, Recursive definition, The Division algorithm: Prime Numbers, The Greatest Common Divisor: Euclidean Algorithm, The Fundamental Theorem of Arithmetic. Basic counting techniques-inclusion and exclusion, pigeon-hole principle, permutation and combination.\n" +
                "\n" +
                "Module-3\n" +
                "Propositional Logics ( 8 Hrs )\n" +
                "Propositional Logic: Syntax, Semantics, Validity and Satisfiability, Basic Connectives and Truth Tables, Logical Equivalence: The Laws of Logic, Logical Implication, Rules of Inference, The use of Quantifiers. Proof Techniques: Some Terminology, Proof Methods and Strategies, Forward Proof, Proof by Contradiction, Proof by Contraposition, Proof of Necessity and Sufficiency.\n" +
                "\n" +
                "Module-4\n" +
                "Algebraic Structures and Morphism ( 8 hrs )\n" +
                "Algebraic Structures and Morphism: Algebraic Structures with one Binary Operation, Semi Groups, Monoids, Groups, Congruence Relation and Quotient Structures, Free and Cyclic Monoids and Groups, Permutation Groups, Substructures, Normal Subgroups, Algebraic Structures with two Binary Operation, Rings, Integral Domain and Fields. Boolean Algebra and Boolean Ring, Identities of Boolean Algebra, Duality, Representation of Boolean Function, Disjunctive and Conjunctive Normal Form\n" +
                "\n" +
                "Module-5\n" +
                "Graph and Trees ( 10 Lectures )\n" +
                "Graphs and their properties, Degree, Connectivity, Path, Cycle, Sub Graph, Isomorphism, Eulerian and Hamiltonian Walks, Graph Coloring, Coloring maps and Planar Graphs, Coloring Vertices, Coloring Edges, List Coloring, Perfect Graph, definition properties and Example, rooted trees, trees and sorting, weighted trees and prefix codes, Biconnected component and Articulation Points, Shortest distances.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested books\n" +
                "1. Kenneth H. Rosen, Discrete Mathematics and its Applications, Tata McGraw –Hill\n" +
                "2. Discrete Mathematics, Tata McGraw -Hill\n" +
                "3. C L Liu and D P Mohapatra, Elements of Discrete Mathematics A Computer Oriented Approach, 3rd Edition by, Tata McGraw –Hill.\n" +
                "4. Susanna S. Epp, Discrete Mathematics with Applications, 4th edition, Wadsworth Publishing Co.Inc...");

        List<String> SummerIndustryInternship = Arrays.asList("Summer Industry Internship..");


        List<Semester> thirdSemesters = new ArrayList<>();
        thirdSemesters.add(new Semester("Digital Electronics", DigitalElectronics));
        thirdSemesters.add(new Semester("Data Structure and Algorithms", DSA));
        thirdSemesters.add(new Semester("Object Oriented Programming", OOPS));
        thirdSemesters.add(new Semester("Mathematics-III ( Differential Calculus )", MathThird));
        thirdSemesters.add(new Semester("Technical Writing", TWriting));
        thirdSemesters.add(new Semester("Discrete Mathematics", DMath));
        thirdSemesters.add(new Semester("Summer Industry Internship", SummerIndustryInternship));

        branches.add(new Branch("Semester 3", thirdSemesters));
        //3rd Semester End....



        //4 Semester Start...
        List<String> DBMS = Arrays.asList("Module-1\n" +
                "Database system architecture and Data Model ( 6 Hrs )\n" +
                "Database system architecture: Data Abstraction, Data Independence, Data Definition Language (DDL), Data Manipulation Language (DML).\n" +
                "Data models: Entity-relationship model, network model, relational and object oriented data models, integrity constraints, data manipulation operations.\n" +
                "\n" +
                "Module-2\n" +
                "Relational Query Language ( 10 Hr)\n" +
                "Relational query languages: Relational algebra, Tuple and domain relational calculus, SQL3, DDL and DML constructs, Open source and Commercial DBMS - MYSQL, ORACLE, DB2, SQL server\n" +
                "Relational database design: Domain and data dependency, Armstrong’s axioms, Normal forms, Dependency preservation, Lossless design.\n" +
                "Query processing and optimization: Evaluation of relational algebra expressions, Query equivalence, Join strategies, Query optimization algorithms\n" +
                "\n" +
                "Module-3\n" +
                "Storage Strategy (4 Hr )\n" +
                "Storage strategies: Indices, B-trees, hashing\n" +
                "\n" +
                "Module-4\n" +
                "Transaction Processing( 8 hrs )\n" +
                "Transaction processing: Concurrency control, ACID property, Serializability of scheduling, Locking and timestamp based schedulers, Multi-version and optimistic Concurrency Control schemes, Database recovery.\n" +
                "\n" +
                "Module-5\n" +
                "Database Security ( 6 Lectures )\n" +
                "Database Security: Authentication, Authorization and access control, DAC, MAC and RBAC models, Intrusion detection, SQL injection.\n" +
                "\n" +
                "Module-6\n" +
                "Advance Topics( 4 Hrs )\n" +
                "Advanced topics: Object oriented and object relational databases, Logical databases, Web databases, Distributed databases, Data warehousing and data mining.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested books\n" +
                "1. “Database System Concepts”, 6th Edition by Abraham Silberschatz, Henry F. Korth, S. Sudarshan, McGraw-Hill\n" +
                "2. \"Fundamentals of Database Systems”, 5th Edition by R. Elmasri and S. Navathe, Pearson Education\n" +
                "3. \"Foundations of Databases”, Reprint by Serge Abiteboul, Richard Hull, Victor Vianu, Addison-Wesley\n" +
                "4. “Principles of Database and Knowledge – Base Systems”, Vol 1 by J. D. Ullman, Computer SciencePress..");

        List<String> FLAT = Arrays.asList("Module-1\n" +
                "Introduction and Regular languages and finite automata( 10 hrs )\n" +
                "Introduction: Alphabet, languages and grammars, productions and derivation, Chomsky hierarchy of languages.\n" +
                "\n" +
                "Regular languages and finite automata: Regular expressions and languages, deterministic finite automata (DFA) and equivalence with regular expressions, nondeterministic finite automata (NFA) and equivalence with DFA, regular grammars and equivalence with finite automata, properties of regular languages, pumping lemma for regular languages, minimization of finite automata\n" +
                "Data representation: signed number representation, fixed and floating point representations, character representation. Computer arithmetic – integer addition and subtraction, ripple carry adder, carry look-ahead adder, etc. multiplication – shift-and-add, Booth multiplier, carry save multiplier, etc. Division restoring and non-restoring techniques, floating point arithmetic.\n" +
                "\n" +
                "Module-2\n" +
                "Context-free languages and pushdown automat ( 10 hrs )\n" +
                "Context-free grammars (CFG) and Contextfree languages (CFL), Chomsky and Greibach normal forms, nondeterministic pushdown automata (PDA) and equivalence with CFG, parse trees, ambiguity in CFG, pumping lemma for context-free languages, deterministic pushdown automata, closure properties of CFLs\n" +
                "\n" +
                "Module-3\n" +
                "Context Sensitive Language ( 2 Hrs )\n" +
                "Context-sensitive languages: Context-sensitive grammars (CSG) and Context-sensitive languages, linear bounded automata and equivalence with CSG\n" +
                "\n" +
                "Module-4\n" +
                "Turing Machine( 10 Hrs )\n" +
                "Turing machines: The basic model for Turing machines (TM), Turing recognizable (Recursively enumerable) and Turing-decidable (recursive) languages and their closure properties, variants of Turing machines, nondeterministic TMs and equivalence with deterministic TMs, unrestricted grammars and equivalence with Turing machines, TMs as enumerator.\n" +
                "\n" +
                "Module-5\n" +
                "Undecidability\n" +
                "Church-Turing thesis, universal Turing machine, the universal and diagonalization languages, reduction between languages and Rice’s theorem, undecidable problems about languages\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. Michael Sipser, Introduction to the Theory of Computation, PWS Publishing.\n" +
                "2. John E. Hopcroft, Rajeev Motwani and Jeffrey D. Ullman, Introduction to Automata Theory, Languages, and Computation, Pearson Education Asia.\n" +
                "3. Harry R. Lewis and Christos H. Papadimitriou, Elements of the Theory of Computation, Pearson EducationAsia.\n" +
                "4. John Martin, Introduction to Languages and the Theory of Computation, Tata McGraw Hill.\n" +
                "5. Dexter C. Kozen, Automata and Computability, Undergraduate Texts in Computer Science, Springer...");

        List<String> ML = Arrays.asList("Machine Learning\n" +
                "\n" +
                "Objectives of the course\n" +
                "\n" +
                "1. To learn the concept of how to learn patterns and concept from data.\n" +
                "\n" +
                "2. Design and analyze various machine learning algorithms and their applications in recent trends.\n" +
                "\n" +
                "3. Evaluate the various factors of machine learning to measure the performance.\n" +
                "\n" +
                "4. Understand basic of machine learning’s application in recent trend of technology.\n" +
                "\n" +
                "UNIT 1: Introduction: Basic definitions, Linear Algebra, Statistical learning theory, types of learning, hypothesis space and Inductive bias, evaluation and cross validation, Optimization.\n" +
                "\n" +
                "UNIT 2: Statistical Decision Theory, Bayesian Learning (ML, MAP, Bayes estimates, Conjugate priors), Linear Regression, Ridge Regression, Lasso, Principal Component Analysis, Partial Least Squares\n" +
                "\n" +
                "UNIT3: Linear Classification, Logistic Regression, Linear Discriminant Analysis, Quadratic Discriminant Analysis, Perceptron, Support Vector Machines + Kernels, Artificial Neural Networks + Back Propagation, Decision Trees, Bayes Optimal Classifier, Naive Bayes.\n" +
                "\n" +
                "UNIT 4: Hypothesis testing, Ensemble Methods, Bagging Adaboost Gradient Boosting, Clustering, K-means, Kmedoids, Density-based Hierarchical, Spectral .\n" +
                "\n" +
                "UNIT 5: Expectation Maximization, GMMs, Learning theory Intro to Reinforcement Learning ,Bayesian Networks.\n" +
                "\n" +
                "\n" +
                "Suggested books:\n" +
                "\n" +
                "1. Machine Learning. Tom Mitchell. First Edition, McGraw- Hill, 1997\n" +
                "\n" +
                "2. Introduction to Machine Learning Edition 2, by EthemAlpaydin\n" +
                "\n" +
                "3. J. Shavlik and T. Dietterich (Ed), Readings in Machine Learning, Morgan Kaufmann, 1990.\n" +
                "\n" +
                "4. P. Langley, Elements of Machine Learning, Morgan Kaufmann, 1995.\n" +
                "\n" +
                "5. Understanding Machine Learning. Shai Shalev-Shwartz and Shai Ben-David. Cambridge University Press. 2017. [SS-2017]\n" +
                "\n" +
                "6. The Elements of Statistical Learning. Trevor Hastie, Robert Tibshirani and Jerome Friedman...");

        List<String> COA = Arrays.asList("Module-1\n" +
                "Functional Blocks of a Computer ( 10 hrs )\n" +
                "Functional blocks of a computer: CPU, memory, input-output subsystems, control unit. Instruction set architecture of a CPU–registers, instruction execution cycle, RTL interpretation of instructions, addressing modes, instruction set. Case study – instruction sets of some common CPUs.\n" +
                "Data representation: signed number representation, fixed and floating point representations, character representation. Computer arithmetic – integer addition and subtraction, ripple carry adder, carry look-ahead adder, etc. multiplication – shift-and-add, Booth multiplier, carry save multiplier, etc. Division restoring and non-restoring techniques, floating point arithmetic.\n" +
                "\n" +
                "Module-2\n" +
                "Introduction to x86 architecture ( 14 hrs )\n" +
                "Introduction to x86 architecture. CPU control unit design: hardwired and micro- programmed design approaches, Case study – design of a simple hypothetical CPU. Memory system design: semiconductor memory technologies, memory organization.\n" +
                "Peripheral devices and their characteristics: Input-output subsystems, I/O device interface, I/O transfers–program controlled, interrupt driven and DMA, privileged and non-privileged instructions, software interrupts and exceptions. Programs and processes–role of interrupts in process state transitions, I/O device interfaces – SCII, USB.\n" +
                "\n" +
                "Module-3\n" +
                "Pipelining ( 10 Hrs )\n" +
                "Basic concepts of pipelining, throughput and speedup, pipeline hazards.\n" +
                "Parallel Processors: Introduction to parallel processors, Concurrent access to memory and cache coherency.\n" +
                "\n" +
                "Module-4\n" +
                "Memory organisation ( 6 Hrs )\n" +
                "Memory organization: Memory interleaving, concept of hierarchical memory organization, cache memory, cache size vs. Block size, mapping functions, replacement algorithms, write policies.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. Computer Organization and Design: The Hardware/Software Interface”, 5th Edition by David A. Patterson and John L. Hennessy, Elsevier.\n" +
                "2. Computer Organization and Embedded Systems”, 6th Edition by Carl Hamacher, McGraw Hill Higher Education.\n" +
                "3. Computer System Design and Architecture”, 2nd Edition by Vincent P. Heuring and Harry F. Jordan, Pearson Education...");


        List<Semester> fourthSemesters = new ArrayList<>();
        fourthSemesters.add(new Semester("Database Management System", DBMS));
        fourthSemesters.add(new Semester("Formal Language and Automata Theory", FLAT));
        fourthSemesters.add(new Semester("Machine Learning", ML));
        fourthSemesters.add(new Semester("Computer Organisation and Architecture", COA));

        branches.add(new Branch("Semester 4", fourthSemesters));
        //4th Semester End...


        //5 Semester Start....
        List<String> Microprocessor = Arrays.asList("Module-1\n" +
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
                "LED, LCD and keyboard interfacing. Stepper motor interfacing, DC Motor interfacing, sensor interfacing...");

        List<String> CD = Arrays.asList("Module-1\n" +
                "Introduction ( 6 Lectures )\n" +
                "Lexical Analysis (scanner): Regular languages, finite automata, regular expressions, from regular expressions to finite automata, scanner generator (lex, flex).\n" +
                "Phase of compilation and overview.\n" +
                "\n" +
                "Module-2\n" +
                "Syntax Analysis (Parser) ( 9 Lectures )\n" +
                "Context-free languages and grammars, push-down automata, LL(1) gram-mars and top-down parsing, operator grammars, LR(O), SLR(1), LR(1), LALR(1) grammars and bottom-up parsing, ambiguity and LR parsing, LALR(1) parser generator (yacc, bison)\n" +
                "\n" +
                "Module-3\n" +
                "Symantic Analysis and Symbol Table ( 10 Lectures )\n" +
                "Attribute grammars, syntax directed definition, evaluation and flow of attribute in a syntax tree.\n" +
                "Symbol Table: Its structure, symbol attributes and management. Run-time environment: Procedure activation, parameter passing, value return, memory allocation, and scope.\n" +
                "\n" +
                "Module-4\n" +
                "Code Generation and Architecture Improvement ( 10 Lectures )\n" +
                "Intermediate Code Generation: Translation of different language features, different types of intermediate forms.\n" +
                "Code Improvement (optimization) Analysis: control-flow, data-flow dependence etc.; Code improvement local optimization, global optimization, loop optimization, peep-hole optimization etc.\n" +
                "Architecture dependent code improvement: instruction scheduling (for pipeline), loop optimization (for cache memory) etc. Register allocation and target code generation.\n" +
                "\n" +
                "Module-5\n" +
                "Advanced Topics ( 5 Lectures )\n" +
                "Type systems, data abstraction, compilation of Object Oriented features and non-imperative programming languages.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "CompilersPrinciples. Techniques.AndToolsbyAlfredV. Aho.RaviSethiJefferyD. Ullman. PearsonEducation.\n" +
                "2. Compiler Design by Santanu Chattopadhyay. PHI\n" +
                "3. Modern Compiler Design by Dick Grune . E. Bal. Ceriel J. H. Jacobs. And Koen G. Langendoen Viley Dreamtech...");

        List<String> OS = Arrays.asList("Module-1\n" +
                "Introduction ( 4Hrs )\n" +
                "Concept of Operating Systems, Generations of Operating systems, Types of Operating Systems, OS Services, System Calls, Structure of an OS-Layered, Monolithic, Microkernel Operating Systems, Concept of Virtual Machine. Case study on UNIX and WINDOWS Operating System.\n" +
                "\n" +
                "Module-2\n" +
                "Processes ( 10 Hrs )\n" +
                "Definition, Process Relationship, Different states of a Process, Process State transitions, Process Control Block (PCB), Context switching.\n" +
                "\n" +
                "Thread: Definition, Various states, Benefits of threads, Types of threads, Concept of multithreads.\n" +
                "\n" +
                "Process Scheduling: Foundation and Scheduling objectives, Types of Schedulers, Scheduling criteria: CPU utilization, Throughput, Turnaround Time, Waiting Time, Response Time; Scheduling algorithms: Pre-emptive and Non pre-emptive, FCFS, SJF, RR; Multiprocessor scheduling: Real Time scheduling: RM and EDF.\n" +
                "\n" +
                "Module-3\n" +
                "Inter- Process Communication ( 6 Hrs )\n" +
                "Critical Section, Race Conditions, Mutual Exclusion, Hardware Solution, Strict Alternation, Peterson’s Solution, The Producer - Consumer Problem, Semaphores, Event Counters, Monitors, Message Passing, Shared Memory, Classical IPC Problems: Reader’s & Writer Problem, Dinning Philosopher Problem etc.\n" +
                "\n" +
                "Module-4\n" +
                "Deadlocks ( 4 Hrs )\n" +
                "Definition, Necessary and sufficient conditions for Deadlock, Deadlock Prevention, and Deadlock Avoidance: Banker’s algorithm, Deadlock detection and Recovery.\n" +
                "\n" +
                "Module-5\n" +
                "Memory Management ( 9 Hrs )\n" +
                "Memory Management: Basic concept, Logical and Physical address map, Memory allocation: Contiguous Memory allocation – Fixed and variable partition–Internal and External fragmentation and Compaction; Paging and Segmentation: Principle of operation – Page allocation – Hardware support for paging, Protection and sharing, Advantages and Disadvantages of paging and segmentation.\n" +
                "\n" +
                "Virtual Memory: Basics of Virtual Memory – Hardware and control structures – Locality of reference, Page fault , Working Set , Dirty page/Dirty bit – Demand paging, Page Replacement algorithms: Optimal, First in First Out (FIFO), Second Chance (SC), Not recently used (NRU) and Least Recently used (LRU).\n" +
                "\n" +
                "Module-6\n" +
                "File Management ( 9 hrs )\n" +
                "File Management: Concept of File, Access methods, File types, File operation, Directory structure, File System structure, Allocation methods (contiguous, linked, indexed), Free-space management (bit vector, linked list, grouping), directory implementation (linear list, hash table), efficiency and performance.\n" +
                "\n" +
                "Disk Management: Disk structure, Disk scheduling - FCFS, SSTF, SCAN, C-SCAN, Disk reliability, Disk formatting, Boot-block, Bad blocks I/O Hardware: I/O devices, Device controllers, Direct memory access, Principles of I/O Software: Goals of Interrupt handlers, Device drivers, Device independent I/O software, Secondary-Storage Structure.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. Operating System Concepts Essentials, 9th Edition by Avi Silberschatz, Peter Galvin, Greg Gagne, Wiley Asia Student Edition.\n" +
                "2. Operating Systems: Internals and Design Principles, 5th Edition, William Stallings, Prentice Hall of India.\n" +
                "3. Operating Systems: Design and Implementation 3rd Edition, 3rd Edition, Andrew S. Tanenbaum\n" +
                "4. Modern Operating Systems, 4th Edition, Andrew S. Tanenbaum..");

        List<String> DAA = Arrays.asList("Module-1\n" +
                "Introduction ( 10 Hrs )\n" +
                "Introduction: Characteristics of algorithm. Analysis of algorithm: Asymptotic analysis of complexity bounds – best, average and worst-case behavior; Performance measurements of Algorithm, Time and space trade-offs, Analysis of recursive algorithms through recurrence relations: Substitution method, Recursion tree method and Masters’ theorem.\n" +
                "\n" +
                "Module-2\n" +
                "Fundamental Algorithmic Strategies ( 10 Hrs )\n" +
                "Brute-Force, Greedy, Dynamic Programming, Branch- and-Bound and Backtracking methodologies for the design of algorithms; Illustrations of these techniques for Problem-Solving , Bin Packing, Knap Sack TSP. Heuristics – characteristics and their application domains.\n" +
                "\n" +
                "Module-3\n" +
                "Graph and Trees Algorithms ( 8 Hrs )\n" +
                "Representational issues in graphs, Traversal algorithms: Depth First Search (DFS) and Breadth First Search (BFS); Shortest path algorithms: Bellman-Ford algorithm, Dijkstra’s algorithm & Analysis of Dijkstra’s algorithm using heaps, Floyd-Warshall’s all pairs shortest path algorithm. Transitive closure, Topological sorting, Network Flow Algorithm, Connected Component.\n" +
                "\n" +
                "Module-4\n" +
                "Tractable and Intractable Problems ( 5 Hrs )\n" +
                "Computability of Algorithms, Computability classes – P, NP, NP-complete and NP-hard. Cook’s theorem, Standard NP-complete problems and Reduction techniques. Approximation algorithms, Randomized algorithms.\n" +
                "\n" +
                "Module-5\n" +
                "Advanced Topic ( 4 Lectures )\n" +
                "Approximation algorithms, Randomized algorithms, Class of problems beyond NP – P SPACE.\n" +
                "\n" +
                "BOOKS\n" +
                "Suggested Books\n" +
                "1. Algorithm Design, 1st Edition, Jon Kleinberg and Éva Tardos, Pearson.\n" +
                "2. Algorithm Design: Foundations, Analysis, and Internet Examples, Second Edition, Michael T Goodrich and Roberto Tamassia, Wiley.\n" +
                "3. Algorithms—A Creative Approach, 3RD Edition, UdiManber, AddisonWesley, Reading, MA...");

        List<String> PSD = Arrays.asList("Module-1\n" +
                "Communication Skills ( 10 Hrs )\n" +
                "Public speaking, Group discussion, Gestures and body language & professional presentation skills.\n" +
                "\n" +
                "Module-2\n" +
                "Interpersonal skills ( 10 hrs )\n" +
                "Group dynamics, Negotiation skills, Leadership, Emotional intelligence.\n" +
                "\n" +
                "Module-3\n" +
                "Employability and Corporate Skills ( 10 hrs )\n" +
                "Time management and effective planning, Stress management, People skills, Team work, development of leadership qualities, Decision making and Negotiation skills, Positive attitude, Self-motivation, Professional ethics, Business etiquettes, balancing board room.\n" +
                "\n" +
                "Module-4\n" +
                "Business writing skills ( 10 Hrs )\n" +
                "Resume Writing. Interview Skills, Technical Presentation, Guest Lecture, Professional Ethics, Project Management, Entrepreneurship.\n" +
                "\n" +
                "Suggested Books\n" +
                "“Personality Development and Soft Skills”, Barun Mitra, Oxford University Press.                                  \n" +
                "B. “Managing Soft Skills for Personality Development”, B.N. Ghosh, McGraw Hill.\n" +
                "C. “Communication Skills and Soft Skills: An Integrated Approach”, E. Suresh Kumar, Pearson...");

        List<String> ConstitutionIndia = Arrays.asList("The Constitution of India is the supreme law of India. Parliament of India cannot make any law which violates the Fundamental Rights enumerated under the Part III of the Constitution. The Parliament of India has been empowered to amend the Constitution under Article 368, however, it cannot use this power to change the “basic structure” of the constitution, which has been ruled and explained by the Supreme Court of India in its historical judgments. The Constitution of India reflects the idea of “Constitutionalism” – a modern and progressive concept historically developed by the thinkers of “liberalism” – an ideology which has been recognized as one of the most popular political ideology and result of historical struggles against arbitrary use of sovereign power by state. The historic revolutions in France, England, America and particularly European Renaissance and Reformation movement have resulted into progressive legal reforms in the form of “constitutionalism” in many countries. The Constitution of India was made by borrowing models and principles from many countries including United Kingdom and America.\n" +
                "\n" +
                "The Constitution of India is not only a legal document but it also reflects social, political and economic perspectives of the Indian Society. It reflects India’s legacy of “diversity”. It has been said that Indian constitution reflects ideals of its freedom movement, however, few critics have argued that it does not truly incorporate our own ancient legal heritage and cultural values. No law can be “static” and therefore the Constitution of India has also been amended more than one hundred times. These amendments reflect political, social and economic developments since the year 1950. The Indian judiciary and particularly the Supreme Court of India has played an historic role as the guardian of people. It has been protecting not only basic ideals of the Constitution but also strengthened the same through progressive interpretations of the text of the Constitution. The judicial activism of the Supreme Court of India and its historic contributions has been recognized throughout the world and it gradually made it “as one of the strongest court in the world”...");

        List<String> ST = Arrays.asList("Software Training..");

        List<String> Seminar = Arrays.asList("Seminar");

        List<Semester> fifthSemesters = new ArrayList<>();
        fifthSemesters.add(new Semester("Microprocessor", Microprocessor));
        fifthSemesters.add(new Semester("Compiler Design", CD));
        fifthSemesters.add(new Semester("Operating System", OS));
        fifthSemesters.add(new Semester("Design Analysis of Algorithms", DAA));
        fifthSemesters.add(new Semester("Professional Skill Development", PSD));
        fifthSemesters.add(new Semester("Constitution of India / Essence of Indian Knowledge Traditional", ConstitutionIndia));
        fifthSemesters.add(new Semester("Software Training", ST));
        fifthSemesters.add(new Semester("Seminar", Seminar));

        branches.add(new Branch("Semester 5", fifthSemesters));
        ////5th Semester End...



        //6 Semester Start....
        List<String> CN = Arrays.asList("Objectives of the course \n" +
                "\n" +
                " To develop an understanding of modern network architectures from a design and performance perspective. \n" +
                "\n" +
                " To introduce the student to the major concepts involved in wide-area networks (WANs), local area networks (LANs) and Wireless LANs (WLANs). \n" +
                "\n" +
                " To provide an opportunity to do network programming \n" +
                "\n" +
                " To provide a WLAN measurement ideas. \n" +
                "\n" +
                "Module 1: (Lecture 8) Data communication Components: Representation of data and its flow Networks , Various Connection Topology, Protocols and Standards, OSI model, Transmission Media, LAN: Wired LAN, Wireless LANs, Connecting LAN and Virtual LAN, Techniques for Bandwidth utilization: Multiplexing - Frequency division, Time division and Wave division, Concepts on spread spectrum.\n" +
                "\n" +
                " Module 2: (Lecture 8) Data Link Layer and Medium Access Sub Layer: Error Detection and Error Correction - Fundamentals, Block coding, Hamming Distance, CRC; Flow Control and Error control protocols - Stop and Wait, Go back – N ARQ, Selective Repeat ARQ, Sliding Window, Piggybacking, Random Access, Multiple access protocols -Pure ALOHA, Slotted ALOHA, CSMA/CD,CDMA/CA \n" +
                "\n" +
                "Module 3: (Lecture 8) Network Layer: Switching, Logical addressing – IPV4, IPV6; Address mapping – ARP, RARP, BOOTP and DHCP–Delivery, Forwarding and Unicast Routing protocols. \n" +
                "\n" +
                "Module 4: (Lecture 8) Transport Layer: Process to Process Communication, User Datagram Protocol (UDP), Transmission Control Protocol (TCP), SCTP Congestion Control; Quality of Service, QoS improving techniques: Leaky Bucket and Token Bucket algorithm. Module 5: Lecture 8 Application Layer: Domain Name Space (DNS), DDNS, TELNET, EMAIL, File Transfer Protocol (FTP), WWW, HTTP, SNMP, Bluetooth, Firewalls, Basic concepts of Cryptography. \n" +
                "\n" +
                "Suggested books \n" +
                "\n" +
                "1. Data Communication and Networking, 4th Edition, Behrouz A. Forouzan, McGraw- Hill. \n" +
                "\n" +
                "2. Data and Computer Communication, 8th Edition, William Stallings, Pearson Prentice Hall India. \n" +
                "\n" +
                "Suggested reference books \n" +
                "\n" +
                "1. Computer Networks, 8th Edition, Andrew S. Tanenbaum, Pearson New International Edition. \n" +
                "\n" +
                "2. Internetworking with TCP/IP, Volume 1, 6th Edition Douglas Comer, Prentice Hall of India. \n" +
                "\n" +
                "3. TCP/IP Illustrated, Volume 1, W. Richard Stevens, Addison-Wesley, United States of America. \n" +
                "\n" +
                "Course Outcomes \n" +
                "\n" +
                "1. Explain the functions of the different layer of the OSI Protocol. \n" +
                "\n" +
                "2. Draw the functional block diagram of wide-area networks (WANs), local area networks (LANs) and Wireless LANs (WLANs) describe the function of each block. \n" +
                "\n" +
                "3. For a given requirement (small scale) of wide-area networks (WANs), local area networks (LANs) and Wireless LANs (WLANs) design it based on the market available component \n" +
                "\n" +
                "4. For a given problem related TCP/IP protocol developed the network programming. \n" +
                "\n" +
                "5. Configure DNS DDNS, TELNET, EMAIL, File Transfer Protocol (FTP), WWW, HTTP, SNMP, Bluetooth, Firewalls using open source available software and tools. ...");

        List<String> SE = Arrays.asList("Module I (Lectures: 8) Introduction: What is Software Engineering and its history, software crisis, Evolution of a Programming System Product, Characteristics of Software, Brooks’ No Silver Bullet, and Software Myths, Software Development Life Cycles: Software Development Process, The Code-and-Fix model, The Waterfall model, The Evolutionary Model, The Incremental Implementation, Prototyping, The Spiral Model, Software Reuse, Critical Comparisons of SDLC models, An Introduction to Non-Traditional Software Development Process: Rational Unified Process, Rapid Application Development, Agile Development Process. \n" +
                "\n" +
                "Module II (Lectures: 8) Requirements: Importance of Requirement Analysis, User Needs, Software Features and Software Requirements, Classes of User Requirements: Enduring and Volatile, Sub phases of Requirement Analysis, Functional and Nonfunctional requirements, Barriers to Eliciting User requirements, The software requirements document and SRS standards, Requirements Engineering, Case Study of SRS for a Real Time System. Tools for Requirements Gathering: Document Flow Chart, Decision Table, Decision Tree, Introduction to nontraditional Requirements. \n" +
                "\n" +
                "Module III (Lectures: 8) Software Design: Goals of good software design, Design strategies and methodologies, Data oriented software design, Structured Design: Structure chart, Coupling, Cohesion, Modular structure, Packaging, Object oriented design, Top-down and bottom-up approach, Design patterns, Structured Analysis: DFD, Data Dictionary, Software Measurement and Metrics: Various Size Oriented Measures: Halstead's software science, Function Point (FP) based measures, Cyclomatic Complexity Measures: Control flow graphs. Development: Selecting a language, Coding guidelines, Writing code, Code documentation. \n" +
                "\n" +
                "Module IV (Lectures: 7) Software Testing: Testing process, Design of test cases, Functional Testing: Boundary value analysis, Equivalence class testing, Decision table testing, Cause effect graphing, Structural testing, Path testing, Data flow and mutation testing, Unit testing, Integration and system testing, Debugging, Alpha & beta testing, testing tools & standards. \n" +
                "\n" +
                "Module V (Lectures: 5) Software Maintenance: Management of maintenance, Maintenance process, Maintenance models, Regression testing, Reverse engineering, Software reengineering, Configuration management, documentation. \n" +
                "\n" +
                "Text Book: \n" +
                "\n" +
                "1. Software Engineering: A Practitioner's Approach, R. S. Pressman, McGraw Hill \n" +
                "\n" +
                "2. Fundamental of Software Engg. By Rajib Mall 4th edition PHI \n" +
                "\n" +
                "Reference Book: \n" +
                "\n" +
                "1. Zero Defect Software, G. G. Schulmeyer, McGraw-Hill \n" +
                "\n" +
                "2. Object Oriented Modeling and Design, J. Rumbaugh, Prentice Hall \n" +
                "\n" +
                "3. Software Engineering, K.K. Aggarwal, Yogesh Singh, New Age International Publishers ...");

        List<String> PROGRAMELECTIVEFirst = Arrays.asList("PROGRAM ELECTIVE- I");

        List<String> PROGRAMELECTIVESecond = Arrays.asList("PROGRAM ELECTIVE- II");

        List<String> PElectiveFirstLab = Arrays.asList("PROFESSIONAL ELECTIVE LAB-I..");

        List<String> MOOC = Arrays.asList("MOOCS / SWAYAM / NPTEL (COURSES - 2)..");

        List<String> GraduateEmp = Arrays.asList("GRADUATE EMPLOYABILITY SKILLS AND COMPETITIVE COURSES (GATE, IES, ETC.)..");

        List<String> PROJECTFirst = Arrays.asList("PROJECT-I...");


        List<Semester> sixthSemesters = new ArrayList<>();
        sixthSemesters.add(new Semester("COMPUTER NETWORKS", CN));
        sixthSemesters.add(new Semester("SOFTWARE ENGINEERING", SE));
        sixthSemesters.add(new Semester("PROGRAM ELECTIVE- I", PROGRAMELECTIVEFirst));
        sixthSemesters.add(new Semester("PROGRAM ELECTIVE- II", PROGRAMELECTIVESecond));
        sixthSemesters.add(new Semester("PROFESSIONAL ELECTIVE LAB-I", PElectiveFirstLab));
        sixthSemesters.add(new Semester("MOOCS / SWAYAM / NPTEL (COURSES - 2)", MOOC));
        sixthSemesters.add(new Semester("GRADUATE EMPLOYABILITY SKILLS AND COMPETITIVE COURSES (GATE, IES, ETC.)", GraduateEmp));
        sixthSemesters.add(new Semester("PROJECT-I", PROJECTFirst));

        branches.add(new Branch("Semester 6", sixthSemesters));
        //6 Semester End...



        //7 Semester Start...
        List<String> Biology = Arrays.asList("Module 1: Introduction Lecture: 2 hrs.\n" +
                "\n" +
                " Purpose: To convey that Biology is as important a scientific discipline as Mathematics, Physics and Chemistry. Bring out the fundamental differences between science and engineering by drawing a comparison between eye and camera, Bird flying and aircraft. Mention the most exciting aspect of biology as an independent scientific discipline. Why we need to study biology? Discuss how biological observations of 18th Century that lead to major discoveries. Examples from Brownian motion and the origin of thermodynamics by referring to the original observation of Robert Brown and Julius Mayor. These examples will highlight the fundamental importance of observations in any scientific inquiry. \n" +
                "\n" +
                "Module 2: Classification Lecture: 3 hrs. \n" +
                "\n" +
                "Purpose: To convey that classification per se is not what biology is all about. The underlying criterion, such as morphological, biochemical or ecological be highlighted. Hierarchy of life forms at phenomenological level. A common thread weaves this hierarchy Classification. Discuss classification based on (a) cellularity- Unicellular or multicellular (b) ultrastructure- prokaryotes or eucaryotes. (c) energy and Carbon utilisation -Autotrophs, heterotrophs, lithotropes (d) Ammonia excretion – aminotelic, uricoteliec, ureotelic (e) Habitata- acquatic or terrestrial (f) Molecular taxonomy- three major kingdoms of life. A given organism can come under different category based on classification. Model organisms for the study of biology come from different groups. E.coli, S.cerevisiae, D. Melanogaster, C. elegance, A. Thaliana, M. musculus. \n" +
                "\n" +
                "Module 3: Genetics Lecture: 4 hrs. \n" +
                "\n" +
                "Purpose: To convey that “Genetics is to biology what Newton’s laws are to Physical Sciences” Mendel’s laws, Concept of segregation and independent assortment. Concept of allele. Gene mapping, Gene interaction, Epistasis. Meiosis and Mitosis be taught as a part of genetics. Emphasis to be give not to the mechanics of cell division nor the phases but how genetic material passes from parent to offspring. Concepts of recessiveness and dominance. Concept of mapping of phenotype to genes. Discuss about the single gene disorders in humans. Discuss the concept of complementation using human genetics. \n" +
                "\n" +
                "Module 4: Biomolecules Lecture: 4 hrs.\n" +
                "\n" +
                " Purpose: To convey that all forms of life has the same building blocks and yet the manifestations are as diverse as one can imagine. Molecules of life. In this context discuss monomeric units and polymeric structures. Discuss about sugars, starch and cellulose. Amino acids and proteins. Nucleotides and DNA/RNA. Two carbon units and lipids. \n" +
                "\n" +
                "Module 5: Enzymes Lecture: 4 hrs. \n" +
                "\n" +
                "Purpose: To convey that without catalysis life would not have existed on earth Enzymology: How to monitor enzyme catalysed reactions. How does an enzyme catalyse reactions? Enzyme classification. Mechanism of enzyme action. Discuss at least two examples. Enzyme kinetics and kinetic parameters. Why should we know these parameters to understand biology? RNA catalysis. \n" +
                "\n" +
                "Module 6: Information Transfer Lecture: 4 hrs. \n" +
                "\n" +
                "Purpose: The molecular basis of coding and decoding genetic information is universal Molecular basis of information transfer. DNA as a genetic material. Hierarchy of DNA structure- from single stranded to double helix to nucleosomes. Concept of genetic code. Universality and degeneracy of genetic code. Define gene in terms of complementation and recombination. \n" +
                "\n" +
                "Module 7: Macromolecular analysis Lecture: 5 hrs.\n" +
                "\n" +
                " Purpose: How to analyse biological processes at the reductionist level Proteins- structure and function. Hierarch in protein structure. Primary secondary, tertiary and quaternary structure. Proteins as enzymes, transporters, receptors and structural elements. \n" +
                "\n" +
                "Module 8: Metabolism Lecture: 4 hrs. \n" +
                "\n" +
                "Purpose: The fundamental principles of energy transactions are the same in physical and biological world. Thermodynamics as applied to biological systems. Exothermic and endothermic versus endergonic and exergoinc reactions. Concept of Keqand its relation to standard free energy. Spontaneity. ATP as an energy currency. This should include the breakdown of glucose to CO2 + H2O (Glycolysis and Krebs cycle) and synthesis of glucose from CO2 and H2O (Photosynthesis). Energy yielding and energy consuming reactions. Concept of Energy charge. \n" +
                "\n" +
                "Module 9: Microbiology Lecture: 3 hrs. \n" +
                "\n" +
                "Purpose: Concept of single celled organisms. Concept of species and strains. Identification and classification of microorganisms. Microscopy. Ecological aspects of single celled organisms. Sterilization and media compositions. Growth kinetics. \n" +
                "\n" +
                "Suggested Reference Books: \n" +
                "\n" +
                "1. Biology: A global approach: Campbell, N. A.; Reece, J. B.; Urry, Lisa; Cain, M, L.; Wasserman, S. A.; Minorsky, P. V.; Jackson, R. B. Pearson Education Ltd\n" +
                "\n" +
                "2. Outlines of Biochemistry, Conn, E.E; Stumpf, P.K; Bruening, G; Doi, R.H. John Wiley and Sons \n" +
                "\n" +
                "3. Principles of Biochemistry (V Edition), By Nelson, D. L.; and Cox, M. M.W.H. Freeman and Company \n" +
                "\n" +
                "4. Molecular Genetics (Second edition), Stent, G. S.; and Calender, R. W.H. Freeman and company, Distributed by Satish Kumar Jain for CBS Publisher \n" +
                "\n" +
                "5. Microbiology, Prescott, L.M J.P. Harley and C.A. Klein 1995. 2nd edition Wm, C. Brown Publishers \n" +
                "\n" +
                "Course Outcomes \n" +
                "\n" +
                "After studying the course, the student will be able to: \n" +
                "\n" +
                "1. Describe how biological observations of 18th Century that lead to major discoveries.\n" +
                "\n" +
                "2. Convey that classification per seis not what biology is all about but highlight the underlying criteria, such as morphological, biochemical and ecological \n" +
                "\n" +
                "3. Highlight the concepts of recessiveness and dominance during the passage of genetic material from parent to offspring\n" +
                "\n" +
                " 4. Convey that all forms of life have the same building blocks and yet the manifestations are as diverse as one can imagine \n" +
                "\n" +
                "5. Classify enzymes and distinguish between different mechanisms of enzyme action. \n" +
                "\n" +
                "6. Identify DNA as a genetic material in the molecular basis of information transfer. \n" +
                "\n" +
                "7. Analyse biological processes at the reductionistic level\n" +
                "\n" +
                "8. Apply thermodynamic principles to biological systems. \n" +
                "\n" +
                "9. Identify and classify microorganisms. ...");

        List<String> IP = Arrays.asList("Induction program (mandatory) ~\n" +
                "\n" +
                "Induction program for students to be offered right at the start of the first year.\n" +
                "\n" +
                "3 weeks duration \n" +
                "\n" +
                "Physical activity \n" +
                "\n" +
                "Creative Arts \n" +
                "\n" +
                " Universal Human Values \n" +
                "\n" +
                " Literary \n" +
                "\n" +
                "Proficiency Modules \n" +
                "\n" +
                "Lectures by Eminent People \n" +
                "\n" +
                " Visits to local Areas \n" +
                "\n" +
                " Familiarization to Dept./Branch &Innovations...");

        List<String> OElectiveF = Arrays.asList("REAL TIME SYSTEMS\n" +
                "MOBILE AND WIRELESS COMPUTING\n" +
                "CRYPTOGRAPHY AND NETWORK SECURITY");

        List<String> OElectiveS = Arrays.asList("REAL TIME SYSTEMS\n" +
                "MOBILE AND WIRELESS COMPUTING\n" +
                "CRYPTOGRAPHY AND NETWORK SECURITY");

        List<String> PElectiveT = Arrays.asList("REAL TIME SYSTEMS\n" +
                "MOBILE AND WIRELESS COMPUTING\n" +
                "CRYPTOGRAPHY AND NETWORK SECURITY");

        List<String> PlElectiveLABT = Arrays.asList("PROFESSIONAL ELECTIVE LAB -II..");

        List<String> SummerEntrepreneurThree = Arrays.asList("SUMMER ENTREPRENEURSHIP -III...");

        List<String> ProjectFirst = Arrays.asList("PROJECT -I.");

        List<Semester> seventhSemesters = new ArrayList<>();
        seventhSemesters.add(new Semester("BIOLOGY FOR ENGINEERS", Biology));
        seventhSemesters.add(new Semester("INDUCTION PROGRAM", IP));
        seventhSemesters.add(new Semester("OPEN ELECTIVE-I", OElectiveF));
        seventhSemesters.add(new Semester("OPEN ELECTIVE-II", OElectiveS));
        seventhSemesters.add(new Semester("PROGRAM ELECTIVE -III", PElectiveT));
        seventhSemesters.add(new Semester("PROFESSIONAL ELECTIVE LAB -II", PlElectiveLABT));
        seventhSemesters.add(new Semester("SUMMER ENTREPRENEURSHIP -III", SummerEntrepreneurThree));
        seventhSemesters.add(new Semester("PROJECT -I", ProjectFirst));

        branches.add(new Branch("Semester 7", seventhSemesters));
        //7Semester End...

        //8 Semester Start...
        List<String> OEThree = Arrays.asList("CYBER SECURITY COMMON PAPER\n" +
                "COMPUTER GRAPHICS\n" +
                "BITCOIN AND CRYPTO CURRENCIES\n" +
                "CLOUD COMPUTING\n" +
                "PROBABILITY AND STATISTICAL INFERENCE\n" +
                "SIMULATION AND MODELLING");

        List<String> OEFour = Arrays.asList("CYBER SECURITY COMMON PAPER\n" +
                "COMPUTER GRAPHICS\n" +
                "BITCOIN AND CRYPTO CURRENCIES\n" +
                "CLOUD COMPUTING\n" +
                "PROBABILITY AND STATISTICAL INFERENCE\n" +
                "SIMULATION AND MODELLING");

        List<String> PEFour = Arrays.asList("NATURAL LANGUAGE PROCESSING\n" +
                "BIOINFORMATICS\n" +
                "ROBOTICS AND ROBOT APPLICATION\n" +
                "ARTIFICIAL INTELLIGENCE\n" +
                "MANAGEMENT INFORMATION SYSTEM");

        List<String> PEFive = Arrays.asList("NATURAL LANGUAGE PROCESSING\n" +
                "BIOINFORMATICS\n" +
                "ROBOTICS AND ROBOT APPLICATION\n" +
                "ARTIFICIAL INTELLIGENCE\n" +
                "MANAGEMENT INFORMATION SYSTEM");

        List<String> ProjectTwo = Arrays.asList("PROJECT-II..");

        List<Semester> eightSemesters = new ArrayList<>();
        eightSemesters.add(new Semester("OPEN ELECTIVE-III", OEThree));
        eightSemesters.add(new Semester("OPEN ELECTIVE-IV", OEFour));
        eightSemesters.add(new Semester("PROGRAM ELECTIVE-IV", PEFour));
        eightSemesters.add(new Semester("PROGRAM ELECTIVE-V", PEFive));
        eightSemesters.add(new Semester("PROJECT-II", ProjectTwo));

        branches.add(new Branch("Semester 8", eightSemesters));






        return branches;
    }
}


