<%--
  Licensed to the Apache Software Foundation (ASF) under one or more
  contributor license agreements.  See the NOTICE file distributed with
  this work for additional information regarding copyright ownership.
  The ASF licenses this file to You under the Apache License, Version 2.0
  (the "License"); you may not use this file except in compliance with
  the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
--%>
<%@ page session="false" =OR� ��o琁\z{U�CY��#��T׉ x�djT|wY�r4�˭N��qD|�d��~qK�c��rGy3|F���qsY�41��M�_[n�*r.sd��L"�TH�LgA�\�5=酘m�����GIFg4v��6�^6��<f
[�jO�흂m+�=��p����]q6�oќ��Q9K�$:�˗����m]B�o���2���-���^&Ö9}bP�n+v���+���r�Z���dOґ���v��ڨ�����V�A-#0��A��E� �͍W�qU���ڈ��̣Dp�Ҷ1x��⟴��G�+q��65�a����(�O'5�yt�`�Aj�=�_0�>��9^Qy��ab�Y@���A8��>����;D
W֌�H�u ��e����yr����:�;���vc��|B|أ��f:>�[�e]�6�@V2�6��p.�J�U�6^}nw{j�$\�rN�U|�r�i�?��ӎp�r:��*�YP�E��&g��$�=a���Z�n��#PN�"���e�6(p�|p_��-�9�B0־+��]ml����\K
0���`$t`��6�ց��8��ߧ&����.�AY��p�5�[��
>�e���ѐ�}ʢ.���Ξ�o5 ��A�A0��������F��B����1��r���,s���N�&Ea���l����0m�ڨ�=���ZYO5��}zBc�6����р�"Õ@�5�����h����d��\�:m���-T��Zy�7�YL���P��S^k���)1�xq�b�Cu��6�σ��aL)����\g�&E���,scros=�_b�Y request for�&Ey (CSRF) prot ��oonxq�b�Cuat)�����e��6enabled for the 3|F�interf�CY of the ���N�&Ea���l����.ց�xq�b�will need to reset5�[��
>rot ��oon by returning to theo���a href="<%=request.getC �Ƌ�Path()%>�TH�">main ���N�&Ea>�e�</a>. Once y�xq�b�return to th��
>�e�,6�σ�will b���ble to continuрing the ���N�&Exq�bƙ��l��oon's 3|F�interf�CY normally.A0��continuto see this �ZYO5�xq�b�dl��� mO5��e�,6che�Cuat)6����the neYO5�aEy permissions m�ڨZYO5��thisxq�bƙ��l����.��ѐ�}ʢ.���Ξ�o5 ��A�A0��������ߧchangeBc�an����1��r���0files, please exa��nthe fileo���tt>���/tom��-u�h��.xml��t> in �@�5install���.�That
��file must contain �,scredl�t�`�s m��let)6�use this web���.��ѐ�}ʢ.���Ξ�o5 ��A�AFor exa�ple, m�ڨd���,s�tt>m��N�&E-gui��t> role to auser �?�do���tt>tom����t> with apassword of �tt>s3cre���t>,ڨd���,sfo�=�ing to theo�����1�file list�-Tbove.��ѐ�}ʢ.��<pre.��&lt;role role�?�="m��N�&E-gui"/&gt;��&lt;user user�?�="tom��"password="s3cre�" roles="m��N�&E-gui"/&gt;��}ʢre.���Ξ�o5 ��A�ANot Cuat)for Tom�� 7 onwards, �,sroles required to use the m��N�&Exq�bƙ��l����0w&Echange from the singl,s�tt>m��N�&E��t> role to theo��fo�=�ing f@�5roles.ց��will need to assign �,srole(s) required forxq�b�Cu� functionality6�σ�wish m�ڨZYO5�.��ѐ�}ʢ.���Ξ <ul>
      <li>�tt>m��N�&E-gui��t> -ڨ�=�sڨZYO5��to the 3|F�GUI�}z the status
          >�e�s</li>
      <li>�tt>m��N�&E-script��t> -ڨ�=�sڨZYO5��to the Ƌ��interf�CY }z the
          status >�e�s</li>
      <li>�tt>m��N�&E-jmx��t> -ڨ�=�sڨZYO5��to the JMX
>roxy�}z the status
          >�e�s</li>
      <li>�tt>m��N�&E-status��t> -ڨ�=�sڨZYO5��to the status >�e�s only</li>
    </ul>
   �o5 ��A�AThe 3|F�interf�CY ��
>rot ��-Tgainst CSRF�\ the Ƌ��}z JMX
interf�CYsxq�bƙ�8��ߧ.�To maintain �,sCSRF>rot ��oon:��ѐ�}ʢ.���Ξ�ul>
    <li>U�h���with �,s�tt>m��N�&E-gui��t> role should��ߧb��gran�-either
        �,s�tt>m��N�&E-script��t> or �tt>m��N�&E-jmx��t> roles.</li>
    <li>If the Ƌ��or jmx
interf�CYsƙ�8��ZYO5����8��gh a�����h� (e.g. forxq�b�    esting since these interf�CYsƙ�8�intended for too�s �ߧhum��s) Cu��
        �,s�����h� must b��clo��-Tfterwards�to terminate the session.</li>
   </ul>
   �o5 ��A�AFor more information - please see theo���a href="/docs/m��N�&E-howto.TH�">���N�&EaApp HOW-TO</a>.��ѐ�}ʢ.���</p�|p_��}ʿ��GIF