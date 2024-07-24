package com.example.beuengineers.Syllabus;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beuengineers.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BranchAdapter branchAdapter;
    List<Branch> branchList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ie);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        branchList = getBranches();
        branchAdapter = new BranchAdapter(branchList, this);
        recyclerView.setAdapter(branchAdapter);
    }

    private List<Branch> getBranches() {
        List<Branch> branches = new ArrayList<>();

        //1 Semester
        List<String> Chemistry = Arrays.asList("Chemistry\n" +
                " L:3 t:1 p:3 credit 5.5 \n" +
                "\n" +
                "Module 1: atomic and molecular structure (10 lectures) \n" +
                "\n" +
                "Failure of classical newtonian and maxwell wave mechanics to explain properties of particles at atomic and sub-atomic level; electromagnetic radiation, dual nature of electron and electromagnetic radiation, planks theory, photoelectric effect and heisenberg uncertainty principle. Failure of earlier theories to explain certain properties of molecules like paramagnetic properties. Principles for combination of atomic orbitals to form molecular orbitals. Formation of homo and hetero diatomic molecules and plots of energy level diagram of molecular orbitals. Coordination numbers and geometries, isomerism in transitional metal compounds, crystal field theory and the energy level diagrams for transition metal ions and their magnetic properties. \n" +
                "\n" +
                "Module 2: spectroscopic techniques and applications (8 lectures) \n" +
                "\n" +
                "Principles of vibrational and rotational spectroscopy and selection rules for application in diatomic molecules. Elementary idea of electronic spectroscopy. Uv-vis spectroscopy with related rules and its applications. Fluorescence and its applications in medicine. Basic principle of nuclear magnetic resonance and its application. Basics of magnetic resonance imaging. \n" +
                "\n" +
                "Module 3: intermolecular forces and properties of gases (4 lectures) \n" +
                "\n" +
                "Ionic, dipolar and van der waals interactions. Equations of state of ideal and real gases, deviation from ideal behaviour. Vander waal gas equation. \n" +
                "\n" +
                "Module 4: use of free energy in chemical equilibria and water chemistry (8 lectures) \n" +
                "\n" +
                "Thermodynamic functions: energy, enthalpy entropy and free energy. Equations to interrelate thermodynamic properties. Free energy, emf. And cell potentials, the nernst equation and applications. Corrosion. Use of free energy considerations in metallurgy through ellingham diagrams. Solubility equilibria. \n" +
                "\n" +
                "Water chemistry, hard and soft water. Parameters of quality of water to be used in different industries as for drinking water. Calculation of hardness of water in all units. Estimation of hardness using edta and alkalinity method. Removal of hardness by soda lime and ion exchange method including zeolite method \n" +
                "\n" +
                "Module 5: periodic properties (4 lectures) \n" +
                "\n" +
                "Effective nuclear charge, penetration of orbitals, variations of s, p, d and f orbital energies of atoms in the periodic table, electronic configurations, atomic and ionic sizes, ionization energies, electron affinity and \n" +
                "\n" +
                "Electronegativity, polarizability, acid, base, principle of hsab theory, oxidation states, hybridization and molecular geometries. \n" +
                "\n" +
                "Module 6: stereochemistry (4 lectures) \n" +
                "\n" +
                "Representations of 3-d structures, structural isomers and stereoisomers, configurations and symmetry and chirality, enantiomers, diastereomers, optical activity, absolute configurations and conformational analysis. \n" +
                "\n" +
                "Module 7: organic reactions and synthesis of a drug molecule (4 lectures) \n" +
                "\n" +
                "Introduction to intermediates and reactions involving substitution, addition, elimination, oxidation- reduction, diels elder cyclization and epoxide ring openings reactions. Synthesis of a commonly used drug molecule like aspirin. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Suggested text books: \n" +
                "~ university chemistry, by b. H. Mahan \n" +
                "~ chemistry: principles and applications, by m. J. Sienko and r. A. Plane \n" +
                "~ fundamentals of molecular spectroscopy, by c. N. Banwell \n" +
                "~ engineering chemistry (nptel web-book), by b. L. Tembe, kamaluddin and m. S. Krishnan \n" +
                "~ physical chemistry, by p. W. Atkins \n" +
                "~ organic chemistry: structure and function by k. P. C. Volhardt and n. E. Schore, 5th edition \n" +
                "~ http://bcs.Whfreeman.Com/vollhardtschore5e/default.Asp \n" +
                "\n" +
                "Chemistry laboratory \n" +
                "Choice of 10-12 experiments from the following \n" +
                "\n" +
                "~ determination of surface tension and viscosity \n" +
                "~ thin layer chromatography \n" +
                "~ ion exchange column for removal of hardness of water \n" +
                "~ determination of chloride content of water \n" +
                "~ colligative properties using freezing point depression \n" +
                "~ determination of the rate constant of a reaction \n" +
                "~ determination of cell constant and conductance of solutions \n" +
                "~ potentiometry - determination of redox potentials and emfs \n" +
                "~ synthesis of a polymer/drug \n" +
                "~ saponification/acid value of an oil \n" +
                "~ chemical analysis of a salt \n" +
                "~ lattice structures and packing of spheres \n" +
                "~ models of potential energy surfaces \n" +
                "~ chemical oscillations- iodine clock reaction \n" +
                "~ determination of the partition coefficient of a substance between two immiscible liquids \n" +
                "~ adsorption of acetic acid by charcoal \n" +
                "~ use of the capillary viscosimeters to the demonstrate of the isoelectric point as the ph of minimum viscosity for gelatin sols and/or coagulation of the white part of egg...");

        List<String> MathFirst = Arrays.asList("Mathematics –I\n" +
                "\n" +
                " (calculus and differential equations)\n" +
                "\n" +
                " L:3 t:1 p:0 credit:4\n" +
                "\n" +
                " Contents\n" +
                "\n" +
                " \n" +
                "\n" +
                "Module 1:\n" +
                "\n" +
                " Calculus (8 lectures)\n" +
                "\n" +
                " Evolutes and involutes; evaluation of definite and improper integrals; beta and gamma functions and their properties; applications of definite integrals to evaluate surface areas and volumes of revolutions. Rolles theorem, mean value theorems, taylors and maclaurin theorems with remainders; indeterminate forms and l hospital rule; maxima and minima. \n" +
                "\n" +
                "Module 2:\n" +
                "\n" +
                " Sequences and series (7 lectures)\n" +
                "\n" +
                " Convergence of sequence and series, tests for convergence, power series, taylors series. Series for exponential, trigonometric and logarithmic functions; fourier series: half range sine and cosine series, parsevals theorem. \n" +
                "\n" +
                "Module 3:\n" +
                "\n" +
                " Multivariable calculus: differentiation (6 lectures)\n" +
                "\n" +
                " Limit, continuity and partial derivatives, directional derivatives, total derivative; tangent plane and normal line; maxima, minima and saddle points; method of lagrange multipliers; gradient, curl and divergence. \n" +
                "\n" +
                "Module 4:\n" +
                "\n" +
                " Multivariable calculus: integration (7 lectures)\n" +
                "\n" +
                " Multiple integration: double and triple integrals (cartesian and polar), change of order of integration in double integrals, change of variables (cartesian to polar), applications: areas and volumes by (double integration) center of mass and gravity (constant and variable densities). Theorems of green, gauss and stokes, orthogonal curvilinear coordinates, simple applications involving cubes, sphere and rectangular parallelepipeds. \n" +
                "\n" +
                "Module 5:\n" +
                "\n" +
                " First order ordinary differential equations (3 lectures)\n" +
                "\n" +
                " Exact, linear and bernoulli equations, euler equations, equations not of first degree: equations solvable for p, equations solvable for y, equations solvable for x and clairauts type. \n" +
                "\n" +
                "Module 6:\n" +
                "\n" +
                " Ordinary differential equations of higher order (6 lectures)\n" +
                "\n" +
                " Second order linear differential equations with variable coefficients, method of variation of parameters, cauchy-euler equation; power series solutions; legendre polynomials, bessel functions of the first kind and their properties. \n" +
                "\n" +
                "Module 7:\n" +
                "\n" +
                " Partial differential equations: first order (3 lectures)\n" +
                "\n" +
                " First order partial differential equations, solutions of first order linear and non-linear pdes.\n" +
                "\n" +
                "\n" +
                "\n" +
                " \n" +
                "\n" +
                "Text / references:\n" +
                "\n" +
                "\n" +
                "\n" +
                " ~ g.B. Thomas and r.L. Finney, calculus and analytic geometry, pearson, 2002.\n" +
                " ~ t. Veerarajan, engineering mathematics, mcgraw-hill, new delhi, 2008.\n" +
                " ~ b. V. Ramana, higher engineering mathematics, mcgraw hill, new delhi, 2010.\n" +
                " ~ n.P. Bali and m. Goyal, a text book of engineering mathematics, laxmi publications, 2010.\n" +
                " ~ b.S. Grewal, higher engineering mathematics, khanna publishers, 2000.\n" +
                " ~ e. Kreyszig, advanced engineering mathematics, john wiley and sons, 2006.\n" +
                " ~ w. E. Boyce and r. C. Diprima, elementary differential equations and boundary value problems, wiley india, 2009.\n" +
                " ~ s. L. Ross, differential equations, wiley india, 1984.\n" +
                " ~ e. A. Coddington, an introduction to ordinary differential equations, prentice hall india, 1995.\n" +
                " ~ e. L. Ince, ordinary differential equations, dover publications, 1958.\n" +
                " ~ g.F. Simmons and s.G. Krantz, differential equations, mcgraw hill, 2007...");

        List<String> Pps = Arrays.asList("Programming for problem solving\n" +
                " L:3 t:0 p:4 credit:5 \n" +
                "\n" +
                "Module 1: introduction to programming (6 lectures) I\n" +
                "\n" +
                "Introduction to components of a computer system (disks, memory, processor, where a program is stored and executed, operating system, compilers etc). Idea of algorithm: steps to solve logical and numerical problems. Representation of algorithm: flowchart/pseudo code with examples. From algorithms to programs; source code, variables (with data types) variables and memory locations, type casting/type conversion, run time environment (static, dynamic location), storage classes (auto, register, static, extern), syntax and logical errors in compilation, object and executable code. \n" +
                "\n" +
                "Module 2: operators (3 lectures) \n" +
                "\n" +
                "Arithmetic expressions/arithmetic operators/relational operators/logical operators/bitwise operators and precedence \n" +
                "\n" +
                "Module 3: conditional branching and loops (5 lectures) \n" +
                "\n" +
                "Writing and evaluation of conditionals and consequent branching, iteration and loops \n" +
                "\n" +
                "Module 4: arrays (4 lectures) \n" +
                "\n" +
                "Array declaration and initialization, bound checking arrays (1-d, 2-d), character arrays and strings. \n" +
                "\n" +
                "Module 5: basic algorithms (6 lectures) \n" +
                "\n" +
                "Searching (linear search, binary search etc.), basic sorting algorithms (bubble, insertion and selection), finding roots of equations, notion of order of complexity through example programs (no formal definition required) \n" +
                "\n" +
                "Module 6: function (4 lectures) \n" +
                "\n" +
                "Introduction and writing functions, scope of variables functions (including using built in libraries), parameter passing in functions, call by value, passing arrays to functions: idea of call by reference \n" +
                "\n" +
                "Module 7: recursion (5 lectures) \n" +
                "\n" +
                "Recursion, as a different way of solving problems. Example programs, such as finding factorial, fibonacci series, reverse a string using recursion, and gcd of two numbers, ackerman function etc. Quick sort or merge sort. \n" +
                "\n" +
                "Module 8: structure/union (3 lectures) \n" +
                "\n" +
                "Structures, accessing structure elements, way of storage of structure element, defining structures and array of structures, basic definition of union, comparison between structure and union with example \n" +
                "\n" +
                "Module 9: pointers (5 lectures) \n" +
                "\n" +
                "Idea of pointers, defining pointers, use of pointers in self-referential structures, notion of linked list (no implementation), pointer to pointer, pointer to array, pointer to strings, array of pointer, pointer to function, pointer to structure. \n" +
                "\n" +
                "Module 10: file handling \n" +
                "\n" +
                "(only if time is available, otherwise should be done as part of the lab) \n" +
                "\n" +
                "\n" +
                "\n" +
                "Suggested text books: \n" +
                "~ byron gottfried, schaums outline of programming with c, mcgraw-hill \n" +
                "~ e. Balaguruswamy, programming in ansi c, tata mcgraw-hill \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Suggested reference books \n" +
                "~ brian w. Kernighan and dennis m. Ritchie, the c programming language, prentice hall of india \n" +
                "~ yashwant kanetkar, let us c, bpb publication \n" +
                "\n" +
                "\n" +
                "\n" +
                "The student will learn \n" +
                "~ to formulate simple algorithms for arithmetic and logical problems. \n" +
                "~ to translate the algorithms to programs (in c language). \n" +
                "~ to test and execute the programs and correct syntax and logical errors. \n" +
                "~ to implement conditional branching, iteration and recursion. \n" +
                "~ to decompose a problem into functions and synthesize a complete program using divide and conquer approach. \n" +
                "~ to use arrays, pointers and structures to formulate algorithms and programs. \n" +
                "~ to apply programming to solve matrix addition and multiplication problems and searching and sorting problems. \n" +
                "~ to apply programming to solve simple numerical method problems, namely rot finding of function, differentiation of function and simple integration. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Laboratory programming for problem solving \n" +
                "[the laboratory should be preceded or followed by a tutorial to explain the approach or algorithm to be implemented for the problem given.] \n" +
                "\n" +
                "Tutorial 1: problem solving using computers: \n" +
                "\n" +
                "Lab1: familiarization with programming environment \n" +
                "\n" +
                "Tutorial 2: variable types and type conversions: \n" +
                "\n" +
                "Lab 2: simple computational problems using arithmetic expressions \n" +
                "\n" +
                "Tutorial 3: branching and logical expressions: \n" +
                "\n" +
                "Lab 3: problems involving if-then-else structures \n" +
                "\n" +
                "Tutorial 4: loops, while and for loops: \n" +
                "\n" +
                "Lab 4: iterative problems e.G., sum of series \n" +
                "\n" +
                "Tutorial 5: 1d arrays: searching, sorting: \n" +
                "\n" +
                "Lab 5: 1d array manipulation \n" +
                "\n" +
                "Tutorial 6: 2d arrays and strings \n" +
                "\n" +
                "Lab 6: matrix problems, string operations \n" +
                "\n" +
                "Tutorial 7: functions, call by value: \n" +
                "\n" +
                "Lab 7: simple functions \n" +
                "\n" +
                "Tutorial 8: numerical methods (root finding, numerical differentiation, numerical integration): \n" +
                "\n" +
                "Lab 8: programming for solving numerical methods problems \n" +
                "\n" +
                "Tutorial 9: recursion, structure of recursive calls \n" +
                "\n" +
                "Lab 9: recursive functions \n" +
                "\n" +
                "Tutorial 10: pointers, structures and dynamic memory allocation \n" +
                "\n" +
                "Lab 10: pointers and structures \n" +
                "\n" +
                "Tutorial 11: file handling: \n" +
                "\n" +
                "Lab 11: file operations...");

        List<String> Workshop = Arrays.asList("Workshop manufacturing practices\n" +
                " L:1 t:0 p:4 credit:3 \n" +
                "\n" +
                "Lectures and videos: (10 hours) [l: 1; t: 0; p: 0 (1 credit)] \n" +
                "\n" +
                "Detailed contents: \n" +
                "1. Manufacturing methods-casting, forming, machining, joining, advanced manufacturing methods (3 lectures) \n" +
                "2. Cnc machining, additive manufacturing (1 lecture) \n" +
                "3. Fitting operations and power tools (1 lecture) \n" +
                "4. Carpentry (1 lecture) \n" +
                "5. Plastic moulding, glass cutting (1 lecture) \n" +
                "6. Metal casting (1 lecture) \n" +
                "7. Welding (arc welding and gas welding), brazing, soldering (2 lecture) \n" +
                "\n" +
                "\n" +
                "\n" +
                "Suggested text/reference books: \n" +
                "~hajra choudhury s.K., hajra choudhury a.K. And nirjhar roy s.K., elements of workshop technology, vol. I 2008 and vol. Ii 2010, media promoters and publishers private limited, mumbai. \n" +
                "~kalpakjian s. And steven s. Schmid, manufacturing engineering and technology, 4th edition, pearson education india edition, 2002. \n" +
                "~gowri p. Hariharan and a. Suresh babu,manufacturing technology – I pearson education, 2008. \n" +
                "~roy a. Lindberg, processes and materials of manufacture, 4th edition, prentice hall india, 1998. \n" +
                "~rao p.N., manufacturing technology, vol. I and vol. Ii, tata mcgrawhill house, 2017. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Course outcomes: \n" +
                "~upon completion of this course, the students will gain knowledge of the different manufacturing processes which are commonly employed in the industry, to fabricate components using different materials. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Workshop practice: (60 hours) [l: 0; t: 0; p: 4 (2 credits)] \n" +
                "1. Machine shop (10 hours) and fitting shop (8 hours) \n" +
                "2. Carpentry (6 hours) \n" +
                "3. Welding shop (8 hours) (arc welding 4 hrs + gas welding 4 hrs) \n" +
                "4. Casting (8 hours) and smithy (6 hours) \n" +
                "5. Plastic moulding and glass cutting (6 hours) \n" +
                "6. 3-d printing of different models (8 hours) \n" +
                "\n" +
                "\n" +
                "\n" +
                "Examinations could involve the actual fabrication of simple components, utilizing one or more of the techniques covered above..");

        List<String> English = Arrays.asList("English\n" +
                " L:2 t:0 p:2 credit:3 \n" +
                "\n" +
                "Detailed contents \n" +
                "\n" +
                "1.Vocabulary building \n" +
                "A. The concept of word formation \n" +
                "B. Root words from foreign languages and their use in english \n" +
                "C. Acquaintance with prefixes and suffixes from foreign languages in english to form derivatives. \n" +
                "D. Synonyms, antonyms, and standard abbreviations. \n" +
                "E. Affixes, acronyms \n" +
                "\n" +
                "2.Basic writing skills \n" +
                "A. Sentence structures \n" +
                "B. Use of phrases and clauses in sentences \n" +
                "C. Importance of proper punctuation \n" +
                "D. Kinds of sentences \n" +
                "E. Use of tense, use in context and coherence of tense in writing \n" +
                "F. Use of voice – active/passive in sentences \n" +
                "G. Use of speech – direct and indirect speech \n" +
                "H. Framing questions- direct, using modal verbs \n" +
                "\n" +
                "3.Identifying common errors in writing \n" +
                "A. Subject-verb agreement \n" +
                "B. Noun-pronoun agreement \n" +
                "C. Misplaced modifiers \n" +
                "D. Articles \n" +
                "E. Prepositions \n" +
                "F. Redundancies \n" +
                "G. Clichés \n" +
                "H. Common english errors \n" +
                "\n" +
                "4.Nature and style of sensible writing \n" +
                "A. Describing \n" +
                "B. Defining \n" +
                "C. Classifying \n" +
                "D. Providing examples or evidence \n" +
                "E. Writing introduction and conclusion \n" +
                "F. Organising principle of paragraphs in documents \n" +
                "G. Argument, describing/ narrating/ planning, defining,classifying \n" +
                "H. Lexical resources, using suitable language register \n" +
                "I. Coherence, writing introduction, body and conclusion, techniques for writing precisely,grammar and accuracy \n" +
                "\n" +
                "5.Writing practices \n" +
                "A. Comprehension \n" +
                "B. Formal letter writing/ application/ report writing/ writing minutes of meetings \n" +
                "C. Essay writing \n" +
                "D. Formal email writing \n" +
                "E. Resume/ cv writing, cover letter, \n" +
                "F. Statement of purpose \n" +
                "\n" +
                "6.Oral communication \n" +
                "\n" +
                "(this unit involves interactive practice sessions in language lab) \n" +
                "A. Listening comprehension \n" +
                "B. Pronunciation, intonation, stress and rhythm \n" +
                "C. Common everyday situations: conversations and dialogues \n" +
                "D. Communication at workplace \n" +
                "E. Interviews \n" +
                "F. Formal presentations \n" +
                "G. Acquainting students with ipa symbols \n" +
                "H. Phonetics (basic) \n" +
                "I. Sounds – vowels, consonants \n" +
                "J. Clearing mother tongue influence \n" +
                "K. Clearing redundancies and common errors related to indianisms \n" +
                "L. Group discussion \n" +
                "M. Expressing opinions \n" +
                "N. Coherence and fluency in speech \n" +
                "\n" +
                "7.Reading skills \n" +
                "A. Reading comprehension, \n" +
                "B. Paragraph reading based on phonetic sounds/ intonation \n" +
                "\n" +
                "8.Professional skills \n" +
                "A. Team building \n" +
                "B. Soft skills and etiquettes \n" +
                "\n" +
                "9.Acquaintance with technology-aided language learning \n" +
                "A. Use of computer software (grammarly, ginger…) \n" +
                "B. Use of smartphone applications (duolingo, busuu…) \n" +
                "\n" +
                "10.Activities \n" +
                "A. Narrative chain \n" +
                "B. Describing/ narrating \n" +
                "C. Writing essays in relay \n" +
                "D. Peer/ group activities \n" +
                "E. Brainstorming vocabulary \n" +
                "F. Cue / flash cards for vocabulary \n" +
                "G. Debates \n" +
                "\n" +
                "Suggested readings: \n" +
                "~practical english usage. Michael swan. Oup. 1995. \n" +
                "~remedial english grammar. F.T. Wood. Macmillan.2007 \n" +
                "~on writing well. William zinsser. Harper resource book. 2001 \n" +
                "~study writing. Liz hamp-lyons and ben heasly. Cambridge university press. 2006. \n" +
                "~communication skills. Sanjay kumar and pushplata. Oxford university press. 2011. \n" +
                "~exercises in spoken english. Parts. I-iii. Ciefl, hyderabad. Oxford university press..");

        List<Semester> firstSemesters = new ArrayList<>();
        firstSemesters.add(new Semester("CHEMISTRY", Chemistry));
        firstSemesters.add(new Semester("MATHEMATICS-I (CALCULUS AND DIFFERENTIAL EQUATIONS)", MathFirst));
        firstSemesters.add(new Semester("PROGRAMMING FOR PROBLEM SOLVING", Pps));
        firstSemesters.add(new Semester("WORKSHOP MANUFACTURING PRACTICES", Workshop));
        firstSemesters.add(new Semester("ENGLISH", English));

        branches.add(new Branch("Semester 1", firstSemesters));



        //2 Semester
        List<String> BEE = Arrays.asList("Basic electrical engineering \n" +
                "L:3 t:1 p:2 credit:5 \n" +
                "\n" +
                " Module 1: dc circuits (8 lectures)\n" +
                "\n" +
                " Electrical circuit elements (r, l and c), voltage and current sources, kirchhoff current and voltage laws, analysis of simple circuits with dc excitation. Star-delta conversion, network theorems (superposition, thevenin, norton and maximum power transfer theorems). Time-domain analysis of first-order rl and rc circuits\n" +
                "\n" +
                " Module 2: ac circuits (8 lectures)\n" +
                "\n" +
                " Representation of sinusoidal waveforms, peak, rms and average values (form factor and peak factor), impedance of series and parallel circuit, phasor representation, real power, reactive power, apparent power, power factor, power triangle. Analysis of single-phase ac circuits consisting of r, l, c, rl, rc, rlc combinations (series and parallel), resonance. Three-phase balanced circuits, voltage and current relations in star and delta connections. \n" +
                "\n" +
                "Module 3: magnetic circuits: (4 lectures)\n" +
                "\n" +
                " Introduction, series and parallel magnetic circuits, analysis of series and parallel magnetic circuits. \n" +
                "\n" +
                "Module 4: transformers (6 lectures)\n" +
                "\n" +
                " Magnetic materials, bh characteristics, ideal and practical transformer, emf equation, equivalent circuit, losses in transformers, regulation and efficiency. Auto-transformer and three-phase transformer connections. \n" +
                "\n" +
                "Module 5: electrical machines (10 lectures)\n" +
                "\n" +
                " Construction, working, torque-speed characteristic and speed control of separately excited dc motor. Generation of rotating magnetic fields, construction and working of a three-phase induction motor, significance of torque-slip characteristic. Loss components and efficiency, starting and speed control of induction motor. Construction and working of synchronous generators. \n" +
                "\n" +
                "Module 6: electrical installations (6 lectures)\n" +
                "\n" +
                " Components of lt switchgear: switch fuse unit (sfu), mcb, elcb, mccb, types of wires and cables, earthing. Types of batteries, important characteristics for batteries. Elementary calculations for energy consumption, power factor improvement and battery backup. \n" +
                "\n" +
                "\n" +
                "\n" +
                "Suggested text / reference books\n" +
                "\n" +
                " ~ d. P. Kothari and I. J. Nagrath, “basic electrical engineering”, tata mcgraw hill, 2010.\n" +
                "\n" +
                " ~ d. C. Kulshreshtha, “basic electrical engineering”, mcgraw hill, 2009.\n" +
                "\n" +
                " ~ l. S. Bobrow, “fundamentals of electrical engineering”, oxford university press, 2011.\n" +
                "\n" +
                " ~ e. Hughes, “electrical and electronics technology”, pearson, 2010.\n" +
                "\n" +
                " ~ v. D. Toro, “electrical engineering fundamentals”, prentice hall india, 1989.\n" +
                "\n" +
                " ~ basic electrical engineering by fitzerald, et al, tata mcgraw hill\n" +
                "\n" +
                " ~ fundamentals of electrical engg. By r. Prasad, phi publication\n" +
                "\n" +
                " ~ basic electrical engineering by v.K. Mehta and rohit mehta, s.Chand publication..");

        List<String> EGD = Arrays.asList("Engineering graphics and design \n" +
                "L:1 t:0 p:4 credit:3  \n" +
                "\n" +
                " Traditional engineering graphics:\n" +
                "\n" +
                " Principles of engineering graphics; orthographic projection; descriptive geometry; drawing principles; isometric projection; surface development; perspective; reading a drawing; sectional views; dimensioning and tolerances; true length, angle; intersection, shortest distance. \n" +
                "\n" +
                " Computer graphics:\n" +
                "\n" +
                " Engineering graphics software; -spatial transformations; orthographic projections; model viewing; co-ordinate systems; multi-view projection; exploded assembly; model viewing; animation; spatial manipulation; surface modelling; solid modelling, introduction to building information modelling (bim). \n" +
                "\n" +
                " (except the basic essential concepts, most of the teaching part can happen concurrently in the laboratory) \n" +
                "\n" +
                "  Module 1: introduction to engineering drawing \n" +
                "\n" +
                " Principles of engineering graphics and their significance, usage of drawing instruments, lettering, conic sections including the rectangular hyperbola (general method only); cycloid, epicycloid, hypocycloid and involute; scales – plain, diagonal and vernier scales \n" +
                "\n" +
                "Module 2: orthographic projections \n" +
                "\n" +
                "Principles of orthographic projections-conventions -projections of points and lines inclined to both planes; projections of planes inclined planes -auxiliary planes \n" +
                "\n" +
                "Module 3: projections of regular solids \n" +
                "\n" +
                "Those inclined to both the planes- auxiliary views; draw simple annotation, dimensioning and scale. Floor plans that include: windows, doors, and fixtures such as wc, bath, sink, shower, etc. \n" +
                "\n" +
                "Module 4: sections and sectional views of right angular solids \n" +
                "\n" +
                "Covering, prism, cylinder, pyramid, cone – auxiliary views; development of surfaces of right regular solids- prism, pyramid, cylinder and cone; draw the sectional orthographic views of geometrical solids, objects from industry and dwellings (foundation to slab only) \n" +
                "Nmodule 5: isometric projections \n" +
                "\n" +
                "Principles of isometric projection – isometric scale, isometric views, conventions; isometric views of lines, planes, simple and compound solids; conversion of isometric views to orthographic views and vice-versa, conventions \n" +
                "\n" +
                "Module 6: overview of computer graphics \n" +
                "\n" +
                "Listing the computer technologies that impact on graphical communication, demonstrating knowledge of the theory of cad software [such as: the menu system, toolbars (standard, object properties, draw, modify and dimension), drawing area (background, crosshairs, coordinate system), dialog boxes and windows, shortcut menus (button bars), the command line (where applicable), the status bar, different methods of zoom as used in cad, select and erase objects.; isometric views of lines, planes, simple and compound solids] \n" +
                "\n" +
                "Module 7: customisation and cad drawing \n" +
                "\n" +
                "Consisting of set up of the drawing page and the printer, including scale settings, setting up of units and drawing limits; iso and ansi standards for coordinate dimensioning and tolerancing; orthographic constraints, snap to objects manually and automatically; producing drawings by using various coordinate input entry methods to draw straight lines, applying various ways of drawing circles. \n" +
                "\n" +
                "Module 8: annotations, layering and other functions \n" +
                "\n" +
                "Covering applying dimensions to objects, applying annotations to drawings; setting up and use of layers, layers to create drawings, create, edit and use customized layers; changing line lengths through modifying existing lines (extend/lengthen); printing documents to paper using the print command; orthographic projection techniques; drawing sectional views of composite right regular geometric solids and project the true shape of the sectioned surface; drawing annotation, computer-aided design (cad) software modeling of parts and assemblies. Parametric and non-parametric solid, surface, and wireframe models. Part editing and two-dimensional documentation of models. Planar projection theory, including sketching of perspective, isometric, multiview, auxiliary, and section views. Spatial visualization exercises. Dimensioning guidelines, tolerancing techniques; dimensioning and scale multi views of dwelling. \n" +
                "\n" +
                "Module 9: demonstration of a simple team design project that illustrates \n" +
                "\n" +
                "Geometry and topology of engineered components: creation of engineering models and their presentation in standard 2d blueprint form and as 3d wire-frame and shaded solids; meshed topologies for engineering analysis and tool-path generation for component manufacture; geometric dimensioning and tolerancing; use of solid-modeling software for creating associative models at the component and assembly levels. Floor plans that include: windows, doors, and fixtures such as wc, bath, sink, shower, etc. Applying colour coding according to building drawing practice; drawing sectional elevation showing foundation to ceiling; introduction to building information modelling (bim). \n" +
                "\n" +
                "Suggested text/reference books: \n" +
                " \n" +
                "~ bhatt n.D., panchal v.M. And ingle p.R., (2014), engineering drawing, charotar publishing house \n" +
                "~ shah, m.B. And rana b.C. (2008), engineering drawing and computer graphics, pearson education \n" +
                "~ agrawal b. And agrawal c. M. (2012), engineering graphics, tmh publication \n" +
                "~ narayana, k.L. And p kannaiah (2008), text book on engineering drawing, scitechpublishers \n" +
                "~ (corresponding set of) cad software theory and user manuals..");

        List<String> MathTwo = Arrays.asList("Mathematics –ii\n" +
                "\n" +
                " (linear algebra, transform calculus and numerical methods)\n" +
                "\n" +
                " L:3 t:1 p:0 credit:4\n" +
                "\n" +
                " \n" +
                "\n" +
                "Module 1:\n" +
                "\n" +
                " Matrices (10 lectures)\n" +
                "\n" +
                " Algebra of matrices, inverse and rank of a matrix, rank-nullity theorem; system of linear equations; symmetric, skew-symmetric and orthogonal matrices; determinants; eigenvalues and eigenvectors; diagonalization of matrices; cayley-hamilton theorem, orthogonal transformation and quadratic to canonical forms. \n" +
                "\n" +
                "Module 2:\n" +
                "\n" +
                " Numerical methods-I (10 lectures)\n" +
                "\n" +
                " Solution of polynomial and transcendental equations – bisection method, newton-raphson method and regula-falsi method. Finite differences, interpolation using newton’s forward and backward difference formulae. Central difference interpolation: gauss’s forward and backward formulae. Numerical integration: trapezoidal rule and simpson’s 1/3rd and 3/8 rules. \n" +
                "\n" +
                "Module 3:\n" +
                "\n" +
                " Numerical methods-ii (10 lectures)\n" +
                "\n" +
                " Ordinary differential equations: taylors series, euler and modified eulers methods. Runge- kutta method of fourth order for solving first and second order equations. Milne’s and adam’s predicator-corrector methods. Partial differential equations: finite difference solution two dimensional laplace equation and poisson equation, implicit and explicit methods for one dimensional heat equation (bender-schmidt and crank-nicholson methods), finite difference explicit method for wave equation. \n" +
                "\n" +
                "Module 4:\n" +
                "\n" +
                " Transform calculus (10 lectures)\n" +
                "\n" +
                " Laplace transform, properties of laplace transform, laplace transform of periodic functions. Finding inverse laplace transform by different methods, convolution theorem. Evaluation of integrals by laplace transform, solving odes and pdes by laplace transform method. Fourier transforms. \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Text / references:\n" +
                "\n" +
                " ~ d. Poole,linear algebra: a modern introduction, brooks/cole, 2005. ~ n.P. Bali and m. Goyal, a text book of engineering mathematics, laxmi publications, 2008. ~ b.S. Grewal, higher engineering mathematics, khanna publishers, 2010. ~ v. Krishnamurthy, v. P. Mainra and j. L. Arora, an introduction to linear algebra , affiliated east-west press, 2005...");

        List<String> WavePHY = Arrays.asList("Physics \n" +
                "\n" +
                "(waves and optics, and introduction to quantum mechanics)\n" +
                "\n" +
                " L:3 t:1 p:3\n" +
                "\n" +
                " Credit:5.5\n" +
                "\n" +
                " Contents\n" +
                "\n" +
                " \n" +
                "\n" +
                "Module 1:\n" +
                "\n" +
                " Waves (3 lectures)\n" +
                "\n" +
                " Mechanical and electrical simple harmonic oscillators, damped harmonic oscillator, forced mechanical and electrical oscillators, impedance, steady state motion of forced damped harmonic oscillator \n" +
                "\n" +
                "Module 2:\n" +
                "\n" +
                " Non-dispersive transverse and longitudinal waves (4 lectures) transverse wave on a string, the wave equation on a string, harmonic waves, reflection and transmission of waves at a boundary, impedance matching, standing waves and their eigen frequencies, longitudinal waves and the wave equation for them, acoustics waves \n" +
                "\n" +
                "Module 3:\n" +
                "\n" +
                " Light and optics (3 lectures)\n" +
                "\n" +
                " Light as an electromagnetic wave and fresnel equations, reflectance and transmittance, brewster’s angle, total internal reflection, and evanescent wave. Mirrors and lenses and optical instruments based on them \n" +
                "\n" +
                "Module 4: \n" +
                "\n" +
                "Wave optics (5 lectures)\n" +
                "\n" +
                " Huygens’ principle, superposition of waves and interference of light by wavefront splitting and amplitude splitting; young’s double slit experiment, newton’s rings, michelson interferometer, mach zehnder interferometer. Farunhofer diffraction from a single slit and a circular aperture, the rayleigh criterion for limit of resolution and its application to vision; diffraction gratings and their resolving power \n" +
                "\n" +
                "Module 5:\n" +
                "\n" +
                " Lasers (5 lectures)\n" +
                "\n" +
                " Einstein’s theory of matter radiation interaction and a and b coefficients; amplification of light by population inversion, different types of lasers: gas lasers (he-ne, co2), solid-state lasers (ruby, neodymium), dye lasers; properties of laser beams: mono-chromaticity \n" +
                "\n" +
                "Module 6: \n" +
                "\n" +
                "Introduction to quantum mechanics (5 lectures)\n" +
                "\n" +
                " Wave nature of particles, time-dependent and time-independent schrodinger equation for wave function, born interpretation, probability current, expectation values, free-particle wave function and wave-packets, uncertainty principle. \n" +
                "\n" +
                "Module 7:\n" +
                "\n" +
                " Solution of wave equation (6 lectures)\n" +
                "\n" +
                " Solution of stationary-state schrodinger equation for one dimensional problems–particle in a box, particle in attractive delta-function potential, square-well potential, linear harmonic oscillator. Scattering from a potential barrier and tunneling; related examples like alpha- decay, field-ionization and scanning tunneling microscope, tunneling in semiconductor structures. Three-dimensional problems: particle in three dimensional box and related examples. \n" +
                "\n" +
                "Module 8:\n" +
                "\n" +
                " Introduction to solids and semiconductors (9 lectures)\n" +
                "\n" +
                " Free electron theory of metals, fermi level, density of states in 1, 2 and 3 dimensions, bloch’s theorem for particles in a periodic potential, kronig-penney model and origin of energy bands. Types of electronic materials: metals, semiconductors, and insulators. Intrinsic and extrinsic semiconductors, dependence of fermi level on carrier-concentration and temperature (equilibrium carrier statistics), carrier generation and recombination, carrier transport: diffusion and drift, p -n junction. \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Text / references:\n" +
                "\n" +
                "\n" +
                "\n" +
                " ~ g. Main, vibrations and waves in physics, cambridge university press, 1993.\n" +
                " ~ h. J. Pain, the physics of vibrations and waves, wiley, 2006.\n" +
                " ~ e. Hecht, optics, pearson education, 2008.\n" +
                " ~ a. Ghatak, optics, mcgraw hill education, 2012.\n" +
                " ~ o. Svelto, principles of lasers, springer science and business media, 2010.\n" +
                " ~ d. J. Griffiths, quantum mechanics, pearson education, 2014.\n" +
                " ~ r. Robinett, quantum mechanics, oup oxford, 2006.\n" +
                " ~ d. Mcquarrie, uantum chemistry, university science books, 2007.\n" +
                " ~ d. A. Neamen, semiconductor physics and devices, times mirror high education group, chicago, 1997.\n" +
                " ~ e.S. Yang, microelectronic devices, mcgraw hill, singapore, 1988.\n" +
                " ~ b.G. Streetman, solid state electronic devices, prentice hall of india, 1995..");

        List<Semester> secondSemesters = new ArrayList<>();
        secondSemesters.add(new Semester("BASIC ELECTRICAL ENGINEERING", BEE));
        secondSemesters.add(new Semester("ENGINEERING GRAPHICS AND DESIGN", EGD));
        secondSemesters.add(new Semester("MATHEMATICS -II (LINEAR ALGEBRA, TRANSFORM CALCULUS AND NUMERICAL METHODS)", MathTwo));
        secondSemesters.add(new Semester("PHYSICS (WAVE AND OPTICS, AND INTRODUCTION TO QUANTUM MECHANICS)", WavePHY));

        branches.add(new Branch("Semester 2", secondSemesters));



        //3 Semester
        List<String> NT = Arrays.asList("Network Theory\n" +
                "\n" +
                "\n" +
                "3L:1T:0P 3 Credits\n" +
                "\n" +
                "1 Introduction to signals, their classification and properties, different types of systems, LTI systems and their properties, periodic waveforms and signal synthesis, properties and applications of Laplace transform.\n" +
                "\n" +
                "2 System modeling in terms of differential equations and transient response of R, L, C, series and parallel circuits for impulse, step, ramp, sinusoidal and exponential signals by classical method and using Laplace transform.\n" +
                "\n" +
                "3 Graph theory : Concept of tree, Tie-set matrix, Cut-set matrix and application to solve electric networks. Two port networks – Introduction of two port parameters and their interconversion, Interconnection of two 2-port networks, Open circuit and Short circuit impedances and ABCD constants, Relation between image impedances and Short circuit and Open circuit impedances.\n" +
                "\n" +
                "4 Network functions, their properties and concept of transfer impedance, Hurwitz polynomial ,Positive real function and synthesis of LC, RC, RL Networks in Foster’s I and II, Cauer’s I and II forms.\n" +
                "\n" +
                "5 Introduction of passive filter and their classification, frequency response, Characteristic impedance of low pass, high pass, Band Pass and Band reject prototype section\n" +
                "\n" +
                "Name of Authors / Books /Publishers\n" +
                "\n" +
                "1 “Engineering Circuit Analysis”, by W H Hayt, TMH Eighth Edition\n" +
                "\n" +
                "2 “Network analysis and synthesis”, by F F Kuo, John Weily and Sons, 2nd Edition\n" +
                "\n" +
                "3 “Circuit Theory”, by S Salivahanan, Vikas Publishing House 1st Edition, 2014\n" +
                "\n" +
                "4 “Network analysis”, by M. E. Van Valkenburg, PHI, 2000\n" +
                "\n" +
                "5 “Networks and Systems”, by D. R. Choudhary, New Age International, 1999 6 “Electric Circuit”, Bell Oxford Publications, 7th Edition..");

        List<String> SAS = Arrays.asList("Signals and Systems\n" +
                "\n" +
                "\n" +
                "3L:0T:0P 3 Credits\n" +
                "\n" +
                "1 Introduction to Signal and System : Definition, classification of systems, standard test signal, properties of system, properties of linear system, Properties: linearity: additivity and homogeneity, Shiftinvariance, Causality\n" +
                "\n" +
                "2 Linear time-invariant (LTI) systems, impulse response and step response, convolution, Characterization of causality and stability of linear time-invariant systems. System representation through differential equations and difference equations.3 Laplace transformation : Laplace transform of some important function, Shift theorem and its application, Laplace transform of periodic signals, Functional analysis of response, Initial and Final value theorems, Response to periodic sinusoidal excitation, Region Of Convergence, Poles and Zeros of system, Laplace domain analysis, Solution to differential equations.\n" +
                "\n" +
                "4 Analysis of Fourier Methods : Fourier series expansion, Functional symmetry condition, Exponential form of Fourier series, Fourier integral and Fourier transform, Multiplication and their effect in the frequency domain, Magnitude and Phase response, DTFT, Parseval’s Theorem\n" +
                "\n" +
                "5 Z-transformation : Z transform of Discrete time signal, LTI system, solution of difference equation, Application of Z transform to open loop system, Region Of Convergence, z-domain analysis.\n" +
                "\n" +
                "Name of Authors / Books /Publishers\n" +
                "\n" +
                "1 “Signal and System”, A.V Oppenheim, A.S Willsky and I.T Young, Prentice Hall\n" +
                "\n" +
                "2 “Signals and Systems - Continuous and Discrete”, R.F. Ziemer, W.H. Tranter and D.R. Fannin, 4th edition, Prentice Hall\n" +
                "\n" +
                "3 “Analysis of Linear System” by D.K Cheng, Narosa pub. House\n" +
                "\n" +
                "4 “Signal & system” by H.P Hsu, Tata McGraw Hill..");

        List<String> MathThree = Arrays.asList("Mathematics III\n" +
                "\n" +
                "\n" +
                "3L:0T:0P 3 Credits\n" +
                "\n" +
                "1 Unit1 (6 Lectures): Polynomials: Orthogonal Polynomials –Lagrange’s, Chebysev Polynomials; Trigonometric Polynomials; Wavelet transforms : properties, methods, inverses and their applications.\n" +
                "\n" +
                "2 Unit2 (10 Lectures): Sets, relations and functions: Basic operations on sets, Cartesian products, disjoint union (sum), and power sets. Different types of relations, their compositions and inverses. Different types of functions: Ber and Bei functions; recurrence relations, orthogonality properties.\n" +
                "\n" +
                "3 Unit3 (6 Lectures): Introduction to Graphs: Graphs and their basic properties – degree, path, cycle, subgraph, isomorphism, Eulerian and Hamiltonian walk, trees.\n" +
                "\n" +
                "4 Unit4 (10 Lectures): Basic Statistics: Measures of Central tendency: Moments, skewness and Kurtosis ; Probability distributions - Binomial, Poisson and Normal ; evaluation of statistical parameters for these three distributions, Correlation and regression – Rank correlation.\n" +
                "\n" +
                "5 Unit5 (10 Lectures): Applied Statistics: Curve fitting by the method of least squares- fitting of straight lines, second degree parabolas and more general curves. Test of significance: Large sample test for single proportion, difference of proportions, single mean, difference of means, and difference of standard deviations.\n" +
                "\n" +
                "Name of Authors / Books /Publishers\n" +
                "\n" +
                "1. Erwin Kreyszig, Advanced Engineering Mathematics, 9th Edition, John Wiley and amp; Sons, 2006.\n" +
                "\n" +
                "2. N.P. Bali and Manish Goyal, A text book of Engineering Mathematics, Laxmi Publications, Reprint, 2010.\n" +
                "\n" +
                "3. Veerarajan T., Engineering Mathematics (for semester III), Tata McGrawHill, New Delhi, 2010 41 | P a g e\n" +
                "\n" +
                "4. C. L. Liu, Elements of Discrete Mathematics, 2nd Ed., Tata McGraw-Hill, 2000..");

        List<String> OOPS = Arrays.asList("Object Oriented Programming\n" +
                "\n" +
                "\n" +
                "3L:0T:0P 3 Credits\n" +
                "\n" +
                "1 Introduction to C++ : Object Oriented Technology, Advantages of OOP, Input-output in C++, Tokens, Keywords, Identifiers, Data Types C++, Derives data types. The void data type, Type Modifiers, Typecasting, Constant, Operator, Precedence of Operators, Strings.\n" +
                "\n" +
                "2 Control Structures : Decision making statements like if-else, Nested if-else, goto, break, continue, switch case, Loop statement like for loop, nested for loop, while loop, do-while loop.\n" +
                "\n" +
                "3 Functions : Parts of Function, User-defined Functions, Value-Returning Functions, void Functions, Value Parameters, Function overloading, Virtual Functions.\n" +
                "\n" +
                "4 Classes and Data Abstraction : Structure in C++, Class, Build-in Operations on Classes,Assignment Operator and Classes, Class Scope, Reference parameters and Class Objects (Variables), Member functions, Accessor and Mutator Functions, Constructors, default Constructor, Destructors.\n" +
                "\n" +
                "5 Overloading and Templates : Operator Overloading, Function Overloading, Function Templates, Class Templates.\n" +
                "\n" +
                "6 Inheritance : Single and Multiple Inheritance, virtual Base class, Abstract Class, Pointer and Inheritance, Overloading Member Function.\n" +
                "\n" +
                "7 Pointers and Arrays : Void Pointers, Pointer to Class, Pointer to Object, The this Pointer, Void Pointer, Arrays.\n" +
                "\n" +
                "8 Exception Handling : The keywords try, throw and catch. Creating own Exception Classes, Exception Handling Techniques (Terminate the Program, Fix the Error and Continue, Log the Error and Continue),\n" +
                "\n" +
                "Stack Unwinding.Name of Authors / Books /Publishers\n" +
                "\n" +
                "1 “Thinking in C++”, Volume 1 and 2 by Bruce Eckel, Chuck Allison, Pearson Education\n" +
                "\n" +
                "2 “Mastering C++”, 1/e by Venugopal, TataMcGraw Hill.\n" +
                "\n" +
                "3 “Object Oriented Programming with C++”, 3/e by E. Balaguruswamy, Tata McGraw Hill.\n" +
                "\n" +
                "4 “Starting Out with Object Oriented Programming in C++”, by Tony Gaddis, Wiley India\n" +
                "\n" +
                "Object Oriented Programming Lab are according to the theory mentioned above. 0L: 0T: 2P 1 Credit..");

        List<String> BE = Arrays.asList("Basic Electronics\n" +
                "\n" +
                "\n" +
                "3L:0T:0P 3 Credits\n" +
                "\n" +
                "1 PN junction diode : Depletion layer, Barrier potential, Forward and Reverse bias, Breakdown voltage, IV characteristics of PN junction diode, Knee voltage, Ideal PN junction diode, Diode capacitances, Breakdown diodes (Avalanche and Zener diode). Photodiode and Light Emitting Diode.\n" +
                "\n" +
                "2 Rectifiers and filters : Half wave and Full wave rectifiers (Centre-tap and Bridge), Regulation, Ripple factor, R-C, L-C and Pi filters. Clipping and Clamping circuits, Voltage multiplier.\n" +
                "\n" +
                "3 BJT: Basic theory and Operation of PNP and NPN transistors, Characteristics of C-B, C-E and C-C configuration. Biasing : Base bias, Emitter feedback bias, Voltage divider bias, Load line, Operating point, Incremental analysis using hybrid model.\n" +
                "\n" +
                "4 FET : Introduction, Operation, I-V characteristics, JFET parameters, JFET amplifiers. MOSFET: Introduction, Operation, MOSFET parameters.\n" +
                "\n" +
                "5 Integrated circuit: Characteristics of an ideal Operational Amplifier. Application as inverting, noninverting amplifiers. Summer, Difference Amplifier, Differentiator, Integrator. Feedback Amplifiers.\n" +
                "\n" +
                "Name of Authors / Books /Publishers\n" +
                "\n" +
                "1 “Electronic devices and circuit theory” by Boylestead and Nashelsky, Pearson\n" +
                "\n" +
                "2 “Electronic principle” by Albert Malvino and Davis J Bates, TMH\n" +
                "\n" +
                "3 “Integrated Electronics”, By Jacob Millman and Christos Halkias..");

        List<String> EEM = Arrays.asList("Electrical & Electronic Material\n" +
                "\n" +
                "\n" +
                "3L:0T:0P 3 Credits\n" +
                "\n" +
                "1 Atomic structure and bonding in materials. Crystal structure of materials, Crystal systems, Unit cells and space lattices, Determination of structures of simple crystals by X-ray diffraction, Miller indices of planes and directions, Packing geometry in Metallic, Ionic and Covalent solids. Concept of amorphous, single and polycrystalline structures and their effect on properties of materials. Crystal growth techniques. Imperfections in crystalline solids and their role in influencing various properties.\n" +
                "\n" +
                "2 Band theory of Solids : Energy band diagram, E – K Diagram, Reduced E – K Diagram, Insulators, Semiconductors & Conductors.\n" +
                "\n" +
                "3 Semiconductor : Single Crystal, Polycrystalline and Amorphous, Fermi – Dirac Distribution, Hall effect, Intrinsic & Extrinsic, N type & P type, Crystal growth – (1) Preparation of electronic grade polycrystal in Siemens reactor,(2) Czochrarlski Method & Float Zone method of bulk single crystal ingot preparation (3) Mirror finished wafer preparation (4) Epitaxial film growth – Chemical Vapor phase Deposition & Liquid Phase Epitaxy (5) Molecular Beam Epitaxy.\n" +
                "\n" +
                "4 Dielectric behavior of materials : Polarization, Dielectric constant at low frequency & high frequency, Dielectric loss, Piezoelectricity & FerroElectricity\n" +
                "\n" +
                "5 Magnetic Properties : Origin of magnetism in metallic and ceramic materials, Paramagnetism, Diamagnetism, Antiferromagnetism, Ferromagnetism, Ferrimagnetism, magnetic hysteresis, Influence of temperature on magnetic behaviour, domains and Hysteresis.\n" +
                "\n" +
                "6 Superconductors : Low and High temperature (YBaCuO) superconductors, Meissner effect, Applications.\n" +
                "\n" +
                "7 Printed Circuit Board : Manufacturing process, Single- & Double-sided boards, surface mounted devices\n" +
                "\n" +
                "Name of Authors / Books /Publishers\n" +
                "\n" +
                "1 “Solid State Physics”, by Kittel, McGraw Hill.\n" +
                "\n" +
                "2 “Principles of Electric Engineering Materials & Devices”, by S.O. Kasp, McGraw Hill.\n" +
                "\n" +
                "3 “Structure & properties of materials (VOL VI), Electronic Properties”, by Robert M. Rose, Lawrence A.Shepherd & John Wulf, Wiley Eastern Ltd.\n" +
                "\n" +
                "Electrical and Electronics Materials Lab are according to the theory mentioned above. 0L: 0T: 2P 1 Credit..");

        List<Semester> thirdSemesters = new ArrayList<>();
        thirdSemesters.add(new Semester("NETWORK THEORY", NT));
        thirdSemesters.add(new Semester("SIGNALS AND SYSTEMS", SAS));
        thirdSemesters.add(new Semester("MATHEMATICS -III", MathThree));
        thirdSemesters.add(new Semester("OBJECT ORIENTED PROGRAMMING", OOPS));
        thirdSemesters.add(new Semester("BASIC ELECTRONICS", BE));
        thirdSemesters.add(new Semester("ELECTRICAL AND ELECTRONICS MATERIAL", EEM));

        branches.add(new Branch("Semester 3", thirdSemesters));

        //4 Semester
        List<String> DC = Arrays.asList("DIGITAL CIRCUITS..");
        List<String> AE = Arrays.asList("ANALOG ELECTRONICS..");
        List<String> AC = Arrays.asList("ANALOG COMMUNICATION");
        List<String> MI = Arrays.asList("MEASUREMENTS AND INSTRUMENTATION..");
        List<String> Bio = Arrays.asList("BIOLOGY..");
        List<String> MOOCSFirst = Arrays.asList("MOOCS / SWAYAM / NPTEL ETC. (COURSES -I)..");
        List<String> EIKT = Arrays.asList("ESSENCE OF INDIAN KNOWLEDGE TRADITION /INDIAN CONSTITUTION..");

        List<Semester> fourthSemesters = new ArrayList<>();
        fourthSemesters.add(new Semester("DIGITAL CIRCUITS", DC));
        fourthSemesters.add(new Semester("ANALOG ELECTRONICS", AE));
        fourthSemesters.add(new Semester("ANALOG COMMUNICATION", AC));
        fourthSemesters.add(new Semester("MEASUREMENTS AND INSTRUMENTATION", MI));
        fourthSemesters.add(new Semester("BIOLOGY", Bio));
        fourthSemesters.add(new Semester("MOOCS / SWAYAM / NPTEL ETC. (COURSES -I)", MOOCSFirst));
        fourthSemesters.add(new Semester("ESSENCE OF INDIAN KNOWLEDGE TRADITION /INDIAN CONSTITUTION", EIKT));

        branches.add(new Branch("Semester 4", fourthSemesters));

        //5 Semester
        List<String> LICA = Arrays.asList("LINEAR INTEGRATED CIRCUITS AND APPLICATIONS..");
        List<String> LCS = Arrays.asList("LINEAR CONTROL SYSTEMS..");
        List<String> MM = Arrays.asList("MICROPROCESSOR AND MICROCONTROLLERS..");
        List<String> PE = Arrays.asList("POWER ELECTRONICS..");
        List<String> SAT = Arrays.asList("SENSORS AND TRANDUCERS..");
        List<String> NPTEL = Arrays.asList("MOOCS / SWAYAM / NPTEL ETC.(COURSES-II)");

        List<Semester> fifthSemesters = new ArrayList<>();
        fifthSemesters.add(new Semester("LINEAR INTEGRATED CIRCUITS AND APPLICATIONS", LICA));
        fifthSemesters.add(new Semester("LINEAR CONTROL SYSTEMS", LCS));
        fifthSemesters.add(new Semester("MICROPROCESSOR AND MICROCONTROLLERS", MM));
        fifthSemesters.add(new Semester("POWER ELECTRONICS..", PE));
        fifthSemesters.add(new Semester("SENSORS AND TRANDUCERS", SAT));
        fifthSemesters.add(new Semester("MOOCS / SWAYAM / NPTEL ETC.(COURSES-II)", NPTEL));

        branches.add(new Branch("Semester 5", fifthSemesters));

        //6 Semester
        List<String> II = Arrays.asList("INDUSTRIAL INSTRUMENTATION..");
        List<String> AI = Arrays.asList("ANALYTICAL INSTRUMENTATION..");
        List<String> PSD = Arrays.asList("PROFESSIONAL SKILL DEVELOPMENT..");
        List<String> CNS = Arrays.asList("COMPUTER NETWORK AND SECURITY..");
        List<String> IPI = Arrays.asList("INSTRUMENTATION IN PROCESS INDUSTRIES..");
        List<String> AIAI = Arrays.asList("ARTIFICIAL INTELLIGENCE..");

        List<Semester> sixthSemesters = new ArrayList<>();
        sixthSemesters.add(new Semester("INDUSTRIAL INSTRUMENTATION", II));
        sixthSemesters.add(new Semester("ANALYTICAL INSTRUMENTATION", AI));
        sixthSemesters.add(new Semester("PROFESSIONAL SKILL DEVELOPMENT", PSD));
        sixthSemesters.add(new Semester("COMPUTER NETWORK AND SECURITY", CNS));
        sixthSemesters.add(new Semester("INSTRUMENTATION IN PROCESS INDUSTRIES", IPI));
        sixthSemesters.add(new Semester("ARTIFICIAL INTELLIGENCE", AIAI));

        branches.add(new Branch("Semester 6", sixthSemesters));
        //6th Semester End...



        //7 Semester
        List<String> III = Arrays.asList("INTELLIGENT INSTRUMENTATION..");
        List<String> ISM = Arrays.asList("INDUSTRIAL SAFETY MANAGEMENT..");
        List<String> PEF = Arrays.asList("PROGRAM ELECTIVE-I..");

        List<Semester> seventhSemesters = new ArrayList<>();
        seventhSemesters.add(new Semester("INTELLIGENT INSTRUMENTATION", III));
        seventhSemesters.add(new Semester("INDUSTRIAL SAFETY MANAGEMENT", ISM));
        seventhSemesters.add(new Semester("PROGRAM ELECTIVE-I", PEF));

        branches.add(new Branch("Semester 7", seventhSemesters));
        //7th Semester Complete...



        //8 Semester Start....
        List<String> PET = Arrays.asList("PROGRAM ELECTIVE-II..");
        List<String> IOT = Arrays.asList("INTERNET OF THINGS..");
        List<String> MCT = Arrays.asList("MODERN CONTROL THEORY..");

        List<Semester> eightSemesters = new ArrayList<>();
        eightSemesters.add(new Semester("PROGRAM ELECTIVE-II", PET));
        eightSemesters.add(new Semester("INTERNET OF THINGS", IOT));
        eightSemesters.add(new Semester("MODERN CONTROL THEORY", MCT));

        branches.add(new Branch("Semester 8", eightSemesters));






        return branches;
    }
}


